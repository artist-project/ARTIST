/*
* Copyright (c) 2014 Tecnalia.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*
*Zurik Corera (Tecnalia)-SCC component implementation
*
*
*
*
*Initially developed in the context of ARTIST EU project www.artist-project.eu
*/ 

package eu.artist.premigration.tft.scc.metricexplorer;

/*
•	Modifiability = 0.629+0.471*NC – 0.173*NGen – 0.616*NAggH – 0.696*NGenH + 0.396*MaxDIT
•	Scalability = 2.182 + 0.099*AC + 0.100*EC + 0.O97*ND -0 .036*PC +0.068*DMS
•	Understandability = 1.166+0.256*NC – 0.394*NGenH
•	Level Of Complexity (LOC) = 0.269+0.008*Coupling + 0.181*cohesion + 0.119*CC + 0.084*ILCC
•	Maintenance = 2.399 + 0.493*Modifiability + 0.474*Understandability + 0.524*scalability + 0.507*LOC

NC: Number of classes;
NGen: Number of Generalizations; 
NGenH: Number Of Generalizations Hierarchies;
AC: Afferent Coupling;
EC: Efferent Coupling;
ND: Nesting Depth; 
CC: Cyclomatic complexity;
ILCC: IL Cyclometic complexity 
 
  	
*/	


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;






import eu.artist.premigration.tft.scc.structures.Component;
import eu.artist.premigration.tft.scc.structures.Method;
import eu.artist.premigration.tft.scc.structures.Project;
import eu.artist.premigration.tft.scc.structures.SearchResult;
import eu.artist.premigration.tft.scc.structures.SourceFile;
import eu.artist.premigration.tft.scc.structures.UmlElement;

public class MetricCalculator {

	private List<Component> result= new ArrayList<Component>();
	private File folder;
	private String ext="java";
	private String comText="package";
	private int type=1;
	private String impText="import";
	
	
	public List<Component> getMetrics(String folderPath ,String ComponentModelPath ,String ClassModelPath, int type) throws Exception{// type 1 java 2 cshap
		this.folder = new File(folderPath);
		
		if (type==2){//cshap
			this.type=2;
			this.ext="cs";
			this.comText="namespace";
			this.impText="using";
		}
		ComponentExplorer s= new ComponentExplorer(); 

    	List<String> componentList=s.getComponetsList(this.folder, this.ext, this.comText, type);

		for (String com: componentList){
    		Component c = new Component();
    		c.setName(com);
    		result.add(c);
		}
		getClassNumber();
		getEfferentCoupling();
		getAfferentCoupling();
		getCyclomaticComplexity();
		getNesteBlockDepth();
		if (ComponentModelPath!=null &&ClassModelPath!=null){
			getAGH(ComponentModelPath, ClassModelPath);
		}
		getModifiability();
		getUnderstandability();
		getScalability();
		getLevelOfComplexity(type);
		getMaintenance();

		
		return this.result;
	}
	
	public List<Component> getMetricsByComponent(HashMap<String, List<String>> classFiles, List<String> srcPaths, String ComponentModelPath, String ClassModelPath, int type) throws Exception{// type 1 java 2 cshap
		
		if (type==2){//cshap
			this.type=2;
			this.ext="cs";
			this.comText="namespace";
			this.impText="using";
		}
		//initialize classPaths
		for (String com: classFiles.keySet()){
			System.out.println(com+" component size: "+classFiles.get(com).size());
			for (int i=0; classFiles.get(com).size()>i; i++){
				for (String base: srcPaths){
					String str=base+classFiles.get(com).get(i).replace(".", "/");
					str=str.substring(0,str.lastIndexOf("/"))+"."+str.substring(str.lastIndexOf("/")+1);
					File fich = new File(str);
					if (fich.exists()){
						classFiles.get(com).set(i, str);
						break;
					}
				}
			}
    		

		}
		
		//TODO get keywords
		List<String> keywords= new ArrayList<String>();
		keywords.add("String");
		 
		for (String com: classFiles.keySet()){
    		Component c = new Component();
    		c.setName(com);
    		result.add(c);
    		c.setClassNumber(classFiles.get(com).size());
    		c.setCyclomaticComplexity(getCyclomaticComplexity(classFiles.get(com)));
    		c.setNestedBlockDepth(getNesteBlockDepth(classFiles.get(com)));
    		this.getReusability(classFiles.get(com), keywords, c);
		}
		
        System.out.println();
        System.out.println("****** Class Number");
		for (Component com: this.result){
    		System.out.println("Component: " + com.getName() + " Class Number: " + com.getClassNumber());
    	}
		
        System.out.println();
        System.out.println("****** Ciclomatic Complexity");
		for (Component com: this.result){
    		System.out.println("Component: " + com.getName() + " Ciclomatic Complexity: " + com.getCyclomaticComplexity());
    	}
		
        System.out.println();
        System.out.println("****** Nested Bock Depth");
		for (Component com: this.result){
    		System.out.println("Component: " + com.getName() + " Nested Bock Depth : " + com.getNestedBlockDepth());
    	}
		
		getEfferentCoupling(classFiles);
		getAfferentCoupling(classFiles);
		
		if (ComponentModelPath!=null &&ClassModelPath!=null){
			getAGH(ComponentModelPath, ClassModelPath);
		}
		
		getModifiability();
		getUnderstandability();
		getScalability();
		getLevelOfComplexity(type);
		getMaintenance();
		
		return this.result;
		
	}
	
