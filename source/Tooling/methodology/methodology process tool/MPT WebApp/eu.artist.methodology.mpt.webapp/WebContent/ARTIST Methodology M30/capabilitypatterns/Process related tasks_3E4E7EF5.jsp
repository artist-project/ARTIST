<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Phase: Process related</title>
<meta name="uma.type" content="Phase">
<meta name="uma.name" content="Process related tasks">
<meta name="uma.presentationName" content="Process related">
<meta name="element_type" content="other">
<meta name="filetype" content="description">
<meta name="role" content="none">
<link rel="StyleSheet" href="./../../css/default.css" type="text/css">
<script src="./../../scripts/ContentPageResource.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSubSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ActivityTreeTable.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ProcessElementPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageToolbar.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/contentPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/processElementData.js" type="text/javascript" language="JavaScript"></script><script type="text/javascript" language="JavaScript">
					var defaultQueryStr = '?proc=_boyq0RvEEeSVgNVCd9uEdQ&path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug';
					var backPath = './../../';
					var imgPath = './../../images/';
					var nodeInfo=null;
					contentPage.preload(imgPath, backPath, nodeInfo,  defaultQueryStr, false, true, true);
				</script>
</head>
<body onload="checkTasks()" onclick = "checkTasks()">

<% MPTProcessorBean Task = new MPTProcessorBean(); %>



<script language="JavaScript" type="text/javascript">
function checkTasks() {

	
	
	if (<%= Task.isSLAMPVisible()%> == false)
		{
	document.getElementById("c3ec7365").style.display = 'none';
		}
	

	if (<%= Task.isMCRPVisible()%> == false)
	{
	document.getElementById("1febe8dd").style.display = 'none';
	}
	
	if (<%= Task.isRAPVisible()%> == false)
	{
	document.getElementById("76391e4c").style.display = 'none';
	}

	if (<%= Task.isDPVisible()%> == false)
	{
	document.getElementById("6776042c").style.display = 'none';
	}
	
	if (<%= Task.isUMPVisible()%> == false)	
	{
	document.getElementById("6cd79136").style.display = 'none';		
	}
	
	if (<%= Task.isSLAMPA1Visible()%> == false)
		{ // var node =	document.getElementById("c3ec7365");
		  //node.parentNode.removeChild(node);
		document.getElementById("6932c2da").style.display = 'none';

		
		}
	
	if (<%= Task.isSLAMPA2Visible()%> == false)
		{
		document.getElementById("c09e7bc2").style.display = 'none';
		}

	if (<%= Task.isSLAMPA3Visible()%> == false)
		{
		document.getElementById("138a1e5b").style.display = 'none';
		}
	
	if (<%= Task.isSLAMPA4Visible()%> == false)
		{
		document.getElementById("1fa61d53").style.display = 'none';
		}
	
	if (<%= Task.isSLAMPA5Visible()%> == false)
		{
		document.getElementById("78c49b89").style.display = 'none';
		}
	
	if (<%= Task.isSLAMPA6Visible()%> == false)
		{
		document.getElementById("1ef6d117").style.display = 'none';
		}
	
	
	if (<%= Task.isMCRPA1Visible()%> == false)
		{
		document.getElementById("766082a1").style.display = 'none';
		}
	
	if (<%= Task.isMCRPA7Visible()%> == false)
		{
		document.getElementById("c7ffe93f").style.display = 'none';
		}
	
	
	  }	
	  
	  
	  
	  
				
		
				
			</script>	
