package at.ac.tuwien.big.moea.run.listener;

import org.moeaframework.util.progress.ProgressEvent;

import at.ac.tuwien.big.moea.util.TextUtil;

public class RuntimePrintListener extends AbstractProgressListener {

	@Override
	public void update(ProgressEvent event) {
		System.out.println(
				event.getCurrentSeed() + "/" + event.getTotalSeeds() + "- " + 
				event.getCurrentNFE() + "/" + event.getMaxNFE() + " - " +
				TextUtil.toString(event.getElapsedTime(), 2) + "s/" 
				+ TextUtil.toString(event.getRemainingTime(), 2) + "s");
	}

}
