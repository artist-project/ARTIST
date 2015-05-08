//------------------------------------------------------------------------------
// Copyright (c) 2005, 2006 IBM Corporation and others.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
// 
// Contributors:
// IBM Corporation - initial implementation
//------------------------------------------------------------------------------

function ActivityTreeTable(/*ProcessElementPage*/parent) {
this.parent = parent;
this.tree_node_class  = "treeNode";	// !!! don't translate this !!!
this.expandImage = null;
this.collapseImage = null;
this.shimImage = null;
this.wbsItemHtml = null;
this.imagePath = null;
this.NODE_COLLAPSED = 0;
this.NODE_EXPANDED = 1;
this.DEFAULT_EXPAND_LEVEL = 0; // 0 - collapse all, 1 - expand the first level, ..., 9999 - if you have this many

};

// Creates the collapsible tree table
// the expected format of the html source are as follows:
// each <TR tag has a uinque id and a parentId.
/*
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" href="./css/default.css" rel="StyleSheet">
<script src="./treetable.js" type="text/javascript" language="JavaScript"></script>
</head>
<body onload="createTree('td', 'treeNode', './images/');" >
<table border="1">
<tr id="1" parentId="0">
<td class="treeNode">col 1-1</td><td>col 1-2</td>
</tr>

<tr id="2" parentId="1">
<td class="treeNode">col 1-1</td><td>col 2-2</td>
</tr>

<tr id="3" parentId="1">
<td class="treeNode">col 1-1</td><td>col 2-2</td>
</tr>

<tr id="4" parentId="0">
<td class="treeNode">col 2-1</td><td>col 2-2</td>
</tr>
</table>
</body>
*/
ATTR_ROW_DATA_INDEX = "dataIndex";
ATTR_CHILD_LOADED = "childLoaded";
ATTR_INDENT_SIZE = "indentSize";
ATTR_EXPANDED = "expanded";

ActivityTreeTable.prototype.initialize = function(imgPath)
{
	this.imagePath = contentPage.resolveUrl(imgPath);
	this.expandImage = this.imagePath + 'expand.gif';	
	this.collapseImage = this.imagePath + 'collapse.gif';
	//expandAllImage = this.imagePath + 'expand_all.gif';	
	//collapseAllImage = this.imagePath + 'collapse_all.gif';
	//backToTopImage = this.imagePath + 'back_to_top.gif';
	this.shimImage = this.imagePath + 'indent.gif';
	this.wbsItemHtml = new WBSItemHtml(this, this.imagePath);
};

ActivityTreeTable.prototype.createTree = function(tagName, classSelector) {

	// create the tree table first
	this.createTable();
};


ActivityTreeTable.prototype.createTable = function() {

	var div = document.getElementById("treeContent");
	if ( div == null ) return;
	
	// create table
	var table = document.createElement("TABLE");
	table.id = "ActivityTreeTable";
	table.title = this.data.title;
	table.summary = this.data.summary;
	table.cellspacing = "0px";
	table.cellpadding = "0px";
	table.border="0px";
	table.width="100%";
	table.bordercolor = "#999999";
	table.className = "breakdownTable";
	
	// create table head
	//var tr = document.createElement("TR");
	var tr = table.insertRow(table.rows.length);
	
	tr.setAttribute("valign", "top");
	
	var len = this.data.columns.length;
	for ( i = 0; i < len; i++ ) {
		var col = this.data.columns[i];
		var id = BS_ID_PREFIX + col[0];
		var abbr = col[1];
		
		var th = document.createElement("TH");		
		th.id = id;
		th.abbr = abbr;
		th.innerHTML = "<span style='white-space:nowrap;'>" + col[1] + "</span>";
		tr.appendChild(th);
	}			
	
	
	//table.appendChild(tr);
	div.appendChild(table);
	
	// create the top rows
	this.createToplevelRows();
		
	// for IE need to reset to fresh the layout
	//div.innerHTML = "" + div.innerHTML + "";
};

