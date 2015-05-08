<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="el" xml:lang="el" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Phase: Migration</title>
<meta name="uma.type" content="Phase">
<meta name="uma.name" content="Migration">
<meta name="uma.presentationName" content="Migration">
<meta name="element_type" content="other">
<meta name="filetype" content="description">
<meta name="role" content="none">
<link rel="StyleSheet" href="./../../css/default.css" type="text/css">
<script src="./../../scripts/ContentPageResource.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSubSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ActivityTreeTable.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ProcessElementPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageToolbar.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/contentPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/processElementData.js" type="text/javascript" language="JavaScript"></script><script type="text/javascript" language="JavaScript">
					var defaultQueryStr = '?proc=_boyq0RvEEeSVgNVCd9uEdQ&path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ';
					var backPath = './../../';
					var imgPath = './../../images/';
					var nodeInfo=null;
					contentPage.preload(imgPath, backPath, nodeInfo,  defaultQueryStr, false, true, true);
				</script>
</head>
<body onclick="checkTasks()">
<% MPTProcessorBean Task = new MPTProcessorBean(); %>

<script language="JavaScript" type="text/javascript">
function checkTasks() {
	

	if (<%= Task.isTEBENCHVisible()%> == false)
		document.getElementById("6ca97195").style.display = 'none';
	
	if (<%= Task.isTEMPOPVisible()%> == false)
		document.getElementById("6d8c1433").style.display = 'none';
	
	if (<%= Task.isAPAPUPVisible()%> == false)
		document.getElementById("c207d87f").style.display = 'none';
	
	if (<%= Task.isAPACLASVisible()%> == false)
		document.getElementById("658f5574").style.display = 'none';
	
	if (<%= Task.isSCTARGETVisible()%> == false)
		document.getElementById("c156588e").style.display = 'none';
	
	if (<%= Task.isGSCODEVisible()%> == false)
		document.getElementById("1667c7b2").style.display = 'none';
	
	if (<%= Task.isGDEPLVisible()%> == false)
		document.getElementById("67583dd4").style.display = 'none';
	
	if (<%= Task.isVERBETCOptional()%> == true)
		alert("VERBETC is optional");

	if (<%= Task.isMCRPVisible()%> == false)
		document.getElementById("1b8b5878").style.display = 'none';
	
	if (<%= Task.isRAPVisible()%> == false)
		document.getElementById("1c6ea67f").style.display = 'none';
	
	if (<%= Task.isDPVisible()%> == false)
		document.getElementById("6d9653b0").style.display = 'none';
	
	if (<%= Task.isUMPVisible()%> == false)
		document.getElementById("7492d600").style.display = 'none';
	
	if (<%= Task.isVALPROVisible()%> == false)
		document.getElementById("6cab76f7").style.display = 'none';
	
	if (<%= Task.isCUSTOMERVisible()%> == false)
		document.getElementById("6c9a6263").style.display = 'none';
	
	if (<%= Task.isSLAMPVisible()%> == false)
		document.getElementById("6e6a56ed").style.display = 'none';
	
	
	
	
	
	  }	
				
			</script>	