	private void getReusability(List<String> classList, List<String> keywords, Component c) throws Exception{
		Searcher s= new Searcher(); 
		s.addType(this.ext);
		for (String key : keywords) {
			s.addParam(key);
		}
		s.searchInClassList(classList);
		ClassExplorer ce;
		if (this.type==1){
			ce= new JavaExplorer();
		}else{
			ce= new CSExplorer();
		}

		Project p= new Project();
		
		for (SearchResult sr : s.getNoResult()) {
			File sampleFile = new File(sr.getFileName());
			p.addSourceFile(ce.findMethodsParser(sampleFile));
		}

		for (SearchResult sr : s.getResult()) {
			File sampleFile = new File(sr.getFileName());
			p.addSourceFile(ce.findMethodsParser(sampleFile, sr.getLines()));
		}
		c.setReusability(p.getReusability());
		c.setReusabilityLines(p.getReusabilityLines());
		System.out.println("********* Reusability level "+c.getName()+": "+p.getReusability());
		System.out.println("********* Reusability Lines "+c.getName()+": "+p.getReusabilityLines());
		
	}

	
	private void getAGH(String comModel, String classModel) throws Exception{
		UMLExplorer ue= new UMLExplorer();
		File umlfile = new File(comModel);

        UmlElement result=ue.exploreComponents(umlfile);

        umlfile = new File(classModel);

        System.out.println();
        System.out.println("****** AGH");
		
        for(UmlElement e : result.getChilds()){
			ue.exploreComponent(umlfile, e.getChilds());
	        for (Component com: this.result){
	        	if (com.getName().equals(e.getName())){
	    	        System.out.println("Component name: "+e.getName());
	    	        System.out.println("Aggregations number: "+ue.getAggregationNumber());
	    	        System.out.println("Generalizations number: "+ue.getGeneralizationsNumber());
	    	        System.out.println("Hierarchies number: "+ue.getHierarchiesNumber());
	    	        
	    	        com.setAggregations(ue.getAggregationNumber());
	    	        com.setGeneralizations(ue.getGeneralizationsNumber());
	    	        com.setHierarchies(ue.getHierarchiesNumber());
	        		
	        	}
	        }
			
		}
		
	}

	
	private void getClassNumber() throws Exception{
		ComponentExplorer s= new ComponentExplorer(); 

		HashMap<String, List<String>> componentMap=s.getComponetsMap(this.folder, this.ext, this.comText, this.type);
		System.out.println();
		System.out.println("****** Class number");

		for (Component com: this.result){
			com.setClassNumber( componentMap.get(com.getName()).size());
    		System.out.println("Component: " + com.getName() + " Class Number: " + componentMap.get(com.getName()).size());
    	}
		
	}
	
