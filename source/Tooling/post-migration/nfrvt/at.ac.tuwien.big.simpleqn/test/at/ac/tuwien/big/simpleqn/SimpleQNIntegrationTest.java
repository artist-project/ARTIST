/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package at.ac.tuwien.big.simpleqn;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import scala.actors.threadpool.Arrays;
import scala.collection.immutable.Range;
import at.ac.tuwien.big.simpleqn.strategies.AvgQueueLengthScaling;
import at.ac.tuwien.big.simpleqn.strategies.RoundRobinBalancing;
import at.ac.tuwien.big.simpleqn.strategies.ShortestQueueBalancing;

public class SimpleQNIntegrationTest extends TestCase {

	public void testBasicQN() {
		Service service1 = new Service("Service1", 1);
		Service service2 = new Service("Service2", 2);
		Service service3 = new Service("Service3", 3);
		Service service4 = new Service("Service4", 4);

		List<Service> services = new ArrayList<Service>();
		services.add(service1);
		services.add(service2);
		services.add(service3);
		services.add(service4);

		QueuingNet net = new QueuingNet(services);

		Job job1 = new Job(1, net);
		Job job2 = new Job(2, net);

		// The order in which requests are added within one job matters!
		Request reqJob1Ser1 = job1.request(service1);
		Request reqJob1Ser2 = job1.request(service2);
		Request reqJob2Ser1 = job2.request(service1);
		Request reqJob2Ser3 = job2.request(service3);
		Request reqJob2Ser4 = job2.request(service4);
		Request reqJob1Ser4 = job1.request(service4);

		net.close();

		// assert overall service time
		assertEquals(7, job1.overallServiceTime());
		assertEquals(8, job2.overallServiceTime());

		// assert requests at service centers
		assertEquals(2, service1.requests().size());
		assertEquals(1, service2.requests().size());
		assertEquals(1, service3.requests().size());
		assertEquals(2, service4.requests().size());
		assertEquals(1, service1.requestsOf(job1).size());
		assertTrue(service1.requestsOf(job1).contains(reqJob1Ser1));
		assertEquals(1, service2.requestsOf(job1).size());
		assertTrue(service2.requestsOf(job1).contains(reqJob1Ser2));
		assertEquals(0, service3.requestsOf(job1).size());
		assertEquals(1, service4.requestsOf(job1).size());
		assertTrue(service4.requestsOf(job1).contains(reqJob1Ser4));

		// assert prev and next request
		assertEquals(reqJob1Ser1, reqJob1Ser2.previousRequestInJob().get());
		assertEquals(reqJob1Ser2, reqJob1Ser4.previousRequestInJob().get());
		assertTrue(reqJob1Ser1.previousRequestInJob().isEmpty());
		assertEquals(reqJob1Ser2, reqJob1Ser1.nextRequestInJob().get());
		assertEquals(reqJob1Ser4, reqJob1Ser2.nextRequestInJob().get());
		assertTrue(reqJob1Ser4.nextRequestInJob().isEmpty());

		// assert waiting times
		assertEquals(0, reqJob1Ser1.waitingTime());
		assertEquals(0, reqJob1Ser2.waitingTime());
		assertEquals(0, reqJob1Ser4.waitingTime());
		// 0sec waiting time because job2 starts 1sec later than job1, service1
		// requires 1sec -> when job2 arrives, job1 has been finished already
		assertEquals(0, reqJob2Ser1.waitingTime());
		assertEquals(0, reqJob2Ser3.waitingTime());
		// 2sec waiting time because job2 starts 1sec later than job1, and
		// job2 arrives at service4 2sec later than job1 (service 3 takes 1sec
		// longer than service2, job2 looses another second). Service4 takes
		// 4sec and job2 arrives after job1 has been processed for 2sec already.
		assertEquals(2, reqJob2Ser4.waitingTime());

		// assert residence times
		assertEquals(1, reqJob1Ser1.residenceTime());
		assertEquals(2, reqJob1Ser2.residenceTime());
		assertEquals(4, reqJob1Ser4.residenceTime());
		assertEquals(1, reqJob2Ser1.residenceTime());
		assertEquals(3, reqJob2Ser3.residenceTime());
		assertEquals(6, reqJob2Ser4.residenceTime());

		// assert arrival times
		assertEquals(1, reqJob1Ser1.arrivalTime());
		assertEquals(2, reqJob1Ser2.arrivalTime());
		assertEquals(4, reqJob1Ser4.arrivalTime()); // 5
		assertEquals(2, reqJob2Ser1.arrivalTime());
		assertEquals(3, reqJob2Ser3.arrivalTime());
		assertEquals(6, reqJob2Ser4.arrivalTime()); // 7

		// assert leaving times
		assertEquals(2, reqJob1Ser1.leavingServiceTime());
		assertEquals(4, reqJob1Ser2.leavingServiceTime());
		assertEquals(8, reqJob1Ser4.leavingServiceTime());
		assertEquals(3, reqJob2Ser1.leavingServiceTime());
		assertEquals(6, reqJob2Ser3.leavingServiceTime());
		assertEquals(3, reqJob2Ser3.leavingQueueTime());
		assertEquals(12, reqJob2Ser4.leavingServiceTime());
		assertEquals(8, reqJob2Ser4.leavingQueueTime());

		assertEquals(7, job1.overallServiceTime());
		assertEquals(0, job1.overallWaitingTime());
		assertEquals(7, job1.overallResidenceTime());
		assertEquals(0, job1.maxWaitingTime());

		assertEquals(8, job2.overallServiceTime());
		assertEquals(10, job2.overallResidenceTime());
		assertEquals(2, job2.overallWaitingTime());
		assertEquals(2, job2.maxWaitingTime());

		// assert queue at time
		assertEquals(0, service1.requestQueueAt(0).size());
		assertEquals(1, service4.requestQueueAt(6).size());
		assertEquals(1, service4.requestQueueAt(7).size());
		assertEquals(0, service4.requestQueueAt(8).size());

		// assert average/max queue length in a time interval
		assertEquals(0.0, service1.avgQueueLength(range(0, 20)));
		assertEquals(1.0, service4.avgQueueLength(range(6, 7)));
		assertEquals(0.5, service4.avgQueueLength(range(7, 8)));
		assertEquals(0, service1.maxQueueLength(range(0, 20)));
		assertEquals(0, service4.maxQueueLength(range(0, 4)));
		assertEquals(1, service4.maxQueueLength(range(0, 20)));

		// assert completion time
		assertEquals(8, job1.completionTime());
		assertEquals(12, job2.completionTime());
		assertEquals(12, net.completionTime());

		// assert idle time, busy time, and utilization
		assertEquals(1, service1.idleTime(range(0, 0)));
		assertEquals(0, service1.idleTime(range(1, 2)));
		assertEquals(1, service1.busyTime(range(0, 1)));
		assertEquals(2, service1.busyTime(range(1, 2)));
		assertEquals(0.5, service1.utilization(range(0, 1)));
		assertEquals(1.0, service1.utilization(range(1, 2)));
		assertEquals(1, net.busyTime(range(0, 1)));
		assertEquals(0.5, net.utilization(range(0, 1)));
		assertEquals(1.0, net.utilization(range(1, 2)));
		assertEquals(1.0, net.utilization(range(1, 11)));

		// assert number of completed jobs and throughput
		assertEquals(2, net.completedJobs().size());
		assertEquals(1, net.completedJobs(8).size());
		assertEquals(0, net.completedJobs(7).size());
		assertEquals(2d / 13d, net.throughput());
	}

