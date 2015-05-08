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

ContentPageSection = function(){

this.collapseSectionsByDefault = false;		// 2012-12-05 Change it to true to collapse all sections by default
this.firstSection = null;
this.expandImage = null;
this.collapseImage = null;
this.expandAllImage = null;
this.collapseAllImage = null;
this.backToTopImage = null;
this.shimImage = null;
this.sectionCollapseDivs = null;
this.sectionCollapseLinks = null;

// test message, 
this.backToTopText = null;
this.expandAllText = null;
this.collapseAllText = null;
};

ContentPageSection.prototype.init = function(imgPath) {

	this.backToTopText = contentPage.res.backToTopText;
	this.expandAllText = contentPage.res.expandAllText;
	this.collapseAllText = contentPage.res.collapseAllText;

	this.expandImage = contentPage.resolveUrl(imgPath + 'expand.gif');		
	this.collapseImage = contentPage.resolveUrl(imgPath + 'collapse.gif');
	this.expandAllImage = contentPage.resolveUrl(imgPath + 'expand_all.gif');	
	this.collapseAllImage = contentPage.resolveUrl(imgPath + 'collapse_all.gif');
	this.backToTopImage = contentPage.resolveUrl(imgPath + 'back_to_top.gif');
	this.shimImage = contentPage.resolveUrl(imgPath + 'shim.gif');
};

// Creates the collapsible section links.
ContentPageSection.prototype.createSectionLinks = function(tagName, classSelector) {

	if (document.getElementsByTagName) {
		var elements = document.getElementsByTagName(tagName);
		var sectionElements = new Array(elements.length);
		var totalLinks = 0;
		for (var i = 0; i < elements.length; i++) {
			var element = elements[i];
			
			// save the element for auto wrap
			if ( element.getAttribute("autoWrap") == "true" ) {
				contentPage.addAutoWrapElement(element);
			}
			
			if (element.className == classSelector) {
				sectionElements[totalLinks++] = element;				
			}
		}
		sectionElements.length = totalLinks;
		this.sectionCollapseDivs = new Array(totalLinks);
		this.sectionCollapseLinks = new Array(totalLinks);
		this.firstSection = sectionElements[0];
		for (var i = 0; i < sectionElements.length; i++) {
			var element = sectionElements[i];
			//var sectionTitle = element.innerHTML;		// 2012-12-05 Get the section title
			var siblingContainer;
			if (document.createElement && (siblingContainer = document.createElement('div')) && siblingContainer.style) {	
				var nextSibling = element.nextSibling;
				element.parentNode.insertBefore(siblingContainer, nextSibling);
				var nextElement = sectionElements[i + 1];
				while (nextSibling != nextElement && nextSibling != null && nextSibling.className != 'copyright') {
					var toMove = nextSibling;
					nextSibling = nextSibling.nextSibling;
					siblingContainer.appendChild(toMove);
				}
				if (this.collapseSectionsByDefault) {
    				siblingContainer.style.display = 'none';
    			}
				// 2012-12-05 if by default, collapsing all sections is false, then check individual sections.
				/*
				else {
					switch(sectionTitle) {
					case "Purpose":
					case "Relationships":
					case "Main Description":
						siblingContainer.style.display = 'none';
						break;
					default:
						break;
					}
				}
				*/
    			this.sectionCollapseDivs[i] = siblingContainer;
    			this.createCollapsibleSection(element, siblingContainer, i);
			}
			else {
				return;
			}
		}
		
		this.createExpandCollapseAllSectionsLinks(sectionElements[0]);
		
		var divElements = document.getElementsByTagName('div');
		for(var j = 0; j < divElements.length; j++){
			if(divElements[j].id == 'treeContent'){
				this.createExpandCollapseAllSectionsLinksForTreeTable(divElements[j]);
				break;
			}
		}
	}
};