	private void getEfferentCoupling() throws Exception{
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Efferent Coupling");
		HashMap<String, List<String>> componentMap=s.getComponetsMap(this.folder, this.ext, this.comText, this.type);

//    	List<String> componentList=s.getComponetsList(this.folder, this.ext, this.comText, type);

    	CouplingExplorer ce= new CouplingExplorer(); 
    	for (Component com: this.result){
			ce.addParam(this.impText+" "+com.getName());
		}
    	
		for (Component com: this.result){
			ce.clearEfferent();
    		List<String> sourceFiles=componentMap.get(com.getName());
    		for (String sf: sourceFiles){
    			File src = new File(sf);
    			ce.searchReferences(src);
    		}
    		com.setClassNumber(ce.getEfferent().size());
			//System.out.println("Component: "+com.getName()+" Efferent Coupling: "+ce.getCouplingNum());
			System.out.println("Component: "+com.getName()+" Efferent Unique Coupling: "+ce.getEfferent().size());
    	}

		
	}
	
	private void getEfferentCoupling(HashMap<String, List<String>> classFiles) throws Exception{
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Efferent Coupling");

    	CouplingExplorer ce= new CouplingExplorer(); 
    	for (Component com: this.result){
			ce.addParam(this.impText+" "+com.getName());
		}
    	
		for (Component com: this.result){
			ce.clearEfferent();
    		List<String> sourceFiles=classFiles.get(com.getName());
    		for (String sf: sourceFiles){
    			File src = new File(sf);
    			ce.searchReferences(src);
    		}
    		com.setClassNumber(ce.getEfferent().size());
			//System.out.println("Component: "+com.getName()+" Efferent Coupling: "+ce.getCouplingNum());
			System.out.println("Component: "+com.getName()+" Efferent Unique Coupling: "+ce.getEfferent().size());
    	}

		
	}

	private void getAfferentCoupling() throws Exception{
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Afferent Coupling");
		HashMap<String, List<String>> componentMap=s.getComponetsMap(this.folder, this.ext, this.comText, this.type);

    	CouplingExplorer ce= new CouplingExplorer(); 
		for (Component com: this.result){
			ce.clearParam();
			ce.clearEfferent();
			ce.addParam(this.impText+" "+com.getName());
			for (Component com2: this.result){
	    		List<String> sourceFiles=componentMap.get(com2.getName());
	    		for (String sf: sourceFiles){
	    			File src = new File(sf);
	    			ce.searchReferences(src);
	    		}
	    	}
			com.setClassNumber(ce.getCouplingNum());
			System.out.println("Component: "+com.getName()+" Afferent Coupling: "+ce.getCouplingNum());
		}


	}

	private void getAfferentCoupling(HashMap<String, List<String>> classFiles) throws Exception{
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Afferent Coupling");

    	CouplingExplorer ce= new CouplingExplorer(); 
		for (Component com: this.result){
			ce.clearParam();
			ce.clearEfferent();
			ce.addParam(this.impText+" "+com.getName());
			for (Component com2: this.result){
	    		List<String> sourceFiles=classFiles.get(com2.getName());
	    		for (String sf: sourceFiles){
	    			File src = new File(sf);
	    			ce.searchReferences(src);
	    		}
	    	}
			com.setClassNumber(ce.getCouplingNum());
			System.out.println("Component: "+com.getName()+" Afferent Coupling: "+ce.getCouplingNum());
		}


	}

	private void getCyclomaticComplexity() throws Exception{
		
		System.out.println();
		System.out.println("****** Cyclomatic Complexity");

		Searcher s= new Searcher(); 
		s.addType(this.ext);
		s.searchInFolder(this.folder);
		
		ClassExplorer ce;
		if (this.type==1){
			ce= new JavaExplorer();
		}else{
			ce= new CSExplorer();
		}

		//Creacion del objeto Project
		Project p= new Project();
		
		for (SearchResult sr : s.getNoResult()) {

			File sampleFile = new File(sr.getFileName());
			p.addSourceFile(ce.findMethodsParser(sampleFile));
			
		}
		CyclomaticExplorer cy= new CyclomaticExplorer();
		HashMap<String, Float> componentMap= new HashMap<String, Float>();
		String comName="";
		float sfNum=0;
		float ccc=0;
		for (SourceFile sf : p.getSourceFile()) {
			if (!sf.getPackageName().equals("")){

				String actualName=s.getPackageName(sf.getPackageName(),this.type);
				if (!comName.equals(actualName)){
					if (!comName.equals("")){
						ccc=ccc/sfNum;
						//System.out.println("Component:"+comName+" file number: "+sfNum+" Cyclomatic Complexity number: "+ccc);
						componentMap.put(comName,ccc);
						ccc=0;
						sfNum=0;
					}
					comName=actualName;
				}
				//System.out.println();
				//System.out.println("Component name: "+actualName+" Class name: "+sf.getName());
				float cyNum=0;
				for (Method mt : sf.getMethods()) {
					int mcc=cy.getCyclomatic((mt.getCode()));
					cyNum+=mcc;
					//System.out.println(mt.getName()+" Cyclomatic level: "+mcc);
				}
				float sfcc=0;
				if (sf.getMethods().size()>0){
					sfcc=cyNum/sf.getMethods().size();
				}
				//System.out.println("Source file level: "+cyNum+" Method number: "+sf.getMethods().size()+" Cyclomatic Complexity number: "+sfcc);
				
				sfNum++;
				ccc+=sfcc;
			}
		}
		if (!comName.equals("")){
			ccc=ccc/sfNum;
			//System.out.println("********Component:"+comName+" file number: "+sfNum+" Cyclomatic Complexity number: "+ccc);
			componentMap.put(comName,ccc);
		}
		
		for (Component com: this.result){
			com.setCyclomaticComplexity(componentMap.get(com.getName()));
    		System.out.println("Component: " + com.getName() + " Cyclomatic Complexity: " + componentMap.get(com.getName()));
    	}
	}