<div id="breadcrumbs"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td valign="top">
<div autoWrap="true">
<div id="page-guid" value="_lipZ8RvGEeSVgNVCd9uEdQ"></div>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="pageTitle" nowrap="true">Phase: Migration</td><td width="100%">
<div align="right" id="contentPageToolbar"></div>
</td><td width="100%" class="expandCollapseLink" align="right"><a name="mainIndex" href="./../../index.htm"></a><script language="JavaScript" type="text/javascript" src="./../../scripts/treebrowser.js"></script></td>
</tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
<td class="pageTitleSeparator"><img src="./../../images/shim.gif" alt="" title="" height="1"></td>
</tr>
</table>
<div class="overview">
<table width="97%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="50"><img src="./../../images/phase.gif" alt="" title=""></td><td>
<table class="overviewTable" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top"></td>
</tr>
</table>
</td>
</tr>
</table>
</div>
</div>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr valign="middle">
<td width="10" class="tab"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_Description" href="./../../ARTIST Methodology M30/capabilitypatterns/Migration_33DD5A3A.html_desc.html">Description</a></td><td width="21"><img src="./../../images/tab_middle-i_a.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="activeTab"><span style="white-space:nowrap;">Work Breakdown Structure</span></td><td width="1"><img src="./../../images/tab_middle-a_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_TBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Migration_33DD5A3A.html_tbs.html"><span style="white-space:nowrap;">Team Allocation</span></a></td><td width="21"><img src="./../../images/tab_middle-i_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_WPBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Migration_33DD5A3A.html_wpbs.html"><span style="white-space:nowrap;">Work Product Usage</span></a></td><td width="21"><img src="./../../images/tab_end-i.gif" width="21" height="17" alt="" title=""></td><td width="50%"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td>
</tr>
<tr>
<td colspan="2"><img src="./../../images/shim.gif" height="2" alt="" title=""></td><td><img src="./../../images/tab_space_middle.gif" width="21" height="2" alt="" title=""></td><td class="activeTab"><img src="./../../images/shim.gif" width="10" height="2" alt="" title=""></td><td><img src="./../../images/tab_space.gif" width="21" height="2" alt="" title=""></td><td colspan="5"><img src="./../../images/shim.gif" height="2" alt="" title=""></td>
</tr>
<tr>
<td colspan="10" class="activeTab"><img src="./../../images/shim.gif" height="5" alt="" title=""></td>
</tr>
</table>
<div class="sectionHeading">Workflow</div>
<div class="sectionContent">
<table class="sectionTable" border="0" cellspacing="0" cellpadding="0">
<tr>
<td class="sectionTableSingleCell" colspan="2" align="left">
<p></p>
<img border="0" diagramType="Activity" id="diagram_Activity" src="./../../ARTIST Methodology M30/capabilitypatterns/resources/Migration_33DD5A3A_Activity.jpeg" alt="Activity diagram: Migration" title="Activity diagram: Migration" usemap="#Activity_Migration"><map name="Activity_Migration">
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Application Discovery Understanding_E62EF8BA.html" relpath=",_mw4HoRvGEeSVgNVCd9uEdQ" alt="Application Discovery &amp; Understanding" title="Application Discovery &amp; Understanding" coords="130, 155, 322, 204" shape="rect" guid="_mw4HoRvGEeSVgNVCd9uEdQ"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.jsp" relpath=",_twp9MRvGEeSVgNVCd9uEdQ" alt="Target Environment Specification" title="Target Environment Specification" coords="385, 275, 543, 324" shape="rect" guid="_twp9MRvGEeSVgNVCd9uEdQ"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Modernization_454C9CFC.jsp" relpath=",_zd3-sRvGEeSVgNVCd9uEdQ" alt="Modernization" title="Modernization" coords="615, 170, 683, 219" shape="rect" guid="_zd3-sRvGEeSVgNVCd9uEdQ"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.jsp" relpath=",_96FfEXFeEeSNzfNcO5_Rug" alt="Process related" title="Process related" coords="40, 75, 120, 125" shape="rect" guid="_96FfEXFeEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Business Model Definition_177525F3.jsp" relpath=",_0Gq64XF3EeSNzfNcO5_Rug" alt="Business Model Definition" title="Business Model Definition" coords="190, 70, 327, 120" shape="rect" guid="_0Gq64XF3EeSNzfNcO5_Rug"></area>
</map>
</td>
</tr>
</table>
</div>
<div class="sectionHeading">Work Breakdown</div>
<div class="sectionContent">
<div id="treeContent"></div>
<script language="JavaScript">
contentPage.processPage.treeTable.data = {
title: "Work Breakdown", summary: "Work Breakdown", 
columns: [
["presentation_name", "Breakdown Element"],
["steps", "Steps"],
["id", "Index"],
["predecessors", "Predecessors"],
["model_info", "Model Info"],
["type", "Type"],
["is_planned", "Planned"],
["is_repeatable", "Repeatable"],
["has_multiple_occurrences", "Multiple Occurrences"],
["is_ongoing", "Ongoing"],
["is_event_driven", "Event Driven"],
["is_optional", "Optional"],
["teams", "Team"]],
rows: [
		
{id: "1d2b443e", parentId: "", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "35", prefix: "", name: "Application Discovery & Understanding ", title: "Application Discovery & Understanding ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Discovery Understanding_E62EF8BA.html", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "224abd04", parentId: "1d2b443e", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "36", prefix: "", name: "Model Discovery", title: "MODELDISCO", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model Discovery_B5A377C1.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "153d2681", parentId: "224abd04", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q,_MyVOQG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "37", prefix: "", name: "Classify the input non-cloud artefacts", title: "MODELDISCO.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classify the input non-cloud artefacts_C0922740.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "679ffd4e", parentId: "224abd04", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q,_P_XK8G8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "38", prefix: "", name: "Inject the content of the non-cloud artefacts as initial models", title: "MODELDISCO.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inject the content of the non-cloud artefacts as initial models_72F578B6.html", 
	predecessors: "37", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "18317d50", parentId: "224abd04", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q,_RoH4gG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "39", prefix: "", name: "Map the initial models to models that conform to another metamodel", title: "MODELDISCO.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Map the initial models to models that conform to another metamod_6BEC9B6E.html", 
	predecessors: "38", info: "", type: "Task Descriptor", 
	repeatable: "true", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "14104686", parentId: "1d2b443e", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "40", prefix: "", name: "Model Understanding", title: "MODELUNDER", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model Understanding_76FDD728.html", 
	predecessors: "36", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "753603d4", parentId: "14104686", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q,_jAWIkG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "41", prefix: "", name: "Refine the models", title: "MODELUNDER.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Refine the models_48B71A0A.html", 
	predecessors: "36", info: "", type: "Task Descriptor", 
	repeatable: "true", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "227535a3", parentId: "14104686", relPath: ",_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q,_jcXWMG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "42", prefix: "", name: "Manual refinement or amendment of generated models", title: "MODELUNDER.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Manual refinement or amendment of generated models_12E26477.html", 
	predecessors: "41", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c7f26723", parentId: "", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "43", prefix: "", name: "Target Environment Specification", title: "Target Environment Specification", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.jsp", 
	predecessors: "35", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6ca97195", parentId: "c7f26723", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "44", prefix: "", name: " Target Environment Benchmarking", title: "TEBENCH ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Benchmarking_8F721461.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "764a01f1", parentId: "6ca97195", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw,_NMBYQG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "45", prefix: "", name: "Benchmark Selection and Application Categorization", title: "TEBENCH.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark Selection and Application Categorization_F6D0915F.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6826c960", parentId: "6ca97195", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw,_PMeNEG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "46", prefix: "", name: "Benchmark execution and result storage", title: "TEBENCH.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark execution and result storage_A1D388DB.html", 
	predecessors: "45", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d8c1433", parentId: "c7f26723", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "47", prefix: "", name: "Target Environment Model Population", title: "TEMPOP ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Model Population_707A1ABB.html", 
	predecessors: "44", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7626b25e", parentId: "6d8c1433", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw,_TZIawG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "48", prefix: "", name: "Metamodel definition", title: "TEMPOP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Metamodel definition_B21EE3E1.html", 
	predecessors: "45", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1e280da0", parentId: "6d8c1433", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw,_UUSbcG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "49", prefix: "", name: "Model instances creation", title: "TEMPOP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model instances creation_783EEA06.html", 
	predecessors: "48", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78c20e39", parentId: "6d8c1433", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw,_VTBUkG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "50", prefix: "", name: "Benchmark results inclusion", title: "TEMPOP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark results inclusion_43548D00.html", 
	predecessors: "49", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c207d87f", parentId: "c7f26723", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "51", prefix: "", name: "Application Components Performance and Usage profiling", title: "APAPUP ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Components Performance and Usage profiling_FEDEFCC3.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1a857267", parentId: "c207d87f", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_X5UBYG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "52", prefix: "", name: "Target app VM creation", title: "APAPUP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target app VM creation_E4F6092B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1c2dd165", parentId: "c207d87f", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_X5UBYW8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "53", prefix: "", name: "Target app VM profiling", title: "APAPUP.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target app VM profiling_EF93E93B.html", 
	predecessors: "52", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "13a7a084", parentId: "c207d87f", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_1iDA0G8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "54", prefix: "", name: "Benchmark VM creation", title: "APAPUP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark VM creation_4AE1A41F.html", 
	predecessors: "52", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "18fc378f", parentId: "c207d87f", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_1iDA0W8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "55", prefix: "", name: "Benchmark VM profiling", title: "APAPUP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark VM profiling_557F842F.html", 
	predecessors: "54,53", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "658f5574", parentId: "c7f26723", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "56", prefix: "", name: "Application Artefacts Classification", title: "APACLAS", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Artefacts Classification_5E40F31F.html", 
	predecessors: "51", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "bcf6f30a", parentId: "658f5574", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw,_Y16XEG8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "57", prefix: "", name: "Classifier Training", title: "APACLAS.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classifier Training_D7991EB0.html", 
	predecessors: "55", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b77d5dc", parentId: "658f5574", relPath: ",_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw,_Y16XEW8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "58", prefix: "", name: "Classifier Usage and Conclusion", title: "APACLAS.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classifier Usage and Conclusion_E236FEC0.html", 
	predecessors: "57,53", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1dd426d0", parentId: "", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "59", prefix: "", name: "Modernization", title: "Modernization", url: "./../../ARTIST Methodology M30/capabilitypatterns/Modernization_454C9CFC.jsp", 
	predecessors: "35,43", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6e993119", parentId: "1dd426d0", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "60", prefix: "", name: "Express Migration Requirements", title: "EMREQ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Express Migration Requirements_38D49CE5.jsp", 
	predecessors: "40,88,101,47,176", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1765e0f9", parentId: "6e993119", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_R89G8G8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "61", prefix: "", name: "Select non-cloud PIM view", title: "EMREQ.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select non-cloud PIM view_F395828B.html", 
	predecessors: "42", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "18f50c44", parentId: "6e993119", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_SigrEG8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "62", prefix: "", name: "Annotate non-cloud PIM view with requirements", title: "EMREQ.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Annotate non-cloud PIM view with requirements_97DA6EB.html", 
	predecessors: "61", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "13a85114", parentId: "6e993119", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_TBDoQG8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "63", prefix: "", name: "Annotate PSM with monitoring and billing components", title: "EMREQ.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Annotate PSM with monitoring and billing components_C76D2017.html", 
	predecessors: "61,92,90,179,180", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78e65d3c", parentId: "6e993119", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_TmKgcG8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "64", prefix: "", name: "Annotate PIM with cloud provider requirements", title: "EMREQ.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Annotate PIM with cloud provider requirements_9F7A1181.html", 
	predecessors: "61,102", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c156588e", parentId: "1dd426d0", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "65", prefix: "", name: "Select Cloud Target", title: "SCTARGET", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select Cloud Target_A1FE6C17.jsp", 
	predecessors: "60", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c320ff39", parentId: "c156588e", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg,_E_KM0G_JEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "66", prefix: "", name: "Select annotated non-cloud PIM", title: "SCTARGET.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select annotated non-cloud PIM_BA84BC11.html", 
	predecessors: "60", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "64539ca8", parentId: "c156588e", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg,_PohqIG_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "67", prefix: "", name: "Match and rank the best cloud environments", title: "SCTARGET.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Match and rank the best cloud environments_F3A66162.html", 
	predecessors: "66", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6f4c879d", parentId: "c156588e", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg,_QlK4kG_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "68", prefix: "", name: "Select Target Cloud Environment", title: "SCTARGET.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select Target Cloud Environment_30D2AFDC.html", 
	predecessors: "67", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6f50d36c", parentId: "1dd426d0", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "69", prefix: "", name: "Cloudify and Optimize application features", title: "OPTAPPFEA", url: "./../../ARTIST Methodology M30/capabilitypatterns/Cloudify and Optimize application features_83823EFB.html", 
	predecessors: "65", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c49def8f", parentId: "6f50d36c", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg,_jmwSIG_SEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "70", prefix: "", name: "Cloudify the non-cloud PIM", title: "OPTAPPFEA.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Cloudify the non-cloud PIM_D8FB1644.html", 
	predecessors: "66", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c067eb20", parentId: "6f50d36c", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg,_vWG_wG_TEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "71", prefix: "", name: "Optimize the cloudified PIM", title: "OPTAPPFEA.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Optimize the cloudified PIM_F3D12BB1.html", 
	predecessors: "68,70", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d9ced10", parentId: "1dd426d0", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "72", prefix: "", name: "Non-functional goals validation  model level", title: "NFVALML", url: "./../../ARTIST Methodology M30/capabilitypatterns/Non-functional goals validation model level_11F6FD4B.html", 
	predecessors: "69,7", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c839caae", parentId: "6d9ced10", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg,_MsgAEG_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "73", prefix: "", name: "Process MAT report for model-level evaluation", title: "NFVALML.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Process MAT report for model-level evaluation_4C788E4D.html", 
	predecessors: "8", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b9bb0a8", parentId: "6d9ced10", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg,_NE8VQG_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "74", prefix: "", name: "Nonfunctional properties model level evaluation", title: "NFVALML.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Nonfunctional properties model level evaluation_1E9C6E96.html", 
	predecessors: "73,71", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "19e12792", parentId: "6d9ced10", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg,_NWq-cG_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "75", prefix: "", name: "Conclusions about goal fulfilment", title: "NFVALML.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Conclusions about goal fulfilment_765EAB14.html", 
	predecessors: "74,8", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1667c7b2", parentId: "1dd426d0", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "76", prefix: "", name: "GSCODE", title: "GSCODE", url: "./../../ARTIST Methodology M30/capabilitypatterns/GSCODE_5C928129.html", 
	predecessors: "69", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6b1672c3", parentId: "1667c7b2", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_bj4cUG_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "77", prefix: "", name: "Select the optimized PSM", title: "GSCODE.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select the optimized PSM_8EDA9F80.html", 
	predecessors: "71", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c3dfaf36", parentId: "1667c7b2", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_cgFl4G_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "78", prefix: "", name: "Apply specific target generation patterns", title: "GSCODE.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Apply specific target generation patterns_1D25D614.html", 
	predecessors: "77", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78d558d4", parentId: "1667c7b2", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_dJqHUG_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "79", prefix: "", name: "Generate source code", title: "GSCODE.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate source code_895F29E6.html", 
	predecessors: "78", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "122b1c86", parentId: "1667c7b2", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_dXXMIm_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "80", prefix: "", name: "Inject reusable code", title: "GSCODE.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inject reusable code_61A2EB24.html", 
	predecessors: "79", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78c562d0", parentId: "1667c7b2", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_drCWEG_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "81", prefix: "", name: "Manual completion of generated source code", title: "GSCODE.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Manual completion of generated source code_A60E995B.html", 
	predecessors: "80", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "67583dd4", parentId: "1dd426d0", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "82", prefix: "", name: "Generate Deployment", title: "GDEPL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate Deployment_D0C656A7.html", 
	predecessors: "76", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1d411a54", parentId: "67583dd4", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_pKetgG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "83", prefix: "", name: "Select modernized application", title: "GDEPL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select modernized application_41C3C484.html", 
	predecessors: "78", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1ee79d32", parentId: "67583dd4", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_qEJgcG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "84", prefix: "", name: "Express deployment requirements", title: "GDEPL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Express deployment requirements_8AB3A2CF.html", 
	predecessors: "83", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "173a48a2", parentId: "67583dd4", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_qeX-UG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "85", prefix: "", name: "Generate deployment descriptors and scripts", title: "GDEPL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate deployment descriptors and scripts_701788B5.html", 
	predecessors: "84", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "77bebc9e", parentId: "67583dd4", relPath: ",_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_q1KtsG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "86", prefix: "", name: "Generate deployment units", title: "GDEPL.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate deployment units_312763D7.html", 
	predecessors: "85", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6ae7b324", parentId: "", relPath: ",_96FfEXFeEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "87", prefix: "", name: "Process related tasks", title: "Process related", url: "./../../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.jsp", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6e6a56ed", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "88", prefix: "", name: "SLAMP", title: "SLAMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/SLAMP_6ED80D9B.jsp", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "70431b0c", parentId: "6e6a56ed", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_SuHHoHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "89", prefix: "", name: "Determine SLA frameworks", title: "SLAMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine SLA frameworks_4600B941.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6cc4a836", parentId: "6e6a56ed", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_S-NZIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "90", prefix: "", name: "Determine, document and agree requirements for existing and new services", title: "SLAMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine, document and agree requirements for existing and new _711A022B.html", 
	predecessors: "89", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6a0274ed", parentId: "6e6a56ed", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_Un23gHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "91", prefix: "", name: "Review underpinning agreements", title: "SLAMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review underpinning agreements_F6BF601.html", 
	predecessors: "90", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "13ec844f", parentId: "6e6a56ed", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_TjnMQHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "92", prefix: "", name: "Monitor service performance against SLA", title: "SLAMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor service performance against SLA_9F352292.html", 
	predecessors: "91", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c25ac8f2", parentId: "6e6a56ed", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_UEGDIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "93", prefix: "", name: "Produce service reports", title: "SLAMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Produce service reports_AA6B3852.html", 
	predecessors: "92", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "16f3dab1", parentId: "6e6a56ed", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_tHxREHFhEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "94", prefix: "", name: "Review SLAs and underpinning agreements", title: "SLAMP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review SLAs and underpinning agreements_51225ED9.html", 
	predecessors: "92,90,91,93", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7492d600", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "95", prefix: "", name: "UMP", title: "UMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/UMP_EDBF639D.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "222e139e", parentId: "7492d600", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_diSb4HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "96", prefix: "", name: "Planning the releases", title: "UMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Planning the releases_2759A24E.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "6954065c", parentId: "7492d600", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_c9fFsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "97", prefix: "", name: "Build and test the release", title: "UMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Build and test the release_566CBD11.html", 
	predecessors: "96", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "1e362816", parentId: "7492d600", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_dzbPMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "98", prefix: "", name: "Release testing and pilot", title: "UMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Release testing and pilot_4C41B4E5.html", 
	predecessors: "97", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1dd3dee0", parentId: "7492d600", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_dPD94HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "99", prefix: "", name: "Perform transfer, deployment and retirement", title: "UMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Perform transfer, deployment and retirement_69A4713B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "6a02245a", parentId: "7492d600", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_eD0boHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "100", prefix: "", name: "Verify, review and close deployment", title: "UMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Verify, review and close deployment_7E42AF70.html", 
	predecessors: "99", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1a5e65cc", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "101", prefix: "", name: "CPMP", title: "CPMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/CPMP_77C1929F.html", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1dd3a283", parentId: "1a5e65cc", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_iFdsIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "102", prefix: "", name: "Define the main features to be fulfilled by the cloud provider", title: "CPMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the main features to be fulfilled by the cloud provider_3913FD71.html", 
	predecessors: "173", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "10b4981d", parentId: "1a5e65cc", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_jSgHAHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "103", prefix: "", name: "Select cloud provider", title: "CPMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select cloud provider_6A163657.html", 
	predecessors: "102", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c4027acd", parentId: "1a5e65cc", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_ibXqsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "104", prefix: "", name: "Establish the cloud provider agreement", title: "CPMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish the cloud provider agreement_62D320AD.html", 
	predecessors: "103,173", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1ba184c1", parentId: "1a5e65cc", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_iucXsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "105", prefix: "", name: "Monitor the fulfilment of the conditions", title: "CPMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the fulfilment of the conditions_307E037C.html", 
	predecessors: "104", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c54b95a5", parentId: "1a5e65cc", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_i-PHMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "106", prefix: "", name: "Report and control the non-fulfilment", title: "CPMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Report and control the non-fulfilment_6C28617D.html", 
	predecessors: "105", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "78c9fce7", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "107", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_B93C3581.html", 
	predecessors: "124", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c2dfc9ce", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_mFBR8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "108", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_FF05D15F.html", 
	predecessors: "128", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "be8180db", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_m15VQHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "109", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_9C2A6702.html", 
	predecessors: "108", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "13e11c6f", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_lfUj4HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "110", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_72535189.html", 
	predecessors: "109", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "11effe56", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_naaXkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "111", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_E154BCCD.html", 
	predecessors: "110", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "2087c005", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_nF11wHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "112", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_BC5B6F.html", 
	predecessors: "111", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "6b318c28", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_mddnIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "113", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_C8C3C446.html", 
	predecessors: "112", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "12ee6ac8", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_nwdgEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "114", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_8CB382B5.html", 
	predecessors: "113", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "6847f2bf", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_n_D8wHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "115", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_C57EA5C.html", 
	predecessors: "114", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c496b147", parentId: "78c9fce7", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_lOLwkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "116", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_D8E34511.html", 
	predecessors: "115", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1ed5762f", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "117", prefix: "", name: "MP", title: "MP", url: "./../../ARTIST Methodology M30/capabilitypatterns/MP_236F7095.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6e8dd0b4", parentId: "1ed5762f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_rjNY8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "118", prefix: "", name: "Analysis the market for the migrated solution", title: "MP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis the market for the migrated solution_E063B559.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "c20d85f2", parentId: "1ed5762f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_r5tNYHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "119", prefix: "", name: "Identify the Marketing objectives", title: "MP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify the Marketing objectives_273AA672.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "12ecd3c5", parentId: "1ed5762f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_sU1DIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "120", prefix: "", name: "Identify the Marketing Strategy", title: "MP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify the Marketing Strategy_4FBE02DA.html", 
	predecessors: "119", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "70517671", parentId: "1ed5762f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_tN5ZIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "121", prefix: "", name: "Start implementing the market strategy", title: "MP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Start implementing the market strategy_C940C704.html", 
	predecessors: "120", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "6728e8a4", parentId: "1ed5762f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_s8wl0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "122", prefix: "", name: "Monitor the market plan", title: "MP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the market plan_290B0258.html", 
	predecessors: "121", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c831a06e", parentId: "1ed5762f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_smjsUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "123", prefix: "", name: "Monitor the market", title: "MP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the market_A3C4DFC.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b8b5878", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "124", prefix: "", name: "MCRP", title: "MCRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.jsp", 
	predecessors: "162", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6d4f89d2", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_wQXEkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "125", prefix: "", name: "Define a communication mechanism with the user", title: "MCRP.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define a communication mechanism with the user_6A2329AA.html", 
	predecessors: "165", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "c54f03d0", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_wf25IHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "126", prefix: "", name: "Define the appropriate physical and Logical structure for the communication mechanism", title: "MCRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the appropriate physical and Logical structure for the co_1AA356F7.html", 
	predecessors: "125", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "754b9113", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_xuFm0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "127", prefix: "", name: "Registration Communication", title: "MCRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Registration Communication_41CA80C2.html", 
	predecessors: "126", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6573a348", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_xOfgwHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "128", prefix: "", name: "Initial diagnosis", title: "MCRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_9C8478F.html", 
	predecessors: "127", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "c3099809", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "129", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_A1BF6539.html", 
	predecessors: "128", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7b37a278", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h3XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "130", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_EDE5D7D.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "c2f5f489", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h0nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "131", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_AFC1CB36.html", 
	predecessors: "130", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "13c3232f", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h3nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "132", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_FD777193.html", 
	predecessors: "131", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "781a0830", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h4nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "133", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_C20953B2.html", 
	predecessors: "132", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "65c71860", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h5XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "134", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_980221BB.html", 
	predecessors: "133", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "13f325f2", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h43FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "135", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_2AE32977.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "c3acce57", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h33FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "136", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_66514758.html", 
	predecessors: "135", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "75416266", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h6nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "137", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_4B2D17F0.html", 
	predecessors: "136", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "12476258", parentId: "c3099809", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h03FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "138", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_189BA0FB.html", 
	predecessors: "137", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "6f31d7c5", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_w_JdMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "139", prefix: "", name: "Inform the user", title: "MCRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inform the user_4E303443.html", 
	predecessors: "107,129", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "171f6437", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_wxvTUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "140", prefix: "", name: "Incidence closure", title: "MCRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence closure_A2D9FB18.html", 
	predecessors: "139", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "c02e1798", parentId: "1b8b5878", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_xfejEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "141", prefix: "", name: "Measure and analysis user feedback", title: "MCRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Measure and analysis user feedback_48657AFC.html", 
	predecessors: "140", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1c6ea67f", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "142", prefix: "", name: "RAP", title: "RAP", url: "./../../ARTIST Methodology M30/capabilitypatterns/RAP_C7DEDC90.html", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7732ace0", parentId: "1c6ea67f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_7wnbsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "143", prefix: "", name: "Define the new roles", title: "RAP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the new roles_2D830F.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "72e624e3", parentId: "1c6ea67f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_8FoCYHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "144", prefix: "", name: "Modify the existing roles", title: "RAP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Modify the existing roles_269B48D7.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c823d026", parentId: "1c6ea67f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_8cH20HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "145", prefix: "", name: "Train people", title: "RAP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Train people_2699BB33.html", 
	predecessors: "143,144", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "78d10d05", parentId: "1c6ea67f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_6wFy0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "146", prefix: "", name: "Communicate the affected people their new activities and responsibilities", title: "RAP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Communicate the affected people their new activities and respons_507EE3D2.html", 
	predecessors: "145", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1c43f11a", parentId: "1c6ea67f", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_7IrR8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "147", prefix: "", name: "Communicate the entire organisation the new and modified roles", title: "RAP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Communicate the entire organisation the new and modified roles_32F38628.html", 
	predecessors: "146", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d9653b0", parentId: "6ae7b324", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "148", prefix: "", name: "DP", title: "DP", url: "./../../ARTIST Methodology M30/capabilitypatterns/DP_56F7EE33.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "676cb437", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_BKBJUHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "149", prefix: "", name: "Requirements elicitation", title: "DP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Requirements elicitation_D69B3DEB.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "beb1b3ba", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_CAQ00HFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "150", prefix: "", name: "Select the requirements to be developed in the sprint", title: "DP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select the requirements to be developed in the sprint_253F54FC.html", 
	predecessors: "149", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "79a3abdb", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_ArLRMHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "151", prefix: "", name: "Analysis and modelling", title: "DP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis and modelling_907946B9.html", 
	predecessors: "150", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "7995672c", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_A5L4AHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "152", prefix: "", name: "Development", title: "DP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Development_3F38B8EA.html", 
	predecessors: "151", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "bee2d52b", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_CeNVEHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "153", prefix: "", name: "Testing of functional and non functional requirements", title: "DP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Testing of functional and non functional requirements_DB1E6734.html", 
	predecessors: "152", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "72add5d0", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_BrjJEHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "154", prefix: "", name: "Review and add the requirements", title: "DP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review and add the requirements_AA14017A.html", 
	predecessors: "153", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "10575c35", parentId: "6d9653b0", relPath: ",_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_COalkHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "155", prefix: "", name: "Test and deploy the final application", title: "DP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Test and deploy the final application_D1482E5B.html", 
	predecessors: "154", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "bd0a45cb", parentId: "", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "156", prefix: "", name: "Business Model Definition", title: "Business Model Definition", url: "./../../ARTIST Methodology M30/capabilitypatterns/Business Model Definition_177525F3.jsp", 
	predecessors: "87", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6cab76f7", parentId: "bd0a45cb", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "157", prefix: "", name: "Value Proposition", title: "VALPRO", url: "./../../ARTIST Methodology M30/capabilitypatterns/Value Proposition_B1DF2148.html", 
	predecessors: "117", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "103f1d6a", parentId: "6cab76f7", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_Dmfe4HF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "158", prefix: "", name: "Identify and analyse the customers needs and motivation", title: "VALPRO.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify and analyse the customers needs and motivation_962D7210.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6e8c4073", parentId: "6cab76f7", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_CeOPQHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "159", prefix: "", name: "Define the functionalities that need to be delivered to each customer segment in order to solve their needs", title: "VALPRO.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the functionalities that need to be delivered to each cus_40E2618E.html", 
	predecessors: "158", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c0930b91", parentId: "6cab76f7", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_DYL9IHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "160", prefix: "", name: "Define the value delivered to each customer segment", title: "VALPRO.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the value delivered to each customer segment_DA793DB5.html", 
	predecessors: "159", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "77ca1203", parentId: "6cab76f7", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_B6da4HF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "161", prefix: "", name: "Continuously monitor the value proposition", title: "VALPRO.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Continuously monitor the value proposition_CE580A59.html", 
	predecessors: "160", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6c9a6263", parentId: "bd0a45cb", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "162", prefix: "", name: "Customer interface", title: "CUSTOMER", url: "./../../ARTIST Methodology M30/capabilitypatterns/Customer interface_962A8F69.jsp", 
	predecessors: "157,117,88", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "78dd8ac0", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_rVotoHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "163", prefix: "", name: "Analyse expected relationships from each customer segment", title: "CUSTOMER.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analyse expected relationships from each customer segment_1FC24CD6.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "76482615", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_sH20wHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "164", prefix: "", name: "Gap Analysis", title: "CUSTOMER.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Gap Analysis_47A79F78.html", 
	predecessors: "118,163", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7664bb4e", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_sZbs8HF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "165", prefix: "", name: "Implement generic customer relationship mechanisms", title: "CUSTOMER.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Implement generic customer relationship mechanisms_C72043C.html", 
	predecessors: "164", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "789fad1a", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_tJt6YHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "166", prefix: "", name: "Instantiate these generic mechanisms to the corresponding customer segment", title: "CUSTOMER.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Instantiate these generic mechanisms to the corresponding custom_67FE547B.html", 
	predecessors: "165", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1648d9c2", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_r1rfoHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "167", prefix: "", name: "Determine sales channels", title: "CUSTOMER.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine sales channels_C53AFBC0.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c3e7349e", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_s8mrcXF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "168", prefix: "", name: "Implement sales channels", title: "CUSTOMER.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Implement sales channels_958A18B3.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6af5bf5f", parentId: "6c9a6263", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_rmemAHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "169", prefix: "", name: "Deliver the value proposition to the customers", title: "CUSTOMER.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Deliver the value proposition to the customers_434EADDE.html", 
	predecessors: "161,92,93,166,167,168", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1c6f204b", parentId: "bd0a45cb", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "170", prefix: "", name: "Operational infrastructure ", title: "OPERATIONAL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Operational infrastructure_4838F228.jsp", 
	predecessors: "157,162", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "11f8a1f7", parentId: "1c6f204b", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_usI58HF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "171", prefix: "", name: "Determine key personnel resources", title: "OPERATIONAL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine key personnel resources_4037414F.html", 
	predecessors: "159,163", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "79b16358", parentId: "1c6f204b", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_u7C4oHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "172", prefix: "", name: "Determine the key non-personnel resources", title: "OPERATIONAL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the key non-personnel resources_4C3FE3C1.html", 
	predecessors: "68", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bed60a24", parentId: "1c6f204b", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_vKr3IHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "173", prefix: "", name: "Establish Key infrastructure associations", title: "OPERATIONAL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish Key infrastructure associations_5A1D358A.html", 
	predecessors: "172,68", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "71f74571", parentId: "1c6f204b", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_vqIMMHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "174", prefix: "", name: "Establish sales channel associations", title: "OPERATIONAL.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish sales channel associations_157BC78F.html", 
	predecessors: "168", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7619ae8e", parentId: "1c6f204b", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_v3PbIHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "175", prefix: "", name: "Establish other key associations", title: "OPERATIONAL.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish other key associations_2A8FAB43.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "20c14105", parentId: "bd0a45cb", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "176", prefix: "", name: "Financial Management", title: "FINANCIAL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Financial Management_E43F929C.jsp", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c1fef447", parentId: "20c14105", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_oGOgcHF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "177", prefix: "", name: "Determine Revenue means", title: "FINANCIAL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine Revenue means_E63932CB.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "757b974a", parentId: "20c14105", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_pO8cAHF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "178", prefix: "", name: "Determine the Costs Structure", title: "FINANCIAL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the Costs Structure_AFF2C7C7.html", 
	predecessors: "170,177", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c20757e2", parentId: "20c14105", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_o3_7oHF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "179", prefix: "", name: "Determine the pricing strategy", title: "FINANCIAL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the pricing strategy_B47AFEB.html", 
	predecessors: "170,178", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c1d309ab", parentId: "20c14105", relPath: ",_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_oWd74HF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "180", prefix: "", name: "Determine the billing mechanisms", title: "FINANCIAL.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the billing mechanisms_95448C5.html", 
	predecessors: "179", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
]};
				</script>
</div>
<table class="copyright" border="0" cellspacing="0" cellpadding="0">
<tr>
<td class="copyright"></td>
</tr>
</table>
</td>
</tr>
</table>
</body>
<script language="JavaScript" type="text/javascript">
				contentPage.onload();
			</script>
</html>
