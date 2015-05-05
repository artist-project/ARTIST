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

/**
 * Loads the specified table of contents
 */
function loadTOC(tocHref)
{
	// navigate to this toc, if not already loaded
	if (window.location.href.indexOf("tocView.jsp?toc="+tocHref) != -1)
		return;
	window.location.replace("tocView.jsp?toc="+tocHref);
}

var tocTitle = "";
var tocId = "";

function onloadHandler()
{
	return;
	tocTitle = 'Workbench\u0020User\u0020Guide';
	var tocTopic = "about:blank";

	// set title on the content toolbar
	parent.parent.parent.setContentToolbarTitle(tocTitle);

	var topicSelected=false;
	// select specified topic, or else the book
	var topic = "about:blank";
	if (topic != "about:blank" && topic != tocTopic) {
		if (topic.indexOf(window.location.protocol) != 0 && topic.length > 2) {
			// remove the .. from topic
			topic = topic.substring(2);
			// remove advanced/tocView.jsp from path to obtain contextPath
			var contextPath = window.location.pathname;
			var slash = contextPath.lastIndexOf('/');
			if(slash > 0) {
				slash = contextPath.lastIndexOf('/', slash-1);
				if(slash >= 0) {
					contextPath = contextPath.substr(0, slash);
					topic = window.location.protocol + "//" +window.location.host + contextPath + topic;
				}
			}
		}
		topicSelected = selectTopic(topic);
	} else {
		topicSelected = selectTopicById(tocId);
	}

	if(!topicSelected){
		if(parent.parent.activityFiltering){
			askShowAll();
		}
	}


	focusHandler("e");
}

var askShowAllDialog;
var w = 470;
var h = 270;

function askShowAll(){

	var l = top.screenLeft + (top.document.body.clientWidth - w) / 2;
	var t = top.screenTop + (top.document.body.clientHeight - h) / 2;

	// move the dialog just a bit higher than the middle
	if (t-50 > 0) t = t-50;

	window.location="javascript://needModal";
	askShowAllDialog = window.open("askShowAll.jsp", "askShowAllDialog", "resizeable=no,height="+h+",width="+w+",left="+l+",top="+t );
	askShowAllDialog.focus();
}

function yesShowAll(){
	window.parent.parent.showAll();
}

function closeAskShowAllDialog(){
	try {
		if (askShowAllDialog){
			askShowAllDialog.close();
		}
	}
	catch(e) {}
}

function onunloadHandler() {
	closeAskShowAllDialog();

	document.body.innerHTML = "";

}
