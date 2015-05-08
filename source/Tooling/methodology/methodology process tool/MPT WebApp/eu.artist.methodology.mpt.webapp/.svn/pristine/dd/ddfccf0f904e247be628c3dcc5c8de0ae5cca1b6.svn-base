ContentPageToolbar = function(){

this.expandAllImage = null;
this.collapseAllImage = null;
this.bookmarkImage = null;
this.printImage = null;
this.backImage = null;
this.forwardImage = null;
this.dividerImage = null;

// hold the toolbar item ids
this.toolbarItems = [];

this.barItemIdPrefix = "contentbar_";

}

ContentPageToolbar.prototype.init = function(imgPath) {

	this.expandAllImage = contentPage.resolveUrl(imgPath + 'expand_all.gif');	
	this.collapseAllImage = contentPage.resolveUrl(imgPath + 'collapse_all.gif');
	this.bookmarkImage = contentPage.resolveUrl(imgPath + 'bookmark.gif');
	this.printImage = contentPage.resolveUrl(imgPath + 'print.gif');
	this.backImage = contentPage.resolveUrl(imgPath + 'back.gif');
	this.forwardImage = contentPage.resolveUrl(imgPath + 'forward.gif');
	this.dividerImage = contentPage.resolveUrl(imgPath + 'divider.gif');
	//this.shimImage = contentPage.resolveUrl(imgPath + 'shim.gif');
	
	this._createToolbar();
};

ContentPageToolbar.prototype._createToolbar = function() {
	var container = document.getElementById("contentPageToolbar");
		
	if ( container == null ) {
		return;
	}
	
	var html = ["<table border='0' cellspacing='0' cellpadding='0' >", "<tr>"];
		
		// local file can't be added as bookmark
		if ( !contentPage.isFileUrl(location.href) ) {
			html = html.concat(this._getToolbarItemHtml(this.bookmarkImage, contentPage.res.toolbar_bookmark));
		}
		
		html = html.concat(this._getToolbarItemHtml(this.backImage, contentPage.res.toolbar_back));
		html = html.concat(this._getToolbarItemHtml(this.forwardImage, contentPage.res.toolbar_forward));
		html = html.concat(this._getToolbarItemHtml(this.expandAllImage , contentPage.res.toolbar_expand_all));
		html = html.concat(this._getToolbarItemHtml(this.collapseAllImage, contentPage.res.toolbar_collapse_all));
		html = html.concat(["<td width='10px'><img alt='' src='", this.dividerImage, "' title=''/></td>"]);
		html = html.concat(this._getToolbarItemHtml(this.printImage, contentPage.res.toolbar_print));
		html = html.concat(["</tr>", "</table>"]);
		
	container.innerHTML = html.join("");

	// attach events
	for (var i = 0; i < this.toolbarItems.length; i++ ) {
		var id = this.toolbarItems[i];
		var bar = document.getElementById(id);
		//alert(bar.tagName);
		
		// note: all handler functions should return false to avoid the url action
		var handler = null;
		if ( id.indexOf(this.bookmarkImage) >= 0 ) {
			handler =  function() { 
				contentPage.saveAsBookmark();
				return false;
			};
		} else if ( id.indexOf(this.backImage) >= 0 ) {
			handler =  function() { 
				//alert("back");
				var app = contentPage.getApp();
				if ( app != null ) {
					app.browser.back();
				}
				return false;
			};
		} else if ( id.indexOf(this.forwardImage) >= 0 ) {
			handler =  function() { 
				var app = contentPage.getApp();
				if ( app != null ) {
					app.browser.forward();
				}
				return false;
			};
		} else if ( id.indexOf(this.expandAllImage) >= 0 ) {
			handler =  function() { 
				contentPage.section.expandAll();
				return false;
			};
		} else if ( id.indexOf(this.collapseAllImage) >= 0 ) {
			handler =  function() { 
				contentPage.section.collapseAll();
				return false;
			};
		} else if ( id.indexOf(this.printImage) >= 0 ) {
			handler =  function() { 
				window.print();
				return false;
			};
		} 
		
		if ( handler != null ) {
			bar.onclick = handler;			
		}
		
		// handle the key stroke
		
	}

	
	/*
	var table = document.createElement("table");
	table.border = "2";
	table.cellspacing = "0";
	table.cellpadding = "0";
	container.appendChild(table);
	
	var tr = document.createElement("tr");
	table.appendChild(tr);
	*/
	// create the bar items
	//tr.appendChild(this._createToolbarItem(this.bookmarkImage, "Bookmark this page", "20px"));
	/*
	tr.appendChild(this.createToolbarItem(this.backImage, "back", "20px"));
	tr.appendChild(this.createToolbarItem(this.forwardImage, "forward", "20px"));
	tr.appendChild(this.createToolbarItem(this.expandAllImage, "expand All", "20px"));
	tr.appendChild(this.createToolbarItem(this.collapseAllImage, "collapse All", "20px"));
	tr.appendChild(this.createToolbarItem(this.dividerImage, "", "10px"));
	tr.appendChild(this.createToolbarItem(this.printImage, "Print", "20px"));
	*/
	
};

ContentPageToolbar.prototype._getToolbarItemHtml = function(imgSrc, text) {
	
	var index = this.toolbarItems.length;
	var id = this.barItemIdPrefix + imgSrc;
	this.toolbarItems[index] = id;
	
	var html = ["<td width='20px' class='contentToolbarIcon'><a href='' id='", id, "'>",  
		"<img alt='", text, "' src='", imgSrc, "' title='", text, "'/></a>", "</td>"];

	return html;	
};

ContentPageToolbar.prototype._createToolbarItem = function(imgSrc, text, width) {
	var td = document.createElement("td");
	td.width = width;
	
	var img = document.createElement("img");
	img.id = this.barItemIdPrefix + imgSrc;
	
	img.src = imgSrc;
	img.title = text;
	img.alt = text;
	img.width = '16';
	img.height = '16';
	img.border = '0';
	//img.align = 'absmiddle';
	
	td.appendChild(img);
	
	//alert("td: " + td);
	
	return td;
};


