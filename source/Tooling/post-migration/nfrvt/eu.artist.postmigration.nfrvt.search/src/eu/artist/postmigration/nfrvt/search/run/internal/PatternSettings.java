package eu.artist.postmigration.nfrvt.search.run.internal;

import eu.artist.postmigration.opgml.input.PatternImpactEstimates;

public class PatternSettings {
	private int minFixedScaling = 1;
	private int maxFixedScaling = 3;
	
	private int minMinAutoScaling = 1;
	private int maxMinAutoScaling = 4;
	private int minMaxAutoScaling = 3;
	private int maxMaxAutoScaling = 5;
	
	private PatternImpactEstimates impactEstimates = new PatternImpactEstimates();
	
	public PatternSettings() { }
	
	public PatternSettings(int minFixedScaling, int maxFixedScaling,
			int minMinAutoScaling, int maxMinAutoScaling,
			int minMaxAutoScaling, int maxMaxAutoScaling) {
		this(minFixedScaling, maxFixedScaling, 
				minMinAutoScaling, maxMinAutoScaling, 
				minMaxAutoScaling, maxMaxAutoScaling,
				new PatternImpactEstimates());
	}
	
	public PatternSettings(int minFixedScaling, int maxFixedScaling,
			int minMinAutoScaling, int maxMinAutoScaling,
			int minMaxAutoScaling, int maxMaxAutoScaling,
			PatternImpactEstimates impactEstimates) {
		this.minFixedScaling = minFixedScaling;
		this.maxFixedScaling = maxFixedScaling;
		this.minMinAutoScaling = minMinAutoScaling;
		this.maxMinAutoScaling = maxMinAutoScaling;
		this.minMaxAutoScaling = minMaxAutoScaling;
		this.maxMaxAutoScaling = maxMaxAutoScaling;
		this.impactEstimates = impactEstimates;
	}

	public int getMinFixedScaling() {
		return minFixedScaling;
	}
	
	public void setMinFixedScaling(int minFixedScaling) {
		this.minFixedScaling = minFixedScaling;
	}
	
	public int getMaxFixedScaling() {
		return maxFixedScaling;
	}
	
	public void setMaxFixedScaling(int maxFixedScaling) {
		this.maxFixedScaling = maxFixedScaling;
	}
	
	public int getMinMinAutoScaling() {
		return minMinAutoScaling;
	}
	
	public void setMinMinAutoScaling(int minMinAutoScaling) {
		this.minMinAutoScaling = minMinAutoScaling;
	}
	
	public int getMaxMinAutoScaling() {
		return maxMinAutoScaling;
	}
	
	public void setMaxMinAutoScaling(int maxMinAutoScaling) {
		this.maxMinAutoScaling = maxMinAutoScaling;
	}
	
	public int getMinMaxAutoScaling() {
		return minMaxAutoScaling;
	}
	
	public void setMinMaxAutoScaling(int minMaxAutoScaling) {
		this.minMaxAutoScaling = minMaxAutoScaling;
	}
	
	public int getMaxMaxAutoScaling() {
		return maxMaxAutoScaling;
	}
	
	public void setMaxMaxAutoScaling(int maxMaxAutoScaling) {
		this.maxMaxAutoScaling = maxMaxAutoScaling;
	}
	
	public PatternImpactEstimates getPatternImpactEstimates() {
		return impactEstimates;
	}
	
	public void setPatternImpactEstimates(PatternImpactEstimates impactEstimates) {
		this.impactEstimates = impactEstimates;
	}	
}
