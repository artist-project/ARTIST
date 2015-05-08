<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Activity: SCTARGET</title>
<meta name="uma.type" content="Activity">
<meta name="uma.name" content="Select Cloud Target">
<meta name="uma.presentationName" content="SCTARGET">
<meta name="element_type" content="workflow_detail">
<meta name="filetype" content="description">
<meta name="role" content="none">
<link rel="StyleSheet" href="./../../css/default.css" type="text/css">
<script src="./../../scripts/ContentPageResource.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageSubSection.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ActivityTreeTable.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ProcessElementPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/ContentPageToolbar.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/contentPage.js" type="text/javascript" language="JavaScript"></script><script src="./../../scripts/processElementData.js" type="text/javascript" language="JavaScript"></script><script type="text/javascript" language="JavaScript">
					var defaultQueryStr = '?proc=_boyq0RvEEeSVgNVCd9uEdQ&path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg';
					var backPath = './../../';
					var imgPath = './../../images/';
					var nodeInfo=null;
					contentPage.preload(imgPath, backPath, nodeInfo,  defaultQueryStr, false, true, true);
				</script>
</head>
<body onload="checkActivities()">

<% MPTProcessorBean activity = new MPTProcessorBean(); %>

<script language="JavaScript" type="text/javascript">
function checkActivities() {
	
	

	if (<%= activity.isSCTARGETA2A3Visible()%> == false)
		
	{
		document.getElementById("7b3db4b8").style.display = 'none';
		document.getElementById("67361a4c").style.display = 'none';

	}
	
	
	
	
	
	  }	
				
			</script>	


<div id="breadcrumbs"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td valign="top">
<div autoWrap="true">
<div id="page-guid" value="_EihmEW_HEeSHL-dlvDvGPg"></div>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="pageTitle" nowrap="true">Activity: SCTARGET</td><td width="100%">
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
<td valign="top">Models of the candidate Cloud targets (infrastructure or platform providers), which are available through the ARTIST repository are matched against the afore-posed requirements, using a model-enabled matchmaking algorithm. The optimal target provider (e.g. best ranked match) could be automatically selected or the selection can be deferred to the end-user, who selects it amongst the found matches</td>
</tr>
</table>
</td>
</tr>
</table>
</div>
</div>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr valign="middle">
<td width="10" class="tab"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_Description" href="./../../ARTIST Methodology M30/capabilitypatterns/Select Cloud Target_A1FE6C17.html_desc.html">Description</a></td><td width="21"><img src="./../../images/tab_middle-i_a.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="activeTab"><span style="white-space:nowrap;">Work Breakdown Structure</span></td><td width="1"><img src="./../../images/tab_middle-a_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_TBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Select Cloud Target_A1FE6C17.html_tbs.html"><span style="white-space:nowrap;">Team Allocation</span></a></td><td width="21"><img src="./../../images/tab_middle-i_i.gif" width="21" height="17" align="absmiddle" alt="" title=""></td><td nowrap class="tab"><a class="tab" id="TAB_WPBS" href="./../../ARTIST Methodology M30/capabilitypatterns/Select Cloud Target_A1FE6C17.html_wpbs.html"><span style="white-space:nowrap;">Work Product Usage</span></a></td><td width="21"><img src="./../../images/tab_end-i.gif" width="21" height="17" alt="" title=""></td><td width="50%"><img src="./../../images/shim.gif" width="10" height="17" alt="" title=""></td>
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
<img border="0" diagramType="Activity" id="diagram_Activity" src="./../../ARTIST Methodology M30/capabilitypatterns/resources/Select Cloud Target_A1FE6C17_Activity.jpeg" alt="Activity diagram: SCTARGET" title="Activity diagram: SCTARGET" usemap="#Activity_Select Cloud Target"><map name="Activity_Select Cloud Target">
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Select annotated non-cloud PIM_BA84BC11.html" relpath=",_E_KM0G_JEeSHL-dlvDvGPg" alt="SCTARGET.A1" title="SCTARGET.A1" coords="140, 155, 211, 204" shape="rect" guid="_E_KM0G_JEeSHL-dlvDvGPg"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Match and rank the best cloud environments_F3A66162.html" relpath=",_PohqIG_HEeSHL-dlvDvGPg" alt="SCTARGET.A2" title="SCTARGET.A2" coords="290, 155, 364, 204" shape="rect" guid="_PohqIG_HEeSHL-dlvDvGPg" onclick="return <%= activity.isSCTARGETA2A3Visible()%>"></area>
<area href="./../../ARTIST Methodology M30/capabilitypatterns/Select Target Cloud Environment_30D2AFDC.html" relpath=",_QlK4kG_HEeSHL-dlvDvGPg" alt="SCTARGET.A3" title="SCTARGET.A3" coords="440, 160, 511, 209" shape="rect" guid="_QlK4kG_HEeSHL-dlvDvGPg" onclick="return <%= activity.isSCTARGETA2A3Visible()%>"></area>
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
		
{id: "6cc41c08", parentId: "", relPath: ",_E_KM0G_JEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "66", prefix: "", name: "Select annotated non-cloud PIM", title: "SCTARGET.A1", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select annotated non-cloud PIM_BA84BC11.html", 
	predecessors: "60", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "7b3db4b8", parentId: "", relPath: ",_PohqIG_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "67", prefix: "", name: "Match and rank the best cloud environments", title: "SCTARGET.A2 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Match and rank the best cloud environments_F3A66162.html", 
	predecessors: "66", info: "", type: "Task Descriptor", 
	repeatable: "false", multiOccurences: "false", optional: "false", planned: "false",  ongoing: "false", eventDriven: "false", 
	team: "", entryState: "", exitState: "", deliverable: "", variabilityType: "",
	steps: []},
	
		
		
{id: "67361a4c", parentId: "", relPath: ",_QlK4kG_HEeSHL-dlvDvGPg", isSuppressed: "", indentSize: 0, hasChildren:false, 
	index: "68", prefix: "", name: "Select Target Cloud Environment", title: "SCTARGET.A3 ", url: "./../../ARTIST Methodology M30/capabilitypatterns/Select Target Cloud Environment_30D2AFDC.html", 
	predecessors: "67", info: "", type: "Task Descriptor", 
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
