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

// messages to be externized
// here defines all the I18N specific messages used in the javascripts

var topnav_js_MESSAGE1 = "The TreeBrowse is not yet loaded!\nPlease wait!";
var topnav_js_MESSAGE2 = "There is no '{0}' page for this page.\nTry one of the other navigation buttons.";
var topnav_js_MESSAGE3 = "There is no {0} page!";
var topnav_js_MESSAGE_prev = "previous";
var topnav_js_MESSAGE_next = "next";
var topnav_js_MESSAGE_up = "up";
var topnav_js_MESSAGE4 = "The current file is not in the tree browser.";
var topnav_js_MESSAGE5 = "The published site is already displayed using frames";

function formatString(message, replace0)
{
   	return message.replace(/\{0\}/, replace0);
} 

// this script is for the topnav.html
// this is NOT for general use
MSFPhover =
(((navigator.appName == "Netscape") &&
  (parseInt(navigator.appVersion) >= 3 )) ||
  ((navigator.appName == "Microsoft Internet Explorer") &&
  (parseInt(navigator.appVersion) >= 4 )));

  function MSFPpreload(img)
  {
     var a=new Image();
     a.src=img;
     return a;
  }
  
var tour = 0;

function openFirstTour ()
// open the guided tour /haakan 990324
{
if(!tour || tour==null || tour.closed)
    {
      tour = open("./tour/tour.htm","tour_page","toolbar=no,directories=no,menubar=no,scrollbars=yes,width=350,height=700,resizable=yes");
      tour.focus();
    }
    else
    {
      tour.focus();
    }
}

function openTour ()
// open the guided tour /haakan 990324
{
if(!tour || tour==null || tour.closed)
    {
      tour = open("./tour/tour.htm","tour_page","toolbar=no,directories=no,menubar=no,scrollbars=yes,width=350,height=700,resizable=yes");
      tour.focus();
    }
    else
    {
      tour.focus();
    }
}

//Addition by Chinh Vo 03/28/00
 function displayGettingStarted()
 {
 	var pagePattern = /ovu_proc/;
 	var mainPage = window.parent.ory_doc.location;

 	if ( pagePattern.test( mainPage ) ) {
    	if (getCookie("RUP") != "checked") { openFirstTour(); }
	}
	else {
		setTimeout( "displayGettingStarted()", 1000 );
	}
}

function getCookie (name)
{
  var dcookie = document.cookie;
  var cname = name + "=";
  var clen = dcookie.length;
  var cbegin = 0;
  while (cbegin < clen)
  {
    var vbegin = cbegin + cname.length;
    if (dcookie.substring(cbegin, vbegin) == cname)
    {
      var vend = dcookie.indexOf (";", vbegin);
      if (vend == -1)
      {
        vend = clen;
      }
      return unescape(dcookie.substring(vbegin, vend));
    }
    cbegin = dcookie.indexOf(" ", cbegin) + 1;
    if (cbegin == 0)
    {
      break;
    }
  }
  return null;
 }


  var index=null;
  var tour=null;
  var search=null;
  var glossary=null;
  var feedback=null;
  var treeLoaded=false;
  function checkTreeLoaded()
  {
    if(treeLoaded)
    {
      return treeLoaded;
    }

    /*
     if(parent.ory_toc.document.RupPresenterApplet != null
        && parent.ory_toc.document.RupPresenterApplet.isReady())
     {
       treeLoaded = true;
     }
     */
     if(parent.ory_toc.document.RupPresenterApplet != null)
     {
      	var method = typeof parent.ory_toc.document.RupPresenterApplet.isReady;
	 if (method != "undefined") {
		if (parent.ory_toc.document.RupPresenterApplet.isReady())
		{
       			treeLoaded = true;
		}

	  }

     }

     return treeLoaded;
   }


    function showAlertNotLoaded()
    {
      alert(topnav_js_MESSAGE1);
    }

