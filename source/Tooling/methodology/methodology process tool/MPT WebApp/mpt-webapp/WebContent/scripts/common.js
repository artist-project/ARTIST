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

var globalLayer = "";

//for popup submenu with red arrows
var checked = false;

/* Browser sensing */
/* Set up boolian variables to record the browser type */
var isNS4 = 0;
var isIE4 = 0;
var isNew = 0;
var docObj, styleObj, currObj, layOn, layOff, dom;
/* Determines the browser name and browser version */
var brow = ((navigator.appName) + (parseInt(navigator.appVersion)));
/* reassign variable depending on the browser */



//capture event
NS4 = (document.captureEvents);
if (NS4) { document.captureEvents(Event.MOUSEDOWN); }
document.onmousedown = doAccessKeys;	



if (parseInt(navigator.appVersion >= 5)) {isNew = 1}
	else if (brow == "Netscape4") 
	{isNS4 = 1;}
		else if (brow == "Microsoft Internet Explorer4") 
		{isIE4 = 1;}
				
if (isNS4||isIE4||isNew) {
	docObj = (isNS4) ? 'document' : 'document.all';
	styleObj = (isNS4) ? '' : '.style';
	}



/////////////////////SNIFFER BEGINS HERE////////////////////////////////////
var c='.css" />';
var l='<link rel="stylesheet" type="text/css" href="./stylesheets/';

//Sniffer variables begins
//converting to lowercase
var snn = navigator;
var snpl = snn.platform.toLowerCase(); // not supported in NS3.0
var snua = ' ' + snn.userAgent.toLowerCase();
var snun = snn.appName.toLowerCase();

// platform
var snvpl_mac = snua.indexOf('mac') > 0;
var snvpl_unix = snua.indexOf("x11") > 0;
var snvpl_win = snua.indexOf('win') > 0;

// browser version
var snvv_ie = snua.indexOf('msie') > 0;
var snvv_nn = snua.indexOf('mozilla') > 0;
var snvversion = snn.appVersion;


// 'compatible' versions of "mozilla" aren't navigator
if(snua.indexOf('compatible') > 0) {
	snnvv_nn = false;
}
//Ends sniffer variables 
	
		
/* This is a basic sniffer */
  
if(snvpl_win)//windows

{  
  if(snvv_ie)    
  {
    if (snua.indexOf('ie 5')!=-1)document.write(l+'common_base'+c);
    else if(snua.indexOf('ie 5.5')!=-1)document.write(l+'common_base'+c);
    else if(snua.indexOf('ie 6')!=-1)document.write(l+'common_adv'+c);
    else
	  {
	    document.write(l+'common_adv'+c);
	  }
  }
  else if (snvv_nn) 
  {
  
  if (snua.indexOf("/4")!=-1)document.write(l+'common_base'+c);
  else if(snua.indexOf("/5")!=-1)document.write(l+'common_adv'+c);
  else if(snua.indexOf("/6")!=-1)document.write(l+'common_adv'+c);
  else
	  {
	   document.write(l+'common_adv'+c);
	  }
  }
  else
  {
   document.write(l+'common_adv'+c);
  }
}
else if(snvpl_unix)//unix
  {  
  if(snvv_ie)    
  {
    if (snua.indexOf('ie 5')!=-1)document.write(l+'common_baseUNX'+c);
    else if(snua.indexOf('ie 5.5')!=-1)document.write(l+'common_baseUNX'+c);
    else if(snua.indexOf('ie 6')!=-1)document.write(l+'common_advUNX'+c);
    else
	  {
	  document.write(l+'common_adv'+c);
	  }
  }

  else if (snvv_nn) 
  {
  if (snua.indexOf("/4")!=-1)document.write(l+'common_baseUNX'+c);
  else if(snua.indexOf("/5")!=-1)document.write(l+'common_advUNX'+c);
  else if(snua.indexOf("/6")!=-1)document.write(l+'common_advUNX'+c);
  else
	  {
	  document.write(l+'common_advUNX'+c);
	  }
  } 
  else
  {
  document.write(l+'common_advUNX'+c);
  }
}

