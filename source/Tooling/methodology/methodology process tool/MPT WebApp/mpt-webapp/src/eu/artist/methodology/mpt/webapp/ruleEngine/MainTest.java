package eu.artist.methodology.mpt.webapp.ruleEngine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import eu.artist.methodology.mpt.model.GlobalVariable;
import eu.artist.methodology.mpt.model.Result;
import eu.artist.methodology.mpt.model.TestVariable;

public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("resource/mpt.xml");
		File tftReport = new File("resource/report.csv");
		File newMATReport= new File ("resource/mpt.xml");
		RuleEngine.INSTANCE.loadNewMATReport(newMATReport);
		RuleEngine.INSTANCE.loadTFTReport(tftReport);
		RuleEngine.INSTANCE.loadMATReport(file);
		RuleEngine.INSTANCE.setRuleFile(new File("resource/RuleSet_1.drl"));
		
		GlobalVariable variable = new GlobalVariable("testVariable", new TestVariable());
		List<GlobalVariable> variables = new ArrayList<GlobalVariable>();
		variables.add(variable);
		
		RuleEngine.INSTANCE.fireRules(variables);
		Result result = RuleEngine.INSTANCE.getResult();
		
		System.out.println("Result: " + result.getStringResult());
		System.out.println(((TestVariable)variable.getVariable()).getTestString());
		
		

		
		
		
		
		
	}

}
