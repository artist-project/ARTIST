package eu.artist.migration.mut.componentmodelgenerator.generators;


/**
 * List of available component model generators
 * TODO Design a new mechanism to add new generators by configuration and not hard-coded.
 * TODO Consider to use Eclipse extension points to declare and provide additional generators
 * @author Jesús Gorroñogoitia
 *
 */
public enum CMGenerators {
		Observer_pattern ("Observer pattern"),
		RCP ("Eclipse RCP"),
		MS_Sharepoint ("Microsoft Share Point");
	
		
	private String label;
	
	/**
	 * Default constructor
	 * @param label The generator label to display 
	 */
	CMGenerators (String label){
		this.label = label;
	}
	
	/**
	 * It returns the generator label
	 * @return
	 */
	public String getLabel(){
		return label;
	}
	
	
} // TODO Read available component model generators from configuration
