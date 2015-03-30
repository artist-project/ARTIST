package at.ac.tuwien.big.simpleqn;

import org.junit.Test;

import scala.actors.threadpool.Arrays;
import scala.collection.immutable.Range.Inclusive;

public class JMTComparisonTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testAnalysisWithFourServices() {
		Service service1 = new Service("Service1", 1000);
		Service service2 = new Service("Service2", 1000);
		Service service3 = new Service("Service3", 1000);
		Service service4 = new Service("Service4", 1000);

		Service[] services = { service1, service2, service3, service4 };
		QueuingNet net = new QueuingNet(Arrays.asList(services));

		int arrivalTime1 = 0;
		int arrivalTime2 = 0;
		for (int i = 1; i < 200; i++) { // 51000?
			arrivalTime1 += exp(0.001);
			arrivalTime2 += exp(0.001);
			Job job1 = new Job(arrivalTime1, net);
			job1.request(service1);
			job1.request(service2, exp(0.001));
			job1.request(service4);
			Job job2 = new Job(arrivalTime2, net);
			job2.request(service1);
			job2.request(service3, exp(0.002)); // 0.001
			job2.request(service4);
		}

		net.close();
		System.out.println("testAnalysisWithFourServices");
		System.out.println("Overall results");
		System.out.println("Completion Time=" + net.completionTime());
		System.out.println("Throughput/s=" + net.throughput() * 1000);
		System.out.println("Utilization=" + net.utilization());
		System.out.println();
		for (Service service : services) {
			System.out.println(service.name() + " results");
			Inclusive estimatedLongRunRange = net.estimatedLongRunRange();
			System.out.println("utilization="
					+ service.utilization(estimatedLongRunRange));
			System.out.println();
		}
	}

	private int exp(double lamdba) {
		return (int) (Math.log(1 - Math.random()) / (-lamdba));
	}

}
