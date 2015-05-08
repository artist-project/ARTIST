/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Based upon: http://introcs.cs.princeton.edu/java/stdlib/StdRandom.java.html
 * @author Martin Fleck
 *
 */
public class ArrivalTimeGenerator {

	private Random random;
	
	public ArrivalTimeGenerator() {
		random = new Random(System.currentTimeMillis());
	}
	
	public double nextExponentialTime(double rate_lambda) {
		// uniform random number with Math.random [0,1)
		return -Math.log(1 - Math.random())/rate_lambda;
	}
	
	public double nextGaussian() {
		double r, x, y;
        do {
            x = -1.0 + random.nextDouble() * (1.0 + 1.0);
            y = -1.0 + random.nextDouble() * (1.0 + 1.0);
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);
	}
	
	public double nextGaussian(double mean, double stddev) {
        return mean + stddev * nextGaussian();
    }
	
	public double nextGeometric(double p) {
        // using algorithm given by Knuth
        return (int) Math.ceil(Math.log(random.nextDouble()) / Math.log(1.0 - p));
    }

	/**
     * Return an integer with a Poisson distribution with mean lambda.
     */
    public int nextPoisson(double lambda) {
        // using algorithm given by Knuth
        // see http://en.wikipedia.org/wiki/Poisson_distribution
        int k = 0;
        double p = 1.0;
        double L = Math.exp(-lambda);
        do {
            k++;
            p *= random.nextDouble();
        } while (p >= L);
        return k-1;
    }

    /**
     * Return a real number with a Pareto distribution with parameter alpha.
     */
    public double nextPareto(double alpha) {
        return Math.pow(1 - random.nextDouble(), -1.0/alpha) - 1.0;
    }

    /**
     * Return a real number with a Cauchy distribution.
     */
    public double nextCauchy() {
        return Math.tan(Math.PI * (random.nextDouble() - 0.5));
    }
	
    
    private ArrivalTimeGenerator generator;
    private Set<Double> times;
    private List<Integer> timesMultiple;
    
    @Before
    public void setUp() {
    	generator = new ArrivalTimeGenerator();
    	times = new TreeSet<Double>();
    	timesMultiple = new ArrayList<Integer>();
    }
    
    @After
    public void tearDown() {
    	for(double time : times)
			System.out.println(time);
    	Collections.sort(timesMultiple);
    	for(int time : timesMultiple)
			System.out.println(time);
    }
	
	@Test
	public void testNumbersExponential() {
		System.out.println("------------ Test Exponential ------------");
		
		for(int i = 0; i < 20; i++) 
			times.add((generator.nextExponentialTime(0.54)));
	}
	
	@Test
	public void testNumbersGaussian() {
		System.out.println("------------ Test Gaussian ------------");

		for(int i = 0; i < 20; i++) 
			times.add((generator.nextGaussian(10.0, 2.0)));
	}
	
	@Test
	public void testNumbersPoisson() {
		System.out.println("------------ Test Poisson ------------");
		int prev = 0;
		for(int i = 0; i < 30; i++) 
			timesMultiple.add(prev + (prev = (generator.nextPoisson(10))));
	}
}