	public void testJobDependentServiceTime() {
		Service service1 = new Service("Service1", 2);
		Service service2 = new Service("Service2", 2);

		List<Service> services = new ArrayList<Service>();
		services.add(service1);
		services.add(service2);

		QueuingNet net = new QueuingNet(services);

		Job job1 = new Job(1, net);
		Job job2 = new Job(2, net);
		Job job3 = new Job(3, net);
		Job job4 = new Job(4, net);

		Request reqJob1Service1 = job1.request(service1, 3);
		Request reqJob1Service2 = job1.request(service2, 3);
		Request reqJob2Service1 = job2.request(service1, 4);
		Request reqJob2Service2 = job2.request(service2);
		Request reqJob3Service1 = job3.request(service1, 1);
		Request reqJob3Service2 = job3.request(service2, 5);
		Request reqJob4Service1 = job4.request(service1);
		Request reqJob4Service2 = job4.request(service2, 4);

		net.close();

		assertEquals(2, reqJob2Service1.waitingTime());
		assertEquals(0, reqJob2Service2.waitingTime());

		assertEquals(3, reqJob1Service1.serviceTime());
		assertEquals(3, reqJob1Service2.serviceTime());
		assertEquals(4, reqJob2Service1.serviceTime());
		assertEquals(2, reqJob2Service2.serviceTime());
		assertEquals(1, reqJob3Service1.serviceTime());
		assertEquals(5, reqJob3Service2.serviceTime());
		assertEquals(2, reqJob4Service1.serviceTime());
		assertEquals(4, reqJob4Service2.serviceTime());

		assertEquals(6, job1.overallResidenceTime());
		assertEquals(0, job1.overallWaitingTime());
		assertEquals(7, job1.completionTime());

		assertEquals(2, job2.overallWaitingTime());
		assertEquals(10, job2.completionTime());
		assertEquals(8, job2.overallResidenceTime());

		assertEquals(15, job3.completionTime());
		assertEquals(6, job3.overallWaitingTime());
		assertEquals(12, job3.overallResidenceTime());

		assertEquals(9, job4.overallWaitingTime());
		assertEquals(15, job4.overallResidenceTime());
		assertEquals(19, job4.completionTime());
	}