else if(snvpl_mac)//mac
  {  
  if(snvv_ie)    
  {
    if (snua.indexOf('ie 5')!=-1)document.write(l+'common_base'+c);
    else if(snua.indexOf('ie 5.5')!=-1)document.write(l+'common_base'+c);
    else if(snua.indexOf('ie 6')!=-1)document.write(l+'common_adv'+c);
    else
	  {
	   document.write(l+'common_adv'+c);
	  }
  }

  else if (snvv_nn) 
  {
  if (snua.indexOf("/4")!=-1)document.write(l+'common_base'+c);
  else if(snua.indexOf("/6")!=-1)document.write(l+'common_advMac'+c);
  else
	  {
	   document.write(l+'common_adv'+c);
	  }
  } 
  else
  {
 document.write(l+'common_adv'+c);
  }
}

else//others 
{
  document.write(l+'common_adv'+c);

}

//SNIFFER ENDS HERE


function ns_reload(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.NSW=innerWidth; document.NSH=innerHeight; onresize=ns_reload; }}
  else if (innerWidth!=document.NSW || innerHeight!=document.NSH) location.reload();
}
ns_reload(true);





///////////////////////SNIFFER ENDS HERE//////////////////////////////


//loop to change background color for ie
function bcolor(bcol,d_name)
{
if (document.all)
{
 var thestyle= eval ('document.all.'+d_name+'.style');
 thestyle.backgroundColor=bcol;
 }
}

// new page to load in frame
function changeframe(url) {
top.checkinbottom.location.href= url 
}

// checked all checkboxes
function checkAll(field) {
     if (!checked) { // if checkboxes are not checked then check them
          for (i = 0; i < field.length; i++) { // loop through the array of checkboxes & check them
               field[i].checked = true;
          }
          checked = true;
     }
} 

function checkedIn(id) {
  if (document.all) {
    return document.all[id].style;
  } else if(document.layers) {
    return document.layers[id];
  }
}

// For IE Only: to enable linking before pop-ups dissappear when clicked.
function disablecapture() {
document.onmousedown = null;
}


// hide layers when clicked
function doAccessKeys(ev) {
	if(globalLayer != "") {
		if(document.layers) { document.layers[globalLayer].visibility = "hidden"; }	
		else { document.all[globalLayer].style.visibility = "hidden"; }
	}
}



//allows two bottom frames to link to new pages at the same time
function framedirect() {
page = document.formTopframe.newLocation.options[document.formTopframe.newLocation.selectedIndex].value;
tempIndex = page.indexOf('?');
firstURL = page.substring(0,tempIndex);
secondURL = page.substring(tempIndex + 1,page.length);

top.treeFrame.location.href = firstURL;
top.viewFrame.location.href = secondURL;
}


function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);


function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}


function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}


function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}


function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}



function MM_showHideLayers() { //v3.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) if ((obj=MM_findObj(args[i]))!=null) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v='hide')?'hidden':v; }
    obj.visibility=v; }
}


function mschangeframe(url) {
top.contentFrame.location.href= url 
}

//changes middle nav and content frame, currently used in multisite
function MSframeChange() {
page = document.formBannerFrame.newLocation.options[document.formBannerFrame.newLocation.selectedIndex].value;
tempIndex = page.indexOf('?');
firstURL = page.substring(0,tempIndex);
secondURL = page.substring(tempIndex + 1,page.length);

top.middleNav.location.href = firstURL;
top.contentFrame.location.href = secondURL;
}



//opens up a dynamic window
function open_help(helpfile) {
    var winleft, wintop;
    var helpleft, helptop;
    var helpwidth, helpheight;
    if (document.layers) {
        winleft = top.screenX;
        wintop = top.screenY;
    }
    else {
        winleft = top.screenLeft;
        wintop = top.screenTop;
    }
    helpwidth = Math.min(screen.availWidth);
    helpheight = Math.min(screen.availHeight);
 	helpwidth=helpwidth *.6;
	helpheight=helpheight *.85;	
	helptop = 0;
    if (winleft > 20)
        helpleft = 0;
    else
        helpleft = screen.width - helpwidth - 10;
    top.open(helpfile, 'ccweb_help',
             'left='+helpleft+',top='+helptop+',width='+helpwidth+',height='+helpheight+',resizable=1,scrollbars=1');
}