ActivityTreeTable.prototype.processTR = function(trElement) {

	var indentSize = 0;
	var parentId = trElement.getAttribute("parentId");
	var parentTR  = null;
	if ( parentId != "")
	{

		// cache it to be faster
		parentTR = document.getElementById(parentId);
		//parentTR = createdNodes[parentId];
		if ( parentTR != null && parentTR != undefined )
		{
			indentSize = parseInt(parentTR.getAttribute(ATTR_INDENT_SIZE)) + 1;
		}
	}

	var expanded = this.getDefaultExpandState(indentSize);

	trElement.setAttribute(ATTR_INDENT_SIZE, indentSize);
	trElement.setAttribute(ATTR_EXPANDED, expanded);

	//alert("createTreeNode for id, parentId, indent =" + trElement.id + ", " + parentId + ",  indentSize=" + indentSize);
	//createTreeNode(element, indentSize);

	//save the created ones so we can referecne it
	//createdNodes[trElement.id] = trElement;


	if ( (parentTR != null) && this.isNodeSuppressed(parentTR) )
	{
		this.setNodeSuppressed(trElement, true);
		//alert("parent suppressed");
	}

	if ( this.isNodeSuppressed(trElement) == true || (parentTR != null && parentTR.getAttribute(ATTR_EXPANDED) == this.NODE_COLLAPSED) )
	{
		trElement.style.display = 'none';
		//alert("suppressed");
	}
				
};

ActivityTreeTable.prototype.getTreeTable = function() {
	return document.getElementById("ActivityTreeTable");
};

ActivityTreeTable.prototype.createToplevelRows = function() {

	var table = this.getTreeTable();
	if ( table == null ) return;

	var rows = this.data.rows;
	var len = rows.length;
	var suppressedRows = new Array();
	//var parentId = "";
	
	for ( var i = 0; i < len; i++ ) {
	
		var row = rows[i];
		if ( row == null ) continue;
		
		//parentId = "";
		
		// don't create the row if the row is suppressed or if the parent is suppressed
		if ( this.isRowSuppressed(row) ) {
			//suppressedRows.push(row.id);
			//parentId = row.id;
			
			// clear the suppressed rows
			rows[i] = null;
			
			//alert("suppressed " + i);
			continue;
		}
		
		/*		
		while ( (row.parentId != parentId) && (suppressedRows.length > 0) ) {
			parentId = suppressedRows.pop();
		}
		
		if ( (row.parentId != "") && (row.parentId == parentId) ) {
			suppressedRows.push(row.id);
			
			// clear the suppressed rows
			rows[i] = null;

			//alert("suppressed " + i);
			continue;
		}
		*/
		
		
		if ( row.parentId == null || row.parentId == "") {
			this.wbsItemHtml.parseRow(row);
			
			var tr = table.insertRow(table.rows.length);
			tr.setAttribute(ATTR_ROW_DATA_INDEX, i);

			this.wbsItemHtml.loadRow(tr);
			
			//table.appendChild(tr);
			
			this.processTR(tr);
		}
	}
};


ActivityTreeTable.prototype.createChildRows = function(trElement) {

	var loaded = trElement.getAttribute(ATTR_CHILD_LOADED);
	if ( loaded == "true" ) {
		return;
	}


	var table = this.getTreeTable();
	//var insertBefore = trElement.getNextSibling;
	var rowIndex =  parseInt(trElement.rowIndex);
	
	// make sure the value is a number otherwise Fire fox will treat it as a string
	var dataIndex =  parseInt(trElement.getAttribute(ATTR_ROW_DATA_INDEX));
	
	for ( var i = dataIndex+1; i < this.data.rows.length; i++ ) {
		var row = this.data.rows[i];
		if ( row == null ) continue;
		if ( row.parentId != trElement.id ) {
			continue;
		}
		
		this.wbsItemHtml.parseRow(row);

		rowIndex++;
		var tr = table.insertRow(rowIndex);
		tr.setAttribute(ATTR_ROW_DATA_INDEX, i);
		this.wbsItemHtml.loadRow(tr);

		this.processTR(tr);
		
	}	
	
	trElement.setAttribute(ATTR_CHILD_LOADED, "true");
	
};