ContentPageSection.prototype.createExpandCollapseAllSectionsLinksForTreeTable = function(tableDiv) {
	var div;
	var self = this;
	
	if (document.createElement && (div = document.createElement('div'))) {
		div.className = 'expandCollapseLink';
		div.align = 'right';
		var image = document.createElement('img');
		image.src = this.expandAllImage;
		image.alt = this.expandAllText;
		image.title = this.expandAllText;
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';		
		var link = document.createElement('a');
		link.className = 'expandCollapseLink';
		link.href = '';
		link.appendChild(image);
		link.onclick = /*this.expandAll;*/ function(evt) {
			/*
			 for (var i = 0; i < self.sectionCollapseDivs.length; i++) {
			 	self.sectionCollapseDivs[i].style.display = '';
			 	self.sectionCollapseLinks[i].firstChild.src = self.collapseImage;
			 }
			 */
			 self.expandAllTreeTable();
			 if (evt && evt.preventDefault) {
			 	evt.preventDefault();
			 }
			 return false;
		};
		var span = document.createElement('span');
		span.className = 'expandCollapseText';
		span.appendChild(document.createTextNode(this.expandAllText));
		link.appendChild(span);
		div.appendChild(link);
		div.appendChild(document.createTextNode(String.fromCharCode(160)));
		div.appendChild(document.createTextNode(String.fromCharCode(160)));
		div.appendChild(document.createTextNode(String.fromCharCode(160)));
		div.appendChild(document.createTextNode(String.fromCharCode(160)));						
		
		image = document.createElement('img');
		image.src = this.collapseAllImage;
		image.alt = this.collapseAllText;
		image.title = this.collapseAllText;
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';
		link = document.createElement('a');
		link.className = 'expandCollapseLink';
		link.href = '#';
		link.appendChild(image);
		link.onclick = /*this.collapseAll;*/function(evt) {
			/*
			for (var i = 0; i < self.sectionCollapseDivs.length; i++) {
				self.sectionCollapseDivs[i].style.display = 'none';
				self.sectionCollapseLinks[i].firstChild.src = self.expandImage;
			}
			*/
			self.collapseAllTreeTable();
			
			if (evt && evt.preventDefault) {
				evt.preventDefault();
			}
			return false;
		};
		span = document.createElement('span');
		span.className = 'expandCollapseText';
		span.appendChild(document.createTextNode(this.collapseAllText));				
		link.appendChild(span);
		div.appendChild(link);
		
		/*
		var overviewSeparator = document.getElementById("overviewSeparator");
		overviewSeparator.parentNode.insertBefore(div, overviewSeparator);
		*/
		if (tableDiv != null) {
			tableDiv.parentNode.insertBefore(div, tableDiv);
		}
		
		/*if (contentPage.getApp() != null) {
			div.style.display = "none";
		}*/
	}
};

ContentPageSection.prototype.expandAllTreeTable = function() {
	contentPage.processPage.treeTable.expandAllTreeNode();
};
	
ContentPageSection.prototype.collapseAllTreeTable = function() {
	contentPage.processPage.treeTable.collapseAllTreeNode();
};

// Creates a collapsible section.
ContentPageSection.prototype.createCollapsibleSection = function(element, siblingContainer, index) {
	if (document.createElement) {
		// Add a spacing between the sections.
		var sectionSeparator = document.createElement('img');
		sectionSeparator.src = this.shimImage;
		sectionSeparator.alt = '';
		sectionSeparator.title = '';
		sectionSeparator.height = '3';
		sectionSeparator.border = '0';
		sectionSeparator.align = 'absmiddle';
		element.parentNode.insertBefore(sectionSeparator, element);
		
		// Add a expand/collapse link to the section heading.
		var span = document.createElement('span');
		var link = document.createElement('a');
		link.collapseDiv = siblingContainer;
		link.href = '';
		var image = document.createElement('img');
		if (this.collapseSectionsByDefault) {
			image.src = this.expandImage;
			image.alt = contentPage.res.expandText;
			image.title = contentPage.res.expandText;
		} 
		// 2012-12-05 addition to set the right expand icon
		/*
		else if (siblingContainer.style.display == "none"){		
			image.src = this.expandImage;
			image.alt = contentPage.res.expandText;
			image.title = contentPage.res.expandText;
		} 
		*/
		else {
			image.src = this.collapseImage;
			image.alt = contentPage.res.collapseText;
			image.title = contentPage.res.collapseText;			
		}
				
		image.width = '17';
		image.height = '15';
		image.border = '0';
		image.align = 'absmiddle';
		link.appendChild(image);
		var self = this;
		link.onclick = function(evt) {
			// here "this" is the tarhet element, i.e. the IMG
			// Expands or collapses a section based on the received event.
			if (this.collapseDiv.style.display == '') {
				this.parentNode.parentNode.nextSibling.style.display = 'none';
				this.firstChild.src = self.expandImage;
				this.firstChild.alt = contentPage.res.expandText;
				this.firstChild.title = contentPage.res.expandText;
			}
			else {
				this.parentNode.parentNode.nextSibling.style.display = '';
				this.firstChild.src = self.collapseImage;
				this.firstChild.alt = contentPage.res.collapseText;
				this.firstChild.title = contentPage.res.collapseText;				
			}
			if (evt && evt.preventDefault) {
				evt.preventDefault();
			}
			return false;
		};

		this.sectionCollapseLinks[index] = link;
		span.appendChild(link);
		element.insertBefore(span, element.firstChild);
		element.appendChild(document.createTextNode(String.fromCharCode(160)));
		element.appendChild(document.createTextNode(String.fromCharCode(160)));
    	
		// Add a Back To Top link in the section heading.
		this.createBackToTopLink(siblingContainer);
	}
};

