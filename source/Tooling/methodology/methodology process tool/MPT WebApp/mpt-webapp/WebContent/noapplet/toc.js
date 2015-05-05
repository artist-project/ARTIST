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
 
// Common scripts for IE and Mozilla.

var isMozilla = navigator.userAgent.indexOf('Mozilla') != -1 && parseInt(navigator.appVersion.substring(0,1)) >= 5;
var isIE = navigator.userAgent.indexOf('MSIE') != -1;

// this is the selected node
var oldActive;
var oldActiveClass = "";
var toc_loaded = false;

function setLoaded()
{
	toc_loaded = true;
	selectFirstTopic();
}

// Preload images
// **********************************************************
// Note: code moved into the jsp, for dynamic image preferences

/**
 * Returns the target node of an event
 */
function getTarget(e) {
	var target;
  	if (isMozilla)
  		target = e.target;
  	else if (isIE)
   		target = window.event.srcElement;

	return target;
}

/**
 * Returns the next tree node "down" from current one
 */
function getNextDown(node)
{
	var a = getAnchorNode(node);
	if (!a) return null;
		
	// Try visible child first
	var li = a.parentNode;
	var ul = getChildNode(li, "UL");
	if (ul && ul.className == "expanded")
		return getDescendantNode(ul, "A");
	
	// Try next sibling
	var li_sib = getNextSibling(li);
	if (li_sib != null)
		return getDescendantNode(li_sib, "A");
		
	// Try looking to parent's sibling
	while(li_sib == null) {
		var ul = li.parentNode;
		li = ul.parentNode;
		if (li.tagName != "LI") // reached the top, nothing else to do
			return null;
			
		li_sib = getNextSibling(li);		
	}
		
	// found the next down sibling
	return getDescendantNode(li_sib, "A");		
}

/**
 * Returns the next tree node "down" from current one
 */
function getNextUp(node)
{
	var a = getAnchorNode(node);
	if (!a) return null;
		
	// Get previous sibling first
	var li = a.parentNode;
	var li_sib = getPrevSibling(li);
	if (li_sib != null) {
		// try to get the deepest node that preceeds this current node
		var candidate = getDescendantNode(li_sib, "A");
		var nextDown = getNextDown(candidate);
		while(nextDown != null && nextDown != node){
			candidate = nextDown;
			nextDown = getNextDown(nextDown);
		}
		return getDescendantNode(candidate, "A");	;
	} else {
		// get the parent
		var li = li.parentNode.parentNode;
		if (li && li.tagName == "LI")
			return getDescendantNode(li, "A");
		else
			return null;
	}
}

/**
 * Returns the next sibling element
 */
function getNextSibling(node) 
{
	var sib = node.nextSibling;
	while (sib && (sib.nodeType == 3 || sib.tagName=="SCRIPT")) // text or script node
		sib = sib.nextSibling;
	return sib;
}

/**
 * Returns the next sibling element
 */
function getPrevSibling(node) 
{
	var sib = node.previousSibling;
	while (sib && (sib.nodeType == 3 || sib.tagName=="SCRIPT")) // text or script node
		sib = sib.previousSibling;
	return sib;
}


/**
 * Returns the child node with specified tag
 */
function getChildNode(parent, childTag)
{
	var list = parent.childNodes;
	if (list == null) return null;
	for (var i=0; i<list.length; i++)
		if (list.item(i).tagName == childTag)
			return list.item(i);
	return null;
}

/**
 * Returns the descendat node with specified tag (depth-first searches)
 */
function getDescendantNode(parent, childTag)
{	
	if (parent == null) return null;
	
	if (parent.tagName == childTag)
		return parent;
		
	var list = parent.childNodes;
	if (list == null) return null;
	for (var i=0; i<list.length; i++) {
		var child = list.item(i);
		if(child.tagName == childTag)
			return child;
		
		child = getDescendantNode(child, childTag);
		if (child != null)
			return child;
	}
	return null;
}