ActivityTreeTable.prototype.getDefaultExpandState = function(level)
{

	if (level >= this.DEFAULT_EXPAND_LEVEL ) {
		return this.NODE_COLLAPSED;
	} else {
		return this.NODE_EXPANDED;
	}

};

ActivityTreeTable.prototype.getTreeNodeSrc = function(level)
{
	if ( this.getDefaultExpandState(level) == this.NODE_COLLAPSED ) {
		return this.expandImage;
	}
	else {
		return this.collapseImage;
	}
};


ActivityTreeTable.prototype.getIMG = function(trElement)
{
	var e = trElement;
	
	while ( e != null && e.tagName != "IMG")
	{	
		e = e.firstChild;
		//alert(e.tagName);
	}
	
	if(e.nextSibling!=null){
		return e.nextSibling;
	}
	
	return e;
};

ActivityTreeTable.prototype.getTR = function(element)
{
	// the heml structure is
	// <tr id="2" parentId="1">
	// <td class="treeNode">col 1-1</td><td>col 2-2</td>
	// </tr>
	var e = element;
	while ( e != null && e.tagName != "TR" || e.className != this.tree_node_class)
	{	
		e = e.parentNode;
		//alert(e.tagName);
	}
	
	return e;
};


// Expands or collapses a section based on the received event.
ActivityTreeTable.prototype.expandCollapseTreeNode = function(evtElement) {

	//alert(evtElement.tagName);

	var trElement = this.getTR(evtElement);
	
	// make sure the child rows are created
	this.createChildRows(trElement);
	
	// if there is no child, remove the tree node image
	if ( !this._hasChildren(trElement) )
	{
		evtElement.src = this.shimImage;
		evtElement.onclick = null;
		evtElement.style.cursor = "default";
		return false;
	}
	
	var expanded = trElement.getAttribute(ATTR_EXPANDED);

	if (expanded == this.NODE_EXPANDED) {
		this.hideChildren(trElement);
		evtElement.src = this.expandImage;
		expanded = this.NODE_COLLAPSED;
		evtElement.alt = contentPage.res.expandText;
		evtElement.title = contentPage.res.expandText;
	}
	else {
		this.showHideChildren(trElement, true);
		evtElement.src = this.collapseImage;
		expanded = this.NODE_EXPANDED;
		evtElement.alt = contentPage.res.collapseText;
		evtElement.title = contentPage.res.collapseText;		
	}
	
	trElement.setAttribute(ATTR_EXPANDED, expanded);
	
	/*
	if (evt && evt.preventDefault) {
		evt.preventDefault();
	}
	*/
	
	return false;
};

ActivityTreeTable.prototype.getFirstTreeNodeTR = function(table)
{
	var e = table;
	
	while ( e != null && e.tagName != "TR") {	
		e = e.firstChild;
	}
	
	while (e!=null&&e.className != this.tree_node_class) {
		e = e.nextSibling;
	}
	
	return e;
};

