package at.ac.tuwien.big.moea.run.listener;

import org.apache.commons.lang3.time.StopWatch;
import org.moeaframework.util.progress.ProgressEvent;

public class SeedRuntimePrintListener extends AbstractProgressListener {

	private StopWatch seedWatch = new StopWatch();
	private StopWatch totalWatch = new StopWatch();

	@Override
	public void update(ProgressEvent event) {
		if(isStarted(event))
			if(!totalWatch.isStarted())
				totalWatch.start();
		
		if(isSeedStarted(event))
			if(!seedWatch.isStarted()) 
				seedWatch.start();
		
		if(isSeedFinished(event)) {
			seedWatch.stop();
			System.out.println("Run " + event.getCurrentSeed() + " of " + event.getTotalSeeds() + " terminated after " + seedWatch + ".");
			seedWatch.reset();
		}
			
		if(isFinished(event)) {
			totalWatch.stop();
			System.out.println("Total runtime for " + event.getTotalSeeds() + " seeds: " + totalWatch + ".");
			totalWatch.reset();
		}
	}

}
