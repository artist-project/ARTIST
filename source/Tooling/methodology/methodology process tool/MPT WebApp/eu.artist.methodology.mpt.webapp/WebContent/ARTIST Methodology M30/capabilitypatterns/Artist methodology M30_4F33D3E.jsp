<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="el" xml:lang="el" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Capability Pattern: Artist methodology M30</title>
<meta name="uma.type" content="CapabilityPattern">
<meta name="uma.name" content="Artist methodology M30">
<meta name="uma.presentationName" content="Artist methodology M30">
<meta name="element_type" content="other">
<meta name="filetype" content="description">
<meta name="role" content="none">
<link rel="StyleSheet" href="./../../css/default.css" type="text/css">
<script src="./../../scripts/ContentPageResource.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSubSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ActivityTreeTable.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ProcessElementPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageToolbar.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/contentPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/processElementData.js" type="text/javascript" language="JavaScript"></script><script type="text/javascript" language="JavaScript">
					var defaultQueryStr = '?proc=_boyq0RvEEeSVgNVCd9uEdQ&path=_boyq0RvEEeSVgNVCd9uEdQ';
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
		document.getElementById("751857b6").style.display = 'none';
	
	if (<%= Task.isTEMPOPVisible()%> == false)
		document.getElementById("720ac3d8").style.display = 'none';
	
	if (<%= Task.isAPAPUPVisible()%> == false)
		document.getElementById("18d0a10f").style.display = 'none';
	
	if (<%= Task.isAPACLASVisible()%> == false)
		document.getElementById("71ea81ba").style.display = 'none';
	
	if (<%= Task.isSCTARGETVisible()%> == false)
		document.getElementById("75fc2666").style.display = 'none';
	
	if (<%= Task.isGSCODEVisible()%> == false)
		document.getElementById("6444e04e").style.display = 'none';
	
	if (<%= Task.isGDEPLVisible()%> == false)
		document.getElementById("1236880c").style.display = 'none';
	
	if (<%= Task.isVERBETCOptional()%> == true)
		alert("VERBETC is optional");

	if (<%= Task.isMCRPVisible()%> == false)
		document.getElementById("bf69e77b").style.display = 'none';
	
	if (<%= Task.isRAPVisible()%> == false)
		document.getElementById("1df001da").style.display = 'none';
	
	if (<%= Task.isDPVisible()%> == false)
		document.getElementById("78eea6bc").style.display = 'none';
	
	if (<%= Task.isUMPVisible()%> == false)
		document.getElementById("66a67421").style.display = 'none';
	
	if (<%= Task.isVALPROVisible()%> == false)
		document.getElementById("714711e8").style.display = 'none';
	
	if (<%= Task.isCUSTOMERVisible()%> == false)
		document.getElementById("20be344f").style.display = 'none';
	
	if (<%= Task.isSLAMPVisible()%> == false)
		document.getElementById("c05adba0").style.display = 'none';
	
	
	
	
	
	  }	
				
			</script>	




<div id="breadcrumbs"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td valign="top">
<div autoWrap="true">
<div id="page-guid" value="_boyq0RvEEeSVgNVCd9uEdQ"></div>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="pageTitle" nowrap="true">Capability Pattern: Artist methodology M30</td><td width="100%">
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
<td width="50"><img src="./../../images/capabilitypattern.gif" alt="" title=""></td><td>
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
<td width="10" class="tab"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_Description" href="./../../ARTIST Methodology M30/capabilitypatterns/Artist methodology M30_4F33D3E.html_desc.html">Description</a></td><td width="21"><img src="./../../images/tab_middle-i_a.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="activeTab"><span style="white-space:nowrap;">Work Breakdown Structure</span></td><td width="1"><img src="./../../images/tab_middle-a_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_TBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Artist methodology M30_4F33D3E.html_tbs.html"><span style="white-space:nowrap;">Team Allocation</span></a></td><td width="21"><img src="./../../images/tab_middle-i_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_WPBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Artist methodology M30_4F33D3E.html_wpbs.html"><span style="white-space:nowrap;">Work Product Usage</span></a></td><td width="21"><img src="./../../images/tab_end-i.gif" width="21" height="17" alt="" title=""></td><td width="50%"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td>
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
<img border="0" diagramType="Activity" id="diagram_Activity" src="./../../ARTIST Methodology M30/capabilitypatterns/resources/Artist methodology M30_4F33D3E_Activity.jpeg" alt="Activity diagram: Artist methodology M30" title="Activity diagram: Artist methodology M30" usemap="#Activity_Artist methodology M30"><map name="Activity_Artist methodology M30">
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Migration_33DD5A3A.jsp" relpath=",_lipZ8RvGEeSVgNVCd9uEdQ" alt="Migration" title="Migration" coords="230, 145, 274, 194" shape="rect" guid="_lipZ8RvGEeSVgNVCd9uEdQ"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Premigration_3BDB4933.html" relpath=",_5NwTMMcbEeSwnqs8HmEXvQ" alt="Premigration" title="Premigration" coords="70, 145, 139, 195" shape="rect" guid="_5NwTMMcbEeSwnqs8HmEXvQ"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Postmigration_9A152E77.html" relpath=",_2RlMIMi_EeS7wJTzzHxtQg" alt="Postmigration" title="Postmigration" coords="375, 140, 450, 190" shape="rect" guid="_2RlMIMi_EeS7wJTzzHxtQg"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Migration Artefacts Reuse Evolution_981B36E2.html" relpath=",_O2CaIclUEeSF8-J5ZzwGkg" alt="Migration Artefacts Reuse &amp; Evolution" title="Migration Artefacts Reuse &amp; Evolution" coords="170, 235, 372, 285" shape="rect" guid="_O2CaIclUEeSF8-J5ZzwGkg"></area>
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
		