/**
 * Returns the anchor of this click
 * NOTE: MOZILLA BUG WITH A:focus and A:active styles
 */
function getAnchorNode(node) {
  if (node == null) return null;
   
  if (node.nodeType == 3)  //"Node.TEXT_NODE") 
	return node.parentNode;
  else if (node.tagName == "A") 
    return node;
  else if (node.tagName == "IMG")
  	return getChildNode(node.parentNode, "A");
  return null;
}

/**
 * Returns the plus/minus icon for this tree node
 */
function getPlusMinus(node)
{
	if (isPlusMinus(node))
		return node;
  	else if (node.nodeType == 3)  //"Node.TEXT_NODE") 
		return getChildNode(node.parentNode.parentNode, "IMG");
	else if (node.tagName == "IMG")
    	return getChildNode(node.parentNode.parentNode, "IMG");
  	else if (node.tagName == "A") 
    	return getChildNode(node.parentNode, "IMG");

 	return null;
}


/**
 * Returns true when the node is the plus or minus icon
 */
function isPlusMinus(node)
{
	return (node.nodeType != 3 && node.tagName == "IMG" && (node.className == "expanded" || node.className == "collapsed"));
}

/**
 * Collapses a tree rooted at the specified element
 */
function collapse(node) {
  node.className = "collapsed";
  node.src = plus.src;
  node.alt = altTopicClosed;
  // set the UL as well
  var ul = getChildNode(node.parentNode, "UL");
  if (ul != null) ul.className = "collapsed";
}

/**
 * Expands a tree rooted at the specified element
 */
function expand(node) {
  	node.className = "expanded";
  	node.src = minus.src;
    node.alt = altTopicOpen;
  	// set the UL as well
  	var ul = getChildNode(node.parentNode, "UL");
  	if (ul != null){
  		ul.className = "expanded";
  		if (ul.id.length > 0){
  			if (!frames.dynLoadFrame) {
  				return;
  			}
  			var ix = window.location.href.indexOf('?');
  			if (ix < 0) {
  				return;
  			}
  			var query = window.location.href.substr(ix);
  			frames.dynLoadFrame.location = "tocFragment.jsp" + query + "&path=" + ul.id;
  		}
  	}
}

/**
 * Expands the nodes from root to the specified node
 */
function expandPathTo(node, inclusive)
{

	// when the node is a link, get the plus/minus image
	if (node.tagName == "A") 
	{
		var img = getChildNode(node.parentNode, "IMG")
		if (img != null)
		{			
			expandPathTo(img, inclusive);
			return;
		}
	}
	
	if (inclusive && isCollapsed(node))
		expand(node);
		
	var li = node.parentNode;
	if (li == null) return;
	var ul = li.parentNode;
	if (ul == null) return;
	li = ul.parentNode;
	if (li == null) return;
	var img = getChildNode(li, "IMG");
	if (img == null) return;
		
	expandPathTo(img, true);
}

/**
 * Returns true when this is an expanded tree node
 */
function isExpanded(node) {
  return node.className == "expanded";
}

/**
 * Returns true when this is a collapsed tree node
 */
function isCollapsed(node) {
  return  node.className == "collapsed";
}

/**
 * Highlights link
 */
function highlightTopic(topic)
{
	if (isMozilla)
		window.getSelection().removeAllRanges();

  	var a = getAnchorNode(topic); 
  	if (a != null)
  	{
  	 // 	parent.parent.parent.setContentToolbarTitle(tocTitle);
  	  	if (oldActive) 
  	  		oldActive.className = oldActiveClass;

  		oldActive = a;
  		oldActiveClass = a.className;
  		a.className = "active";
  		// it looks like the onclick event is not handled in mozilla
  		// *** TO DO: handle failed synchronization, do not select in that case
  		if (isMozilla && a.onclick) 
  			a.onclick()
  		//if (isIE)
  		//	a.hideFocus = "true";
  		
  	}
}


