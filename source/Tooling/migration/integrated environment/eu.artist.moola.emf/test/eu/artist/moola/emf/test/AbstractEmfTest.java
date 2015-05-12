package eu.artist.moola.emf.test;

import org.junit.BeforeClass;

import eu.artist.moola.TransformationRegistry;
import eu.artist.moola.emf.acceleo.AcceleoTransformation;
import eu.artist.moola.emf.atl.AtlTransformation;
import eu.artist.moola.emf.atl.emftvm.AtlEmftvmTransformation;
import eu.artist.moola.emf.modisco.MoDiscoTransformation;

public class AbstractEmfTest {
	
    @BeforeClass
    public static void setUpBaseClass() {
		TransformationRegistry.register("MoDisco", MoDiscoTransformation.class);
		TransformationRegistry.register("Acceleo", AcceleoTransformation.class);
		TransformationRegistry.register("ATL", AtlTransformation.class);
		TransformationRegistry.register("ATL/EMFTVM", AtlEmftvmTransformation.class);
    }
    
}