ActivityTreeTable.prototype.expandAllTreeNode = function() {
	var table = this.getTreeTable();
	
	if ( table == null ) return;

	var firstTreeNode=this.getFirstTreeNodeTR(table);
	this.createChildRows(firstTreeNode);
	this.showHideChildren(firstTreeNode,true);
	var imgElement=this.getIMG(firstTreeNode);
	if (this._hasChildren(firstTreeNode)) {
		imgElement.src = this.collapseImage;
		imgElement.alt = contentPage.res.collapseText;
		imgElement.title = contentPage.res.collapseText;
		firstTreeNode.setAttribute(ATTR_EXPANDED, this.NODE_EXPANDED);
	}
	else {
		imgElement.src = this.shimImage;
	}
	
	var nextTR = this.getNextSibling(firstTreeNode);
	while ( nextTR != null) 
	{	
		var imgElement = this.getIMG(nextTR)
		if (this.isNodeSuppressed(nextTR) == false)
		{
			this.createChildRows(nextTR);
			this.showHideChildren(nextTR,true);
			if (this._hasChildren(nextTR)) {
				imgElement.src = this.collapseImage;
				imgElement.alt = contentPage.res.collapseText;
				imgElement.title = contentPage.res.collapseText;
				nextTR.setAttribute(ATTR_EXPANDED, this.NODE_EXPANDED);
			}
			else {
				imgElement.src = this.shimImage;
			}
		}
		nextTR = this.getNextSibling(nextTR);
	}
};

ActivityTreeTable.prototype.collapseAllTreeNode = function() {

	var table = this.getTreeTable();
	
	if ( table == null ) return;

	var firstTreeNode = this.getFirstTreeNodeTR(table);
	this.createChildRows(firstTreeNode);
	this.hideChildren(firstTreeNode);
	
	var imgElement = this.getIMG(firstTreeNode);
	
	if(this._hasChildren(firstTreeNode)) {
		imgElement.src = this.expandImage;
		imgElement.alt = contentPage.res.expandText;
		imgElement.title = contentPage.res.expandText;
		firstTreeNode.setAttribute(ATTR_EXPANDED, this.NODE_COLLAPSED);
	}
	else {
		// alert("null");
		imgElement.src = this.shimImage;
	}
	
	var nextTR = this.getNextSibling(firstTreeNode);
	
	//alert("nextTR.getAttribute:"+nextTR.getAttribute("parentId"));
	while ( nextTR != null) 
	{
		if (this.isNodeSuppressed(nextTR) == false)
		{
			//this.hideChildren(nextTR);
			this.createChildRows(nextTR);
			this.hideChildren(nextTR);
			var imgElement=this.getIMG(nextTR);
			if (this._hasChildren(nextTR)) {
				this.getIMG(nextTR).src = this.expandImage;
				imgElement.alt = contentPage.res.expandText;
				imgElement.title = contentPage.res.expandText;
				nextTR.setAttribute(ATTR_EXPANDED, this.NODE_COLLAPSED);
			}
			else {
				imgElement.src = this.shimImage;
			}
		}
		nextTR = this.getNextSibling(nextTR);
		//alert("nextTR.getAttribute:"+nextTR.getAttribute("parentId"));
	}
};


ActivityTreeTable.prototype.hideChildren = function(parent)
{	
	// make sure it's the TR element
	parent = this.getTR(parent);
	//var parentId = parent.id;
	var indentSize = parseInt(parent.getAttribute(ATTR_INDENT_SIZE));
	
	var nextTR = parent;
	while ( (nextTR=this.getNextSibling(nextTR)) != null && nextTR.getAttribute(ATTR_INDENT_SIZE) > indentSize )
	{		
		nextTR.style.display = 'none';		
	}
		
};


ActivityTreeTable.prototype.showHideChildren = function(parent, show)
{		
	// make sure it's the TR element
	parent = this.getTR(parent);
	
	//var indentSize = parent.indentSize;
	var nextTR = this.getNextSibling(parent);
	while ( nextTR != null && nextTR.getAttribute("parentId") == parent.id )
	{
		if ( show && (this.isNodeSuppressed(nextTR) == false) )
		{
			nextTR.style.display = '';
		}
		else
		{
			
			nextTR.style.display = 'none';
		}
		
		nextTR = this.showHideChildren(nextTR, (show==true)&&(nextTR.getAttribute(ATTR_EXPANDED)==this.NODE_EXPANDED) );
	}
	
	return nextTR;
	
};


