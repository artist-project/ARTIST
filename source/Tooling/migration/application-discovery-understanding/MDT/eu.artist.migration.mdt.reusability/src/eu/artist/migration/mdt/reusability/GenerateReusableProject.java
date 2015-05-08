package eu.artist.migration.mdt.reusability;

import org.tecnalia.structures.Project;

public class GenerateReusableProject {
	public static Project reusableProject= null;
	/**
	 * @return
	 */
	public static Project getProject(){
		if (reusableProject==null)
			return (new Project());		
		else
			return reusableProject;
	}

}