function showStatusNotLoaded()
  {
    //return "The TreeBrowse is not yet loaded!\nPlease wait!";
    return topnav_js_MESSAGE1;
  }

  function showAlertNoPage(text)
  {
     var parentLabel = parent.ory_toc.document.applets.Tree.getParentLabel(parent.ory_doc.document.URL);
     if(parentLabel!="" && parentLabel!=null)
     {
          //alert("There is no '" + text + "' page for this page.\nTry one of the other navigation buttons.");
          alert(formatString(topnav_js_MESSAGE2, text));
     }
     else
     {
         //alert("There is no '" + text + "' page for this page.\nTry one of the other navigation buttons");
         alert(formatString(topnav_js_MESSAGE2, text));
     }
  }

  function showStatusNoPage(text)
  {

     var parentLabel = parent.ory_toc.document.applets.Tree.getParentLabel(parent.ory_doc.document.URL);
     var msg;
     if(parentLabel!="" && parentLabel!=null)
     {
        //msg = "There is no " + text + " page!";
        msg = formatString(topnav_js_MESSAGE3, text);
     }
     else
     {
        //msg = "There is no " + text + " page!";
        msg = formatString(topnav_js_MESSAGE3, text);
     }

     return msg;
  }

  function showParentLabel()
  {
    if(checkTreeLoaded())
    {
      var label = parent.ory_toc.document.applets.Tree.getParentLabel(parent.ory_doc.document.URL);
      var parenturl = parent.ory_toc.document.applets.Tree.getParentUrl(parent.ory_doc.document.URL);

     if(label!="" && label!=null && parenturl!="" && parenturl!=null)
     {
       self.status = label;
     }
     else
     {
       self.status = showStatusNoPage("up");
     }
    }
    else
    {
        self.status = showStatusNotLoaded();
    }
  }

  function showHomeLabel()
  {
    self.status = "Home";
  }

  function showPreviousLabel()
  {
    if(checkTreeLoaded())
    {
      var label = parent.ory_toc.document.applets.Tree.getPreviousLabel(parent.ory_doc.document.URL);
      var prevurl = parent.ory_toc.document.applets.Tree.getPreviousUrl(parent.ory_doc.document.URL);

     if(label!="" && label!=null && prevurl!="" && prevurl!=null)
     {
       self.status = label;
     }
     else
     {
        self.status = showStatusNoPage("previous");
     }
    }
    else
    {
        self.status = showStatusNotLoaded();
    }
  }

  function showNextLabel()
  {
    if(checkTreeLoaded())
    {
      var label = parent.ory_toc.document.applets.Tree.getNextLabel(parent.ory_doc.document.URL);
      var nexturl = parent.ory_toc.document.applets.Tree.getNextUrl(parent.ory_doc.document.URL);
      if(label!="" && label!=null && nexturl!="" && nexturl!=null)
      {
        self.status = label;
      }
      else
      {
        self.status =  showStatusNoPage("next");
      }
    }
    else
    {
       self.status =  showStatusNotLoaded();
    }
  }

  function loadPrevious()
  {
    if(checkTreeLoaded())
    {
     var newLabel = parent.ory_toc.document.applets.Tree.getPreviousLabel(parent.ory_doc.document.URL);
     var newLocation = parent.ory_toc.document.applets.Tree.getPreviousUrl(parent.ory_doc.document.URL);

     if(newLocation!="" && newLocation!=null)
     {

	if ((newLocation.indexOf("applet")==-1) && (newLocation.indexOf("www")==-1))
	{
		parent.ory_doc.location = newLocation;
	}
	else if (newLocation.indexOf("applet")!=-1)
	{
	 	parent.ory_toc.document.applets.Tree.getAppletPage(newLocation, newLabel);
	}
	else if (newLocation.indexOf("www")!=-1)
	{
		newLocation = parent.ory_toc.document.applets.Tree.getHttpPage(newLocation, newLabel, "Previous");
	}
	      	parent.ory_toc.document.applets.Tree.selectNode(newLocation);
     }
     else
     {
       showAlertNoPage(topnav_js_MESSAGE_prev);
     }
     }
    else
    {
        showAlertNotLoaded();
    }
     return;
  }

  function loadNext()
  {
    if(checkTreeLoaded())
    {
     var newLabel = parent.ory_toc.document.applets.Tree.getNextLabel(parent.ory_doc.document.URL);
     var newLocation = parent.ory_toc.document.applets.Tree.getNextUrl(parent.ory_doc.document.URL);
     if(newLocation!="" && newLocation!=null)
     {

	if ((newLocation.indexOf("applet")==-1) && (newLocation.indexOf("www")==-1))
	{
		parent.ory_doc.location = newLocation;
	}
	else if (newLocation.indexOf("applet")!=-1)
	{
	 	parent.ory_toc.document.applets.Tree.getAppletPage(newLocation, newLabel);
	}
	else if (newLocation.indexOf("www")!=-1)
	{
		newLocation = parent.ory_toc.document.applets.Tree.getHttpPage(newLocation, newLabel, "Next");
	}
       parent.ory_toc.document.applets.Tree.selectNode(newLocation);

     }
     else
     {
        showAlertNoPage(topnav_js_MESSAGE_next);
     }
    }
    else
    {
      showAlertNotLoaded();
    }

     return;
  }

  function loadParent()
  {
    if(checkTreeLoaded())
    {
     var newLocation = parent.ory_toc.document.applets.Tree.getParentUrl(parent.ory_doc.document.URL);
     if(newLocation!="" && newLocation!=null)
     {
       parent.ory_doc.location = newLocation;
       parent.ory_toc.document.applets.Tree.selectNode(newLocation);
     }
     else
     {
       showAlertNoPage(topnav_js_MESSAGE_up);
     }
    }
    else
    {
       showAlertNotLoaded();
    }

     return;
  }

