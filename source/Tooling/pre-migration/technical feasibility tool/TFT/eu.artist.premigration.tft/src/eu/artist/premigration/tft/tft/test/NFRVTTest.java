package eu.artist.premigration.tft.tft.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import eu.artist.premigration.tft.nfrvt.resources.types.CloudProvider;

public class NFRVTTest {



	public static void main(String[] args) {


		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File ("E:/file.txt")));
			String line;
			while ((line = br.readLine()) != null) {
				String stereotype = line.split("\\.")[1];
				
//				System.out.println("--- detected " + stereotype + " stereotyped classes");
//				System.out.println("helper def: " + stereotype + "dClasses: Sequence(UML2!Class) = ");
//				System.out.println("thisModule.allINClasses->select(s|s.hasStereotype(thisModule."+ stereotype + "))-> debug ('"+stereotype+"');");
				
//				System.out.println("\t\t(thisModule." + stereotype + ",");
//				System.out.println("\t\tTuple{classes=thisModule.organizedByPackage(thisModule."+stereotype+"dClasses), merge=true, subGroupStereotype=OclUndefined}),");
				
				System.out.println("helper def: " + stereotype + ":UML2!Stereotype = profile!Stereotype." );
				System.out.println("\tallInstancesFrom('J2EEProfile')->select(e|e.name='" + (stereotype.replace("Stereotype", "")+ "').first();"));
				
//				helper def: ejbContextStereotype: UML2!Stereotype = profile!Stereotype.
//						allInstancesFrom('J2EEProfile')->select(e|e.name='EJBContext').first();
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//		MigrationStandaloneSetup.doSetup();
		//		MigrationResourceSet set = new MigrationResourceSet();
		//		
		//		File file = new File("src/eu/artist/premigration/tft/tft/test/mathelper_LoB.gml");
		//		URI uri = URI.createFileURI(file.getAbsolutePath());
		//		
		//		GoalModel goalModel = set.loadGoalModel(uri);
		//		EList<Goal> goals = goalModel.getGoals();
		//		for (Goal goal : goals) {
		//			if (goal instanceof SoftGoal) {
		//				SoftGoal hardGoal = (SoftGoal) goal;
		//				System.out.println(goal.getName());
		//			}
		//		}
		//		System.out.println("done");
	}
}