<div id="breadcrumbs"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td valign="top">
<div autoWrap="true">
<div id="page-guid" value="_96FfEXFeEeSNzfNcO5_Rug"></div>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="pageTitle" nowrap="true">Phase: Process related</td><td width="100%">
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
<td width="10" class="tab"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_Description" href="./../../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.html_desc.html">Description</a></td><td width="21"><img src="./../../images/tab_middle-i_a.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="activeTab"><span style="white-space:nowrap;">Work Breakdown Structure</span></td><td width="1"><img src="./../../images/tab_middle-a_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_TBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.html_tbs.html"><span style="white-space:nowrap;">Team Allocation</span></a></td><td width="21"><img src="./../../images/tab_middle-i_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_WPBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.html_wpbs.html"><span style="white-space:nowrap;">Work Product Usage</span></a></td><td width="21"><img src="./../../images/tab_end-i.gif" width="21" height="17" alt="" title=""></td><td width="50%"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td>
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
<img border="0" diagramType="Activity" id="diagram_Activity" src="./../../ARTIST Methodology M30/capabilitypatterns/resources/Process related tasks_3E4E7EF5_Activity.jpeg" alt="Activity diagram: Process related" title="Activity diagram: Process related" usemap="#Activity_Process related tasks"><map name="Activity_Process related tasks">
<area href="./../../ARTIST Methodology M30/capabilitypatterns/SLAMP_6ED80D9B.jsp" relpath=",__6FA4XFeEeSNzfNcO5_Rug" alt="SLAMP" title="SLAMP" coords="200, 165, 240, 214" shape="rect" guid="__6FA4XFeEeSNzfNcO5_Rug" onclick="return <%= Task.isSLAMPVisible()%>" ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/UMP_EDBF639D.html" relpath=",_BJzjYXFfEeSNzfNcO5_Rug" alt="UMP" title="UMP" coords="305, 85, 345, 134" shape="rect" guid="_BJzjYXFfEeSNzfNcO5_Rug"  onclick="return <%= Task.isUMPVisible()%>"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/CPMP_77C1929F.html" relpath=",_D0kggXFfEeSNzfNcO5_Rug" alt="CPMP" title="CPMP" coords="280, 250, 320, 299" shape="rect" guid="_D0kggXFfEeSNzfNcO5_Rug"  onclick="return <%= Task.isSLAMPVisible()%>" ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/IMRP_B93C3581.html" relpath=",_FWoJIXFfEeSNzfNcO5_Rug" alt="IMRP" title="IMRP" coords="415, 165, 455, 214" shape="rect" guid="_FWoJIXFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/MP_236F7095.html" relpath=",_GqN38XFfEeSNzfNcO5_Rug" alt="MP" title="MP" coords="425, 85, 465, 134" shape="rect" guid="_GqN38XFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.jsp" relpath=",_HuxFMXFfEeSNzfNcO5_Rug" alt="MCRP" title="MCRP" coords="315, 165, 355, 214" shape="rect" guid="_HuxFMXFfEeSNzfNcO5_Rug"  onclick="return <%= Task.isMCRPVisible()%>" ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/RAP_C7DEDC90.html" relpath=",_JxTksXFfEeSNzfNcO5_Rug" alt="RAP" title="RAP" coords="365, 250, 405, 299" shape="rect" guid="_JxTksXFfEeSNzfNcO5_Rug"  onclick="return <%= Task.isRAPVisible()%>" ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/DP_56F7EE33.html" relpath=",_M2J1wXFfEeSNzfNcO5_Rug" alt="DP" title="DP" coords="210, 85, 250, 134" shape="rect" guid="_M2J1wXFfEeSNzfNcO5_Rug"  onclick="return <%= Task.isDPVisible()%>" ></area>
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
		
