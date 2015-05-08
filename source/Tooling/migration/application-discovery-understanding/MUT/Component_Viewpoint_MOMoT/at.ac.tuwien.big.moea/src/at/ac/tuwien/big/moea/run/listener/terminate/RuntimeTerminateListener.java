package at.ac.tuwien.big.moea.run.listener.terminate;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.moeaframework.util.progress.ProgressEvent;

import at.ac.tuwien.big.moea.run.executor.TerminatableExecutor;
import at.ac.tuwien.big.moea.run.listener.AbstractProgressListener;
import at.ac.tuwien.big.moea.util.CastUtil;
import at.ac.tuwien.big.moea.util.MathUtil;

public class RuntimeTerminateListener extends AbstractProgressListener {

	private long terminationTime;
	private StopWatch watch;
	
	public RuntimeTerminateListener(long terminationTime) {
		this.terminationTime = terminationTime;	
	}
	
	public RuntimeTerminateListener(int minutes, int seconds, int milliseconds) {
		this(0, 0, minutes, seconds, milliseconds);
	}
	
	public RuntimeTerminateListener(int days, int hours, int minutes, int seconds, int milliseconds) {
		this.terminationTime = MathUtil.toNanoseconds(days, hours, minutes, seconds, milliseconds);
	}
	
	protected TerminatableExecutor getExecutor(ProgressEvent event) {
		if(event == null)
			return null;
		return CastUtil.asClass(event.getExecutor(), TerminatableExecutor.class);
	}
	
	protected boolean terminateRun(ProgressEvent event) {
		TerminatableExecutor executor = getExecutor(event);
		if(executor == null)
			return false;
		return true;
	}
	
	protected boolean terminateRun(ProgressEvent event, boolean condition) {
		if(!condition)
			return false;
		return terminateRun(event);
	}
	
	@Override
	public void update(ProgressEvent event) {
		if(isSeedStarted(event)) {
			watch = new StopWatch();
			watch.start();
		}
	
		if(terminateRun(event, watch.getNanoTime() > terminationTime)) {
			watch.stop();
			System.out.println("--> Run " + event.getCurrentSeed() + " of " + event.getTotalSeeds() + " has been terminated after " + watch + ", because the time limit of " + DurationFormatUtils.formatDurationHMS(terminationTime/MathUtil.MILLISECONS_TO_NS) + " has been reached.\n");
		}
	}
}
