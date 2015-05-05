
// define the class here so we don't need to load the detail implementations 
function ProcessElementPage() {

	this.par_proc = null;
	this.par_path = null;

	// images for the activity, generated dynamically when publishing
	this.imageFiles = [];
	
	// suppressed items for the activity, generated dynamically when publishing
	this.suppressedItems = [];
	
	// element urls for the activity, generated dynamically when publishing
	this.elementUrls = [];
		
	this.treeTable = null;
	
};

ProcessElementPage.prototype.init = function(hasTree) {

	var parameters = contentPage.getUrlParameters(contentPage.queryStr.substring(1));
	this.par_proc = parameters["proc"];
	this.par_path = parameters["path"];
	
	if ( this.par_proc == null || this.par_path == null ) {
		parameters = contentPage.getUrlParameters(contentPage.defaultQueryStr.substring(1));
		this.par_proc = parameters["proc"];
		this.par_path = parameters["path"];
	}	
	
	if ( hasTree) {
		this.createTree(contentPage.imgPath);
	}
};

ProcessElementPage.prototype.onload = function() {
	this.fixMapUrls();
	this.fixTabUrls();
	if ( this.treeTable != null && this.treeTable.createTree) {
		this.treeTable.createTree('div', 'treeNode');
	}
	
};


ProcessElementPage.prototype.createTree = function(imgPath) {
	this.treeTable = new ActivityTreeTable(this);
	this.treeTable.initialize(imgPath);
};

ProcessElementPage.prototype.fixTabUrls = function() {

	var a = document.getElementById("TAB_Description");
	if ( a != null ) {
		this.fixTabUrl(a);
	}
	
	a = document.getElementById("TAB_WBS");
	if ( a != null ) {
		this.fixTabUrl(a);
	}

	a = document.getElementById("TAB_WPBS");
	if ( a != null ) {
		this.fixTabUrl(a);
	}

	a = document.getElementById("TAB_TBS");
	if ( a != null ) {
		this.fixTabUrl(a);
	}
};


ProcessElementPage.prototype.fixTabUrl = function(a) {
	if (a == null ||  contentPage.queryStr == null ) return;
	var url = a.getAttribute("href");
	if ( url != null ) {
		a.setAttribute("href", url + contentPage.queryStr);
	}
}

ProcessElementPage.prototype.fixMapUrls = function() {

	// fix the map area url
	if (document.getElementsByTagName) {
		var elements = document.getElementsByTagName("AREA");
		if ( elements != null ) {
			for (var i = 0; i < elements.length; i++) {
				var element = elements[i];
				var url = element.getAttribute("href");
				var relPath = element.getAttribute("relPath");
				if ( url != null && relPath != null ) {
					url = this.getActivityItemUrl(url, this.par_proc, this.par_path, relPath);
					element.setAttribute("href", url);
				}
			}
		}
		
	}
	
	// fix the diagram img urls
	var diagramType = "Activity"; // no transtation!
	var e = document.getElementById("diagram_" + diagramType);
	if ( e != null ) {
		var url = this.getDiagramImageUrl(this.par_proc, this.par_path, diagramType);
		if ( url != null ) {
			e.src = url;
		}
	}
	
	diagramType = "ActivityDetail"; // no transtation!
	e = document.getElementById("diagram_" + diagramType);
		if ( e != null ) {
			var url = this.getDiagramImageUrl(this.par_proc, this.par_path, diagramType);
			if ( url != null ) {
				e.src = url;
			}
	}
}



ProcessElementPage.prototype.getActivityItemUrl = function(url, process, elementProcessPath, relProcessPath)
{
	var queryString = "?proc=" + process + "&path=" + elementProcessPath + relProcessPath;
	return contentPage.resolveUrl(url) + queryString;
	
};

ProcessElementPage.prototype.getDiagramImageUrl = function(process, elementProcessPath, diagramType)
{
	// get the diagram image file for the specified element path and process
	// retutns null if noting
	// diagram type is Activity, ActivityDetail, 
	var imgUrl = this.imageFiles[elementProcessPath+diagramType];
	//alert("get " + diagramType + " diagram for " + elementProcessPath + " = " + imgUrl);

	if ( imgUrl != null && imgUrl != "undefined" ) {
		return contentPage.resolveUrl(imgUrl);
	} 
	
	return null;
};

