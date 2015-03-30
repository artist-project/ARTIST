package eu.artist.premigration.tft.scc.test;

import eu.artist.premigration.tft.scc.metricexplorer.ReusabilityExplorer;

public class ReusabilityTest {
	public static void main(String[] args) throws Exception {
		ReusabilityExplorer re= new ReusabilityExplorer();
		re.calculateReusability("zurik", "zurik", "http://54.158.226.57:8080/ArtistEva/webresources/question/getrtt", "D:/Proyectos/Artist/javapetstore-2.0-ea5/src");
		
		System.out.println("*********** Reusability: "+re.getReusability());
		System.out.println("*********** Reusability Lines: "+re.getReusabilityLines());
	
	}

}
