package eu.artist.moola.dsl.core

import java.util.List;

/**
 * This class can be used to load and store trafos and is implemented as a transformation.
 * The specification of this transformation is implicitly set to having only one output of the
 * model type.
 */
class ModelTrafo extends Transformation {

	private final static String OUTPUT_ID = "result"
	
	String name;
	String conformsTo;
	String path;
	
	
	@Override
	public void setSpec(Specification spec) {
		throw new RuntimeException("The spec of a Model Transformation cannot be altered");
	}
	
	
	
	/**
	 * The asType function allows implicit conversion from ModelTrafo to ModelLink
	 * @param clazz The target class
	 * @return The current object represented in the target class
	 */
	Object asType(Class clazz) {
		if (clazz == ModelLink) {
			return [trafo: this, outputIdentifier: OUTPUT_ID] as ModelLink
		}
		else {
			super.asType(clazz)
		}
	}
	
	List<ModelLink> or(ModelLink link) {
		return [this as ModelLink, link]
	}
	
	List<ModelLink> or(ModelTrafo trafo) {
		return [this as ModelLink, trafo as ModelLink]
	}
	
}