function whereAmI()
  {
    if(checkTreeLoaded())
    {
	var status = parent.ory_toc.document.applets.Tree.selectNode(parent.ory_doc.document.URL);
    	if( status == false )
	{
		alert( topnav_js_MESSAGE4 );
	}
    }
    else
    {
      showAlertNotLoaded();
    }
     return;
  }

  function upArrow()
  {
    if(checkTreeLoaded())
    {
      var newLocation = parent.ory_toc.document.applets.Tree.upArrow();
      if(newLocation!="" && newLocation!=null)
      {
       parent.ory_doc.location = newLocation;
      }
    }
    else
    {
      showAlertNotLoaded();
    }
     return;
  }

  function downArrow()
  {
    if(checkTreeLoaded())
    {
      var newLocation = parent.ory_toc.document.applets.Tree.downArrow();
      if(newLocation!="" && newLocation!=null)
      {
       parent.ory_doc.location = newLocation;
      }

    }
    else
    {
      showAlertNotLoaded();
    }
     return;
  }

    function leftArrow()
  {
    if(checkTreeLoaded())
    {
     parent.ory_toc.document.applets.Tree.leftArrow();
    }
    else
    {
      showAlertNotLoaded();
    }
     return;
  }

    function rightArrow()
  {
    if(checkTreeLoaded())
    {
     parent.ory_toc.document.applets.Tree.rightArrow();
    }
    else
    {
      showAlertNotLoaded();
    }
     return;
  }


function loadTop()
{
  if(parent.frames.length!=0 && parent.frames[1].name=="ory_toc")
  {
     alert(topnav_js_MESSAGE5);
  }
  else
  {
    var expires = new Date();
    expires.setTime (expires.getTime() + (1000 * 20));
    document.cookie = "rup_ory_doc=" + escape (document.URL) +
    "; expires=" + expires.toUTCString() +  "; path=/";

    var new_ory_doc_loc = null;

    for(i=document.links.length-1;i>=0;i--)
    {
       if(document.links[i].href.indexOf("index.htm")!=-1)
       {
         new_ory_doc_loc = document.links[i].href;
         break;
       }
    }

    if(new_ory_doc_loc!=null)
    {
	if( self.name == "ory_doc" )
	{
		window.close();
		window.open( new_ory_doc_loc );
	}
	else
	{
	       	top.location = new_ory_doc_loc;
	}
    }
   }
}