	private float getCyclomaticComplexity(List<String> classFiles) throws Exception{
		
		ClassExplorer ce;
		if (this.type==1){
			ce= new JavaExplorer();
		}else{
			ce= new CSExplorer();
		}

		//Creacion del objeto Project
		Project p= new Project();
		
		for (String sr : classFiles) {

			File sampleFile = new File(sr);
			p.addSourceFile(ce.findMethodsParser(sampleFile));
			
		}
		CyclomaticExplorer cy= new CyclomaticExplorer();
		float sfNum=0;
		float ccc=0;
		for (SourceFile sf : p.getSourceFile()) {
				float cyNum=0;
				for (Method mt : sf.getMethods()) {
					int mcc=cy.getCyclomatic((mt.getCode()));
					cyNum+=mcc;
					//System.out.println(mt.getName()+" Cyclomatic level: "+mcc);
				}
				float sfcc=0;
				if (sf.getMethods().size()>0){
					sfcc=cyNum/sf.getMethods().size();
				}
				//System.out.println("Source file level: "+cyNum+" Method number: "+sf.getMethods().size()+" Cyclomatic Complexity number: "+sfcc);
				
				sfNum++;
				ccc+=sfcc;
			}
		ccc=ccc/sfNum;
		return ccc;
	}
	
	
	private void getNesteBlockDepth() throws Exception{
		
		System.out.println();
		System.out.println("****** Nested Block Depth");

		Searcher s= new Searcher(); 
		s.addType(this.ext);
		s.searchInFolder(this.folder);
		
		ClassExplorer ce;
		if (this.type==1){
			ce= new JavaExplorer();
		}else{
			ce= new CSExplorer();
		}

		Project p= new Project();
		
		for (SearchResult sr : s.getNoResult()) {
			File sampleFile = new File(sr.getFileName());
			//System.out.println(sr.getFileName());
			p.addSourceFile(ce.findMethodsParser(sampleFile));
			
		}
		NestedBlockDepthExplorer nbde= new NestedBlockDepthExplorer();
		HashMap<String, Float> componentMap= new HashMap<String, Float>();
		String comName="";
		float sfNum=0;
		float ccc=0;
		for (SourceFile sf : p.getSourceFile()) {
			if (!sf.getPackageName().equals("")){
				String actualName=s.getPackageName(sf.getPackageName(),this.type);
				if (!comName.equals(actualName)){
					if (!comName.equals("")){
						ccc=ccc/sfNum;
						//System.out.println("Component:"+comName+" file number: "+sfNum+" Cyclomatic Complexity number: "+ccc);
						componentMap.put(comName,ccc);
						ccc=0;
						sfNum=0;
					}
					comName=actualName;
				}
				//System.out.println();
				//System.out.println("Component name: "+s.getPackageName(sf.getPackageName(),1)+" Class name: "+sf.getName());
				float cyNum=0;
				for (Method mt : sf.getMethods()) {
					int mcc=nbde.getNDB(mt.getCode());
					cyNum+=mcc;
					//System.out.println(mt.getName()+" NBD level: "+mcc);
				}
				float sfcc=0;
				if (sf.getMethods().size()>0){
					sfcc=cyNum/sf.getMethods().size();
				}
						
				//System.out.println("Source file level: "+cyNum+" Method number: "+sf.getMethods().size()+" NDB number: "+sfcc);
				
				
				sfNum++;
				ccc+=sfcc;
			}
		}
		if (!comName.equals("")){
			ccc=ccc/sfNum;
			//System.out.println("********Component:"+comName+" file number: "+sfNum+" Cyclomatic Complexity number: "+ccc);
			componentMap.put(comName,ccc);
		}
		
		for (Component com: this.result){
			com.setCyclomaticComplexity(componentMap.get(com.getName()));
    		System.out.println("Component: " + com.getName() + " Nested Block Depth: " + componentMap.get(com.getName()));
    	}

		
		
	}
	