// Creates a Back to top link.
ContentPageSection.prototype.createBackToTopLink = function(element) {
	var div;
	
	if (document.createElement && (div = document.createElement('div'))) {
		div.className = 'backToTopLink';
		div.align = 'right';
		var image = document.createElement('img');
		image.alt = this.backToTopText;
		image.title = this.backToTopText;
		image.src = this.backToTopImage;
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';		
		var link = document.createElement('a');
		link.className = 'backToTopLink';
		link.href = '#';
		link.appendChild(image);
		var span = document.createElement('span');
		span.className = 'backToTopLink';
		span.appendChild(document.createTextNode(this.backToTopText));		
		link.appendChild(span);
		div.appendChild(link);
		element.appendChild(div);
	}
};


// Creates the Expand All and Collapse All Sections links.
ContentPageSection.prototype.createExpandCollapseAllSectionsLinks = function(firstElement) {

	var div;
	var self = this;
	
	if (document.createElement && (div = document.createElement('div'))) {
		div.className = 'expandCollapseLink';
		div.align = 'right';
		var image = document.createElement('img');
		image.src = this.expandAllImage;
		image.alt = this.expandAllText;
		image.title = this.expandAllText;
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';		
		var link = document.createElement('a');
		link.className = 'expandCollapseLink';
		link.href = '';
		link.appendChild(image);
		link.onclick = /*this.expandAll;*/ function(evt) {
			/*
			 for (var i = 0; i < self.sectionCollapseDivs.length; i++) {
			 	self.sectionCollapseDivs[i].style.display = '';
			 	self.sectionCollapseLinks[i].firstChild.src = self.collapseImage;
			 }
			 */
			 self.expandAll();
			 if (evt && evt.preventDefault) {
			 	evt.preventDefault();
			 }
			 return false;
		};
		var span = document.createElement('span');
		span.className = 'expandCollapseText';
		span.appendChild(document.createTextNode(this.expandAllText));
		link.appendChild(span);
		div.appendChild(link);
		div.appendChild(document.createTextNode(String.fromCharCode(160)));
		div.appendChild(document.createTextNode(String.fromCharCode(160)));
		div.appendChild(document.createTextNode(String.fromCharCode(160)));
		div.appendChild(document.createTextNode(String.fromCharCode(160)));						
		
		image = document.createElement('img');
		image.src = this.collapseAllImage;
		image.alt = this.collapseAllText;
		image.title = this.collapseAllText;
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';
		link = document.createElement('a');
		link.className = 'expandCollapseLink';
		link.href = '#';
		link.appendChild(image);
		link.onclick = /*this.collapseAll;*/function(evt) {
			/*
			for (var i = 0; i < self.sectionCollapseDivs.length; i++) {
				self.sectionCollapseDivs[i].style.display = 'none';
				self.sectionCollapseLinks[i].firstChild.src = self.expandImage;
			}
			*/
			self.collapseAll();
			
			if (evt && evt.preventDefault) {
				evt.preventDefault();
			}
			return false;
		};
		span = document.createElement('span');
		span.className = 'expandCollapseText';
		span.appendChild(document.createTextNode(this.collapseAllText));				
		link.appendChild(span);
		div.appendChild(link);
		
		/*
		var overviewSeparator = document.getElementById("overviewSeparator");
		overviewSeparator.parentNode.insertBefore(div, overviewSeparator);
		*/
		if (this.firstSection != null) {
			this.firstSection.parentNode.insertBefore(div, this.firstSection);
		}
		
		if ( contentPage.getApp() != null ) {
			div.style.display = "none";
		}
	};
	
	ContentPageSection.prototype.expandAll = function() {
			for (var i = 0; i < this.sectionCollapseDivs.length; i++) {
			 	this.sectionCollapseDivs[i].style.display = '';
			 	this.sectionCollapseLinks[i].firstChild.src = this.collapseImage;
			 }
	};
	
	ContentPageSection.prototype.collapseAll = function() {
			for (var i = 0; i < this.sectionCollapseDivs.length; i++) {
				this.sectionCollapseDivs[i].style.display = 'none';
				this.sectionCollapseLinks[i].firstChild.src = this.expandImage;
			}
	};
};