	private Range range(int from, int to) {
		// Range is inclusive
		return new Range(from, to + 1, 1);
	}

	@SuppressWarnings("unchecked")
	public void testMultipleRequestsToSameService() {
		Service service1 = new Service("Service1", 2);
		Service service2 = new Service("Service2", 2);

		Service[] services = { service1, service2 };
		QueuingNet net = new QueuingNet(Arrays.asList(services));

		Job job1 = new Job(1, net);
		Job job2 = new Job(1, net);

		for (int i = 0; i < 4; i++) {
			job1.request(service1);
			job1.request(service2);
			job2.request(service1);
			job2.request(service2);
		}
		net.close();
	}

	@SuppressWarnings("unchecked")
	public void testMultipleRequestsToBalancer() {
		FixedBalancer service1 = new FixedBalancer("balance1", 5,
				new RoundRobinBalancing(2), 2);
		FixedBalancer service2 = new FixedBalancer("balance2", 5,
				new RoundRobinBalancing(2), 2);

		Service[] services = { service1, service2 };
		QueuingNet net = new QueuingNet(Arrays.asList(services));

		Job job1 = new Job(1, net);
		Job job2 = new Job(1, net);

		for (int i = 0; i < 4; i++) {
			job1.request(service1);
			job1.request(service2, 5);
			job2.request(service1, 5);
			job2.request(service2);
		}
		net.close();

		Service service1_1 = service1.services().apply(0);
		Service service1_2 = service1.services().apply(1);
		Service service2_1 = service2.services().apply(0);
		Service service2_2 = service2.services().apply(1);

		assertEquals(0.3333333333333333d,
				service1_1.utilization(net.completeRange()));
		assertEquals(0.3333333333333333d,
				service1_2.utilization(net.completeRange()));
		assertEquals(0.3333333333333333d,
				service2_1.utilization(net.completeRange()));
		assertEquals(0.3333333333333333d,
				service2_2.utilization(net.completeRange()));

		assertEquals(20, service1_1.busyTime());
		assertEquals(20, service1_2.busyTime());
		assertEquals(20, service2_1.busyTime());
		assertEquals(20, service2_2.busyTime());
		
		assertEquals(40, service1_1.idleTime());
		assertEquals(40, service1_2.idleTime());
		assertEquals(40, service2_1.idleTime());
		assertEquals(40, service2_2.idleTime());
	}

