package eu.artist.migration.ct.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class KnnClassifier {
	
	private String pidstatFileName;
	private String tsharkFileName;
	private String trainingFileName;
	private int k;
	
	public String getPidstatFileName() {
		return pidstatFileName;
	}
	
	public void setPidstatFileName(String pidstatFileName) {
		this.pidstatFileName = pidstatFileName;
	}
	
	public String getTsharkFileName() {
		return tsharkFileName;
	}
	
	public void setTsharkFileName(String tsharkFileName) {
		this.tsharkFileName = tsharkFileName;
	}
	
	public String getTrainingFileName() {
		return trainingFileName;
	}
	
	public void setTrainingFileName(String trainingFileName) {
		this.trainingFileName = trainingFileName;
	}
	
	public int getK() {
		return k;
	}
	
	public void setK(int k) {
		this.k = k;
	}
	
	public KnnClassifier() {
		k = 5;
	}
	
	public KnnClassifier(String pidstatFileName, String tsharkFileName, String trainingFileName) {
		this();
		this.pidstatFileName = pidstatFileName;
		this.tsharkFileName = tsharkFileName;
		this.trainingFileName = trainingFileName;
	}
	
	public KnnClassifier(String pidstatFileName, String tsharkFileName, String trainingFileName, int vectorSize, int k) {
		this(pidstatFileName, tsharkFileName, trainingFileName);
		this.k = k;
	}
	
	private double getEuclideanDistance(Workload a, Workload b) throws Exception {
		double sum = 0;
		if (a.getVector().length != b.getVector().length) {
			throw new Exception("Invalid vector sized in workloads!");
		}
		
		for (int i = 0; i < a.getVector().length; i++) {
			sum += Math.pow((a.getVector()[i] - b.getVector()[i]), 2);
		}
		return Math.sqrt(sum);
	}
	
	private List<BenchmarkWorkload> calculate_knn(int k, ApplicationWorkload application, List<BenchmarkWorkload> workloads) throws Exception {
		double distance;
		BenchmarkWorkload work;
		for (int i = 0; i < workloads.size(); i++) {
			work = workloads.get(i);
			distance = getEuclideanDistance(application, work);
			work.setDistanceFromRequest(distance);
		}
		Collections.sort(workloads);
		ArrayList<BenchmarkWorkload> result = new ArrayList<BenchmarkWorkload>(k);
		for (int i = 0; i < k; i++) {
			result.add(workloads.get(i));
		}
		return result;
	}
	
	private String getWorkloadClassification(ApplicationWorkload query, List<BenchmarkWorkload> nearest) {
		HashMap<String, Integer> histogram = new HashMap<String, Integer>();
		
		Integer value;
		int max = 0;
		for (BenchmarkWorkload w: nearest) {
			value = histogram.get(w.getName());
			if (value == null) {
				histogram.put(w.getName(), 1);
				if (1 > max) {
					max = 1;
				}
			}
			else {
				histogram.put(w.getName(), value + 1);
				if (value + 1 > max) {
					max = value + 1;
				}
			}
		}
		
		HashMap<String, Double> maxKeys = new HashMap<String, Double>();
		for (Entry<String, Integer> e: histogram.entrySet()) {
			if (e.getValue() == max) {
				maxKeys.put(e.getKey(), 0.0);
			}
		}
		
		if (maxKeys.size() == 1) {
			return maxKeys.keySet().toArray()[0].toString();
		}
		
		//We have a tie
		Double distanceSum;
		for (BenchmarkWorkload w: nearest) {
			distanceSum = maxKeys.get(w.getName());
			if (distanceSum != null) {
				maxKeys.put(w.getName(), distanceSum + w.getDistanceFromRequest());
			}
		}
		
		double min = Double.MAX_VALUE;
		String result = null;
		for (Entry<String, Double> e: maxKeys.entrySet()) {
			if (e.getValue() < min) {
				min = e.getValue();
				result = e.getKey();
			}
		}
		return result;
	}
	
	public String calculateClassification() throws Exception {
		ApplicationProfileReader appReader = new ApplicationProfileReader(pidstatFileName, tsharkFileName);
		ApplicationWorkload applicationWorkload = appReader.getWorkloadFromFiles();
		
		BenchmarkProfileReader benchReader = new BenchmarkProfileReader(trainingFileName);
		ArrayList<BenchmarkWorkload> benchmarkWorkloads = benchReader.getWorkloadsFromFile();
		
		List<BenchmarkWorkload> knn = null;
		if (benchmarkWorkloads.size() < k) {
			knn = calculate_knn(benchmarkWorkloads.size(), applicationWorkload, benchmarkWorkloads);
		}
		else {
			knn = calculate_knn(k, applicationWorkload, benchmarkWorkloads);
		}
		
		
		String queryClassification = getWorkloadClassification(applicationWorkload, knn);
		if (queryClassification == null) {
			System.out.println("To classification apetuxe");
		}
		else {
			System.out.println("To kontinotero workload einai to: " + queryClassification);
		}
		
		return queryClassification;
	}
}
