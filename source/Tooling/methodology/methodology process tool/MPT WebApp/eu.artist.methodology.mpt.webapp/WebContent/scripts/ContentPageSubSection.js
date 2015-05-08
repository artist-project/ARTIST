//------------------------------------------------------------------------------
// Copyright (c) 2005, 2006 IBM Corporation and others.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
// 
// Contributors:
// IBM Corporation - initial implementation
// Chris Alderton, IBM Software Services Australia, March 2008
//------------------------------------------------------------------------------

// define the class here so we don't need to load the detail implementations 
ContentPageSubSection = function() {

	this.parent = contentPage;
	// by default, we reuse the images from section
	this.expandImage = this.parent.section.expandImage;		
	this.collapseImage = this.parent.section.collapseImage;
	this.expandAllImage = this.parent.section.expandAllImage;	
	this.collapseAllImage = this.parent.section.collapseAllImage;

	this.indentImage = this.parent.section.shimImage;		// added by Chris Alderton

	// and use the default test, override this as needed
	this.expandAllText = contentPage.res.expandAllSubSectionsText;
	this.collapseAllText = contentPage.res.collapseAllSubSectionsText;	

	// ensures that steps are expanded on display
	this.collapseStepsByDefault = true;
	this.firstStepSection = null;

	this.stepCollapseDivs = null;
	this.stepCollapseLinks = null;
		
};

// Creates the collapsible step section links.
ContentPageSubSection.prototype.createStepLinks = function(tagName, classSelector) {
	
	if (document.getElementsByTagName) {
		var elements = document.getElementsByTagName(tagName);
		if (elements.length == 0) return;
		var stepElements = new Array(elements.length);

		var existStepContents = new Array(elements.length);	// added by Chris Alderton
		var totalLinks = 0;
		var k, l, m;
		for (var i = 0; i < elements.length; i++) {
			var element = elements[i];
			if (element.className == classSelector) {
				
				k=totalLinks;				// added by Chris Alderton

				stepElements[totalLinks++] = element;
			}
			// looking for empty steps
			if(element.className == "stepContent") {
				var exist = false;
				var nextIndex;
				do {
					l = element.innerHTML.toUpperCase().indexOf("<TD>")+4;
					m = element.innerHTML.toUpperCase().indexOf("</TD>");
					if (element.innerHTML.substr(l,m-l)!=''?true:false)
					{
						exist = true;
						break;
					}
					nextIndex = element.innerHTML.toUpperCase().indexOf("<TD>",l);
				}while (nextIndex>-1);
				existStepContents[k] = exist;
			}
		}
		if (totalLinks == 0) return;
		stepElements.length = totalLinks;
		this.stepCollapseDivs = new Array(totalLinks);
		this.stepCollapseLinks = new Array(totalLinks);
		this.firstStepSection = stepElements[0];
		for (var i = 0; i < stepElements.length; i++) {
			var element = stepElements[i];
			var siblingContainer;
			if (document.createElement && (siblingContainer = document.createElement('div')) && siblingContainer.style) {
				var nextSibling = element.nextSibling;
				element.parentNode.insertBefore(siblingContainer, nextSibling);
				var nextElement = stepElements[i + 1];
				while (nextSibling != nextElement && nextSibling != null) {
					var toMove = nextSibling;
					nextSibling = nextSibling.nextSibling;
					siblingContainer.appendChild(toMove);
				}
				if (this.collapseStepsByDefault) {
    				siblingContainer.style.display = 'none';
    			}
    			this.stepCollapseDivs[i] = siblingContainer;
				// extra parameter added - existStepContents[i]
    			this.createCollapsibleStepSection(element, siblingContainer, i, existStepContents[i]);

			}
			else {
				return;
			}
		}
		this.createExpandCollapseAllStepsLinks(stepElements[0]);
	}
};

// Creates a collapsible step section.
// extra parameter added - content
ContentPageSubSection.prototype.createCollapsibleStepSection = function(element, siblingContainer, index, existContent) {

	if (document.createElement) {
		var span = document.createElement('span');
		if(existContent) {
			var link = document.createElement('a');
			link.collapseDiv = siblingContainer;
			link.href = '';
			var image = document.createElement('img');
			if (this.collapseStepsByDefault) {
				image.src = this.expandImage;
				image.alt = contentPage.res.expandText;
				image.title = contentPage.res.expandText;	
			}
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
			link.onclick = /*this.expandCollapseStepSection;*/function(evt) {
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
	    }
	    else {// removes expand/collapse button where step has not content
			var link = document.createElement('a');
			var image = document.createElement('img');
			image.src = this.indentImage;
			image.alt = '';
			image.title = '';
			image.width = '17';
			image.height = '15';
			image.border = '0';
			image.align = 'absmiddle';
			link.appendChild(image);
	    }
	    this.stepCollapseLinks[index] = link;
	    span.appendChild(link);
	    element.insertBefore(span, element.firstChild);
	    element.appendChild(document.createTextNode(String.fromCharCode(160)));
	    element.appendChild(document.createTextNode(String.fromCharCode(160)));
	}
};

					
// Creates the Expand All and Collapse All Steps links.
ContentPageSubSection.prototype.createExpandCollapseAllStepsLinks = function(firstElement) {
	var div;
	var self = this;
	
	if (document.createElement && (div = document.createElement('div'))) {
		div.className = 'expandCollapseLink';
		div.align = 'right';		
		var image = document.createElement('img');
		image.src = this.expandAllImage;
		image.alt = this.expandAllText
		image.title = this.expandAllText
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';
		var link = document.createElement('a');
		link.className = 'expandCollapseLink';
		link.href = '';
		link.appendChild(image);
		link.onclick = /*this.expandAllSteps;*/function(evt) {
			 for (var i = 0; i < self.stepCollapseDivs.length; i++) {
			 	self.stepCollapseDivs[i].style.display = '';
					//stops collapse button being added where step has no content expandAll button is clicked
			     	if (self.stepCollapseLinks[i].firstChild.title != '') {
					self.stepCollapseLinks[i].firstChild.src = self.collapseImage;
			     	}
			 }
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
		
		image = document.createElement('img');
		image.src = this.collapseAllImage;
		image.alt = this.collapseAllText
		image.title = this.collapseAllText
		image.width = '16';
		image.height = '16';
		image.border = '0';
		image.align = 'absmiddle';
		link = document.createElement('a');
		link.className = 'expandCollapseLink';
		link.href = '';
		link.appendChild(image);
		link.onclick = /*this.collapseAllSteps;*/function(evt) {
			for (var i = 0; i < self.stepCollapseDivs.length; i++) {
				self.stepCollapseDivs[i].style.display = 'none';
				//stops expand button being added where step has no content when collapseAll button is clicked
				if (self.stepCollapseLinks[i].firstChild.title != '') {
					self.stepCollapseLinks[i].firstChild.src = self.expandImage;
				}
			}
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
		
		if (this.firstStepSection) {
			this.firstStepSection.parentNode.insertBefore(div, this.firstStepSection);
		}
	}
};