// regular popup up layer according to event
function popLeftMenu(evt,currElem,upChk){
	// checks to see if this is a DHTML browser 
	// and that currElem is not set to 0 in which case 
	// this was triggered by the HREF and cannot be treated as an event
	//upChk should be set to 1 for NS 4 form fix if you want the popdown to pop up instead, so that it doesn't appear over forms.	
	globalLayer = currElem;
	
	if ((isNS4 && currElem != 0) || (isIE4 && currElem != 0)){
		dom = eval(docObj +  '.' + currElem + styleObj);
		state = dom.visibility;
		if (state == "visible" || state == "show")
			{dom.visibility = "hidden";}
			else 
			// finds the position of the mouse 
			// and then offsets the coordinates slightly
				{
		if (isNS4){
				 if ((upChk == 1) && (window.innerWidth < 670)) {
			topVal = eval(evt.pageY - 50);
			leftVal = eval(evt.pageX - 9);
			}				  
				else {
				topVal = eval(evt.pageY - 0);
				leftVal = eval(evt.pageX - 0);
				}
		}		
			else if (isIE4) {
				{
				topVal = eval(event.y+document.body.scrollTop - 0);
				leftVal = eval(event.x+document.body.scrollLeft - 0);
				//bottomVal = eval(event.y+document.body.scrollBottom + 2);
				}
			    }
			// keeps the element from going off screen to the left
			if(leftVal < 2) {leftVal = 2;}
			if(topVal < 2) {topVal = -5;}				
			dom.top = topVal;
			dom.left = leftVal;
			dom.visibility = "visible";					
				}
	} 

}



// special pupup layer to keep it from going off the page

function popLeftMenuSpecial(evt,currElem){
	// checks to see if this is a DHTML browser 
	// and that currElem is not set to 0 in which case 
	// this was triggered by the HREF and cannot be treated as an event
	//upChk should be set to 1 for NS 4 form fix if you want the popdown to pop up instead, so that it doesn't appear over forms.	
	globalLayer = currElem;
	
	if ((isNS4 && currElem != 0) || (isIE4 && currElem != 0)){
		dom = eval(docObj +  '.' + currElem + styleObj);
		state = dom.visibility;
		if (state == "visible" || state == "show")
			{dom.visibility = "hidden";}
			else 
			// finds the position of the mouse 
			// and then offsets the coordinates slightly
				{
		if (isNS4){
			 if (window.innerWidth < 600) {
			topVal = eval(evt.pageY - 0);
			leftVal = eval(evt.pageX - 110);
			}		
				
				else {
				topVal = eval(evt.pageY - 0);
				leftVal = eval(evt.pageX - 0);
				}
		}		
			else if (isIE4) {
				if (document.body.clientWidth < 600) {
				  topVal = eval(event.y+document.body.scrollTop - 0);
				leftVal = eval(event.x+document.body.scrollLeft - 110);
				}
				
				else{
				topVal = eval(event.y+document.body.scrollTop - 0);
				leftVal = eval(event.x+document.body.scrollLeft - 0);
				//bottomVal = eval(event.y+document.body.scrollBottom + 2);
				}
			    }
			// keeps the element from going off screen to the left
			if(leftVal < 2) {leftVal = 2;}
			if(topVal < 2) {topVal = -5;}				
			dom.top = topVal;
			dom.left = leftVal;
			dom.visibility = "visible";					
				}
	} 
		
}




function searchOptions(newLoc) { //Opens new page in the right frame depending on the "Advanced Search for:" selection
			newPage = newLoc.options[newLoc.selectedIndex].value
	
			if (newPage != "") {
				parent.viewFrame.location.href = newPage
			}
		}


//uncheck checkboxes
function uncheckAll(field) {
     if (checked) { // if checkboxes are checked then check them
          for (i = 0; i < field.length; i++) { // loop through the array of checkboxes & uncheck them
               field[i].checked = false;
          }
          checked = false;
     }
} 

// show hide layers for CQ deflect_login_err
ns4 = (document.layers)? true:false
ie4 = (document.all)? true:false

function show(id) {
if (ns4) document.layers[id].visibility = "show"
if (ie4) document.all[id].style.visibility = "visible"
}

function hide(id) {
if (ns4) document.layers[id].visibility = "hide"
if (ie4) document.all[id].style.visibility = "hidden"
}

// pop up window according to mouse event
function showWindow(e,url) {
    var x=y=0;
	
	if (e != '') {
        x = e.screenX;
        y = e.screenY;
    }

    myWindow=window.open(url,'windowName','width=200,height=150,screenX=' + x + ',screenY=' + y + ',left=' + x + ',top=' + y);
}