/*this method fix the url for descriptor links within descriptor*/
ProcessElementPage.prototype.getDescriptorItemUrl = function(url, relProcessPath)
{
	var path = "";
	var i =  this.par_path.indexOf(relProcessPath);
	if ( i > 0 ) {
		path = this.par_path.substring(0, i + relProcessPath.length);
	} else {
		// remove the last guid
		i = this.par_path.lastIndexOf(",");
		path = this.par_path.substring(0, i+1) + relProcessPath;
	}
	
	var queryString = "?proc=" + this.par_proc + "&path=" + path;
	url = contentPage.resolveUrl(url) + queryString;
		
	return url;
	
};


ProcessElementPage.prototype.fixDescriptorLinks = function()
{
	var elements = document.getElementsByTagName("A");
	for (var i = 0; i < elements.length; i++) {
		var element = elements[i];

		var guid = element.getAttribute("guid");
		var url = element.getAttribute("href");
		var innerText = element.innerHTML;

		if ( guid != null && guid != "" ) {
			url = this.getDescriptorItemUrl(url, guid);
			element.setAttribute("href", url);
			element.innerHTML = innerText;
		}
	}
};

ProcessElementPage.prototype.isSuppressed = function(process, elementProcessPath)
{
	var flag = (this.suppressedItems[elementProcessPath] == true);
	//if ( flag ) alert("got one: " + elementProcessPath);
		
	return flag;
};