function openOry (page, target)
{
    if(!index || index.closed)
    {
      index = open(page,target,"toolbar=no,directories=no,menubar=no,scrollbars=yes,width=395,height=500,resizable=yes");
    }
    else
    {
      index.focus();
    }
}

function openSearch()
{
    if(!search || search.closed)
    {
      search = open("./applet/search.htm","search_page","toolbar=no,directories=no,menubar=no,scrollbars=no,width=630,height=450,resizable=yes");
    }
    else
    {
      search.focus();
    }
}

function openProcessSearch()
{
    if(!search || search.closed)
    {
      search = open("./search/search.html","search_page","toolbar=no,directories=no,menubar=no,scrollbars=yes,width=630,height=450,resizable=yes");
    }
    else
    {
      search.focus();
    }
   
}

function getBaseUrl() {

    // get the url base for the search url
	var url = location.href;
	var i = url.lastIndexOf("/");
	url = url.substring(0, i);
	
	return url;
}

function openIndex()
{
   openOry("./index/index.htm","index_win");
}

function openGlossary()
{
 if(!glossary || glossary.closed)
    {
      glossary = open("./process/glossary/index.htm","glossary_win","toolbar=no,directories=no,menubar=no,scrollbars=yes,width=385,height=500,resizable=yes");
    }
    else
    {
      glossary.focus();
    }
}

function printPage()
{
 parent.ory_doc.focus();
 parent.ory_doc.print();
}


function sendFeedback(url)
{
	if ( url == null || url == '' )
	{
		return;
	}
	
	if ( url.indexOf("mailto:") >= 0 )
	{
		sendmail(url);
	}
	else
	{
		
 	    if(!feedback || feedback.closed)
	    {
	      feedback = open(url,"feedback_win","toolbar=no,directories=no,menubar=no,scrollbars=yes,width=600,height=500,resizable=yes");
	    }
	    else
	    {
	      feedback.focus();
	    }
    	}
    	
}


function sendmail(url)
{
	if ( url.indexOf("?subject") == -1 )
	{
		var link=parent.ory_doc.location;
		url = url + '?subject=Feedback: - '+link;
	}
	location.replace(url);
}

//calculates relative path
//path must be all relative from website base or contain full urls
function calculateRelativePath(sourcePath, targetPath)
{
	if (targetPath.indexOf("http:/") != -1)
	{
		return targetPath;
	}

	//replace all '\' with '/'
	sourcePath = sourcePath.replace(/\\/g,"$1/$2");
	targetPath = targetPath.replace(/\\/g,"/");

	//alert("Replace(Source)=>" + sourcePath);
	//alert("Replace(target)=>" + targetPath);


	sourceArray = sourcePath.split("/");
	targetArray = targetPath.split("/");

	var theRelPath = "";

	//loop until we find a difference
	var idx = 0;
	for(idx = 0; idx < sourceArray.length; idx++)
	{
		if (idx > targetPath.length)
		{
			break;
		}

		if (sourceArray[idx] != targetArray[idx])
		{
			break;
		}
	}

	//append the appropriate number of ./
	var maxIdx = sourceArray.length - 1;
	for (var i = idx; i < maxIdx; i++)
	{
		theRelPath = theRelPath + "./";

		//alert("RelPath=>" + theRelPath);
	}

	//append any remaining target path
	while(idx < targetArray.length)
	{
		theRelPath = theRelPath + targetArray[idx++] + "/";
		//alert("RelPath(final)=>" + theRelPath);
	}

	//remove the last path separator
	if (theRelPath.length > 0)
	{
		//alert("RelPath(Trim1)=>" + theRelPath);
		theRelPath = theRelPath.substring(0, (theRelPath.length - 1));
		//alert("RelPath(Trim1)=>" + theRelPath);
	}

	//alert("Return Relative Path => " + theRelPath);

	return theRelPath;
}

function getTreePath()
{
	return buildTreePathLocation();
}