	private float getNesteBlockDepth(List<String> classFiles) throws Exception{
		
		ClassExplorer ce;
		if (this.type==1){
			ce= new JavaExplorer();
		}else{
			ce= new CSExplorer();
		}

		//Creacion del objeto Project
		Project p= new Project();
		
		for (String sr : classFiles) {

			File sampleFile = new File(sr);
			p.addSourceFile(ce.findMethodsParser(sampleFile));
			
		}
		NestedBlockDepthExplorer nbde= new NestedBlockDepthExplorer();
		float sfNum=0;
		float ccc=0;
		for (SourceFile sf : p.getSourceFile()) {
				float cyNum=0;
				for (Method mt : sf.getMethods()) {
					int mcc=nbde.getNDB((mt.getCode()));
					cyNum+=mcc;
					//System.out.println(mt.getName()+" Cyclomatic level: "+mcc);
				}
				float sfcc=0;
				if (sf.getMethods().size()>0){
					sfcc=cyNum/sf.getMethods().size();
				}
				//System.out.println("Source file level: "+cyNum+" Method number: "+sf.getMethods().size()+" Cyclomatic Complexity number: "+sfcc);
				
				sfNum++;
				ccc+=sfcc;
			}
		ccc=ccc/sfNum;
		return ccc;
	}
	
	
	
	
	private void getModifiability() throws Exception{
//Modifiability = 0.629+0.471*NC – 0.173*NGen – 0.616*NAggH – 0.696*NGenH + 0.396*MaxDIT
		System.out.println();
		System.out.println("****** Modifiability");
		for (Component com: this.result){
			float v=0;
			v=(float) (0.629+0.471*com.getClassNumber() - 0.173*com.getGeneralizations() - 0.616*com.getAggregations() - 0.696*com.getHierarchies() + 0.396*com.getMaxDIT());
			com.setModifiability(v);
    		System.out.println("Component: " + com.getName() + " Modifiability: " + v);
    	}
		
	}
	
	private void getScalability() throws Exception{
//Scalability = 2.182 + 0.099*AC + 0.100*EC + 0.O97*ND -0 .036*PC +0.068*DMS
		System.out.println();
		System.out.println("****** Scalability");
		for (Component com: this.result){
			float v=0;
			v=(float) (2.182 + 0.099*com.getAfferentCoupling() + 0.100*com.getEfferentCoupling() + 0.097*com.getNestedBlockDepth() - 0.036*com.getPercentageCoverage() +0.068*com.getDMS());
			com.setScalability(v);
    		System.out.println("Component: " + com.getName() + " Scalability: " + v);
    	}
		
		
	}
	
	private void getUnderstandability() throws Exception{
//Understandability = 1.166+0.256*NC – 0.394*NGenH
		System.out.println();
		System.out.println("****** Understandability");
		for (Component com: this.result){
			float v=0;
			v=(float) (1.166+0.256*com.getClassNumber() - 0.394*com.getHierarchies());
			com.setUnderstandability(v);
    		System.out.println("Component: " + com.getName() + " Understandability: " + v);
    	}
		
	}
	