ProcessElementPage.prototype.buildTeamTree = function(teamTree) {	
	
	var el = document.getElementById("teamTree");
	if ( el == null ) return;
	
	if ( teamTree == null || teamTree.length == 0 ) {
		return;
	}
	
	teamTree[0][0] = teamTree[0][0].replace(/(\'|\")/g, "\\$1");

	var teamBuffer = [];
	var len = teamTree.length;
	for ( var i = 0; i < len; i++ ) {

		if ( !this.isTeamSuppressed(teamTree[i]) ) {
			teamBuffer[teamBuffer.length] = "<div class=\"teamStructure\" align=\"left\">";
			teamBuffer = teamBuffer.concat(this.getTeamTreeHtml(teamTree[i]));
			teamBuffer[teamBuffer.length] = "</div><br/>";
		}

	}
	
	//alert(teamBuffer);
	//document.write(teamBuffer);
	el.innerHTML = teamBuffer.join("");
};


// format is [url, title, relPath, suppressed]
ProcessElementPage.prototype.getTeamTreeHtml = function(teamTree) {

	if ( teamTree == null || teamTree.length < 4) {
		return [];
	}

	var url = teamTree[0];
	var title = teamTree[1];
	var relPath = teamTree[2];
	
	url = this.getActivityItemUrl(url, this.par_proc, this.par_path, relPath);
	
	var teamBuffer = ["<a href=\"", url, "\">", title, "</a>"];
	var slen = 5;
	
	if ( teamTree.length > 4 && teamTree[4] != null && teamTree[4] != "" && teamTree[4] != undefined ) {
		teamBuffer[slen++] = "<ul>";
		for ( var i = 4; i < teamTree.length; i++ ) {
			if (typeof teamTree[i] == "object" && !this.isTeamSuppressed(teamTree[i]) ) {

				teamBuffer[slen++] = "<li>";
				teamBuffer = teamBuffer.concat(this.getTeamTreeHtml(teamTree[i]));
				slen = teamBuffer.length;
				teamBuffer[slen++] = "</li>";
			}
		}
		teamBuffer[slen++] = "</ul>";
	}

	return teamBuffer;
};

ProcessElementPage.prototype.isTeamSuppressed = function(teamTree) {

	if ( teamTree == null || teamTree.length < 4) {
		return true;
	}
	
	var relPath = teamTree[2];
	var sup = teamTree[3];

	if ( sup == "" ) {
		return this.isSuppressed(this.par_proc, this.par_path + relPath);
	} else {
		return (sup == "true");
	}
	
};

ProcessElementPage.prototype.buildProcessElementBreadCrumb = function(url) {

	var div = document.getElementById("breadcrumbs");
	if ( div == null ) return;

	var viewFrame = contentPage.getViewFrame();
	if ( viewFrame == null ) {
		return;
	}
	
	//if the process element are located at the root of this view
	//this.par_path will be null
	if ( this.par_path == null ) {
	    contentPage._buildBreadcrumns(url);
	    return;
	}
		
	var paths = this.par_path.split(",");
	
	var hasApp = (contentPage.getApp() != null);	
	var nodeInfo = null;
	
	if ( hasApp ) {
		// the first path is the process guid
		// however, the tree node might be an activity without having a process node
		// for example, a discipline can have an activity as a referenced work flow
		// so check all 
		for (var x = 0; x < paths.length; x++ ) {
			var id = paths[x];
			nodeInfo = viewFrame.getNodeInfo(id);
			if ( nodeInfo != null ) {
				break;
			}
		}
		
		// if the process is not in the tree, there is no nodeinfo
		// in such case, use the node info of the element
		if ( nodeInfo == null ) {
			nodeInfo = contentPage.nodeInfo;
		}
		
		if ( nodeInfo != null ) {
			// remove the first element since it's the view node
			paths.shift();
	
			var self = this;
			var callback = function(bcs) {
				self._showProcessElementBreadCrumb(div, bcs, url);
			};
			viewFrame.getBreadcrumbsByPath(nodeInfo, paths, callback);
		} else {
			// if can't find the tree node, just show the process breadcrumbs
			var bcs = [];
			this._showProcessElementBreadCrumb(div, bcs, url);
		}
	} else {
		var bcs = null;
		while (paths.length > 0 ) {
			bcs = viewFrame.getBreadcrumbsByPath(paths);
			if ( bcs != null && bcs.length > 0 ) {
				break;
			}
			
			paths.shift();
		}
		
		if ( bcs == null || bcs.length == 0 ) {
			bcs  = viewFrame.getBreadcrumbs(url);
		}
		
		//alert(bcs);
		this._showProcessElementBreadCrumb(div, bcs, url);
	}
	

};

ProcessElementPage.prototype._showProcessElementBreadCrumb = function(div, bcs, url) {
	var viewFrame = contentPage.getViewFrame();
	if (viewFrame == null || !viewFrame.getBreadcrumbs ) {
		return;
	}
	
	var localBcs = [];
	var count = 0;
	var linksText = "";
	var paths = this.par_path.split(",");
	var path = this.par_path;
	
	var hasApp = (contentPage.getApp() != null);
	//alert("app:" + hasApp);
	var baseUrl = null;
	if ( hasApp ) {
		baseUrl = contentPage.getApp().getBaseUrl();
	} else {	
		baseUrl = viewFrame.getBaseUrl();
	}
	
	var lastBcsId = null;
	if ( bcs == null ) {
		bcs = [];
	} else if ( bcs.length > 0 ) {
		lastBcsId = bcs[bcs.length-1].id;
	}
	
	
	for (var i = paths.length-1; i >=0; i--) {
		var guid = paths[i];

		var item_text = "";
		var item_url = "";
		
		var item = this.elementUrls[guid];
		if ( item != null ) {
			item_text = item[0];
			item_url = baseUrl + item[1];

			// get the url with no back path, then conver to a full url			
			item_url = this.getActivityItemUrl(item_url, this.par_proc, path, '');
			// get the last tree-node breadcrumbs
			// process this before the item_url is set
			//alert("viewFrame.getBreadcrumbs: " + viewFrame.getBreadcrumbs);
			if ( guid == lastBcsId ) {
				break;
			}
			
			localBcs[count++] = {id: guid, url: item_url, title: item_text};			
		}
		
		// trim the path
		var x = path.indexOf("," + guid);
		if ( x > 0 ) {
			path = path.substring(0, x);
		}
	}

	if ( localBcs.length > 0 ) {
		// order it right
		localBcs = localBcs.reverse();
		if ( bcs == null )  bcs = [];		
		var count = bcs.length;
		for (var i = 0; i < localBcs.length; i++) {
			bcs[count+i] = localBcs[i];
		}
	}
	
	if ( bcs != null && bcs.length > 0 ) {
		contentPage.showBreadcrumns(div, bcs);
	}
	
};



ProcessElementPage.prototype.getProcessElementLinkHtmlFromId = function(guid, elementPath, backPath) {

	var str = [];
	var item = this.elementUrls[guid];
	if ( item != null ) {
		var text = item[0];
		var url = backPath + item[1];
		url = this.getActivityItemUrl(url, this.par_proc, elementPath, '');
		
		// escape the quotes
		url = url.replace(/'/g, "\\'");
		url = url.replace(/\"/g, "\\\"");
			
			
		str = ["<a href=\"", url, "\">", text, "</a>"];
	}

	
	return str.join("");
};