function getFirstTopicUrl()
{
	var links = document.getElementsByTagName("a");
	if ( links.length > 0 )
	{
		return links[0].href;
	}
	
	return null;
}

function selectFirstTopic() {
	//var url = getFirstTopicUrl();
	//selectTopic(url);

	var links = document.getElementsByTagName("a");
	if ( links.length > 0 )
	{
		highlightTopic(links[0]);
		parent.parent.frames["ory_doc"].location.href = links[0].href;
	}


}


/**
 * Selects a topic in the tree: expand tree and highlight it
 * returns true if success
 */
function selectTopic(topic)
{
	if (!topic)
		return false;
		
	topic = parent.parent.fixUrl(topic);
	
	// remove the query, if any
	var i = topic.indexOf('?');
	if (i != -1)
		topic = topic.substring(0, i);


	var links = document.getElementsByTagName("a");

	for (var i=0; i<links.length; i++)
	{			
		var fixed_href = parent.parent.fixUrl(links[i].href);
		
		// remove the query, if any
		var indx = fixed_href.indexOf('?');
		if (indx != -1) {
			fixed_href = fixed_href.substring(0, indx);
		}

		//alert("fixed href=" + fixed_href);
		if (topic == fixed_href)
		{
			expandPathTo(links[i], false);
			highlightTopic(links[i]);
			scrollIntoView(links[i]);
			return true;
		}
	}
	return false;
}

/**
 * Selects a topic in the tree: expand tree and highlight it
 * returns true if success
 */
function selectTopicById(id)
{
	var topic = document.getElementById(id);
	if (topic)
	{
		expandPathTo(topic, false);
		highlightTopic(topic);
		scrollIntoView(topic);
		return true;
	}
	return false;
}

/**
 * Scrolls the page to show the specified element
 */
function scrollIntoView(node)
{
	var scroll = getVerticalScroll(node);
	if (scroll != 0)
		window.scrollBy(0, scroll);
}

/**
 * Scrolls the page to show the specified element
 */
function getVerticalScroll(node)
{
	var nodeTop = node.offsetTop;
	var nodeBottom = nodeTop + node.offsetHeight;
	var pageTop = 0;
	var pageBottom = 0;
	
	if (isIE)
	{
		pageTop = document.body.scrollTop; 
		pageBottom = pageTop + document.body.clientHeight;
	
	} 
	else if (isMozilla)
	{
		pageTop = window.pageYOffset;
		pageBottom = pageTop + window.innerHeight - node.offsetHeight;
	}
	
	var scroll = 0;
	if (nodeTop >= pageTop )
	{
		if (nodeBottom <= pageBottom)
			scroll = 0; // already in view
		else
			scroll = nodeBottom - pageBottom;
	}
	else
	{
		scroll = nodeTop - pageTop;
	}
	
	return scroll;
}

/*
 * Currently called on IE only
 */
function focusHandler(e)
{
	/*if (isMozilla)
		return;
	*/
		
	try{
		if (oldActive){
			// only focus when the element is visible
			var scroll = getVerticalScroll(oldActive);
			if (scroll == 0)
				oldActive.focus();
		}		
	}
	catch(e){}
}


/**
 * display topic label in the status line on mouse over topic
 */
function mouseMoveHandler(e) {
	var overNode = getTarget(e);
 	if (!overNode) return;
  	
	overNode = getAnchorNode(overNode);
	  if (overNode == null){
	   window.status = "";
	   return;
	  }
 
	if (isMozilla)
		e.cancelBubble = false;
  	 
	if (overNode.title == "") {
		if (overNode.innerText)
			overNode.title = overNode.innerText;
		else if (overNode.text)
			overNode.title = overNode.text;
	}
	window.status = overNode.title;
}

/**
 * handler for expanding / collapsing topic tree
 */
