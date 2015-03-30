package eu.artist.postmigration.nfrvt.lang.pml.renderer;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTDateTimeValueConverter;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.nsl.renderer.NSLTextRenderer;
import eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;

public class PMLTextRenderer extends NSLTextRenderer {	
	protected String render(Observation observation) {
		return observation.getToolName() + " at " + ARTISTDateTimeValueConverter.MILLISECONDS.format(observation.getDateTime());
	}

	protected String render(MeasurementModel model) {
		return "Measurement Model";
	}
	
	protected String render(Workload workload) {
		return workload.getActivity().getName() + " (" + workload.getPattern() + ")";
	}

	protected String render(DataPointMeasurement measurement) {
		return measurement.getProperty().getName() + "(" + measurement.getContext().getName() + ")" + " = " + doRender(measurement.getValue()); 
	}
	
	protected String render(BenchmarkMeasurement measurement) {
		return measurement.getProperty().getName() + "(" + measurement.getProvider().getName() + ")" + " = " + doRender(measurement.getValue()); 
	}
	
	protected String render(TimeSeriesMeasurement measurement) {
		return measurement.getProperty().getName() + "(" + measurement.getContext().getName() + ")" + ": " + measurement.getValues().size() + " values"; 
	}
	
	protected String render(TimeValuePair timeValue) {
		return doRender(timeValue.getDateTime()) + " = " + doRender(timeValue.getValue());
	}
}
