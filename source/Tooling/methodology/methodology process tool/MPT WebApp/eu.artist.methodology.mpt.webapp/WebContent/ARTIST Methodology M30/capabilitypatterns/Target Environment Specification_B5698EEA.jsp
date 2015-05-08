<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Phase: Target Environment Specification</title>
<meta name="uma.type" content="Phase">
<meta name="uma.name" content="Target Environment Specification">
<meta name="uma.presentationName" content="Target Environment Specification">
<meta name="element_type" content="other">
<meta name="filetype" content="description">
<meta name="role" content="none">
<link rel="StyleSheet" href="./../../css/default.css" type="text/css">
<script src="./../../scripts/ContentPageResource.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSubSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ActivityTreeTable.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ProcessElementPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageToolbar.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/contentPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/processElementData.js" type="text/javascript" language="JavaScript"></script><script type="text/javascript" language="JavaScript">
					var defaultQueryStr = '?proc=_boyq0RvEEeSVgNVCd9uEdQ&path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ';
					var backPath = './../../';
					var imgPath = './../../images/';
					var nodeInfo=null;
					contentPage.preload(imgPath, backPath, nodeInfo,  defaultQueryStr, false, true, true);
				</script>
</head>
<body onload="checkTasks()">

<% MPTProcessorBean Task = new MPTProcessorBean(); %>



<script language="JavaScript" type="text/javascript">
function checkTasks() {
	
						
	if (<%= Task.isTEBENCHVisible()%> == false)
		document.getElementById("130a902b").style.display = 'none';
	
	if (<%= Task.isTEMPOPVisible()%> == false)
		document.getElementById("73958f58").style.display = 'none';
	
	if (<%= Task.isAPAPUPVisible()%> == false)
		document.getElementById("6d07c24b").style.display = 'none';
	
	if (<%= Task.isAPACLASVisible()%> == false)
		document.getElementById("6d9e0771").style.display = 'none';
	
	  }	
				
			</script>	

<div id="breadcrumbs"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td valign="top">
<div autoWrap="true">
<div id="page-guid" value="_twp9MRvGEeSVgNVCd9uEdQ"></div>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="pageTitle" nowrap="true">Phase: Target Environment Specification</td><td width="100%">
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
<td width="10" class="tab"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_Description" href="./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.html_desc.html">Description</a></td><td width="21"><img src="./../../images/tab_middle-i_a.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="activeTab"><span style="white-space:nowrap;">Work Breakdown Structure</span></td><td width="1"><img src="./../../images/tab_middle-a_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_TBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.html_tbs.html"><span style="white-space:nowrap;">Team Allocation</span></a></td><td width="21"><img src="./../../images/tab_middle-i_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_WPBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.html_wpbs.html"><span style="white-space:nowrap;">Work Product Usage</span></a></td><td width="21"><img src="./../../images/tab_end-i.gif" width="21" height="17" alt="" title=""></td><td width="50%"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td>
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
<img border="0" diagramType="Activity" id="diagram_Activity" src="./../../ARTIST Methodology M30/capabilitypatterns/resources/Target Environment Specification_B5698EEA_Activity.jpeg" alt="Activity diagram: Target Environment Specification" title="Activity diagram: Target Environment Specification" usemap="#Activity_Target Environment Specification"><map name="Activity_Target Environment Specification">
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Benchmarking_8F721461.html" relpath=",_hM7koRvLEeSzI-OEcHu3kw" alt="TEBENCH" title="TEBENCH" coords="335, 115, 385, 164" shape="rect" guid="_hM7koRvLEeSzI-OEcHu3kw" onclick="return <%= Task.isTEBENCHVisible()%>"  ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Model Population_707A1ABB.html" relpath=",_ljlb0RvLEeSzI-OEcHu3kw" alt="TEMPOP" title="TEMPOP" coords="340, 185, 384, 234" shape="rect" guid="_ljlb0RvLEeSzI-OEcHu3kw" onclick="return <%= Task.isTEMPOPVisible()%>"  ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Application Components Performance and Usage profiling_FEDEFCC3.html" relpath=",_prVUURvLEeSzI-OEcHu3kw" alt="APAPUP" title="APAPUP" coords="210, 110, 254, 159" shape="rect" guid="_prVUURvLEeSzI-OEcHu3kw" onclick="return <%= Task.isAPAPUPVisible()%>"  ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Application Artefacts Classification_5E40F31F.html" relpath=",_QUZB8W8UEeSGk70TEZZiGw" alt="APACLAS" title="APACLAS" coords="205, 185, 255, 234" shape="rect" guid="_QUZB8W8UEeSGk70TEZZiGw" onclick="return <%= Task.isAPACLASVisible()%>"  ></area>
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
		