function mouseClickHandler(e) {

  	var clickedNode = getTarget(e);

  	if (isPlusMinus(clickedNode) )
  	{	
  		if (clickedNode.getAttribute("showIcon") == "true")
  		{
	  		if (isCollapsed(clickedNode)) 
	   			expand(clickedNode);
	  		else if (isExpanded(clickedNode)) 
	  	  		collapse(clickedNode);
  		}
  	}
  	else
  	{
  		var plus_minus = getPlusMinus(clickedNode);
  		if (plus_minus != null)
  			highlightTopic(plus_minus);
  	}
  	
  	if (isMozilla)
  		e.cancelBubble = true;
  	else if (isIE)
  		window.event.cancelBubble = true;
}

/**
 * handler for expanding / collapsing topic tree
 */
function mouseDblClickHandler(e) {

  	var clickedNode = getTarget(e);
  	if (!clickedNode) return;

  	var plus_minus = getPlusMinus(clickedNode);
  	if (plus_minus != null)
  	{	
    	if (clickedNode.tagName == "A" && getChildNode(clickedNode.parentNode, "UL") == null) 
  		{
  			highlightTopic(plus_minus);
  		}
  		else
  		{  		
  			if (clickedNode.getAttribute("showIcon") == "true")
  			{
	    		if (isCollapsed(plus_minus)) 
	   				expand(plus_minus);
	  			else if (isExpanded(plus_minus)) 
	  	  			collapse(plus_minus);  	
	  	  	}  		  		  
  	  			
  			highlightTopic(plus_minus);
  		}
  	}
  
  	if (isMozilla)
  		e.cancelBubble = true;
  	else if (isIE)
  		window.event.cancelBubble = true;
}

/**
 * Handler for key down (arrows)
 */
function keyDownHandler(e)
{
	var key;

	if (isIE) {
		key = window.event.keyCode;
	} else if (isMozilla) {
		key = e.keyCode;
	}
		
	if (key <37 || key > 40) 
		return true;
	
	if (isMozilla)
  		e.cancelBubble = true;
  	else if (isIE)
  		window.event.cancelBubble = true;
  		
  	if (key == 39) { // Right arrow, expand
		var clickedNode = getTarget(e);
  		if (!clickedNode) return;
  		if (isIE){
			if(clickedNode.id!=null){
				if(clickedNode.id.charAt(0)=='b'){
					if(clickedNode.name!="opened"){
						loadTOC(clickedNode.name);
						return true;
					}
				}
			}
		}

  		var plus_minus = getPlusMinus(clickedNode);
  		if (plus_minus != null)
  		{	
    		if (isCollapsed(plus_minus)) 
   				expand(plus_minus);
  			
  			highlightTopic(plus_minus);
  			scrollIntoView(clickedNode);
  		}
  	} else if (key == 37) { // Left arrow,collapse
		var clickedNode = getTarget(e);
  		if (!clickedNode) return;
  		
  		if(clickedNode.id!=null){
  			if(clickedNode.id.charAt(0)=='b'){
				if(clickedNode.name=="opened"){
					loadTOC(" ");
					return true;
				}
				else{ 	
					return true;
				}
			}
			
		}

  		var plus_minus = getPlusMinus(clickedNode);
  		if (plus_minus != null)
  		{	
    		if (isExpanded(plus_minus)) 
   				collapse(plus_minus);
  			
  			highlightTopic(plus_minus);
  			scrollIntoView(clickedNode);
  		}
  	} else if (key == 40 ) { // down arrow
  		var clickedNode = getTarget(e);
  		if (!clickedNode) return;

		var next = getNextDown(clickedNode);
		if (next)
			next.focus();

  	} else if (key == 38 ) { // up arrow
  		var clickedNode = getTarget(e);
  		if (!clickedNode) return;

		var next = getNextUp(clickedNode);
		if (next)
			next.focus();
  	}
  	
  	 			
  	return true;
}

