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

// This temporary function helps to resolve Javascript errors in the migrated RUP
// content pages. It will be removed once the corresponding .js files are being
// migrated along with the HTML content pages.
function ReferenceHelpTopic (topicName, book , fileName) {
   //document.write("<i>"+ topicName + "<\/i>");
};


var contentPage = {

	backPath: null,
	imgPath: null,
	defaultQueryStr: null,
	queryStr: null,
	isProcessPage: false,
	nodeInfo: null,
	
	// define resource file
	res : new ContentPageResource(),
	
	// define activity layout, need to create this as a place holder 
	// so that the dynamically generated data can be loaded
	processPage: ( typeof ProcessElementPage == "undefined" ) ? null : new ProcessElementPage(),
	
	// define section
	section: new ContentPageSection(),
	
	// define sub-section
	subSection: null,
	
	toolbar: null,
	
	// auto wrap elements
	autoWrapElements: [],
	
	// call this method before the page is loaded
	// this is used to initialize some parameters before the page content is processed
	// for example, if the content needs to use some parameters inside the content
	// this approach is not recommented but keep here for backward compatibility
	preload: function(imgPath, backPath, nodeInfo, defaultQueryStr, hasSubSection, isProcessPage, hasTree) {

		this.isProcessPage = isProcessPage || hasTree;
		this.imgPath = imgPath;
		this.backPath = backPath;
		this.nodeInfo = nodeInfo;
		this.defaultQueryStr = defaultQueryStr;
		this.queryStr = location.search;
		
		// convert the image path to absolute path
		// otherwise the page will resolve to wrong absolute path if the browser cashed the pages
		var base = window.location.href;
		var i = base.lastIndexOf("/");
		this.imgPath = base.substring(0, i+1) + this.imgPath;
		//alert(this.imgPath);


		if ( this.queryStr == null || this.queryStr == "" )
		{
			this.queryStr = this.defaultQueryStr;
		}
				
		this.section.init(this.imgPath);
				
		if ( hasSubSection ) {
			this.subSection = new ContentPageSubSection();
		}
		
		if ( this.processPage && (isProcessPage || hasTree) ) {
			this.processPage.init(hasTree);
		}
				
	},
	
	
	// call this method when page is loaded
	onload: function() {
		this.section.createSectionLinks('div', 'sectionHeading', this.imgPath);
		if ( this.subSection != null ) {
			this.subSection.createStepLinks('div', 'stepHeading');
		}
			
		var self = this;
		var app = this.getApp();
		
		if ( app != null ) {
			this.toolbar = new ContentPageToolbar();
			this.toolbar.init(this.imgPath);
		}		
		
		// register auto wrap element
		if ( this.autoWrapElements.length > 0 ) {
			window.onresize = function(e) {
				contentPage.resizeBlockText();
			}		
			this.resizeBlockText();
		}
		
		//alert("content on load: " + location.href);
		
		if ( this.processPage ) {
			this.processPage.onload();
		} 
		
		if ( app != null ) {
			if ( !app.isInitialized() ) {
				var callback = function() {
				//alert("content on load: in callback");
					app.onContentLoaded(location.href);
					self.buildBreadcrumns();
				};
				app.addPostInitCallback(callback);
				
			} else {
				//alert("content on load: calling breadBreadcrumbs");	
				app.onContentLoaded(location.href);
				setTimeout(function () { self.buildBreadcrumns(); }, 10);
			}
		} else {
			this.buildBreadcrumns();
		}
		
		//alert("content page loaded");
		
		// user can add customization code here
		// this method will be called when the page is loaded
		// this is equivalent to inserting javascript immediately before the </html> tag
		
	},
	
	buildBreadcrumns : function() {
		if ( this.processPage ) {
			this.processPage.buildProcessElementBreadCrumb(location.href);
		} else {
			this._buildBreadcrumns(location.href);
		} 
	},
	
	resizeBlockText: function() {
		var newWidth = window.document.body.offsetWidth - 20;
		for ( var i = 0; i < this.autoWrapElements.length; i++ ) {
			var elem = this.autoWrapElements[i];
			elem.style.width=newWidth + "px"; // firefox does not work without specifying the unit
		}
	},
	
	
	addAutoWrapElement: function(elem) {
		this.autoWrapElements.push(elem);
	},
	
	// utility methods
	getUrlParameters: function(queryStr)
	{
		var arr = new Array();	
		var pairs = queryStr.split("&");
	   	for (var i = 0; i < pairs.length; i++) {
	     		var pos = pairs[i].indexOf('=');
	     		if (pos == -1) continue;
	     		var argname = pairs[i].substring(0,pos);
	     		var value = pairs[i].substring(pos+1);    	
	     		arr[argname] = value;
		}
		
		return arr;
	},

	getApp : function() {
		if( typeof theApp != "undefined") {
			return theApp;
		} else if ( window.parent && typeof window.parent.theApp != "undefined") {
			return window.parent.theApp;
		}
	
		return null;
	},
	
	getViewFrame: function() {
	
		var app = this.getApp();
		if ( app != null ) {
		
			// make sure the app is initialized
			if ( app.isInitialized() ) {
				return app.nav;
			} else { 
				return null;
			}
		}
				
		var viewFrame = null;
		for ( var i = 0; i < window.parent.frames.length; i++ ) {
			if ( window.parent.frames[i].name == 'ory_toc_frame' ) {
				var tocFrame = window.parent.frames[i];
				//alert(tocFrame);
				if (tocFrame.frames.length > 0 ) {
					for ( var x = 0; x < tocFrame.frames.length; x++ ) {
						if (tocFrame.frames[x].name == 'ory_toc' ) {
							viewFrame = tocFrame.frames[x];
							break;
						}
					}
				}
			}
		}
	
		return viewFrame;
	},

	_buildBreadcrumns: function(url) {
		var viewFrame = this.getViewFrame();
		if ( viewFrame == null ) {
			return;
		}

		var div = document.getElementById("breadcrumbs");
		if (div != null && viewFrame != null && viewFrame.getBreadcrumbs ) {
			if ( this.getApp() == null ) {
				// don't break old code
				var bcs = viewFrame.getBreadcrumbs(url);
				if ( bcs != null && bcs.length > 0 ) {
					this.showBreadcrumns(div, bcs);
				}
			} else {
				var self = this;
				var callback = function(bcs) {
					if ( bcs != null && bcs.length > 0 ) {
						self.showBreadcrumns(div, bcs);
					}
				};
					
				if (contentPage.nodeInfo != null && contentPage.nodeInfo.length > 0 ) {
					viewFrame.getBreadcrumbsByPath(contentPage.nodeInfo, null, callback);
				} else {
					// do nothing
					//viewFrame.getBreadcrumbs(url, callback);
				}
				
			}
			
		}
	
	},


	showBreadcrumns: function(div, /*array*/bcs) {
		if (div == null || bcs == null || bcs.length == 0  ) {
			return;
		}
		
		var html = [];
		var slen = 0;
		for (var i = 0; i < bcs.length; i++ ) {
			var bc = bcs[i]; // {url:url, title:title}
			if ( i > 0 ) {
				html[slen++] = "<span>&nbsp;>&nbsp;</span>";
			}

			// escape the quotes
			var url = bc.url;
			url = url.replace(/'/g, "\\'");
			url = url.replace(/\"/g, "\\\"");

			if (i == bcs.length-1) {
				html = html.concat(["<span>", bc.title, "</span>"]);
			} else {
				html = html.concat(["<a href=\"", url, "\">", bc.title, "</a>"]);
			}
			slen = html.length;
		}

		var str = ["<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">",
			"<tr><td align=\"left\">"];
		str = str.concat(html);
		str = str.concat(["</td><tr>", "</table>"]);
		div.innerHTML = str.join("");
	},
	
	
	resolveUrl: function(url) {

		// note: don't call the app.resolveContenturl() since the content url might not be set yet
		// use the window's url directly
		if ( url.indexOf("./") == 0 ) {			
				var base = window.location.href;
				//alert("base:" + base);
				var i = base.lastIndexOf("/");
				url = base.substring(0, i) + url.substring(1);
		} 
		
		return url;
	},
	
	/* get the page guid, it's the guid of the element or page*/
	getPageId : function() {
		var e = document.getElementById("page-guid");
		if ( e != null ) {
			return e.getAttribute("value");
		}
		
		return null;
	},
	
	saveAsBookmark: function() {
	
         // for IE, does not work for local file browsing
         // only on server

		//var app = this.getApp();
		var url = location.href;
		var title = document.title;			
 		if (window.sidebar) { 
            // for Mozilla Firefox
            window.sidebar.addPanel(title, url, "");
        } else if( window.external ) { 
            window.external.AddFavorite(url, title);
        } else if(window.opera && window.print) { 
             
        }
        
 	},
	
	isFileUrl: function(url) {
		return (url != null) && (url.toLowerCase().indexOf("file://") == 0);
	}
	// helper methods

};