ActivityTreeTable.prototype._hasChildren = function(parent)
{

	// make sure it's the TR element
	parent = this.getTR(parent);

	var nextTR = this.getNextSibling(parent);
	
//alert("parent.id=" + parent.id + ", nextTR.parentId=" + nextTR.getAttribute("parentId") + ", isSuppressed=" + isNodeSuppressed(nextTR));

	if ( nextTR != null && nextTR.getAttribute("parentId") == parent.id) 
	{
		if (this.isNodeSuppressed(nextTR) == false)
		{
			return true;
		}
		else
		{
			nextTR.nextSibling;
			while (nextTR != null)
			{
				if (this.isNodeSuppressed(nextTR) == false)
				{
					return true;
				}
				nextTR = nextTR.nextSibling;
			}
			return false;
		}
	}
	
	return false;
};


ActivityTreeTable.prototype.getNextSibling = function(element)
{

	var nextElement = element.nextSibling;
	while (nextElement != null && nextElement.tagName != element.tagName )
	{
		nextElement = nextElement.nextSibling;
	}
	
	return nextElement;
};



ActivityTreeTable.prototype.getFirstChild = function(trElement, tagName, className)
{
	var e = trElement.firstChild;
	while (e != null)
	{
		//alert(e.tagName);
		if ( (tagName == null || e.tagName == tagName) && (className == null || e.className == className) )
		{
			return e;
		}
		
		e = e.nextSibling;
	}
	
	return null;
		
};

ActivityTreeTable.prototype.isNodeSuppressed = function(trElement)
{
	// if isSupressed attribute is defined, always use it
	// only browsign model set this attribute
	// if not defined, it's in published site, look up the flag from the generated map
	var attr_suppressed = trElement.getAttribute("isSupressed");
	var relPath = trElement.getAttribute("relProcessPath");
	
	var flag = this.isSuppressed(attr_suppressed, relPath);
	
	if ( attr_suppressed == null || attr_suppressed == "" || attr_suppressed == undefined )
	{		
		this.setNodeSuppressed(trElement, flag);
	}
	
	return flag;
};

ActivityTreeTable.prototype.isRowSuppressed = function(row)
{
	if ( row == null ) return true;
	
	return this.isSuppressed(row.isSuppressed, row.relPath);
	
};

ActivityTreeTable.prototype.isSuppressed = function(attr_suppressed, relPath)
{	
	// if isSupressed attribute is defined, always use it
	// only browsign model set this attribute
	// if not defined, it's in published site, look up the flag from the generated map
	
	//alert(attr_suppressed + "=" + relPath);
	var flag = false;
	
	if ( attr_suppressed == null || attr_suppressed == "" || attr_suppressed == "undefined" )
	{
		// this method is defined in activitylayout.js
		if ( relPath != null && relPath != "" && relPath != "undefined" )
		{
			flag = this.parent.isSuppressed(contentPage.processPage.par_proc, contentPage.processPage.par_path + relPath);
		}
		//alert("x1, flag=" + flag);
	}
	else
	{
		flag = (attr_suppressed == "true");
	}
	
	//alert(flag + " = " + attr_suppressed + relPath);
	return flag;

};


ActivityTreeTable.prototype.setNodeSuppressed = function(trElement, flag)
{
	trElement.setAttribute("isSupressed", flag ? "true" : "false");
		
};




// define the break down structure columns ids here
BS_COL_INDEX = "id";
BS_COL_NAME = "name";
BS_COL_PREFIX = "prefix";
BS_COL_PREDECESSORS = "predecessors";
BS_COL_IS_REPEATABLE = "is_repeatable";
BS_COL_IS_ONGOING = "is_ongoing";
BS_COL_IS_EVENT_DRIVEN = "is_event_driven";
BS_COL_ENTRY_STATE = "entry_state";
BS_COL_EXIT_STATE = "exit_state";
BS_COL_TEAMS = "teams";
BS_COL_TYPE = "type";
BS_COL_MODEL_INFO = "model_info";
BS_COL_PRESENTATION_NAME = "presentation_name"; 
BS_COL_STEPS = "steps";
BS_COL_DELIVERABLE = "deliverable"; 
BS_COL_IS_OPTIONAL = "is_optional"; 
BS_COL_IS_PLANNED = "is_planned";
BS_COL_HAS_MULTIPLE_OCCURRENCES = "has_multiple_occurrences";