if (isMozilla) {
  document.addEventListener('click', mouseClickHandler, true);
  document.addEventListener('dblclick', mouseDblClickHandler, true);
  document.addEventListener('mousemove', mouseMoveHandler, true);
  document.addEventListener('keydown', keyDownHandler, true);
}
else if (isIE){
  document.onclick = mouseClickHandler;
  document.ondblclick = mouseDblClickHandler;
  document.onmousemove = mouseMoveHandler;
  document.onkeydown = keyDownHandler;
  //window.onfocus = focusHandler;
}

function setCookie( name, value, expires, path, domain, secure ) 
{
	// set time, it's in milliseconds
	var today = new Date();
	today.setTime( today.getTime() );

	/*
	if the expires variable is set, make the correct 
	expires time, the current script below will set 
	it for x number of days, to make it for hours, 
	delete * 24, for minutes, delete * 60 * 24
	*/
	if ( expires )
	{
	expires = expires * 1000 * 60 * 60 * 24;
	}
	var expires_date = new Date( today.getTime() + (expires) );

	document.cookie = name + "=" +escape( value ) +
	( ( expires ) ? ";expires=" + expires_date.toGMTString() : "" ) + 
	( ( path ) ? ";path=" + path : "" ) + 
	( ( domain ) ? ";domain=" + domain : "" ) +
	( ( secure ) ? ";secure" : "" );
}


function getCookie( name ) {	
	var start = document.cookie.indexOf( name + "=" );
	var len = start + name.length + 1;
	if ( ( !start ) &&
	( name != document.cookie.substring( 0, name.length ) ) )
	{
	return null;
	}
	if ( start == -1 ) return null;
	var end = document.cookie.indexOf( ";", len );
	if ( end == -1 ) end = document.cookie.length;
	return unescape( document.cookie.substring( len, end ) );
}


function Delete_Cookie( name, path, domain ) {
	if ( Get_Cookie( name ) ) document.cookie = name + "=" +
	( ( path ) ? ";path=" + path : "") +
	( ( domain ) ? ";domain=" + domain : "" ) +
	";expires=Thu, 01-Jan-1970 00:00:01 GMT";
}

function fixTopicUrl(url) {

	var fixed_href = parent.parent.fixUrl(url);
	// remove the query, if any
	var indx = fixed_href.indexOf('?');
	if (indx != -1) {
		fixed_href = fixed_href.substring(0, indx);
	}

	return fixed_href;
}

/* find the node with the given url and return the A element */	
function findNode(topic) {
	if (!topic) {
		return null;
	}
	
	topic = fixTopicUrl(topic);	
	var links = document.getElementsByTagName("a");
	for (var i=0; i<links.length; i++)
	{			
		var fixed_href = fixTopicUrl(links[i].href);			
		if (topic == fixed_href)
		{
			//alert(topic + "\n" + links[i].href);
			return links[i];
		}
	}
	
	return null;
}


function getNodeIdFromUrl(url) {

	var indx = url.indexOf("?");
	if ( indx < 0 ) {
		return null;
	}
	
	queryStr = url.substring(indx+1);
	var pairs = queryStr.split("&");
   	for (var i = 0; i < pairs.length; i++) {
     		var pos = pairs[i].indexOf('=');
     		if (pos == -1) continue;
     		var argname = pairs[i].substring(0,pos);
     		var value = pairs[i].substring(pos+1);    	
     		if ( argname == "nodeId" ) {
     			return value;
     		}
	}
	
	return null;
}

function getBreadcrumbsByGuid(guid) {

	var node = getNodeByGuid(guid);
	if (node != null) {
		id = node.getAttribute("id");
		return getBreadcrumbsByNodeId(id);
	}
	
	return "";	
}

function getNodeByGuid(guid) {

	var links = document.getElementsByTagName("a");
	for (var i=0; i<links.length; i++)
	{	
		var node = links[i];
		if (guid == node.getAttribute("guid") ) {
			return node;
		}
	}
	
	return null;	
}