	private void getLevelOfComplexity(int type) throws Exception{
//LevelOfComplexity (LOC) = 0.269+0.008*Coupling + 0.181*cohesion + 0.119*CC + 0.084*ILCC
		System.out.println();
		System.out.println("****** LevelOfComplexity");
		for (Component com: this.result){
			float v=0;
			if(type==1){
				v=(float) (0.269+0.008*(com.getAfferentCoupling()+com.getEfferentCoupling())/2 + 0.181*com.getCohesion() + 0.119*com.getCyclomaticComplexity());
			}else{// in Csharp ILCC is used instead of CC
				v=(float) (0.269+0.008*(com.getAfferentCoupling()+com.getEfferentCoupling())/2 + 0.181*com.getCohesion() + 0.084*com.getCyclomaticComplexity());
			}
			com.setLevelOfComplexity(v);
    		System.out.println("Component: " + com.getName() + " LevelOfComplexity: " + v);
    	}
		
	}
	
	private void getMaintenance() throws Exception{
//Maintenance = 2.399 + 0.493*Modifiability + 0.474*Understandability + 0.524*scalability + 0.507*LOC
		System.out.println();
		System.out.println("****** Maintenance");
		for (Component com: this.result){
			float v=0;
			v=(float) (2.399 + 0.493*com.getModifiability() + 0.474*com.getUnderstandability() + 0.524*com.getScalability() + 0.507*com.getLevelOfComplexity());
			com.setMaintenance(v);
    		System.out.println("Component: " + com.getName() + " Maintenance: " + v);
    	}
		
	}
	
private float getModifiability(Component com) throws Exception{
//Modifiability = 0.629+0.471*NC – 0.173*NGen – 0.616*NAggH – 0.696*NGenH + 0.396*MaxDIT
		System.out.println();
		System.out.println("****** Modifiability");
		float v=0;
		v=(float) (0.629+0.471*com.getClassNumber() - 0.173*com.getGeneralizations() - 0.616*com.getAggregations() - 0.696*com.getHierarchies() + 0.396*com.getMaxDIT());
		System.out.println("Component: " + com.getName() + " Modifiability: " + v);
		return v;
	}
	
	private float getScalability(Component com) throws Exception{
//Scalability = 2.182 + 0.099*AC + 0.100*EC + 0.O97*ND -0 .036*PC +0.068*DMS
		System.out.println();
		System.out.println("****** Scalability");
		float v=0;
		v=(float) (2.182 + 0.099*com.getAfferentCoupling() + 0.100*com.getEfferentCoupling() + 0.097*com.getNestedBlockDepth() - 0.036*com.getPercentageCoverage() +0.068*com.getDMS());
		System.out.println("Component: " + com.getName() + " Scalability: " + v);
		return v;
		
	}
	
	private float getUnderstandability(Component com) throws Exception{
//Understandability = 1.166+0.256*NC – 0.394*NGenH
		System.out.println();
		System.out.println("****** Understandability");
		float v=0;
		v=(float) (1.166+0.256*com.getClassNumber() - 0.394*com.getHierarchies());
		System.out.println("Component: " + com.getName() + " Understandability: " + v);
		return v;
		
	}
	
	private float getLevelOfComplexity(Component com, int type) throws Exception{
//LevelOfComplexity (LOC) = 0.269+0.008*Coupling + 0.181*cohesion + 0.119*CC + 0.084*ILCC
		System.out.println();
		System.out.println("****** LevelOfComplexity");
		float v=0;
		if(type==1){
			v=(float) (0.269+0.008*(com.getAfferentCoupling()+com.getEfferentCoupling())/2 + 0.181*com.getCohesion() + 0.119*com.getCyclomaticComplexity());
		}else{// in Csharp ILCC is used instead of CC
			v=(float) (0.269+0.008*(com.getAfferentCoupling()+com.getEfferentCoupling())/2 + 0.181*com.getCohesion() + 0.084*com.getCyclomaticComplexity());
		}
		System.out.println("Component: " + com.getName() + " LevelOfComplexity: " + v);
		return v;
		
	}
	
	private float getMaintenance(Component com) throws Exception{
//Maintenance = 2.399 + 0.493*Modifiability + 0.474*Understandability + 0.524*scalability + 0.507*LOC
		System.out.println();
		System.out.println("****** Maintenance");
		float v=0;
		v=(float) (2.399 + 0.493*com.getModifiability() + 0.474*com.getUnderstandability() + 0.524*com.getScalability() + 0.507*com.getLevelOfComplexity());
		System.out.println("Component: " + com.getName() + " Maintenance: " + v);
		return v;
		
	}
	

	
	
}
