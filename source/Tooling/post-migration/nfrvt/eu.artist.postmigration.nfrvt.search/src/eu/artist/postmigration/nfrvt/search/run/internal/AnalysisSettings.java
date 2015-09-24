package eu.artist.postmigration.nfrvt.search.run.internal;

public class AnalysisSettings {
	private int simulationTime;
	private String resultPath;
	
	public AnalysisSettings() { }
	
	public AnalysisSettings(int simulationTime, String resultPath) {
		this.simulationTime = simulationTime;
		this.resultPath = resultPath;
	}

	public int getSimulationTime() {
		return simulationTime;
	}
	
	public void setSimulationTime(int simulationTime) {
		this.simulationTime = simulationTime;
	}
	
	public String getResultPath() {
		return resultPath;
	}
	
	public void setResultPath(String resultPath) {
		this.resultPath = resultPath;
	}
	
}