{id: "c3ec7365", parentId: "", relPath: ",__6FA4XFeEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "88", prefix: "", name: "SLAMP", title: "SLAMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/SLAMP_6ED80D9B.jsp", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6932c2da", parentId: "c3ec7365", relPath: ",__6FA4XFeEeSNzfNcO5_Rug,_SuHHoHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "89", prefix: "", name: "Determine SLA frameworks", title: "SLAMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine SLA frameworks_4600B941.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c09e7bc2", parentId: "c3ec7365", relPath: ",__6FA4XFeEeSNzfNcO5_Rug,_S-NZIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "90", prefix: "", name: "Determine, document and agree requirements for existing and new services", title: "SLAMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Determine, document and agree requirements for existing and new _711A022B.html", 
	predecessors: "89", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "138a1e5b", parentId: "c3ec7365", relPath: ",__6FA4XFeEeSNzfNcO5_Rug,_Un23gHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "91", prefix: "", name: "Review underpinning agreements", title: "SLAMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review underpinning agreements_F6BF601.html", 
	predecessors: "90", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1fa61d53", parentId: "c3ec7365", relPath: ",__6FA4XFeEeSNzfNcO5_Rug,_TjnMQHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "92", prefix: "", name: "Monitor service performance against SLA", title: "SLAMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor service performance against SLA_9F352292.html", 
	predecessors: "91", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "78c49b89", parentId: "c3ec7365", relPath: ",__6FA4XFeEeSNzfNcO5_Rug,_UEGDIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "93", prefix: "", name: "Produce service reports", title: "SLAMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Produce service reports_AA6B3852.html", 
	predecessors: "92", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "1ef6d117", parentId: "c3ec7365", relPath: ",__6FA4XFeEeSNzfNcO5_Rug,_tHxREHFhEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "94", prefix: "", name: "Review SLAs and underpinning agreements", title: "SLAMP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review SLAs and underpinning agreements_51225ED9.html", 
	predecessors: "92,90,91,93", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6cd79136", parentId: "", relPath: ",_BJzjYXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "95", prefix: "", name: "UMP", title: "UMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/UMP_EDBF639D.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
{id: "762761a0", parentId: "6cd79136", relPath: ",_BJzjYXFfEeSNzfNcO5_Rug,_diSb4HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "96", prefix: "", name: "Planning the releases", title: "UMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Planning the releases_2759A24E.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "c229e0ec", parentId: "6cd79136", relPath: ",_BJzjYXFfEeSNzfNcO5_Rug,_c9fFsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "97", prefix: "", name: "Build and test the release", title: "UMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Build and test the release_566CBD11.html", 
	predecessors: "96", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "1fd0a93e", parentId: "6cd79136", relPath: ",_BJzjYXFfEeSNzfNcO5_Rug,_dzbPMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "98", prefix: "", name: "Release testing and pilot", title: "UMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Release testing and pilot_4C41B4E5.html", 
	predecessors: "97", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "6d880e36", parentId: "6cd79136", relPath: ",_BJzjYXFfEeSNzfNcO5_Rug,_dPD94HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "99", prefix: "", name: "Perform transfer, deployment and retirement", title: "UMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Perform transfer, deployment and retirement_69A4713B.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "77fd3275", parentId: "6cd79136", relPath: ",_BJzjYXFfEeSNzfNcO5_Rug,_eD0boHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "100", prefix: "", name: "Verify, review and close deployment", title: "UMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Verify, review and close deployment_7E42AF70.html", 
	predecessors: "99", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1fc953ba", parentId: "", relPath: ",_D0kggXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "101", prefix: "", name: "CPMP", title: "CPMP", url: "./../../ARTIST Methodology M30/capabilitypatterns/CPMP_77C1929F.html", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6babd5df", parentId: "1fc953ba", relPath: ",_D0kggXFfEeSNzfNcO5_Rug,_iFdsIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "102", prefix: "", name: "Define the main features to be fulfilled by the cloud provider", title: "CPMP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the main features to be fulfilled by the cloud provider_3913FD71.html", 
	predecessors: "173", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1f9e134b", parentId: "1fc953ba", relPath: ",_D0kggXFfEeSNzfNcO5_Rug,_jSgHAHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "103", prefix: "", name: "Select cloud provider", title: "CPMP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select cloud provider_6A163657.html", 
	predecessors: "102", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "true", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6b00b5cc", parentId: "1fc953ba", relPath: ",_D0kggXFfEeSNzfNcO5_Rug,_ibXqsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "104", prefix: "", name: "Establish the cloud provider agreement", title: "CPMP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Establish the cloud provider agreement_62D320AD.html", 
	predecessors: "103,173", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "70168ba0", parentId: "1fc953ba", relPath: ",_D0kggXFfEeSNzfNcO5_Rug,_iucXsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "105", prefix: "", name: "Monitor the fulfilment of the conditions", title: "CPMP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the fulfilment of the conditions_307E037C.html", 
	predecessors: "104", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6d537266", parentId: "1fc953ba", relPath: ",_D0kggXFfEeSNzfNcO5_Rug,_i-PHMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "106", prefix: "", name: "Report and control the non-fulfilment", title: "CPMP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Report and control the non-fulfilment_6C28617D.html", 
	predecessors: "105", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "181bf259", parentId: "", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "107", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_B93C3581.html", 
	predecessors: "124", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c2d3e3ab", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_mFBR8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "108", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_FF05D15F.html", 
	predecessors: "128", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6b46c230", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_m15VQHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "109", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_9C2A6702.html", 
	predecessors: "108", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6ccb486f", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_lfUj4HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "110", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_72535189.html", 
	predecessors: "109", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "14079903", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_naaXkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "111", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_E154BCCD.html", 
	predecessors: "110", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "7621c050", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_nF11wHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "112", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_BC5B6F.html", 
	predecessors: "111", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "72f9cf3f", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_mddnIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "113", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_C8C3C446.html", 
	predecessors: "112", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "6e466d6b", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_nwdgEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "114", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_8CB382B5.html", 
	predecessors: "113", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "6eb5575e", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_n_D8wHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "115", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_C57EA5C.html", 
	predecessors: "114", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6b4caec7", parentId: "181bf259", relPath: ",_FWoJIXFfEeSNzfNcO5_Rug,_lOLwkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "116", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_D8E34511.html", 
	predecessors: "115", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1318b634", parentId: "", relPath: ",_GqN38XFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "117", prefix: "", name: "MP", title: "MP", url: "./../../ARTIST Methodology M30/capabilitypatterns/MP_236F7095.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6c9c472a", parentId: "1318b634", relPath: ",_GqN38XFfEeSNzfNcO5_Rug,_rjNY8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "118", prefix: "", name: "Analysis the market for the migrated solution", title: "MP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis the market for the migrated solution_E063B559.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "1fcf4fcd", parentId: "1318b634", relPath: ",_GqN38XFfEeSNzfNcO5_Rug,_r5tNYHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "119", prefix: "", name: "Identify the Marketing objectives", title: "MP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify the Marketing objectives_273AA672.html", 
	predecessors: "118", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "1f8bf1de", parentId: "1318b634", relPath: ",_GqN38XFfEeSNzfNcO5_Rug,_sU1DIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "120", prefix: "", name: "Identify the Marketing Strategy", title: "MP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Identify the Marketing Strategy_4FBE02DA.html", 
	predecessors: "119", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6c7d8e56", parentId: "1318b634", relPath: ",_GqN38XFfEeSNzfNcO5_Rug,_tN5ZIHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "121", prefix: "", name: "Start implementing the market strategy", title: "MP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Start implementing the market strategy_C940C704.html", 
	predecessors: "120", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "66a17ffa", parentId: "1318b634", relPath: ",_GqN38XFfEeSNzfNcO5_Rug,_s8wl0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "122", prefix: "", name: "Monitor the market plan", title: "MP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the market plan_290B0258.html", 
	predecessors: "121", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7137b8ee", parentId: "1318b634", relPath: ",_GqN38XFfEeSNzfNcO5_Rug,_smjsUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "123", prefix: "", name: "Monitor the market", title: "MP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Monitor the market_A3C4DFC.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1febe8dd", parentId: "", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "124", prefix: "", name: "MCRP", title: "MCRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.jsp", 
	predecessors: "162", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "766082a1", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_wQXEkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "125", prefix: "", name: "Define a communication mechanism with the user", title: "MCRP.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define a communication mechanism with the user_6A2329AA.html", 
	predecessors: "165", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "c81413ed", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_wf25IHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "126", prefix: "", name: "Define the appropriate physical and Logical structure for the communication mechanism", title: "MCRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the appropriate physical and Logical structure for the co_1AA356F7.html", 
	predecessors: "125", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "6f39e166", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_xuFm0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "127", prefix: "", name: "Registration Communication", title: "MCRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Registration Communication_41CA80C2.html", 
	predecessors: "126", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "750ce9d1", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_xOfgwHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "128", prefix: "", name: "Initial diagnosis", title: "MCRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_9C8478F.html", 
	predecessors: "127", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "c3b5665f", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:true, 
	index: "129", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_A1BF6539.html", 
	predecessors: "128", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "c11eaeb3", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h3XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "130", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_EDE5D7D.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6cc75699", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h0nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "131", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_AFC1CB36.html", 
	predecessors: "130", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6cb50191", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h3nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "132", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_FD777193.html", 
	predecessors: "131", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "1a865bc4", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h4nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "133", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_C20953B2.html", 
	predecessors: "132", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "13bb3516", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h5XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "134", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_980221BB.html", 
	predecessors: "133", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "c09185e2", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h43FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "135", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_2AE32977.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "67925984", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h33FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "136", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_66514758.html", 
	predecessors: "135", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "72d80fd9", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h6nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "137", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_4B2D17F0.html", 
	predecessors: "136", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "15960bca", parentId: "c3b5665f", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug,_hc4h03FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 2, hasChildren:false, 
	index: "138", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_189BA0FB.html", 
	predecessors: "137", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "63d37946", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_w_JdMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "139", prefix: "", name: "Inform the user", title: "MCRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inform the user_4E303443.html", 
	predecessors: "107,129", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "bf8d3e8a", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_wxvTUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "140", prefix: "", name: "Incidence closure", title: "MCRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence closure_A2D9FB18.html", 
	predecessors: "139", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "c7ffe93f", parentId: "1febe8dd", relPath: ",_HuxFMXFfEeSNzfNcO5_Rug,_xfejEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "141", prefix: "", name: "Measure and analysis user feedback", title: "MCRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Measure and analysis user feedback_48657AFC.html", 
	predecessors: "140", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "76391e4c", parentId: "", relPath: ",_JxTksXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "142", prefix: "", name: "RAP", title: "RAP", url: "./../../ARTIST Methodology M30/capabilitypatterns/RAP_C7DEDC90.html", 
	predecessors: "170", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "7355879e", parentId: "76391e4c", relPath: ",_JxTksXFfEeSNzfNcO5_Rug,_7wnbsHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "143", prefix: "", name: "Define the new roles", title: "RAP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the new roles_2D830F.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "bcfce5b9", parentId: "76391e4c", relPath: ",_JxTksXFfEeSNzfNcO5_Rug,_8FoCYHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "144", prefix: "", name: "Modify the existing roles", title: "RAP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Modify the existing roles_269B48D7.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "130b858d", parentId: "76391e4c", relPath: ",_JxTksXFfEeSNzfNcO5_Rug,_8cH20HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "145", prefix: "", name: "Train people", title: "RAP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Train people_2699BB33.html", 
	predecessors: "143,144", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "667f5a94", parentId: "76391e4c", relPath: ",_JxTksXFfEeSNzfNcO5_Rug,_6wFy0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "146", prefix: "", name: "Communicate the affected people their new activities and responsibilities", title: "RAP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Communicate the affected people their new activities and respons_507EE3D2.html", 
	predecessors: "145", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c20e02a4", parentId: "76391e4c", relPath: ",_JxTksXFfEeSNzfNcO5_Rug,_7IrR8HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "147", prefix: "", name: "Communicate the entire organisation the new and modified roles", title: "RAP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Communicate the entire organisation the new and modified roles_32F38628.html", 
	predecessors: "146", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6776042c", parentId: "", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "148", prefix: "", name: "DP", title: "DP", url: "./../../ARTIST Methodology M30/capabilitypatterns/DP_56F7EE33.html", 
	predecessors: "", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "667d1bce", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_BKBJUHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "149", prefix: "", name: "Requirements elicitation", title: "DP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Requirements elicitation_D69B3DEB.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "787498cf", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_CAQ00HFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "150", prefix: "", name: "Select the requirements to be developed in the sprint", title: "DP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select the requirements to be developed in the sprint_253F54FC.html", 
	predecessors: "149", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "69f522ed", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_ArLRMHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "151", prefix: "", name: "Analysis and modelling", title: "DP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Analysis and modelling_907946B9.html", 
	predecessors: "150", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "772f76a5", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_A5L4AHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "152", prefix: "", name: "Development", title: "DP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Development_3F38B8EA.html", 
	predecessors: "151", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "76380d8e", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_CeNVEHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "153", prefix: "", name: "Testing of functional and non functional requirements", title: "DP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Testing of functional and non functional requirements_DB1E6734.html", 
	predecessors: "152", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "705c6908", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_BrjJEHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "154", prefix: "", name: "Review and add the requirements", title: "DP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Review and add the requirements_AA14017A.html", 
	predecessors: "153", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "1bb7ed45", parentId: "6776042c", relPath: ",_M2J1wXFfEeSNzfNcO5_Rug,_COalkHFgEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "155", prefix: "", name: "Test and deploy the final application", title: "DP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Test and deploy the final application_D1482E5B.html", 
	predecessors: "154", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
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
