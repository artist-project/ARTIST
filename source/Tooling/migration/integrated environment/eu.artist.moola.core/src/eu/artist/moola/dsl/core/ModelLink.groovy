package eu.artist.moola.dsl.core

class ModelLink {
	Transformation trafo
	String outputIdentifier
	
	/**
	 * Combining model links through the or operator yields a list of model links
	 * @param clazz The target class
	 * @return The current object represented in the target class
	 */
	List<ModelLink> or(ModelLink link) {
		return [this, link]
	}
	
	/**
	 * The asType function allows implicit conversion from ModelLink to Model
	 * @param clazz The target class
	 * @return The current object represented in the target class
	 */
	Object asType(Class clazz) {
		if (clazz == Model) {
			return trafo.outputs[outputIdentifier]
		}
		else {
			super.asType(clazz)
		}
	}
	
}