// id prefix
BS_ID_PREFIX = "BS_COL_";
STEP_GROUP_SIZE = 5;

function WBSItemHtml(/*ActivityTreeTable*/parent)
{
this.parent = parent;
//this.imagePath = imgPath;

this.extendVariability = "extend"; // !!! don't translate this !!!
this.localContributionVariability = "localContribution";	// !!! don't translate this !!!
this.localReplacementVariability = "localReplacement";	// !!! don't translate this !!!

//this.source_html = new Array();
//this.columns = [];
this.fields = [];
this.indentSize = 0;
this.hasChildren = false;
this.id = "";
this.parentId = "";
this.relPath = null;
this.isSupressed = false;
this.url = "";


};



WBSItemHtml.prototype.getTreeNodeTableHtml = function(indentSize, hasChildren, title, url, relPath)
{

// test
// the url is passed in to a string to construct a string literal
// need to escape the quotes
url = url.replace(/(\'|\")/g, "\\$1");

url = contentPage.processPage.getActivityItemUrl(url, contentPage.processPage.par_proc, contentPage.processPage.par_path, relPath);

var src = [
"<table bgcolor=\"#000000\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"defaultTable\"><tr><td nowrap=\"nowrap\">" ];
src = src.concat(this.getTreeNodeHtml(indentSize, hasChildren)); 
src = src.concat([
"</td><td width=\"100%\" nowrap=\"nowrap\">" , 
"<a href=\"" , url , "\">" , title , "</a>" , 
"</td></tr></table>"]);

	return src;
};


WBSItemHtml.prototype.getTreeNodeHtml = function(indentSize, hasChildren)
{
	var width = 17*indentSize;

	var str = ["<div class=\"treeNode\"><span>"];
	var slen = 1;
	if ( indentSize > 0 )
	{
		str[slen] = "<img alt=\"\" width=\"" ;
		str[slen + 1] = width ;
		str[slen + 2] = "\" height=\"15\" border=\"0\" src=\"" ;
		str[slen + 3] = this.parent.shimImage ;
		str[slen + 4] = "\"/>";
		slen += 5;
	}


	var imgSrc;
	
	if ( !hasChildren )
	{
		str[slen]= "<img alt=\"\" width=\"17\" height=\"15\" border=\"0\" align=\"absmiddle\" src=\"" ;
		str[slen + 1] = this.parent.shimImage ;
		str[slen + 2] = "\">";
		slen += 3;

	}
	else 
	{
		var imageSrc = this.parent.getTreeNodeSrc(indentSize);
		str[slen] = "<img alt=\"" ;
		str[slen + 1] =  contentPage.res.expandText ;
		str[slen + 2] =  "\" title=\"" ;
		str[slen + 3] =  contentPage.res.expandText ;
		str[slen + 4] =  "\" width=\"17\" height=\"15\" border=\"0\" align=\"absmiddle\" src=\"" ;
		str[slen + 5] =  imageSrc ;
		str[slen + 6] =  "\"" ;
		str[slen + 7] =  " style=\"cursor:hand\" onclick=\"contentPage.processPage.treeTable.expandCollapseTreeNode(this);return false;\" />";
		slen += 8;
	}
	
	
	str[slen] = "</span>&#160;&#160;</div>";

	return str;	
};


WBSItemHtml.prototype.parseRow = function(row) {
	/*
	var _id = row.id;
	var _parentId = row.parentId;
	var _relPath = row.relPath;
	var _isSupressed = row.isSuppressed;
	var _indentSize = row.indentSize;
	var _hasChildren = row.hasChildren; 
	var _index = row.index;
	var _prefix= row.prefix;
	name, title, url, steps, predecessors, info, type, 
	repeatable, multiOccurences, optional, planned, ongoing, eventDriven, 
	team, entryState, exitState, deliverable, variabilityType;
	*/
	
	this.initRow(row.id, row.parentId, row.relPath, row.isSupressed, row.indentSize, row.hasChildren, 
		row.index, row.prefix, row.name, row.title, row.url, "", row.predecessors, row.info, row.type, 
		row.repeatable, row.multiOccurences, row.optional, row.planned, row.ongoing, row.eventDriven, 
		row.team, row.entryState, row.exitState, row.deliverable, row.variabilityType);
	
	if ( row.steps != null ) {
		var len = row.steps.length;
		var brk = false;
		for ( var i = 0; i < len; i++ ) {
			brk = ((i+1)%STEP_GROUP_SIZE == 0 );
			this.addStep(row.steps[i], brk);
		}
	}
};

WBSItemHtml.prototype.loadRow = function(/*DOM*/tr)
{
	//var tr = document.createElement("TR");
	tr.id = this.id;
	tr.className = "treeNode";
	tr.setAttribute("parentId", this.parentId);
	tr.setAttribute("relProcessPath", this.relPath);

	// is suppressed flag is set only when in browsing model, it's not set in publishing model
	if ( this.isSupressed != null && this.isSupressed != "" && this.isSupressed != undefined) {
		tr.setAttribute("isSupressed", this.isSupressed);
	}
	
	// get the cell source
	var src = [];
	var len = this.parent.data.columns.length;
	for (var i = 0; i < len; i++ ) {
		var td = tr.insertCell(tr.cells.length);
		this.loadCell(td, i);
		//tr.appendChild(td);
		
	}
	
	return tr;				
};



WBSItemHtml.prototype.initRow = function(id, parentId, relPath, isSupressed, indentSize, hasChildren, 
	index, prefix, name, title, url, steps, predecessors, info, type, 
	repeatable, multiOccurences, optional, planned, ongoing, eventDriven, 
	team, entryState, exitState, deliverable, variabilityType)
{
	this.indentSize = indentSize;
	this.hasChildren = hasChildren;
	this.id = id;
	this.parentId = parentId;
	this.relPath = relPath;
	this.isSupressed = isSupressed;
	
	this.fields[BS_COL_INDEX] = index;
	this.fields[BS_COL_PREFIX] = prefix;
	this.fields[BS_COL_NAME] = name;
	this.fields[BS_COL_PRESENTATION_NAME] = title;
	this.url = url;
	this.fields[BS_COL_STEPS] = steps;
	this.fields[BS_COL_PREDECESSORS] = predecessors;
	if (variabilityType.indexOf(this.extendVariability) != -1 || 
		variabilityType.indexOf(this.localContributionVariability) != -1 || 
		variabilityType.indexOf(this.localReplacementVariability) != -1 )
	{
		this.fields[BS_COL_MODEL_INFO] = "";
	}
	else
	{
		this.fields[BS_COL_MODEL_INFO] = info;
	}	
	this.fields[BS_COL_TYPE] = type;

	this.fields[BS_COL_TEAMS] = team;

	this.fields[BS_COL_ENTRY_STATE] = entryState;
	this.fields[BS_COL_EXIT_STATE] = exitState;
	this.fields[BS_COL_DELIVERABLE] = deliverable;
	
	this.setStates(repeatable, multiOccurences, optional, planned, ongoing, eventDriven);
	
	
};

WBSItemHtml.prototype.addStep = function(selected, lineBreak)
{
	var img_src;
	if ( selected ) {
		img_src = this.parent.imagePath + "circle_close.gif";
	} else {
		img_src = this.parent.imagePath + "circle_open.gif";	
	}
	
	var steps = this.fields[BS_COL_STEPS];
	steps += "<img width=\"10\" height=\"9\" alt=\"\" src=\"" + img_src + "\" />";
	if (lineBreak)
	{
		steps += "<br/>";
	}
	
	this.fields[BS_COL_STEPS] = steps;
};


WBSItemHtml.prototype.setStates = function(repeatable, multiOccurences, optional, planned, ongoing, eventDriven)
{
	if ( repeatable == "true") {
		repeatable = "<img alt=\"" + contentPage.res.checkedAltText + "\" height=\"15\" width=\"20\" src=\"" + this.parent.imagePath + "true.gif\">";
	} else {
		repeatable = "&nbsp;";
	}
	
	if ( multiOccurences == "true") {
		multiOccurences = "<img alt=\"" + contentPage.res.checkedAltText + "\" title=\"" + contentPage.res.checkedAltText + "\" height=\"15\" width=\"20\" src=\"" + this.parent.imagePath + "true.gif\">";
	} else {
		multiOccurences = "&nbsp;";
	}
	
	if ( optional == "true") {
		optional = "<img alt=\"" + contentPage.res.checkedAltText + "\" title=\"" + contentPage.res.checkedAltText + "\" height=\"15\" width=\"20\" src=\"" + this.parent.imagePath + "true.gif\">";
	} else {
		optional = "&nbsp;";
	}

	if ( planned =="true") {
		planned = "<img alt=\"" + contentPage.res.checkedAltText + "\" title=\"" + contentPage.res.checkedAltText + "\" height=\"15\" width=\"20\" src=\"" + this.parent.imagePath + "true.gif\">";
	} else {
		planned = "&nbsp;";
	}

	if ( ongoing =="true") {
		ongoing = "<img alt=\"" + contentPage.res.checkedAltText + "\" title=\"" + contentPage.res.checkedAltText + "\" height=\"15\" width=\"20\" src=\"" + this.parent.imagePath + "true.gif\">";
	} else {
		ongoing = "&nbsp;";
	}
	
	if ( eventDriven =="true") {
		eventDriven = "<img alt=\"" + contentPage.res.checkedAltText + "\" title=\"" + contentPage.res.checkedAltText + "\" height=\"15\" width=\"20\" src=\"" + this.parent.imagePath + "true.gif\">";
	} else {
		eventDriven = "&nbsp;";
	}
	
	
	this.fields[BS_COL_IS_REPEATABLE] = repeatable;
	this.fields[BS_COL_HAS_MULTIPLE_OCCURRENCES] = multiOccurences;
	this.fields[BS_COL_IS_OPTIONAL] = optional;
	this.fields[BS_COL_IS_PLANNED] = planned;
	this.fields[BS_COL_IS_ONGOING] = ongoing;
	this.fields[BS_COL_IS_EVENT_DRIVEN] = eventDriven;

};



WBSItemHtml.prototype.loadCell = function(/*DOM*/tdEl, columnCount) {

	var col = this.parent.data.columns[columnCount];
	var col_id = col[0];
	var text = this.fields[col_id];
	if ( text == "" ) {
		text = "&nbsp;";
	}
	
	var id = BS_ID_PREFIX + col_id;
	
	//var tdEl = document.createElement("TD");	
	tdEl.id = id;
	tdEl.headers = "";
	
	var str = "";
	var slen = 3;
	if ( columnCount % 2 != 0 ) {
		tdEl.style.background = "#cccccc";
	}
	
	if ( col_id.indexOf("is_") >=0 || col_id.indexOf("has_") >=0 ) {	
		tdEl.align = "center";
	}
	
	if ( col_id == BS_COL_TYPE || col_id == BS_COL_STEPS ) {
		//tdEl.nowrap = true;
		text = "<span style='white-space:nowrap;'>" + text + "</span>";
	}
	
	if ( col_id == BS_COL_PRESENTATION_NAME ) {
		tdEl.width="100%";
		text = this.getTreeNodeTableHtml(
			this.indentSize, this.hasChildren, 
			text, this.url, this.relPath).join("");
		
	} 
	

	tdEl.innerHTML = text;
	return tdEl;

};