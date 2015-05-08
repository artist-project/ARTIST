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

// javascript for the bookmarks frame ( the ory_toc_frame frame)
// this frame contains a child iframe (ory_toc)

// messages to be externized
// here defines all the I18N specific messages used in the javascripts
var bookmarkviews_js_MESSAGE1 = "This page could not be found in the navigation tree view.";

function displayTree(tab)
{
	url = tab.getAttribute('url');

	if ( selectedTab != null )
	{
		selectedTab.className = "tab"
	}
	tab.className = "selectedTab"
	selectedTab = tab;

	loadIframe("ory_toc", url);
}

function loadIframe(iframeName, url)
{
	if ( window.frames[iframeName] )
	{
		window.frames[iframeName].toc_loaded = false;
		window.frames[iframeName].location = url;
		return true;
	}
	else return false;
}

function showPage()
{

	parent.frames["ory_doc"].location.href = decodeURI(topicToDisplay);
}


/**
 * find a topic in the tree: the topic is set in topicToDisplay
 * returns true if success
 */
function findTocTopic()
{
	var toc_window = window.frames["ory_toc"];

	// check for false is not safe since the value might be undefined if the frame is not loaded yet
	//if (toc_window.toc_loaded == false )
	if ( toc_window.toc_loaded != true )
	{
		//if ( toc_window.toc_loaded == undefined )
		//{
		//	alert("got it!");
		//}
		window.setTimeout("findTocTopic()", 200);
	}
	else
	{
		if ( topicToDisplay == null )
		{
			topicToDisplay = toc_window.getFirstTopicUrl();
		}
	
		var topic = topicToDisplay;
		var found = toc_window.selectTopic(topic);
		if ( found == false )
		{
			var anchorIndex = topic.lastIndexOf("#");
			if (anchorIndex > 0)
			{
				topic = topic.substring(0, anchorIndex);
			}
			found = toc_window.selectTopic(topic);
		}						

		// find the topic in the current view, if not, look for the next view
		if ( found == false )
		{
			if ( loadingTabIndex < viewTabs.length )
			{
				displayTree(viewTabs[loadingTabIndex++]);
				findTocTopic();
			}
			else
			{
				// end finding and got nothing
				// display the default
				alert(bookmarkviews_js_MESSAGE1);
				loadingTabIndex = 0;
				showPage();
			}
		}
		else
		{
			loadingTabIndex = 0;
			// find successful, display the topic page
			showPage();
		}
	}
}

// find the topic in the current tab
function whereAmI()
{
	var url = parent.frames["ory_doc"].document.URL;
	
	if ( url != null )
	{
		topicToDisplay = url;
		findTocTopic();
	}
}


function togViews()
{
	// if currently visible, hide all except the currently selected
	isViewsVisible = (!isViewsVisible);
	
	for ( var i = 0;  i < viewTabs.length; i++)
	{
		var show = isViewsVisible || (viewTabs[i] == selectedTab);
		if ( show )
		{		
			//viewTabs[i].style.visibility = "visible";
			viewTabs[i].style.display = '';
		}
		else
		{
			//viewTabs[i].style.visibility = "hidden";
			viewTabs[i].style.display = 'none';
		}
	}
		
		

}


// display the default page and navigate to the node
// if no default page is set, display the first node of the first view
function init()
{
	loadingTabIndex = 0;
	var tabs = document.getElementsByTagName("span");
	var tabcount = 0;
	for (var i=0; i<tabs.length; i++)
	{
		if ( tabs[i].getAttribute('url') != null )
		{			
			var isDefaultView = tabs[i].getAttribute('isDefaultView');
			if ( isDefaultView == "true" )
			{
				loadingTabIndex = tabcount;
			}
			
			viewTabs[tabcount++] = tabs[i];
		}
	}

	topicToDisplay = parent.getCookie("rup_ory_doc");
	displayTree(viewTabs[loadingTabIndex]);
	findTocTopic();
}


var selectedTab = null;
var viewTabs = new Array();;
var loadingTabIndex = 0;
var topicToDisplay = null;
var isViewsVisible = true;
