package eu.artist.postmigration.nfrvt.strategy.staticanalysis;

import org.eclipse.uml2.uml.Model;

import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder.MeasurementType;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder.ObservationLevel;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_SimpleTypes;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_StaticPropertyCatalogue;

public class StaticAnalysis {
	private MigrationResourceSet resourceSet;
	
	public StaticAnalysis(MigrationResourceSet resourceSet) {
		this.resourceSet = resourceSet;		
	}
	
	public StaticAnalysis() {
		this(new MigrationResourceSet());
	}
	
	public MigrationResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public MeasurementModelBuilder measure(Model umlModel, MeasurementModelBuilder builder) {
		if(umlModel == null)
			throw new IllegalArgumentException("UML Model can not be null.");
		
		builder.addImportNamespace(ARTIST_StaticPropertyCatalogue.Element.CATALOGUE);
		Observation observation = builder.addObservation("StaticAnalysis", ObservationLevel.Model, MeasurementType.Measured);
		
		builder.addDataPoint(observation, 
				builder.createMeasurementName(observation),
				ARTIST_StaticPropertyCatalogue.Element.PROGRAMMING_LANGUAGE,
				umlModel,
				builder.createValue(ARTIST_SimpleTypes.Element.PROGRAMMING_LANGUAGE_LITERALS.JAVA));
		
//		builder.addDataPoint(observation, 
//				builder.createMeasurementName(observation),
//				ARTIST_StaticPropertyCatalogue.Element.CLOUD_PROVIDER,
//				umlModel,
//				builder.createValue(ARTIST_SimpleTypes.Element.CLOUD_PROVIDER_LITERALS.GOOGLE_APP_ENGINE));
			
		return builder;
	}
}