//This method will remove the website base from the url
function calculatCurrentPage(currURL) {

	var theCurrentLocation = document.location.href;
	//replace all '\' with '/'
	theCurrentLocation = theCurrentLocation.replace(/\\/g,"$1/$2");
	currURL = currURL.replace(/\\/g,"$1/$2");

	var sourceArray = theCurrentLocation.split("/");
	var currArray = currURL.split("/");

	var numToRemove = sourceArray.length - 2;
	var idx = 0;
	var theReturnPath = "";
	for (idx = numToRemove; idx < currArray.length; idx++) {
		if (theReturnPath != "") {
			theReturnPath = theReturnPath + "/";
		}
		theReturnPath = theReturnPath + currArray[idx];
	}

	//alert("ArrayTest=>" + currURL + "," + theReturnPath);
	return theReturnPath;
}

//builds tree path
function buildTreePathLocation()
{
	var theDelimiter = "##*";
	var thisPage = "applet/rup_topnav.htm";
	var theLoc = "";



	if(checkTreeLoaded())
	{
		var theCurrentLocation = parent.ory_doc.document.location.href;
		thisPage = calculatCurrentPage(theCurrentLocation);

		//alert("PathName:" + thisPage);

		//alert("Trying to find the path for =>" + theCurrentLocation);

		var thePath = parent.ory_toc.document.RupPresenterApplet.getTreePathArray(theCurrentLocation);

		//alert("The Tree Path: " + thePath);

		thePathString = thePath + "";
    		arrayFromString = thePathString.split(theDelimiter);

		//build the path from the array
		//param 1 = path to icon, param 2 - label, param 3 - path to file
		var counter = 0;
		var theLabel;
		var theRelPath;
		if (arrayFromString.length > 2)
		{
		   theLoc = "";
		   for(var i = 0; i < (arrayFromString.length - 1) ; i++)
		   {
			//it's the icon path
			if (counter < 2)
			{
				if (counter > 0)
				{
					theLoc = theLoc + " &gt; ";
				}

				//alert("Calculating path from(1) " + thisPage + " => " + arrayFromString[i]);

				if (arrayFromString[i].indexOf("\\") == -1 && arrayFromString[i].indexOf("/") == -1)
				{
					if (arrayFromString[i] != "null")
					{
						theRelPath = "applet/images/" + arrayFromString[i];
						theRelPath = calculateRelativePath(thisPage, theRelPath);
					}
					//alert("Modifying Path => " + theRelPath);
				}
				else {
					theRelPath = calculateRelativePath(thisPage, arrayFromString[i]);
				}

				if (theRelPath != "null")
				{
					theLoc = theLoc +
						 "<img border=0 src=\"" +
						 theRelPath  +
						 "\">";
				}

				//alert("the curr path=>" + theLoc);
				counter = 2;
			}
			// it's the label
			else if (counter == 2)
			{
				theLabel = arrayFromString[i];
				counter = 3;
			}
			else if (counter == 3)
			{
				//alert("Calculating path from(3) " + thisPage + " => " + arrayFromString[i]);
				if (arrayFromString[i] != "null")
				{
					theRelPath = calculateRelativePath(thisPage, arrayFromString[i]);
					if (theRelPath != "") {
						theLoc = theLoc +
					 		"<a class=\"hottext\" target=\"ory_doc\" href=\"" +
							 theRelPath +
					 		"\">" +
					 		theLabel +
					 		"<\/a>\n";
					 }
					 else {
					 	theLoc = theLoc +
					 		"<a class=\"hottext\">"  +
					 		theLabel +
					 		"<\/a>\n";
					 }
				}
				else
				{
					theLoc = theLoc +
					 	"<a class=\"hottext\">"  +
					 	theLabel +
					 	"<\/a>\n";
				}
				//alert("the curr path=>" + theLoc);
				counter = 1;
				theRelPath = "null";
				theLabel = "null";
			}
		   }

		//alert("Finished Building => " + theLoc);
		}

	}

	//theLoc = "Current Location&nbsp;&#045;&nbsp;" + theLoc;

	//alert("the Final String=>" + theLoc);

	//document.write(theLoc);
	return theLoc;

}
