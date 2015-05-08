<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Activity: MCRP</title>
<meta name="uma.type" content="Activity">
<meta name="uma.name" content="MCRP">
<meta name="uma.presentationName" content="MCRP">
<meta name="element_type" content="workflow_detail">
<meta name="filetype" content="description">
<meta name="role" content="none">
<link rel="StyleSheet" href="./../../css/default.css" type="text/css">
<script src="./../../scripts/ContentPageResource.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSubSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ActivityTreeTable.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ProcessElementPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageToolbar.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/contentPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/processElementData.js" type="text/javascript" language="JavaScript"></script><script type="text/javascript" language="JavaScript">
					var defaultQueryStr = '?proc=_boyq0RvEEeSVgNVCd9uEdQ&path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug';
					var backPath = './../../';
					var imgPath = './../../images/';
					var nodeInfo=null;
					contentPage.preload(imgPath, backPath, nodeInfo,  defaultQueryStr, false, true, true);
				</script>
</head>
<body onload="checkActivities()" onclick = "checkActivities()">

<% MPTProcessorBean activity = new MPTProcessorBean(); %>

<script language="JavaScript" type="text/javascript">
function checkActivities() {
	
	

	if (<%= activity.isMCRPA1Visible()%> == false)
		
	{
		document.getElementById("7707d357").style.display = 'none';

	}
	

	if (<%= activity.isMCRPA7Visible()%> == false)
		
	{
		document.getElementById("65eb4f25").style.display = 'none';

	}
	
	
	
	
	
	
	  }	
				
			</script>	


<div id="breadcrumbs"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td valign="top">
<div autoWrap="true">
<div id="page-guid" value="_HuxFMXFfEeSNzfNcO5_Rug"></div>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="pageTitle" nowrap="true">Activity: MCRP</td><td width="100%">
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
<td width="50"><img src="./../../images/activity.gif" alt="" title=""></td><td>
<table class="overviewTable" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top">The main objective of this process is to provide a unique point of contact between users and the provider of the services in order to act as the centre of all the service support. </td>
</tr>
</table>
</td>
</tr>
</table>
</div>
</div>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr valign="middle">
<td width="10" class="tab"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_Description" href="./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.html_desc.html">Description</a></td><td width="21"><img src="./../../images/tab_middle-i_a.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="activeTab"><span style="white-space:nowrap;">Work Breakdown Structure</span></td><td width="1"><img src="./../../images/tab_middle-a_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_TBS" href="./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.html_tbs.html"><span style="white-space:nowrap;">Team Allocation</span></a></td><td width="21"><img src="./../../images/tab_middle-i_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_WPBS" href="./../../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.html_wpbs.html"><span style="white-space:nowrap;">Work Product Usage</span></a></td><td width="21"><img src="./../../images/tab_end-i.gif" width="21" height="17" alt="" title=""></td><td width="50%"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td>
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
<img border="0" diagramType="Activity" id="diagram_Activity" src="./../../ARTIST Methodology M30/capabilitypatterns/resources/MCRP_4082FAAC_Activity.jpeg" alt="Activity diagram: MCRP" title="Activity diagram: MCRP" usemap="#Activity_MCRP"><map name="Activity_MCRP">
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Define a communication mechanism with the user_6A2329AA.html" relpath=",_wQXEkHFfEeSNzfNcO5_Rug" alt="MCRP.A1" title="MCRP.A1" coords="205, 70, 253, 119" shape="rect" guid="_wQXEkHFfEeSNzfNcO5_Rug" onclick="return <%= activity.isMCRPA1Visible()%>"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Define the appropriate physical and Logical structure for the co_1AA356F7.html" relpath=",_wf25IHFfEeSNzfNcO5_Rug" alt="MCRP.A2" title="MCRP.A2" coords="300, 65, 345, 114" shape="rect" guid="_wf25IHFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Registration Communication_41CA80C2.html" relpath=",_xuFm0HFfEeSNzfNcO5_Rug" alt="MCRP.A3" title="MCRP.A3" coords="65, 170, 110, 219" shape="rect" guid="_xuFm0HFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_9C8478F.html" relpath=",_xOfgwHFfEeSNzfNcO5_Rug" alt="MCRP.A4" title="MCRP.A4" coords="65, 250, 110, 299" shape="rect" guid="_xOfgwHFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Inform the user_4E303443.html" relpath=",_w_JdMHFfEeSNzfNcO5_Rug" alt="MCRP.A5" title="MCRP.A5" coords="320, 245, 365, 294" shape="rect" guid="_w_JdMHFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Incidence closure_A2D9FB18.html" relpath=",_wxvTUHFfEeSNzfNcO5_Rug" alt="MCRP.A6" title="MCRP.A6" coords="440, 245, 485, 294" shape="rect" guid="_wxvTUHFfEeSNzfNcO5_Rug"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Measure and analysis user feedback_48657AFC.html" relpath=",_xfejEHFfEeSNzfNcO5_Rug" alt="MCRP.A7" title="MCRP.A7" coords="545, 240, 590, 289" shape="rect" guid="_xfejEHFfEeSNzfNcO5_Rug"  onclick="return <%= activity.isMCRPA7Visible()%>" ></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/IMRP_A1BF6539.html" relpath=",_hc4h23FiEeSNzfNcO5_Rug" alt="IMRP" title="IMRP" coords="195, 245, 235, 294" shape="rect" guid="_hc4h23FiEeSNzfNcO5_Rug"></area>
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
		
