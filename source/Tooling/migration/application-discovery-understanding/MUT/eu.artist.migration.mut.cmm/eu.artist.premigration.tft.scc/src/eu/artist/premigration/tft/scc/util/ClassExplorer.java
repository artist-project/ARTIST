package eu.artist.premigration.tft.scc.util;

import java.io.File;
import java.util.ArrayList;

import eu.artist.premigration.tft.scc.structures.SourceFile;

public interface ClassExplorer {
	public SourceFile findMethodsParser(File file) throws Exception;
	public SourceFile findMethodsParser(File file, ArrayList<Integer> lines) throws Exception;
		
}