{id: "130a902b", parentId: "", relPath: ",_hM7koRvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "44", prefix: "", name: " Target Environment Benchmarking", title: "TEBENCH ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Benchmarking_8F721461.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "703a853e", parentId: "130a902b", relPath: ",_hM7koRvLEeSzI-OEcHu3kw,_NMBYQG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "45", prefix: "", name: "Benchmark Selection and Application Categorization", title: "TEBENCH.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark Selection and Application Categorization_F6D0915F.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "154d00df", parentId: "130a902b", relPath: ",_hM7koRvLEeSzI-OEcHu3kw,_PMeNEG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "46", prefix: "", name: "Benchmark execution and result storage", title: "TEBENCH.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark execution and result storage_A1D388DB.html", 
	predecessors: "45", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "73958f58", parentId: "", relPath: ",_ljlb0RvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "47", prefix: "", name: "Target Environment Model Population", title: "TEMPOP ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Model Population_707A1ABB.html", 
	predecessors: "44", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "157f73df", parentId: "73958f58", relPath: ",_ljlb0RvLEeSzI-OEcHu3kw,_TZIawG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "48", prefix: "", name: "Metamodel definition", title: "TEMPOP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Metamodel definition_B21EE3E1.html", 
	predecessors: "45", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "693f3fc9", parentId: "73958f58", relPath: ",_ljlb0RvLEeSzI-OEcHu3kw,_UUSbcG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "49", prefix: "", name: "Model instances creation", title: "TEMPOP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model instances creation_783EEA06.html", 
	predecessors: "48", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6c843119", parentId: "73958f58", relPath: ",_ljlb0RvLEeSzI-OEcHu3kw,_VTBUkG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "50", prefix: "", name: "Benchmark results inclusion", title: "TEMPOP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark results inclusion_43548D00.html", 
	predecessors: "49", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d07c24b", parentId: "", relPath: ",_prVUURvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "51", prefix: "", name: "Application Components Performance and Usage profiling", title: "APAPUP ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Components Performance and Usage profiling_FEDEFCC3.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "70657bbe", parentId: "6d07c24b", relPath: ",_prVUURvLEeSzI-OEcHu3kw,_X5UBYG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "52", prefix: "", name: "Target app VM creation", title: "APAPUP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target app VM creation_E4F6092B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "75097dbe", parentId: "6d07c24b", relPath: ",_prVUURvLEeSzI-OEcHu3kw,_X5UBYW8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "53", prefix: "", name: "Target app VM profiling", title: "APAPUP.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target app VM profiling_EF93E93B.html", 
	predecessors: "52", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6f317b77", parentId: "6d07c24b", relPath: ",_prVUURvLEeSzI-OEcHu3kw,_1iDA0G8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "54", prefix: "", name: "Benchmark VM creation", title: "APAPUP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark VM creation_4AE1A41F.html", 
	predecessors: "52", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "770c79a8", parentId: "6d07c24b", relPath: ",_prVUURvLEeSzI-OEcHu3kw,_1iDA0W8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "55", prefix: "", name: "Benchmark VM profiling", title: "APAPUP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark VM profiling_557F842F.html", 
	predecessors: "54,53", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d9e0771", parentId: "", relPath: ",_QUZB8W8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "56", prefix: "", name: "Application Artefacts Classification", title: "APACLAS", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Artefacts Classification_5E40F31F.html", 
	predecessors: "51", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1ef6db3c", parentId: "6d9e0771", relPath: ",_QUZB8W8UEeSGk70TEZZiGw,_Y16XEG8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "57", prefix: "", name: "Classifier Training", title: "APACLAS.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classifier Training_D7991EB0.html", 
	predecessors: "55", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "2003b341", parentId: "6d9e0771", relPath: ",_QUZB8W8UEeSGk70TEZZiGw,_Y16XEW8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "58", prefix: "", name: "Classifier Usage and Conclusion", title: "APACLAS.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classifier Usage and Conclusion_E236FEC0.html", 
	predecessors: "57,53", info: "", type: "Task Descriptor", 
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