	@SuppressWarnings("unchecked")
	public void testFixedBalancerWithRoundRobin() {
		FixedBalancer balancer1 = new FixedBalancer("balance1", 5,
				new RoundRobinBalancing(2), 2);
		FixedBalancer balancer2 = new FixedBalancer("balance2", 5,
				new RoundRobinBalancing(3), 2);

		Service[] services = { balancer1, balancer2 };
		QueuingNet net = new QueuingNet(Arrays.asList(services));

		Job job1 = new Job(1, net);
		Job job2 = new Job(2, net);
		Job job3 = new Job(3, net);

		Request reqJ1B1 = job1.request(balancer1);
		Request reqJ1B2 = job1.request(balancer2);
		Request reqJ2B1 = job2.request(balancer1);
		Request reqJ2B2 = job2.request(balancer2);
		Request reqJ3B1 = job3.request(balancer1);
		Request reqJ3B2 = job3.request(balancer2);

		net.close();
		net.debugPrint();

		assertTrue(balancer1.services().head() == reqJ1B1.nextRequestInJob()
				.get().service());
		assertTrue(balancer1.services().last() != reqJ1B1.nextRequestInJob()
				.get().service());
		assertTrue(balancer1.services().last() == reqJ2B1.nextRequestInJob()
				.get().service());
		assertTrue(balancer1.services().head() != reqJ2B1.nextRequestInJob()
				.get().service());

		assertTrue(balancer2.services().head() == reqJ1B2.nextRequestInJob()
				.get().service());
		assertTrue(balancer2.services().last() != reqJ1B2.nextRequestInJob()
				.get().service());
		assertTrue(balancer2.services().last() == reqJ2B2.nextRequestInJob()
				.get().service());
		assertTrue(balancer2.services().head() != reqJ2B2.nextRequestInJob()
				.get().service());

		assertTrue(balancer1.services().head() == reqJ3B1.nextRequestInJob()
				.get().service());
		assertTrue(balancer1.services().last() != reqJ3B1.nextRequestInJob()
				.get().service());
		assertTrue(balancer2.services().head() == reqJ3B2.nextRequestInJob()
				.get().service());
		assertTrue(balancer2.services().last() != reqJ3B2.nextRequestInJob()
				.get().service());

		assertEquals(15, job1.overallResidenceTime());
		assertEquals(0, job1.overallWaitingTime());
		assertEquals(2, job2.overallWaitingTime());
		assertEquals(17, job2.overallResidenceTime());

		assertEquals(19, job3.overallResidenceTime());
		assertEquals(4, job3.overallWaitingTime());
	}

	@SuppressWarnings("unchecked")
	public void testScalingBalancerWithRoundRobin() {
		ScalingBalancer service1 = new ScalingBalancer("balance1", 3,
				new ShortestQueueBalancing(1), new AvgQueueLengthScaling(range(
						1, 3), 0, 3, 1.1));
		ScalingBalancer service2 = new ScalingBalancer("balance2", 3,
				new ShortestQueueBalancing(1), new AvgQueueLengthScaling(range(
						1, 3), 0, 3, 1.1));

		Service[] services = { service1, service2 };
		QueuingNet net = new QueuingNet(Arrays.asList(services));

		for (int i = 0; i < 20; i++) {
			Job job1 = new Job(i, net);
			job1.request(service1);
			if (i < 10) job1.request(service2);
			if (i < 10) job1.request(service2);
			if (i < 10) job1.request(service2);
			Job job2 = new Job(i, net);
			job2.request(service1);
			//if (i > 15) job2.request(service2);
		}

		net.close();
		System.out.println("testScalingBalancerWithRoundRobin");
		net.debugPrint();
		System.out.println(net.completionTime());
		System.out.println(net.throughput());
		System.out.println(net.completedJobs().size());

		// System.out.println(balancer1.services().size());
		// System.out.println(net.completionTime());
		// System.out.println(net.completedJobs().size());
		// System.out.println(net.throughput());

	}

}