{id: "7049607f", parentId: "", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "1", prefix: "", name: "Premigration", title: "Premigration", url: "./../../ARTIST Methodology M30/capabilitypatterns/Premigration_3BDB4933.html", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1deb4099", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_eIhV0cccEeSwnqs8HmEXvQ", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "2", prefix: "", name: "Technical Evaluation", title: "TECHEVA", url: "./../../ARTIST Methodology M30/capabilitypatterns/Technical Evaluation_42B89043.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "76660737", parentId: "1deb4099", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_eIhV0cccEeSwnqs8HmEXvQ,_0w1PUMf0EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "3", prefix: "", name: "Security and risk management analysis", title: "TECHEVA.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Security and risk management analysis_F4F5FC94.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "140776d5", parentId: "1deb4099", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_eIhV0cccEeSwnqs8HmEXvQ,_2rNRUMf0EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "4", prefix: "", name: "Operational support requirements analysis", title: "TECHEVA.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Operational support requirements analysis_9BAEB292.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "11ea5777", parentId: "1deb4099", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_eIhV0cccEeSwnqs8HmEXvQ,_3_82sMf0EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "5", prefix: "", name: "Operational business support analysis", title: "TECHEVA.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Operational business support analysis_9EBE0FF6.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "685de523", parentId: "1deb4099", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_eIhV0cccEeSwnqs8HmEXvQ,_56iUEMf0EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "6", prefix: "", name: "Analyse the architectural and programming aspects of the application", title: "TECHEVA.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analyse the architectural and programming aspects of the applica_C958F78B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "711330dc", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_GETiQcf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "7", prefix: "", name: "Migration Goals definition", title: "MGDEF", url: "./../../ARTIST Methodology M30/capabilitypatterns/Migration Goals definition_8C0A9E5C.html", 
	predecessors: "2,9", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "78e03dbe", parentId: "711330dc", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_GETiQcf1EeS9jsuCsUMFrg,_OsF3cMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "8", prefix: "", name: "Migration Goals specification", title: "MGDEF.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Migration Goals specification_DA930AB2.html", 
	predecessors: "2,9", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6cb89142", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "9", prefix: "", name: "Business Evaluation", title: "BUSEVA", url: "./../../ARTIST Methodology M30/capabilitypatterns/Business Evaluation_C71941B8.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "63d1dc8b", parentId: "6cb89142", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg,_Y26ssMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "10", prefix: "", name: "Analyse pricing patterns", title: "BUSEVA.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analyse pricing patterns_228F2B67.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c25cfeb0", parentId: "6cb89142", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg,_Z0aPsMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "11", prefix: "", name: "Business strategy analysis", title: "BUSEVA.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Business strategy analysis_59C69F96.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "75920875", parentId: "6cb89142", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg,_eP15MMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "12", prefix: "", name: "Customer relationship management analysis", title: "BUSEVA.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Customer relationship management analysis_67AC42C6.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1558d4db", parentId: "6cb89142", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg,_fq3swMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "13", prefix: "", name: "Financial management analysis", title: "BUSEVA.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Financial management analysis_6C601598.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "11e555e2", parentId: "6cb89142", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg,_gooVgMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "14", prefix: "", name: "Product catalogue management", title: "BUSEVA.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Product catalogue management_8E36EEAC.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c32ec188", parentId: "6cb89142", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg,_hlrMkMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "15", prefix: "", name: "Regulatory aspects analysis", title: "BUSEVA.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Regulatory aspects analysis_7D216498.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6920f30e", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "16", prefix: "", name: "Technical Feasibility", title: "TECHFEAS", url: "./../../ARTIST Methodology M30/capabilitypatterns/Technical Feasibility_734B2DAA.html", 
	predecessors: "2,7", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "13d23eed", parentId: "6920f30e", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg,_5iOsUMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "17", prefix: "", name: "Identify Components", title: "TECHFEAS.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify Components_82531B67.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c838d921", parentId: "6920f30e", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg,_6iGN4Mf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "18", prefix: "", name: "Migration strategy", title: "TECHFEAS.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Migration strategy_BB5BDC2A.html", 
	predecessors: "17", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "be8fb4db", parentId: "6920f30e", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg,_7WLWMMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "19", prefix: "", name: "Reusable Artefacts", title: "TECHFEAS.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Reusable Artefacts_52860862.html", 
	predecessors: "18", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6cda7bf6", parentId: "6920f30e", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg,_ADWP8Mf2EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "20", prefix: "", name: "Estimate the complexity of the component", title: "TECHFEAS.A4 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Estimate the complexity of the component_32948189.html", 
	predecessors: "18", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6e4e1f35", parentId: "6920f30e", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg,__Id8EMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "21", prefix: "", name: "Estimate the complexity of the task", title: "TECHFEAS.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Estimate the complexity of the task_5208F5BD.html", 
	predecessors: "20,19", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "753411c6", parentId: "6920f30e", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg,__h1eUMf1EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "22", prefix: "", name: "Estimate the total complexity", title: "TECHFEAS.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Estimate the total complexity_23624C4C.html", 
	predecessors: "21", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bcd2803c", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_R1m7Mcf3EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "23", prefix: "", name: "Business Feasibility", title: "BUSFEAS", url: "./../../ARTIST Methodology M30/capabilitypatterns/Business Feasibility_6CCC98B8.html", 
	predecessors: "9", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "120152d5", parentId: "bcd2803c", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_R1m7Mcf3EeS9jsuCsUMFrg,_Xj-MMMf3EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "24", prefix: "", name: "Scenario Workbench definition", title: "BUSFEAS.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Scenario Workbench definition_37935CEB.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "706585d8", parentId: "bcd2803c", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_R1m7Mcf3EeS9jsuCsUMFrg,_YlzcoMf3EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "25", prefix: "", name: "Scenario Workbench simulation", title: "BUSFEAS.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Scenario Workbench simulation_4AFCEBD3.html", 
	predecessors: "24", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "11f8203b", parentId: "bcd2803c", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_R1m7Mcf3EeS9jsuCsUMFrg,_ZngxQMf3EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "26", prefix: "", name: "Determine the cost and benefit of the migration", title: "BUSFEAS.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the cost and benefit of the migration_8F932D9A.html", 
	predecessors: "25,22", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7508e702", parentId: "bcd2803c", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_R1m7Mcf3EeS9jsuCsUMFrg,_a4w9wMf3EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "27", prefix: "", name: "Project the profit and loss accounts resulting from changing the business model", title: "BUSFEAS.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Project the profit and loss accounts resulting from changing the_6D6A90C4.html", 
	predecessors: "26", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1d5ec632", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_HUAIMMf4EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "28", prefix: "", name: "Evaluate the migration", title: "MIGRAT", url: "./../../ARTIST Methodology M30/capabilitypatterns/Evaluate the migration_282320F.html", 
	predecessors: "16,23", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "65c4f248", parentId: "1d5ec632", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_HUAIMMf4EeS9jsuCsUMFrg,_Px2eQMf4EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "29", prefix: "", name: "Evaluate the results of previous tasks", title: "MIGRAT.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Evaluate the results of previous tasks_EE0841B1.html", 
	predecessors: "16,23", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c5bc2fb0", parentId: "1d5ec632", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_HUAIMMf4EeS9jsuCsUMFrg,_9B9bMMf4EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "30", prefix: "", name: "Change the value- parameters for the desired situation", title: "MIGRAT.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Change the value- parameters for the desired situation_9E6E30C.html", 
	predecessors: "29", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "72189f60", parentId: "1d5ec632", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_HUAIMMf4EeS9jsuCsUMFrg,_A8SiwMf5EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "31", prefix: "", name: "Decision on the migration", title: "MIGRAT.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Decision on the migration_7FFE163E.html", 
	predecessors: "29", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b928487", parentId: "7049607f", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_IgDPIcf5EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "32", prefix: "", name: "Methodology Customization", title: "METHCUST", url: "./../../ARTIST Methodology M30/capabilitypatterns/Methodology Customization_F88454FF.html", 
	predecessors: "28", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "19baa76f", parentId: "1b928487", relPath: ",_5NwTMMcbEeSwnqs8HmEXvQ,_IgDPIcf5EeS9jsuCsUMFrg,_l3BwMMf5EeS9jsuCsUMFrg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "33", prefix: "", name: "Instantiation of the generic ARTIST methodology", title: "METHCUST. A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Instantiation of the generic ARTIST methodology_771AA697.html", 
	predecessors: "28", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bf804587", parentId: "", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "34", prefix: "", name: "Migration", title: "Migration", url: "./../../ARTIST Methodology M30/capabilitypatterns/Migration_33DD5A3A.jsp", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "19bbd269", parentId: "bf804587", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "35", prefix: "", name: "Application Discovery & Understanding ", title: "Application Discovery & Understanding ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Discovery Understanding_E62EF8BA.html", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6ebf1b99", parentId: "19bbd269", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "36", prefix: "", name: "Model Discovery", title: "MODELDISCO", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model Discovery_B5A377C1.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "66b02cce", parentId: "6ebf1b99", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q,_MyVOQG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "37", prefix: "", name: "Classify the input non-cloud artefacts", title: "MODELDISCO.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classify the input non-cloud artefacts_C0922740.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "659da003", parentId: "6ebf1b99", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q,_P_XK8G8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "38", prefix: "", name: "Inject the content of the non-cloud artefacts as initial models", title: "MODELDISCO.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inject the content of the non-cloud artefacts as initial models_72F578B6.html", 
	predecessors: "37", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "14c74ae5", parentId: "6ebf1b99", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q,_RoH4gG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "39", prefix: "", name: "Map the initial models to models that conform to another metamodel", title: "MODELDISCO.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Map the initial models to models that conform to another metamod_6BEC9B6E.html", 
	predecessors: "38", info: "", type: "Task Descriptor", 
	repeatable: "true", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1f9f2e9a", parentId: "19bbd269", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "40", prefix: "", name: "Model Understanding", title: "MODELUNDER", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model Understanding_76FDD728.html", 
	predecessors: "36", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "180d201f", parentId: "1f9f2e9a", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q,_jAWIkG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "41", prefix: "", name: "Refine the models", title: "MODELUNDER.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Refine the models_48B71A0A.html", 
	predecessors: "36", info: "", type: "Task Descriptor", 
	repeatable: "true", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6c541820", parentId: "1f9f2e9a", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q,_jcXWMG8FEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "42", prefix: "", name: "Manual refinement or amendment of generated models", title: "MODELUNDER.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Manual refinement or amendment of generated models_12E26477.html", 
	predecessors: "41", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1497d07f", parentId: "bf804587", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "43", prefix: "", name: "Target Environment Specification", title: "Target Environment Specification", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.jsp", 
	predecessors: "35", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "751857b6", parentId: "1497d07f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "44", prefix: "", name: " Target Environment Benchmarking", title: "TEBENCH ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Benchmarking_8F721461.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6ad68aa9", parentId: "751857b6", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw,_NMBYQG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "45", prefix: "", name: "Benchmark Selection and Application Categorization", title: "TEBENCH.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark Selection and Application Categorization_F6D0915F.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "12555505", parentId: "751857b6", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw,_PMeNEG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "46", prefix: "", name: "Benchmark execution and result storage", title: "TEBENCH.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark execution and result storage_A1D388DB.html", 
	predecessors: "45", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "720ac3d8", parentId: "1497d07f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "47", prefix: "", name: "Target Environment Model Population", title: "TEMPOP ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target Environment Model Population_707A1ABB.html", 
	predecessors: "44", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c138fb0f", parentId: "720ac3d8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw,_TZIawG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "48", prefix: "", name: "Metamodel definition", title: "TEMPOP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Metamodel definition_B21EE3E1.html", 
	predecessors: "45", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "71cd9c93", parentId: "720ac3d8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw,_UUSbcG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "49", prefix: "", name: "Model instances creation", title: "TEMPOP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Model instances creation_783EEA06.html", 
	predecessors: "48", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "becea9ff", parentId: "720ac3d8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw,_VTBUkG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "50", prefix: "", name: "Benchmark results inclusion", title: "TEMPOP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark results inclusion_43548D00.html", 
	predecessors: "49", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "18d0a10f", parentId: "1497d07f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "51", prefix: "", name: "Application Components Performance and Usage profiling", title: "APAPUP ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Components Performance and Usage profiling_FEDEFCC3.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c822cafd", parentId: "18d0a10f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_X5UBYG8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "52", prefix: "", name: "Target app VM creation", title: "APAPUP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target app VM creation_E4F6092B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "79a91b28", parentId: "18d0a10f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_X5UBYW8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "53", prefix: "", name: "Target app VM profiling", title: "APAPUP.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Target app VM profiling_EF93E93B.html", 
	predecessors: "52", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6435c567", parentId: "18d0a10f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_1iDA0G8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "54", prefix: "", name: "Benchmark VM creation", title: "APAPUP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark VM creation_4AE1A41F.html", 
	predecessors: "52", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6aee9643", parentId: "18d0a10f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw,_1iDA0W8TEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "55", prefix: "", name: "Benchmark VM profiling", title: "APAPUP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Benchmark VM profiling_557F842F.html", 
	predecessors: "54,53", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "71ea81ba", parentId: "1497d07f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "56", prefix: "", name: "Application Artefacts Classification", title: "APACLAS", url: "./../../ARTIST Methodology M30/capabilitypatterns/Application Artefacts Classification_5E40F31F.html", 
	predecessors: "51", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1c83a96c", parentId: "71ea81ba", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw,_Y16XEG8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "57", prefix: "", name: "Classifier Training", title: "APACLAS.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classifier Training_D7991EB0.html", 
	predecessors: "55", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "754fea40", parentId: "71ea81ba", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw,_Y16XEW8UEeSGk70TEZZiGw", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "58", prefix: "", name: "Classifier Usage and Conclusion", title: "APACLAS.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Classifier Usage and Conclusion_E236FEC0.html", 
	predecessors: "57,53", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "63d981d2", parentId: "bf804587", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "59", prefix: "", name: "Modernization", title: "Modernization", url: "./../../ARTIST Methodology M30/capabilitypatterns/Modernization_454C9CFC.jsp", 
	predecessors: "35,43", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "223d60d5", parentId: "63d981d2", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "60", prefix: "", name: "Express Migration Requirements", title: "EMREQ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Express Migration Requirements_38D49CE5.jsp", 
	predecessors: "40,88,101,47,176", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "109119e1", parentId: "223d60d5", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_R89G8G8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "61", prefix: "", name: "Select non-cloud PIM view", title: "EMREQ.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select non-cloud PIM view_F395828B.html", 
	predecessors: "42", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bcfe6612", parentId: "223d60d5", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_SigrEG8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "62", prefix: "", name: "Annotate non-cloud PIM view with requirements", title: "EMREQ.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Annotate non-cloud PIM view with requirements_97DA6EB.html", 
	predecessors: "61", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "70ebae5c", parentId: "223d60d5", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_TBDoQG8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "63", prefix: "", name: "Annotate PSM with monitoring and billing components", title: "EMREQ.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Annotate PSM with monitoring and billing components_C76D2017.html", 
	predecessors: "61,92,90,179,180", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "79a89f2e", parentId: "223d60d5", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A,_TmKgcG8vEeSpifzI2SXP8A", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "64", prefix: "", name: "Annotate PIM with cloud provider requirements", title: "EMREQ.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Annotate PIM with cloud provider requirements_9F7A1181.html", 
	predecessors: "61,102", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "75fc2666", parentId: "63d981d2", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "65", prefix: "", name: "Select Cloud Target", title: "SCTARGET", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select Cloud Target_A1FE6C17.jsp", 
	predecessors: "60", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "22599f1b", parentId: "75fc2666", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg,_E_KM0G_JEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "66", prefix: "", name: "Select annotated non-cloud PIM", title: "SCTARGET.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select annotated non-cloud PIM_BA84BC11.html", 
	predecessors: "60", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c3fb1bfa", parentId: "75fc2666", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg,_PohqIG_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "67", prefix: "", name: "Match and rank the best cloud environments", title: "SCTARGET.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Match and rank the best cloud environments_F3A66162.html", 
	predecessors: "66", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1d2a4356", parentId: "75fc2666", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg,_QlK4kG_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "68", prefix: "", name: "Select Target Cloud Environment", title: "SCTARGET.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select Target Cloud Environment_30D2AFDC.html", 
	predecessors: "67", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78b90ba1", parentId: "63d981d2", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "69", prefix: "", name: "Cloudify and Optimize application features", title: "OPTAPPFEA", url: "./../../ARTIST Methodology M30/capabilitypatterns/Cloudify and Optimize application features_83823EFB.html", 
	predecessors: "65", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "773e31a3", parentId: "78b90ba1", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg,_jmwSIG_SEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "70", prefix: "", name: "Cloudify the non-cloud PIM", title: "OPTAPPFEA.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Cloudify the non-cloud PIM_D8FB1644.html", 
	predecessors: "66", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6410c3d7", parentId: "78b90ba1", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg,_vWG_wG_TEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "71", prefix: "", name: "Optimize the cloudified PIM", title: "OPTAPPFEA.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Optimize the cloudified PIM_F3D12BB1.html", 
	predecessors: "68,70", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "65aad35d", parentId: "63d981d2", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "72", prefix: "", name: "Non-functional goals validation  model level", title: "NFVALML", url: "./../../ARTIST Methodology M30/capabilitypatterns/Non-functional goals validation model level_11F6FD4B.html", 
	predecessors: "69,7", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1fcfa1b8", parentId: "65aad35d", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg,_MsgAEG_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "73", prefix: "", name: "Process MAT report for model-level evaluation", title: "NFVALML.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Process MAT report for model-level evaluation_4C788E4D.html", 
	predecessors: "8", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c08f4e82", parentId: "65aad35d", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg,_NE8VQG_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "74", prefix: "", name: "Nonfunctional properties model level evaluation", title: "NFVALML.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Nonfunctional properties model level evaluation_1E9C6E96.html", 
	predecessors: "73,71", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6f311be8", parentId: "65aad35d", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg,_NWq-cG_WEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "75", prefix: "", name: "Conclusions about goal fulfilment", title: "NFVALML.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Conclusions about goal fulfilment_765EAB14.html", 
	predecessors: "74,8", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6444e04e", parentId: "63d981d2", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "76", prefix: "", name: "GSCODE", title: "GSCODE", url: "./../../ARTIST Methodology M30/capabilitypatterns/GSCODE_5C928129.html", 
	predecessors: "69", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "75a00dad", parentId: "6444e04e", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_bj4cUG_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "77", prefix: "", name: "Select the optimized PSM", title: "GSCODE.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select the optimized PSM_8EDA9F80.html", 
	predecessors: "71", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "641223c9", parentId: "6444e04e", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_cgFl4G_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "78", prefix: "", name: "Apply specific target generation patterns", title: "GSCODE.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Apply specific target generation patterns_1D25D614.html", 
	predecessors: "77", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "12318be4", parentId: "6444e04e", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_dJqHUG_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "79", prefix: "", name: "Generate source code", title: "GSCODE.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate source code_895F29E6.html", 
	predecessors: "78", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7213a5d6", parentId: "6444e04e", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_dXXMIm_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "80", prefix: "", name: "Inject reusable code", title: "GSCODE.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inject reusable code_61A2EB24.html", 
	predecessors: "79", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6f6cc123", parentId: "6444e04e", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg,_drCWEG_cEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "81", prefix: "", name: "Manual completion of generated source code", title: "GSCODE.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Manual completion of generated source code_A60E995B.html", 
	predecessors: "80", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1236880c", parentId: "63d981d2", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "82", prefix: "", name: "Generate Deployment", title: "GDEPL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate Deployment_D0C656A7.html", 
	predecessors: "76", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "154c7691", parentId: "1236880c", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_pKetgG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "83", prefix: "", name: "Select modernized application", title: "GDEPL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select modernized application_41C3C484.html", 
	predecessors: "78", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c08b7b40", parentId: "1236880c", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_qEJgcG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "84", prefix: "", name: "Express deployment requirements", title: "GDEPL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Express deployment requirements_8AB3A2CF.html", 
	predecessors: "83", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "18b75c62", parentId: "1236880c", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_qeX-UG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "85", prefix: "", name: "Generate deployment descriptors and scripts", title: "GDEPL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate deployment descriptors and scripts_701788B5.html", 
	predecessors: "84", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1dc5af72", parentId: "1236880c", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg,_q1KtsG_fEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "86", prefix: "", name: "Generate deployment units", title: "GDEPL.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Generate deployment units_312763D7.html", 
	predecessors: "85", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "687f8cd0", parentId: "bf804587", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "87", prefix: "", name: "Process related tasks", title: "Process related", url: "./../../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.jsp", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c05adba0", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "88", prefix: "", name: "SLAMP", title: "SLAMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/SLAMP_6ED80D9B.jsp", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7227245c", parentId: "c05adba0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_SuHHoHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "89", prefix: "", name: "Determine SLA frameworks", title: "SLAMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine SLA frameworks_4600B941.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6b14d295", parentId: "c05adba0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_S-NZIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "90", prefix: "", name: "Determine, document and agree requirements for existing and new services", title: "SLAMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine, document and agree requirements for existing and new _711A022B.html", 
	predecessors: "89", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d7de4ad", parentId: "c05adba0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_Un23gHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "91", prefix: "", name: "Review underpinning agreements", title: "SLAMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review underpinning agreements_F6BF601.html", 
	predecessors: "90", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78025ba2", parentId: "c05adba0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_TjnMQHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "92", prefix: "", name: "Monitor service performance against SLA", title: "SLAMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor service performance against SLA_9F352292.html", 
	predecessors: "91", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6e93accf", parentId: "c05adba0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_UEGDIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "93", prefix: "", name: "Produce service reports", title: "SLAMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Produce service reports_AA6B3852.html", 
	predecessors: "92", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "1f7be56c", parentId: "c05adba0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug,_tHxREHFhEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "94", prefix: "", name: "Review SLAs and underpinning agreements", title: "SLAMP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review SLAs and underpinning agreements_51225ED9.html", 
	predecessors: "92,90,91,93", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "66a67421", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "95", prefix: "", name: "UMP", title: "UMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/UMP_EDBF639D.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6a1b425b", parentId: "66a67421", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_diSb4HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "96", prefix: "", name: "Planning the releases", title: "UMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Planning the releases_2759A24E.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "1de1e85d", parentId: "66a67421", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_c9fFsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "97", prefix: "", name: "Build and test the release", title: "UMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Build and test the release_566CBD11.html", 
	predecessors: "96", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "77317c07", parentId: "66a67421", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_dzbPMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "98", prefix: "", name: "Release testing and pilot", title: "UMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Release testing and pilot_4C41B4E5.html", 
	predecessors: "97", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "bcf602b7", parentId: "66a67421", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_dPD94HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "99", prefix: "", name: "Perform transfer, deployment and retirement", title: "UMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Perform transfer, deployment and retirement_69A4713B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "78ce3a53", parentId: "66a67421", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug,_eD0boHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "100", prefix: "", name: "Verify, review and close deployment", title: "UMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Verify, review and close deployment_7E42AF70.html", 
	predecessors: "99", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b7561f0", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "101", prefix: "", name: "CPMP", title: "CPMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/CPMP_77C1929F.html", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c5a8778d", parentId: "1b7561f0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_iFdsIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "102", prefix: "", name: "Define the main features to be fulfilled by the cloud provider", title: "CPMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the main features to be fulfilled by the cloud provider_3913FD71.html", 
	predecessors: "173", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "12f4f60a", parentId: "1b7561f0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_jSgHAHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "103", prefix: "", name: "Select cloud provider", title: "CPMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select cloud provider_6A163657.html", 
	predecessors: "102", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "208ee6c7", parentId: "1b7561f0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_ibXqsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "104", prefix: "", name: "Establish the cloud provider agreement", title: "CPMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish the cloud provider agreement_62D320AD.html", 
	predecessors: "103,173", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b9baa0f", parentId: "1b7561f0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_iucXsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "105", prefix: "", name: "Monitor the fulfilment of the conditions", title: "CPMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the fulfilment of the conditions_307E037C.html", 
	predecessors: "104", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "15402ac8", parentId: "1b7561f0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug,_i-PHMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "106", prefix: "", name: "Report and control the non-fulfilment", title: "CPMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Report and control the non-fulfilment_6C28617D.html", 
	predecessors: "105", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "6db87b74", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "107", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_B93C3581.html", 
	predecessors: "124", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "19eb17c3", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_mFBR8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "108", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_FF05D15F.html", 
	predecessors: "128", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "bf946217", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_m15VQHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "109", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_9C2A6702.html", 
	predecessors: "108", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6fed885c", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_lfUj4HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "110", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_72535189.html", 
	predecessors: "109", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1b698b54", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_naaXkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "111", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_E154BCCD.html", 
	predecessors: "110", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "63cd3504", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_nF11wHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "112", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_BC5B6F.html", 
	predecessors: "111", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "691cb4f0", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_mddnIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "113", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_C8C3C446.html", 
	predecessors: "112", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "1b9b66c5", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_nwdgEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "114", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_8CB382B5.html", 
	predecessors: "113", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "6ad104da", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_n_D8wHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "115", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_C57EA5C.html", 
	predecessors: "114", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c7f114da", parentId: "6db87b74", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug,_lOLwkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "116", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_D8E34511.html", 
	predecessors: "115", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "6dc71062", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "117", prefix: "", name: "MP", title: "MP", url: "./../../ARTIST Methodology M30/capabilitypatterns/MP_236F7095.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6ca1ac85", parentId: "6dc71062", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_rjNY8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "118", prefix: "", name: "Analysis the market for the migrated solution", title: "MP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis the market for the migrated solution_E063B559.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "6cad09ae", parentId: "6dc71062", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_r5tNYHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "119", prefix: "", name: "Identify the Marketing objectives", title: "MP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify the Marketing objectives_273AA672.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "200ebdae", parentId: "6dc71062", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_sU1DIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "120", prefix: "", name: "Identify the Marketing Strategy", title: "MP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify the Marketing Strategy_4FBE02DA.html", 
	predecessors: "119", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6c60967a", parentId: "6dc71062", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_tN5ZIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "121", prefix: "", name: "Start implementing the market strategy", title: "MP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Start implementing the market strategy_C940C704.html", 
	predecessors: "120", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "66cbaa38", parentId: "6dc71062", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_s8wl0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "122", prefix: "", name: "Monitor the market plan", title: "MP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the market plan_290B0258.html", 
	predecessors: "121", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "109975ad", parentId: "6dc71062", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug,_smjsUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "123", prefix: "", name: "Monitor the market", title: "MP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the market_A3C4DFC.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bf69e77b", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "124", prefix: "", name: "MCRP", title: "MCRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.jsp", 
	predecessors: "162", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7874371e", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_wQXEkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "125", prefix: "", name: "Define a communication mechanism with the user", title: "MCRP.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define a communication mechanism with the user_6A2329AA.html", 
	predecessors: "165", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "bd0cdd27", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_wf25IHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "126", prefix: "", name: "Define the appropriate physical and Logical structure for the communication mechanism", title: "MCRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the appropriate physical and Logical structure for the co_1AA356F7.html", 
	predecessors: "125", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "6b8ffe1b", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_xuFm0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "127", prefix: "", name: "Registration Communication", title: "MCRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Registration Communication_41CA80C2.html", 
	predecessors: "126", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1044bf7a", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_xOfgwHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "128", prefix: "", name: "Initial diagnosis", title: "MCRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_9C8478F.html", 
	predecessors: "127", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "bcd3d384", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:true, 
	index: "129", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_A1BF6539.html", 
	predecessors: "128", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "63f78cb6", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h3XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "130", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_EDE5D7D.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "c57085f9", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h0nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "131", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_AFC1CB36.html", 
	predecessors: "130", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "13d1379f", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h3nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "132", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_FD777193.html", 
	predecessors: "131", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d59873c", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h4nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "133", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_C20953B2.html", 
	predecessors: "132", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "76dbc47e", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h5XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "134", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_980221BB.html", 
	predecessors: "133", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "77134bdc", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h43FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "135", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_2AE32977.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "721120b9", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h33FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "136", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_66514758.html", 
	predecessors: "135", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "1c89916f", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h6nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "137", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_4B2D17F0.html", 
	predecessors: "136", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "71e68d5a", parentId: "bcd3d384", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h03FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 4, hasChildren:false, 
	index: "138", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_189BA0FB.html", 
	predecessors: "137", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "6cafbb05", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_w_JdMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "139", prefix: "", name: "Inform the user", title: "MCRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inform the user_4E303443.html", 
	predecessors: "107,129", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6ef6c098", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_wxvTUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "140", prefix: "", name: "Incidence closure", title: "MCRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence closure_A2D9FB18.html", 
	predecessors: "139", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1e1e2eb6", parentId: "bf69e77b", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_xfejEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "141", prefix: "", name: "Measure and analysis user feedback", title: "MCRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Measure and analysis user feedback_48657AFC.html", 
	predecessors: "140", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1df001da", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "142", prefix: "", name: "RAP", title: "RAP", url: "./../../ARTIST Methodology M30/capabilitypatterns/RAP_C7DEDC90.html", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c55d3479", parentId: "1df001da", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_7wnbsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "143", prefix: "", name: "Define the new roles", title: "RAP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the new roles_2D830F.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "be6c7507", parentId: "1df001da", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_8FoCYHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "144", prefix: "", name: "Modify the existing roles", title: "RAP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Modify the existing roles_269B48D7.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "682435e1", parentId: "1df001da", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_8cH20HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "145", prefix: "", name: "Train people", title: "RAP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Train people_2699BB33.html", 
	predecessors: "143,144", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "6d83bd2d", parentId: "1df001da", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_6wFy0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "146", prefix: "", name: "Communicate the affected people their new activities and responsibilities", title: "RAP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Communicate the affected people their new activities and respons_507EE3D2.html", 
	predecessors: "145", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bcd95dfd", parentId: "1df001da", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug,_7IrR8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "147", prefix: "", name: "Communicate the entire organisation the new and modified roles", title: "RAP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Communicate the entire organisation the new and modified roles_32F38628.html", 
	predecessors: "146", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78eea6bc", parentId: "687f8cd0", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "148", prefix: "", name: "DP", title: "DP", url: "./../../ARTIST Methodology M30/capabilitypatterns/DP_56F7EE33.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "704fb4eb", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_BKBJUHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "149", prefix: "", name: "Requirements elicitation", title: "DP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Requirements elicitation_D69B3DEB.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "19ee7a5a", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_CAQ00HFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "150", prefix: "", name: "Select the requirements to be developed in the sprint", title: "DP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select the requirements to be developed in the sprint_253F54FC.html", 
	predecessors: "149", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "6c8f8c46", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_ArLRMHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "151", prefix: "", name: "Analysis and modelling", title: "DP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis and modelling_907946B9.html", 
	predecessors: "150", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "20b05d40", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_A5L4AHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "152", prefix: "", name: "Development", title: "DP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Development_3F38B8EA.html", 
	predecessors: "151", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6d092b94", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_CeNVEHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "153", prefix: "", name: "Testing of functional and non functional requirements", title: "DP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Testing of functional and non functional requirements_DB1E6734.html", 
	predecessors: "152", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "20a24581", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_BrjJEHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "154", prefix: "", name: "Review and add the requirements", title: "DP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review and add the requirements_AA14017A.html", 
	predecessors: "153", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "1711be5c", parentId: "78eea6bc", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug,_COalkHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "155", prefix: "", name: "Test and deploy the final application", title: "DP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Test and deploy the final application_D1482E5B.html", 
	predecessors: "154", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "227d0d20", parentId: "bf804587", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "156", prefix: "", name: "Business Model Definition", title: "Business Model Definition", url: "./../../ARTIST Methodology M30/capabilitypatterns/Business Model Definition_177525F3.jsp", 
	predecessors: "87", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "714711e8", parentId: "227d0d20", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "157", prefix: "", name: "Value Proposition", title: "VALPRO", url: "./../../ARTIST Methodology M30/capabilitypatterns/Value Proposition_B1DF2148.html", 
	predecessors: "117", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c2dec933", parentId: "714711e8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_Dmfe4HF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "158", prefix: "", name: "Identify and analyse the customers needs and motivation", title: "VALPRO.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify and analyse the customers needs and motivation_962D7210.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "193debf5", parentId: "714711e8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_CeOPQHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "159", prefix: "", name: "Define the functionalities that need to be delivered to each customer segment in order to solve their needs", title: "VALPRO.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the functionalities that need to be delivered to each cus_40E2618E.html", 
	predecessors: "158", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "719ff738", parentId: "714711e8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_DYL9IHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "160", prefix: "", name: "Define the value delivered to each customer segment", title: "VALPRO.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the value delivered to each customer segment_DA793DB5.html", 
	predecessors: "159", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7752ddd7", parentId: "714711e8", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug,_B6da4HF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "161", prefix: "", name: "Continuously monitor the value proposition", title: "VALPRO.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Continuously monitor the value proposition_CE580A59.html", 
	predecessors: "160", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "20be344f", parentId: "227d0d20", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "162", prefix: "", name: "Customer interface", title: "CUSTOMER", url: "./../../ARTIST Methodology M30/capabilitypatterns/Customer interface_962A8F69.jsp", 
	predecessors: "157,117,88", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "13bc79ad", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_rVotoHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "163", prefix: "", name: "Analyse expected relationships from each customer segment", title: "CUSTOMER.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analyse expected relationships from each customer segment_1FC24CD6.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6ea973da", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_sH20wHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "164", prefix: "", name: "Gap Analysis", title: "CUSTOMER.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Gap Analysis_47A79F78.html", 
	predecessors: "118,163", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "10b3a3a2", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_sZbs8HF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "165", prefix: "", name: "Implement generic customer relationship mechanisms", title: "CUSTOMER.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Implement generic customer relationship mechanisms_C72043C.html", 
	predecessors: "164", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1edf50eb", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_tJt6YHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "166", prefix: "", name: "Instantiate these generic mechanisms to the corresponding customer segment", title: "CUSTOMER.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Instantiate these generic mechanisms to the corresponding custom_67FE547B.html", 
	predecessors: "165", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "641f552f", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_r1rfoHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "167", prefix: "", name: "Determine sales channels", title: "CUSTOMER.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine sales channels_C53AFBC0.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1c509b9c", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_s8mrcXF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "168", prefix: "", name: "Implement sales channels", title: "CUSTOMER.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Implement sales channels_958A18B3.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "69ea8d14", parentId: "20be344f", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug,_rmemAHF4EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "169", prefix: "", name: "Deliver the value proposition to the customers", title: "CUSTOMER.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Deliver the value proposition to the customers_434EADDE.html", 
	predecessors: "161,92,93,166,167,168", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "10223019", parentId: "227d0d20", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "170", prefix: "", name: "Operational infrastructure ", title: "OPERATIONAL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Operational infrastructure_4838F228.jsp", 
	predecessors: "157,162", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "108a568c", parentId: "10223019", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_usI58HF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "171", prefix: "", name: "Determine key personnel resources", title: "OPERATIONAL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine key personnel resources_4037414F.html", 
	predecessors: "159,163", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "77ce520d", parentId: "10223019", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_u7C4oHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "172", prefix: "", name: "Determine the key non-personnel resources", title: "OPERATIONAL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the key non-personnel resources_4C3FE3C1.html", 
	predecessors: "68", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1fe57406", parentId: "10223019", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_vKr3IHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "173", prefix: "", name: "Establish Key infrastructure associations", title: "OPERATIONAL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish Key infrastructure associations_5A1D358A.html", 
	predecessors: "172,68", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "68dccbb5", parentId: "10223019", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_vqIMMHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "174", prefix: "", name: "Establish sales channel associations", title: "OPERATIONAL.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish sales channel associations_157BC78F.html", 
	predecessors: "168", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "156affea", parentId: "10223019", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug,_v3PbIHF5EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "175", prefix: "", name: "Establish other key associations", title: "OPERATIONAL.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish other key associations_2A8FAB43.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "19060446", parentId: "227d0d20", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:true, 
	index: "176", prefix: "", name: "Financial Management", title: "FINANCIAL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Financial Management_E43F929C.jsp", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "679f85bd", parentId: "19060446", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_oGOgcHF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "177", prefix: "", name: "Determine Revenue means", title: "FINANCIAL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine Revenue means_E63932CB.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7721ca94", parentId: "19060446", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_pO8cAHF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "178", prefix: "", name: "Determine the Costs Structure", title: "FINANCIAL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the Costs Structure_AFF2C7C7.html", 
	predecessors: "170,177", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "19f3f6a0", parentId: "19060446", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_o3_7oHF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "179", prefix: "", name: "Determine the pricing strategy", title: "FINANCIAL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the pricing strategy_B47AFEB.html", 
	predecessors: "170,178", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7607be82", parentId: "19060446", relPath: ",_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug,_oWd74HF6EeSNzfNcO5_Rug", isSuppressed: "", indentSize: 3, hasChildren:false, 
	index: "180", prefix: "", name: "Determine the billing mechanisms", title: "FINANCIAL.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine the billing mechanisms_95448C5.html", 
	predecessors: "179", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6aa02a4b", parentId: "", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "181", prefix: "", name: "Postmigration", title: "Postmigration", url: "./../../ARTIST Methodology M30/capabilitypatterns/Postmigration_9A152E77.html", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1583bb0b", parentId: "6aa02a4b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_4kEMIci_EeS7wJTzzHxtQg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "182", prefix: "", name: "Verification of the behavioural equivalence with test cases", title: "VERBETC", url: "./../../ARTIST Methodology M30/capabilitypatterns/Verification of the behavioural equivalence with test cases_870208EB.html", 
	predecessors: "82", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7b5f442f", parentId: "1583bb0b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_4kEMIci_EeS7wJTzzHxtQg,_BHF9IMjAEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "183", prefix: "", name: "Formal test case specification", title: "VERBETC. A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Formal test case specification_6AFD3670.html", 
	predecessors: "86", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c4cf72ed", parentId: "1583bb0b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_4kEMIci_EeS7wJTzzHxtQg,_Atkp4MjAEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "184", prefix: "", name: "Specifying a test model", title: "VERBETC. A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Specifying a test model_98C91DA4.html", 
	predecessors: "86", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c59a9da4", parentId: "1583bb0b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_4kEMIci_EeS7wJTzzHxtQg,_CUwDEMjAEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "185", prefix: "", name: "Test Case Generation", title: "VERBETC. A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Test Case Generation_AF4C1B9A.html", 
	predecessors: "183,184", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1d38d581", parentId: "1583bb0b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_4kEMIci_EeS7wJTzzHxtQg,_B-5u4MjAEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "186", prefix: "", name: "Test Case Execution and Results Analysis", title: "VERBETC. A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Test Case Execution and Results Analysis_C9137237.html", 
	predecessors: "185", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "63bfdc99", parentId: "6aa02a4b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "187", prefix: "", name: "Verification of the behavioural equivalence with end user based tests", title: "VERBEUBT", url: "./../../ARTIST Methodology M30/capabilitypatterns/Verification of the behavioural equivalence with end user based _CDD40625.html", 
	predecessors: "82", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "22508a0e", parentId: "63bfdc99", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg,_LU4qAMjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "188", prefix: "", name: "User request discovery", title: "VERBEUBT.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/User request discovery_46BDDFC9.html", 
	predecessors: "86", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c068f9da", parentId: "63bfdc99", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg,_MK66IMjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "189", prefix: "", name: "User request mapping", title: "VERBEUBT.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/User request mapping_DCD83999.html", 
	predecessors: "188", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1223d6ea", parentId: "63bfdc99", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg,_L1KskMjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "190", prefix: "", name: "User request execution", title: "VERBEUBT.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/User request execution_2C0978C6.html", 
	predecessors: "189", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "12fad6f0", parentId: "63bfdc99", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg,_NWJ-MMjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "191", prefix: "", name: "Runtime trace extraction", title: "VERBEUBT.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Runtime trace extraction_EA784E63.html", 
	predecessors: "190", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c594b72f", parentId: "63bfdc99", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg,_M9m7UMjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "192", prefix: "", name: "Runtime trace abstraction", title: "VERBEUBT.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Runtime trace abstraction_C25D0025.html", 
	predecessors: "191", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "18bc9b5c", parentId: "63bfdc99", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg,_NsVpkMjEEeS7wJTzzHxtQg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "193", prefix: "", name: "Runtime trace comparison", title: "VERBEUBT.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Runtime trace comparison_3794A18.html", 
	predecessors: "192", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "63e2361e", parentId: "6aa02a4b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_9sZYoclTEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "194", prefix: "", name: "Non-functional goals validation - code level", title: "NFVALCL", url: "./../../ARTIST Methodology M30/capabilitypatterns/Non-functional goals validation - code level_7176DDD3.html", 
	predecessors: "7,182,187", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6d7ffbd0", parentId: "63e2361e", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_9sZYoclTEeSF8-J5ZzwGkg,_LIH5wMlbEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "195", prefix: "", name: "Processing of MAT report for code-level evaluation", title: "NFVALCL.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Processing of MAT report for code-level evaluation_46EA6B14.html", 
	predecessors: "7,182,187", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7113c040", parentId: "63e2361e", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_9sZYoclTEeSF8-J5ZzwGkg,_L7DykMlbEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "196", prefix: "", name: "Non-functional properties code-level evaluation", title: "NFVALCL.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Non-functional properties code-level evaluation_300D2C56.html", 
	predecessors: "195", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "20a3da82", parentId: "63e2361e", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_9sZYoclTEeSF8-J5ZzwGkg,_MbvdwMlbEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "197", prefix: "", name: "Conclusions about goal fulfilment", title: "NFVALCL.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Conclusions about goal fulfilment_69BC96CD.html", 
	predecessors: "196,8", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1c51db81", parentId: "6aa02a4b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_D_DpgclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "198", prefix: "", name: "Cloud Deployment Availability Auditing", title: "CLODEPAVAUD ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Cloud Deployment Availability Auditing_4F56A0A.html", 
	predecessors: "82,170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c052802d", parentId: "1c51db81", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_D_DpgclUEeSF8-J5ZzwGkg,_-vYUEMldEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "199", prefix: "", name: "SLA Preconditions Checking", title: "CLODEPAVAUD.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/SLA Preconditions Checking_99E01863.html", 
	predecessors: "86,172", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7007024d", parentId: "1c51db81", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_D_DpgclUEeSF8-J5ZzwGkg,__ConQMldEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "200", prefix: "", name: "SLA monitoring and logging", title: "CLODEPAVAUD.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/SLA monitoring and logging_91E83435.html", 
	predecessors: "199", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c2d2ede1", parentId: "1c51db81", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_D_DpgclUEeSF8-J5ZzwGkg,_ACcecMleEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "201", prefix: "", name: "Availability statistics extraction-Determination of SLA success", title: "CLODEPAVAUD.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Availability statistics extraction-Determination of SLA success_E3C629C5.html", 
	predecessors: "200", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1822b13b", parentId: "6aa02a4b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_KfZxEclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "202", prefix: "", name: "Certificate the SaaS provider", title: "CERT", url: "./../../ARTIST Methodology M30/capabilitypatterns/Certificate the SaaS provider_44A7ACFE.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6db8139e", parentId: "1822b13b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_KfZxEclUEeSF8-J5ZzwGkg,_xvrRgMlfEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "203", prefix: "", name: "Initial evaluation", title: "CERT.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial evaluation_7F36B9C.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c2f041b1", parentId: "1822b13b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_KfZxEclUEeSF8-J5ZzwGkg,_yAGTIMlfEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "204", prefix: "", name: "Analysis of evidences", title: "CERT.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis of evidences_9CDB9471.html", 
	predecessors: "203", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c4bfaa37", parentId: "1822b13b", relPath: ",_2RlMIMi_EeS7wJTzzHxtQg,_KfZxEclUEeSF8-J5ZzwGkg,_yqq6IMlfEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "205", prefix: "", name: "Evidences confirmation", title: "CERT.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Evidences confirmation_E01F5399.html", 
	predecessors: "204", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "701597be", parentId: "", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "206", prefix: "", name: "Migration Artefacts Reuse & Evolution", title: "Migration Artefacts Reuse & Evolution", url: "./../../ARTIST Methodology M30/capabilitypatterns/Migration Artefacts Reuse Evolution_981B36E2.html", 
	predecessors: "", info: "", type: "Phase", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1e0e3a39", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_RlEMMclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "207", prefix: "", name: "Submit artefacts", title: "SUBMIT", url: "./../../ARTIST Methodology M30/capabilitypatterns/Submit artefacts_D68F981F.html", 
	predecessors: "218", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "bd212cdf", parentId: "1e0e3a39", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_RlEMMclUEeSF8-J5ZzwGkg,_xVb90MllEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "208", prefix: "", name: "Trigger the evolution support service", title: "SUBMIT.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Trigger the evolution support service_C4E0B290.html", 
	predecessors: "219", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bce37fa9", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_VLzpYMlUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "209", prefix: "", name: "Process for Evolution", title: "PROCESS", url: "./../../ARTIST Methodology M30/capabilitypatterns/Process for Evolution_B89216E7.html", 
	predecessors: "207", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1b71999a", parentId: "bce37fa9", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_VLzpYMlUEeSF8-J5ZzwGkg,_TOIWkMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "210", prefix: "", name: "Prepare the incoming artefacts for proper change detection", title: "PROCESS.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Prepare the incoming artefacts for proper change detection_A487CA6A.html", 
	predecessors: "208", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6a125083", parentId: "bce37fa9", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_VLzpYMlUEeSF8-J5ZzwGkg,_UBBzIMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "211", prefix: "", name: "Detect changes derived from both versions-variants", title: "PROCESS.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Detect changes derived from both versions-variants_34C78628.html", 
	predecessors: "210", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "799052f8", parentId: "bce37fa9", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_VLzpYMlUEeSF8-J5ZzwGkg,_UcyiEMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "212", prefix: "", name: "Deliver the Change Description", title: "PROCESS.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Deliver the Change Description_DDAC33E5.html", 
	predecessors: "211", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7739b378", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_XUNgUclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "213", prefix: "", name: "Consume the output of the evolution support service", title: "CONSUME", url: "./../../ARTIST Methodology M30/capabilitypatterns/Consume the output of the evolution support service_881712B.html", 
	predecessors: "209", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "1a6a6654", parentId: "7739b378", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_XUNgUclUEeSF8-J5ZzwGkg,_dXSX4MlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "214", prefix: "", name: "Apply the evolution", title: "CONSUME.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Apply the evolution_1CE942B1.html", 
	predecessors: "209", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6af8072e", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_bZmBUclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "215", prefix: "", name: "Identify Reusable Artefacts", title: "REUSEID", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify Reusable Artefacts_DBB05B82.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "10a0e86c", parentId: "6af8072e", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_bZmBUclUEeSF8-J5ZzwGkg,_4mgXsMllEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "216", prefix: "", name: "Identify potentially reusable artefacts", title: "REUSEID.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify potentially reusable artefacts_B126342.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6b1a77c4", parentId: "6af8072e", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_bZmBUclUEeSF8-J5ZzwGkg,_5whTwMllEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "217", prefix: "", name: "Estimate reuse potential", title: "REUSEID.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Estimate reuse potential_D2D18CC2.html", 
	predecessors: "216", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "71b680b7", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_eThb0clUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "218", prefix: "", name: "Publish and Maintain Reusable Artefacts", title: "REUSEPUB", url: "./../../ARTIST Methodology M30/capabilitypatterns/Publish and Maintain Reusable Artefacts_E9B92423.html", 
	predecessors: "215", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "bce8ca87", parentId: "71b680b7", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_eThb0clUEeSF8-J5ZzwGkg,_AdFSYMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "219", prefix: "", name: "Publish artefacts to the repository", title: "REUSEPUB.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Publish artefacts to the repository_F15623E3.html", 
	predecessors: "216,217", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "71b04adf", parentId: "71b680b7", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_eThb0clUEeSF8-J5ZzwGkg,_Bk2LsMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "220", prefix: "", name: "Check artefact quality", title: "REUSEPUB.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Check artefact quality_E8E207C.html", 
	predecessors: "216,219", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c14ebe48", parentId: "71b680b7", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_eThb0clUEeSF8-J5ZzwGkg,_Dd9pcMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "221", prefix: "", name: "Maintain artefacts", title: "REUSEPUB.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Maintain artefacts_BBAF5900.html", 
	predecessors: "216,219", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1ad56152", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_jLM8cclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "222", prefix: "", name: "Collect Data for Evolution Support", title: "EVOCOLLECT", url: "./../../ARTIST Methodology M30/capabilitypatterns/Collect Data for Evolution Support_229883B4.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "748ca7bf", parentId: "1ad56152", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_jLM8cclUEeSF8-J5ZzwGkg,_omgCUMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "223", prefix: "", name: "Setup development environment", title: "EVOCOLLECT.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Setup development environment_7DAD4BB1.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c142891d", parentId: "1ad56152", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_jLM8cclUEeSF8-J5ZzwGkg,_s1Il8MlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "224", prefix: "", name: "Follow a task centred development approach", title: "EVOCOLLECT.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Follow a task centred development approach_2AB69735.html", 
	predecessors: "223", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "11f04187", parentId: "701597be", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_ppt4AclUEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "225", prefix: "", name: "Use collected Data for Evolution Support", title: "EVOUSE", url: "./../../ARTIST Methodology M30/capabilitypatterns/Use collected Data for Evolution Support_6DB82E9.html", 
	predecessors: "222", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "78c8104b", parentId: "11f04187", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_ppt4AclUEeSF8-J5ZzwGkg,_6vV3AMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "226", prefix: "", name: "Inspect dependencies before changes", title: "EVOUSE.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inspect dependencies before changes_637C5D08.html", 
	predecessors: "223", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "19d787a5", parentId: "11f04187", relPath: ",_O2CaIclUEeSF8-J5ZzwGkg,_ppt4AclUEeSF8-J5ZzwGkg,_7BWNAMlmEeSF8-J5ZzwGkg", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "227", prefix: "", name: "Inspect history before changes", title: "EVOUSE.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inspect history before changes_F38A5F2D.html", 
	predecessors: "223", info: "", type: "Task Descriptor", 
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