{id: "7707d357", parentId: "", relPath: ",_wQXEkHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "125", prefix: "", name: "Define a communication mechanism with the user", title: "MCRP.A1 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define a communication mechanism with the user_6A2329AA.html", 
	predecessors: "165", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "729dfeea", parentId: "", relPath: ",_wf25IHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "126", prefix: "", name: "Define the appropriate physical and Logical structure for the communication mechanism", title: "MCRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Define the appropriate physical and Logical structure for the co_1AA356F7.html", 
	predecessors: "125", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "66a1fb99", parentId: "", relPath: ",_xuFm0HFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "127", prefix: "", name: "Registration Communication", title: "MCRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Registration Communication_41CA80C2.html", 
	predecessors: "126", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "6cb588e4", parentId: "", relPath: ",_xOfgwHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "128", prefix: "", name: "Initial diagnosis", title: "MCRP.A4 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_9C8478F.html", 
	predecessors: "127", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "157f56d9", parentId: "", relPath: ",_hc4h23FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:true, 
	index: "129", prefix: "", name: "IMRP", title: "IMRP", url: "./../../ARTIST Methodology M30/capabilitypatterns/IMRP_A1BF6539.html", 
	predecessors: "128", info: "", type: "Activity", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "true",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "na",
	steps: []},
	
		
		
{id: "6b6199ee", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h3XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "130", prefix: "", name: "Incidence identification", title: "IMRP.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence identification_EDE5D7D.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "6b12aaaa", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h0nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "131", prefix: "", name: "Incidence logging", title: "IMRP.A2", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence logging_AFC1CB36.html", 
	predecessors: "130", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "c268c17f", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h3nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "132", prefix: "", name: "Incidence categorization", title: "IMRP.A3", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence categorization_FD777193.html", 
	predecessors: "131", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "74555375", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h4nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "133", prefix: "", name: "Initial diagnosis", title: "IMRP.A4", url: "./../../ARTIST Methodology M30/capabilitypatterns/Initial diagnosis_C20953B2.html", 
	predecessors: "132", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "79752cf1", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h5XFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "134", prefix: "", name: "Incidence prioritization", title: "IMRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence prioritization_980221BB.html", 
	predecessors: "133", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true]},
	
		
		
{id: "71e0754e", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h43FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "135", prefix: "", name: "Incidence escalation", title: "IMRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence escalation_2AE32977.html", 
	predecessors: "", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true]},
	
		
		
{id: "bf9b5e07", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h33FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "136", prefix: "", name: "Investigation and diagnosis", title: "IMRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Investigation and diagnosis_66514758.html", 
	predecessors: "135", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true,true,true]},
	
		
		
{id: "18f0fae6", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h6nFiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "137", prefix: "", name: "Resolution and Recovery", title: "IMRP.A8", url: "./../../ARTIST Methodology M30/capabilitypatterns/Resolution and Recovery_4B2D17F0.html", 
	predecessors: "136", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "c5a43e66", parentId: "157f56d9", relPath: ",_hc4h23FiEeSNzfNcO5_Rug,_hc4h03FiEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 1, hasChildren:false, 
	index: "138", prefix: "", name: "Following up the incidence", title: "IMRP.A9", url: "./../../ARTIST Methodology M30/capabilitypatterns/Following up the incidence_189BA0FB.html", 
	predecessors: "137", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "bcb74bd8", parentId: "", relPath: ",_w_JdMHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "139", prefix: "", name: "Inform the user", title: "MCRP.A5", url: "./../../ARTIST Methodology M30/capabilitypatterns/Inform the user_4E303443.html", 
	predecessors: "107,129", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true]},
	
		
		
{id: "226739a5", parentId: "", relPath: ",_wxvTUHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "140", prefix: "", name: "Incidence closure", title: "MCRP.A6", url: "./../../ARTIST Methodology M30/capabilitypatterns/Incidence closure_A2D9FB18.html", 
	predecessors: "139", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
		
{id: "65eb4f25", parentId: "", relPath: ",_xfejEHFfEeSNzfNcO5_Rug", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "141", prefix: "", name: "Measure and analysis user feedback", title: "MCRP.A7", url: "./../../ARTIST Methodology M30/capabilitypatterns/Measure and analysis user feedback_48657AFC.html", 
	predecessors: "140", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: [true,true,true]},
	
		
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