function getBreadcrumbs(url) {

	var id = getNodeIdFromUrl(url);
	//alert("id: url : " + id + ", " + url);

	if ( id == null || id == "" ) {
		/*
		// get the parent node, assuming the current node is navigated from the previous node
		var previousBreadCrumbId = getCookie("previousBreadCrumbId");
		
		//alert("previousBreadCrumbId=" + previousBreadCrumbId);
		var pNode = null;
		if ( previousBreadCrumbId != null ) {
			pNode = document.getElementById(previousBreadCrumbId);
			if ( pNode != null ) {
				// get the parent nod of the link
				pNode = pNode.parentNode;
				//alert(pNode.tagName);
			}
		}
		*/
		
		var node = findNode(url);		
		if ( node != null ) {
			id = node.getAttribute("id");
		}
		
		if ( id == null ) {
			return "";
		}
		
		// save the current id
		// setCookie("previousBreadCrumbId", id);
	}
	
	selectTopicById(id);

	return getBreadcrumbsByNodeId(id);
}


function getBreadcrumbsByNodeId(id) {

	var bcs = [];
	var count = 0;
	var pId = id;
	while ( pId != "" ) {
		var topic = document.getElementById(pId);
		if ( topic == null ) {
			break;
		}

		bcs[count++] = _constructBreadcrumb(topic);
		
		pId = topic.getAttribute("parentId");
	}
	
	return bcs.reverse();

}

function _constructBreadcrumb(node) {


	var str = node.innerHTML;
	var url = node.href;
	var guid = node.getAttribute("guid");
	
	var i = str.indexOf(">");
	if ( i > 0 ) {
		str = str.substring(i+1);
	}

	return {id: guid, url: url, title: str};

}



function getBaseUrl() {
	var url = parent.parent.location.href;
	var i = url.lastIndexOf("/");
	return url.substring(0, i+1);
}

function getCurrentSelection() {
	return oldActive;
}

/* give the LI node as parent, find the child <A node with the given guid*/
function getChildNodeWithGuid(/*LI*/pNode, guid)
{
	//alert("parent Link: " + pNode.tagName);

	if ( pNode == null ) {
		return null;
	}
	
	if ( pNode.tagName == "A" ) {
		pNode = pNode.parentNode;
	}
	
	var ul = getChildNode(pNode, "UL");
		
	if ( ul == null ) {
		return null;
	}
		
	var list = ul.childNodes;
	if (list == null) return null;
	
	for (var i=0; i<list.length; i++) {
		var tag = list.item(i);
		if (tag.tagName == "LI" ) {
			var a = getChildNode(tag, "A");
			if ( a != null && a.getAttribute("guid") == guid) {		
				return a;
			}
		}
	}
	
	return null;
}


/* give an array of guids, returns the breadcrumbs*/
function getBreadcrumbsByPath(guids) {

	if ( guids == null || guids.length == 0 ) {
		return [];
	}
	
	// start from the first guid, or from the current selection
	var start = 0;
	var pNode = null;
	var curNode = getCurrentSelection();
	if ( curNode != null ) {
		var curGuid = curNode.getAttribute("guid");
		for ( var i = 0; i < guids.length-1; i++ ) {
			var guid = guids[i];
			if ( guid == curGuid ) {
				start = i;
				pNode = curNode;
				break;
			}			
		}
	}
	

	if ( pNode == null ) {
		pNode = getNodeByGuid(guids[0]);
	}
	
	if ( pNode == null ) {
		return [];
	}
	
	var bcs = getBreadcrumbsByNodeId( pNode.getAttribute("id") );
		
	for ( var i = start+1; i < guids.length; i++ ) {
		var node = getChildNodeWithGuid(pNode, guid[i]);
		if ( node == null ) {
			break;
		}
		
		bcs.push(_constructBreadcrumb(node));		
		pNode = node;
	}

	// select the node
	//selectTopicById(pNode.getAttribute("id") );

	return bcs;	
}



