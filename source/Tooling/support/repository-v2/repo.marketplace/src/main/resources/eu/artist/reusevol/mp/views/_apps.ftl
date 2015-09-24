<#--
/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/ 
-->

<#macro projectBrowserApp>
$(function() {

	<#if accessToken??>
    $.ajaxSetup({
	    beforeSend : function(request) {
            request.setRequestHeader('Authorization', 'Bearer ${accessToken}' );
        }
    });
	</#if>
	
	// Bootstrap Slider for Ratings
	$('#rating-slider').slider({
		formatter : function(value) {
			if (value == "0") {
				return 'No Rating';
			} else {
				return 'Rating: ' + value;
			}
		}
	});

	// Initialize Markdown converter
	var converter = Markdown.getSanitizingConverter();

	// Attach the fancytree widget to an existing <div id="tree"> element
	// and pass the tree options as an argument to the fancytree() function:
	$("#columnview").fancytree(
			{
				extensions : [ "columnview", "filter" ],
				checkbox : false,
				quicksearch : true,
				filter : {
					mode : "hide",
					autoApply : true
				},
				source : {
					url : "${apiBaseUri}/projects?depth=all",
					cache : false
				},
				postProcess : function(event, data) {
					var pid = null;
					var result = $.map(data.response, function(prj, i) {
						pid = prj.id;
						return [ {
							key : prj.id,
							title : prj.label,
							folder : true,
							type : "project",
							children : $.map(prj.packages, function(pkg, j) {
								return [ {
									key : pkg.id,
									title : pkg.label,
									folder : true,
									type : "package",
									children : $.map(pkg.artefacts, function(
											art, k) {
										return [ {
											key : art.id,
											title : art.label,
											type : "artefact",
											description : art.description,
											id : art.id,
											pid : pid
										} ]
									})
								} ];
							})
						} ];
					});
					data.result = result
				},
				activate : function(event, data) {
					if (data.node.data.type == "artefact") {
						var baseUrl = "${apiBaseUri}/artefacts/"
								+ data.node.data.pid + "/" + data.node.data.id;
						var detailsUri = '${mpBaseUri}' + data.node.data.pid + '/' + data.node.data.id + '/details.html'
						$.getJSON(baseUrl + "?depth=all", function(result) {
							$("#art-label").text(result.label);
							$("#art-description").html(
									converter.makeHtml(result.description));
							if (result['image-info']) {
								$("#art-image").attr("src",
										result['image-info'].link);
								$("#art-image").show();
							}
							$("#btn-details").attr("href", detailsUri);
							$("#btn-download").attr("href",
									baseUrl + "/content");
							$("#art-actions").show();

							$("#info-msg").hide()
							var lm = new Date(result['last-modified']);
							var pd = new Date(result['published-on']);
							$("#publisher").text(result.publisher.realname);
							$("#published-on").text(pd.toLocaleString());
							$("#filename")
									.text(result['content-info'].filename);
							$("#filesize").text(
									result['content-info'].size + " bytes");
							$("#last-modified").text(lm.toLocaleString());
							if (result.type) {
								$("#type").text(result.type.label);
							}
							$("#info-table").show()
						});
					} else {
						$("#art-label").text("Artefact Description");
						$("#art-description").text("No artefact selected.");
						$("#art-actions").hide();
						$("#art-image").hide();
						$("#info-msg").show()
						$("#info-table").hide()
					}
				},
				select : function(event, data) {
					// create a tag, when node is selected
					var node = data.node;
					$("span#tag-" + node.key).remove();
					if (node.selected) {
						$("<span>", {
							id : "tag-" + node.key,
							text : node.title,
							"class" : "selTag"
						}).data("key", node.key).append(
								"<button class='close'>&times;</button>")
								.appendTo($("td#tags"));
					}
				}
			});

	$("td#tags").on(
			"click",
			"button.close",
			function(e) {
				// Bind live handler that deselects the node when user clicks
				// 'x' of a tag
				var key = $(e.target).parent().data("key"), node = $(
						":ui-fancytree").fancytree("getNodeByKey", key);
				node.setSelected(false);
				return false; // do not bubble and trigger span click
			}).on(
			"click",
			"span.selTag",
			function(e) {
				// Bind live handler that activates the node, when tag is
				// clicked
				var key = $(e.target).data("key"), node = $(":ui-fancytree")
						.fancytree("getNodeByKey", key);
				node.setActive();
			});

	// Filter stuff
	var tree = $("#columnview").fancytree("getTree");

	/*
	 * Event handlers for our little demo interface
	 */
	$("input[name=search]").keyup(
			function(e) {
				var n, leavesOnly = $("#leavesOnly").is(":checked"), match = $(
						this).val();

				if (e && e.which === $.ui.keyCode.ESCAPE
						|| $.trim(match) === "") {
					$("button#btnResetSearch").click();
					return;
				}
				// Pass a string to perform case insensitive matching
				n = tree.filterNodes(match, leavesOnly);
				$("button#btnResetSearch").attr("disabled", false);
				$("span#matches").text(n);
			}).focus();

	$("button#btnResetSearch").click(function(e) {
		$("input[name=search]").val("");
		$("span#matches").text("");
		tree.clearFilter();
	}).attr("disabled", true);

});
</#macro>

<#macro categoryBrowserApp>
$(function() {

	<#if accessToken??>
    $.ajaxSetup({
	    beforeSend : function(request) {
            request.setRequestHeader('Authorization', 'Bearer ${accessToken}' );
        }
    });
	</#if>
	
	/* Init artefact table */
	$('#table').dataTable({});

	/* Init markdown converter */
	var converter = Markdown.getSanitizingConverter();

	var processCategory = function(cat, i) {
		return [ {
			key : cat.id,
			title : cat.label,
			folder : true,
			expanded : true,
			children : $.map(cat['sub-categories'], processCategory)
		} ];
	};

	// Attach the fancytree widget to an existing <div id="tree"> element
	// and pass the tree options as an argument to the fancytree() function:
	$("#tree").fancytree({
		extensions : [ "filter" ],
		checkbox : false,
		quicksearch : true,
		filter : {
			mode : "hide",
			autoApply : true
		},
		source : {
			url : "${apiBaseUri}/categories?depth=all",// "plugins/fancytree/demo-data.json"
			cache : false
		},
		postProcess : function(event, data) {
			var result = $.map(data.response, processCategory);
			console.log(result);
			data.result = result
		},
		activate : function(event, data) {
			var table = $("#table").dataTable()
			table.fnClearTable();

			$.getJSON("${apiBaseUri}/search?query=categories=="+ data.node.key, function(results) {
				for (i = 0; i < results.length; i++) {
					var result = results[i];
					var data = [
							result.label,
							result.project,
							result.id,
							result.publisher.realname,
							new Date(result['last-modified']).toLocaleString() 
					]
					table.fnAddData(data);
				}
			}).success(function(result){
				table.fnDraw();
			
				/*
				 * Add a click handler to the rows -
				 * this could be used as a callback
				 */
				$("#table tbody tr").click(function(e) {
					if ($(this).hasClass('row-selected')) {
						$(this).removeClass('row-selected');
					} else {
						table.$('tr.row-selected').removeClass('row-selected');
						$(this).addClass('row-selected');
					}

					var data = table._('tr.row-selected');
					console.log(data);
					var baseUrl = "${apiBaseUri}/artefacts/"+ data[0][1]+ "/"+ data[0][2];
					var detailsUri = '${mpBaseUri}' + data[0][1] + '/' + data[0][2] + '/details.html'
					$.getJSON(baseUrl+ "?depth=all",function(result) {
						$("#art-label").text(result.label);
						$("#art-description").html(converter.makeHtml(result.description));
						if (result['image-info']) {
							$("#art-image").attr("src",result['image-info'].link);
							$("#art-image").show();
						}
						$("#btn-details").attr("href", detailsUri);
						$("#btn-download").attr("href",baseUrl+ "/content");
						$("#art-actions").show();

						$("#info-msg").hide()
						var lm = new Date(result['last-modified']);
						var pd = new Date(result['published-on']);
						$("#publisher").text(result.publisher.realname);
						$("#published-on").text(pd.toLocaleString());
						$("#filename").text(result['content-info'].filename);
						$("#filesize").text(result['content-info'].size+ " bytes");
						$("#last-modified").text(lm.toLocaleString());
						if (result.type) {
							$("#type").text(result.type.label);
						}
						$("#info-table").show()
					});
				});
			});


			$("#art-description").text("No artefact selected.");
			$("#art-actions").hide();
			$("#art-image").hide();
			$("#info-msg").text("No item selected.");
			$("#info-table").hide();
		},
	});

	// Filter stuff
	var tree = $("#tree").fancytree("getTree");

	/*
	 * Event handlers for our little demo interface
	 */
	$("input[name=search]").keyup(function(e) {
		var n, leavesOnly = $("#leavesOnly").is(":checked"), match = $(this).val();

		if (e && e.which === $.ui.keyCode.ESCAPE || $.trim(match) === "") {
			$("button#btnResetSearch").click();
			return;
		}
		// Pass a string to perform case insensitive matching
		n = tree.filterNodes(match, leavesOnly);
		$("button#btnResetSearch").attr("disabled", false);
		$("span#matches").text(n);
	}).focus();

	$("button#btnResetSearch").click(function(e) {
		$("input[name=search]").val("");
		$("span#matches").text("");
		tree.clearFilter();
	}).attr("disabled", true);

});
</#macro>

<#macro tableBrowserApp>
$(function() {

	<#if accessToken??>
	$.ajaxSetup({
		beforeSend : function(request) {
			request.setRequestHeader('Authorization', 'Bearer ${accessToken}');
			request.setRequestHeader('Accept', 'application/json');
		}
	});
	</#if>
	
	var converter = Markdown.getSanitizingConverter();

	/* Init artefact table */
	var table = $('#table').dataTable({});

	table.fnClearTable();

	$.getJSON("${apiBaseUri}/search", function(results) {
		for (i = 0; i < results.length; i++) {
			var result = results[i];
			var data = [ 
	            result.label, 
	            result.project, 
	            result.id,
				result.type.label, 
				result.categories, 
				result.tags,
				result['average-rating'] ]
			table.fnAddData(data);
		}
	}).success(function(result){
		table.fnDraw();

		/* Add a click handler to the rows - this could be used as a callback */
		$("#table tbody tr").click( function(e) {
			if ($(this).hasClass('row-selected')) {
				$(this).removeClass('row-selected');
			} else {
				table.$('tr.row-selected').removeClass('row-selected');
				$(this).addClass('row-selected');
			}

			var data = table._('tr.row-selected');
			console.log(data);
			var baseUrl = "http://localhost:8080/api/artefacts/"
					+ data[0][1] + "/" + data[0][2];
			var detailsUrl = "http://localhost:8080/" + data[0][1]
					+ "/" + data[0][2] + "/details.html";
			$.getJSON(baseUrl + "?depth=all", function(result) {
				$("#art-label").text(result.label);
				$("#art-description").html(converter.makeHtml(result.description));
				if (result['image-info']) {
					$("#art-image").attr("src", result['image-info'].link);
					$("#art-image").show();
				}
				$("#btn-details").attr("href", detailsUrl);
				$("#btn-download").attr("href", baseUrl + "/content");
				$("#art-actions").show();

				$("#info-msg").hide()
				var lm = new Date(result['last-modified']);
				var pd = new Date(result['published-on']);
				$("#publisher").text(result.publisher.realname);
				$("#published-on").text(pd.toLocaleString());
				$("#filename").text(result['content-info'].filename);
				$("#filesize").text(result['content-info'].size + " bytes");
				$("#last-modified").text(lm.toLocaleString());
				if (result.type) {
					$("#type").text(result.type.label);
				}
				$("#info-table").show()
			});
		});
	});

	$("#art-description").text("No artefact selected.");
	$("#art-actions").hide();
	$("#art-image").hide();
	$("#info-msg").text("No item selected.");
	$("#info-table").hide();

});
</#macro>

<#macro detailsApp>
$(function() {

	var projectId = "${projectId}";
	var artefactId = "${artefactId}";
	var accessToken = "${accessToken!}";
	
	var timeline = [];

	var converter = Markdown.getSanitizingConverter();
	<#if accessToken??>
	var editor = new Markdown.Editor(converter);
	editor.run();
	</#if>
	
	var baseUrl = "${apiBaseUri}/artefacts/" + projectId + "/"
			+ artefactId;

	<#if accessToken??>
    $.ajaxSetup({
	    beforeSend : function(request) {
            request.setRequestHeader('Authorization', 'Bearer ' + accessToken );
			request.setRequestHeader('Accept', 'application/json');
        }
    });
	</#if>

	$.getJSON(baseUrl + "?depth=all", function(result) {

		// Artefact details
		$("#art-label").text(result.label);
		$("#art-description").html(converter.makeHtml(result.description));
		if (result['image-info']) {
			$("#art-image").attr("src", result['image-info'].link);
			$("#art-image").show();
		}

		// Artefact info
		var lm = new Date(result['last-modified']);
		var pd = new Date(result['published-on']);
		$("#info-msg").hide()
		$("#publisher").text(result.publisher.realname);
		$("#published-on").text(pd.toLocaleString());
		$("#filename").text(result['content-info'].filename);
		$("#filesize").text(result['content-info'].size + " bytes");
		$("#last-modified").text(lm.toLocaleString());
		if (result.type) {
			$("#type").text(result.type.label);
		}
		$("#info-table").show()
		$("#btn-download").attr("href", baseUrl + "/content");
		$("#art-actions").show();

		// Categories
		for (i = 0; i < result.categories.length; i++) {
			$("#categories").append('<li>' + result.categories[i] + '</li>');
		}

		// Tags
		for (i = 0; i < result.tags.length; i++) {
			$("#tags").append('<li>' + result.tags[i] + '</li>');
		}

		// Ratings
		$("#rating-avg").text(result.rating.averageRating);
		$("#rating-size").text("Rated " + result.rating.sampleSize + " times");

		<#if accessToken??>
		// Rating slider
		if (accessToken != null) {
			$('#rating-slider').slider({
				value : result.rating.rating,
				formatter : function(value) {
					if (value == "0") {
						return 'No Rating';
					} else {
						return 'Rating: ' + value;
					}
				}
			});
			$('#slider').show();
		} else {
			$('#slider').hide();
		};
		</#if>

	}); // End of ajax call

	// Adapted from http://codereview.stackexchange.com/questions/37028/grouping-elements-in-array-by-multiple-properties
	function groupBy( array , f ) {
	  var groups = {};
	  array.forEach( function( o ) {
	    var group = JSON.stringify( f(o) );
	    groups[group] = groups[group] || [];
	    groups[group].push( o );  
	  });
	  return groups;
	}

	var dateAsc = function (date1, date2) {
	  if (date1 > date2) return 1;
	  if (date1 < date2) return -1;
	  return 0;
	};
	
	var buildComment = function(comment, icon, color) {
		var bodyText = (comment.text != null) ? '<div class="timeline-body">' + converter.makeHtml(comment.text) + '</div>' : "";
		var posted = new Date(comment.date).toLocaleString();
		return '<li><i class="fa fa-' + icon + ' bg-' + color + '"></i>'
			+ '<div class="timeline-item"><span class="time">'
			+ 'by ' + comment.author.realname + ' on ' + posted + '</span><h3 class="timeline-header"><b>'
			+ comment.title + '</b></h3>' + bodyText + '</div></li>';
	}

	var formatDate = function(date) {
		return date.getDate() + "." + (date.getMonth() + 1) + "." + date.getFullYear();
	}

	var renderComments = function(comments) {
		groupedByDay = groupBy(comments, function(item) {
			var d = new Date(item.date); 
			d.setHours(0,0,0,0); 
			return d.getTime(); 
		});
		var lines = [];
		Object.keys(groupedByDay).sort(dateAsc).forEach(function(key) {
			lines.push('<li class="time-label"><span class="bg-red"><i class="fa fa-clock-o"></i> ' 
				+ formatDate(new Date(parseInt(key, 10))) + '</span></li>');
			var dayComments = groupedByDay[key];
			dayComments.forEach(function(comment) {
				if (comment.type == "COMMENT") {
					lines.push(buildComment(comment, "comments", "yellow"));
				} else if (comment.type == "CREATION") {
					lines.push(buildComment(comment, "plus", "navy"));
				} else if (comment.type == "UPDATE") {
					lines.push(buildComment(comment, "pencil", "olive"));
				} else if (comment.type == "VERSION") {
					lines.push(buildComment(comment, "random", "purple"));
				} else if (comment.type == "RATING") {
					lines.push(buildComment(comment, "star", "maroon"));
				} else if (comment.type == "DOWNLOAD") {
					lines.push(buildComment(comment, "download", "black"));
				}
			});
			$("#comments").html( lines.join("").toString() );
		});
	};

	// Fetch comments
	$.getJSON(baseUrl + "/comments", function(comments) {
		renderComments(comments);
		timeline = comments;
	});

	// Fetch versions
	$.getJSON(baseUrl + "/versions", function(versions) {
			// console.log(versions);
			for (i = 0; i < versions.length; i++) {
				var version = versions[i];
				var created = new Date(version.versionCreated);

				$("#versions") .append(
					'<tr><td>' + version.version + '</td><td>'
					+ converter .makeHtml(version.commitMessage) + '</td><td>'
					+ version.committer + '</td><td>'
					+ created.toLocaleString() + '</td><td><a href="'
					+ baseUrl + ":" + version.version
					+ '/content" class="btn btn-block btn-sm btn-primary">Download</a></td></tr>');
			};
		});

	<#if accessToken??>
	// Update rating
	$('#rating-btn').click(function(e) {
		var rating = $('#rating-slider').attr("value");
		if (rating > 0) {
			var request = $.ajax({
				method : 'POST',
				url : baseUrl + "/rating",
				contentType : 'application/json',
				processData : false,
				data : '{"rating":' + rating + '}'
			});
			request.done(function(response) {
			});
		}
	});

	// Post comment
	$('#post-comment-btn').click(function(e) {
		var title = $('#comment-title').val();
		var text = $('#wmd-input').val();
		var posted = new Date();
		var author = 'self';

		if ((title.length > 0) && (text.length > 0)) {
			var request = $.ajax({
				method : 'POST',
				url : baseUrl + "/comments",
				contentType : 'application/json',
				processData : false,
				data : '{"title":"' + title + '","text":"' + text + '"}'
			});
			request.done(function(response) {
				timeline.push({ title: title, text: text, date: posted, author: author, type: "COMMENT" });
				console.log(timeline);
				renderComments(timeline);
			});
		}
	});
	</#if>

});
</#macro>

<#macro myArtefactsApp>
var apiBaseUrl = "${apiBaseUri}";
var accessToken = "${accessToken!}";

var artefacts = {};
var projects = {};
var categories = {};

// State helpers
var setProjectEnabled = function(enabled) {
	if (enabled == true) {
		$('.art-project').attr('disabled', null);
		$('#packageSelection').attr('disabled', '');
		$('#packageId').attr('disabled', null);
		$('#packageSelection').val("NEW");
	} else {
		$('.art-project').attr('disabled', '');
		$('#packageSelection').attr('disabled', null);
		$('#packageId').attr('disabled', '');
	}
}

var setArtefactFixEnabled = function(enabled) {
	if (enabled == true) {
		$('#projectSelection').attr('disabled', null);
		$('#packageSelection').attr('disabled', null);
		$('#artefactId').attr('disabled', null);
	} else {
		$('#projectSelection').attr('disabled', '');
		$('#packageSelection').attr('disabled', '');
		$('#artefactId').attr('disabled', '');
	}
}

var setCategoryEnabled = function(enabled) {
	if (enabled == true) {
		$('.art-category').attr('disabled', null);
	} else {
		$('.art-category').attr('disabled', '');
	}
}

var setAllEnabled = function(enabled) {
	if (enabled == true) {
		$('.form-control').attr('disabled', null);
	} else {
		$('.form-control').attr('disabled', '');
	}
	$('#newVersion').prop('disabled', !enabled);
}

// Id helpers
var getFullId2 = function(project, id) {
	return project + ":" + id;
}

var getFullId = function(artefact) {
	return getFullId2(artefact.project, artefact.id);
}

var getDomId = function(artefact) {
	var parts = artefact.id.split(":");
	return [ artefact.project, parts[0], parts[1] ].join("-").toString();
}

// HTML helpers
var createSelectOptions = function(data, customElements) {
	var lines = $.map(data, function(value, key) {
		return '<option value="' + value.id + '">' + value.label + '</option>';
	});
	if (customElements) {
		lines.push('<option>---</option>');
		lines.push('<option value="NEW">Create new entity</option>');
	}
	return lines.join("").toString();
}

var populateArtefactList = function(artefacts) {
	var lines = $.map(artefacts, function(art, key) {
		return '<tr id="' + getDomId(art) + '"><td>'
				+ art.label + '</td><td>'
				+ '<buttion class="btn btn-default btn-xs" style="width:4em;" onclick="showArtefact(\''
				+ art.project + '\', \'' + art.id + '\');">Show</buttion>&nbsp;'
				+ '<buttion class="btn btn-info btn-xs" style="width:4em;" onclick="editArtefact(\''
				+ art.project + '\', \'' + art.id + '\');">Edit</buttion>&nbsp;'
				+ '<buttion class="btn btn-warning btn-xs" style="width:4em;" onclick="deleteArtefact(\''
				+ art.project + '\', \'' + art.id + '\');">Delete</buttion>&nbsp;' + '</td></tr>';
	});
	$('#my-artefacts').html(lines.join("").toString());
};

var populatePackageSelection = function(pkgs) {
	$('#packageSelection').html(createSelectOptions(pkgs, true));
};

var recurseCategories = function(categories, path, results, lines) {
	$.each(categories, function(key, cat) {
		path.push(cat.label);
		lines.push('<option value="' + cat.id + '">' + path.join(" > ") + '</option>');
		results[cat.id] = cat;
		if (cat['sub-categories']) {
			recurseCategories(cat['sub-categories'], path, results, lines);
		}
		path.pop();
	});
}

var clearForm = function() {
	var defaultProject = "public";
	$('#projectSelection').val(defaultProject);
	$('#projectId').val(null);
	$('#projectLabel').val(null);
	populatePackageSelection(projects[defaultProject].packages);
	$('#packageSelection').val($('#packageSelection option:first').val());
	$('#packageId').val(null);
	$('#artefactId').val(null);
	$('#artefactLabel').val(null);
	$('#typeSelection').val($('#typeSelection option:first').val());
	$('#artefactTags').val(null);
	$('#categorySelection').val(null);
	$('#wmd-input').val(null);
	$('#contentFilename').text("---");
	$('#contentSize').text("---");
	$('#show-image').html("");
	$('#newVersion').prop('checked', false);
	$('#commitMessage').val(null);
	$('#commitMessage').prop('disabled', true);
	var artefactContent = $("#artefactContent");
	artefactContent.replaceWith(artefactContent.val('').clone(true));
	var artefactImage = $("#artefactImage");
	artefactImage.replaceWith(artefactImage.val('').clone(true));
}

var populateForm = function(a) {
	var key = getFullId(a);
	var pkg = a.id.split(':')[0];
	var id = a.id.split(':')[1];

	$('#projectSelection').val(a.project);
	$('#projectId').val(null);
	$('#projectLabel').val(null);
	populatePackageSelection(projects[a.project].packages);
	$('#packageSelection').val(pkg);
	$('#packageId').val(null);
	$('#artefactId').val(id);
	$('#artefactLabel').val(a.label);
	$('#typeSelection').val(a.type.id);
	$('#artefactTags').val(a.tags.join(", "));
	$('#categorySelection').val(a.categories);
	$('#wmd-input').val(a.description);
	
	if (a['content-info']) {
		$('#contentFilename').text(a['content-info'].filename);
		$('#contentSize').text(a['content-info'].size + " bytes");
	} else {
		$('#contentFilename').text("---");
		$('#contentSize').text("---");
	}
	
	if (a['image-info']) {
		var url = apiBaseUrl + "/artefacts/" + a.project + "/" + a.id + "/image";
		var d = new Date();
		$('#show-image').html('<img src="' + url + '?' + d.getTime() + '" width="100%" />');
	} else {
		$('#show-image').html("");
	}

	var artefactContent = $("#artefactContent");
	artefactContent.replaceWith(artefactContent.val('').clone(true));
	var artefactImage = $("#artefactImage");
	artefactImage.replaceWith(artefactImage.val('').clone(true));

	$('#newVersion').prop('checked', false);
	$('#commitMessage').val(null);
	$('#commitMessage').prop('disabled', true);
}

var createArtefact = function(project, id) {
	clearForm();
	setAllEnabled(true);
	setProjectEnabled(false);
	$('#btn-submit').text("Create artefact");
	$('#btn-submit').attr("onclick", "submitNewArtefact();");
	$('#art-box-title').text("Create new Artefact");
	$('#art-box .box-footer').show();
	$('#art-box').show();
}

var showArtefact = function(project, id) {
	var key = getFullId2(project, id);
	var a = artefacts[key];

	setAllEnabled(false);
	populateForm(a);
	$('#art-box-title').text("Show Artefact '" + a.label + "''");
	$('#art-box .box-footer').hide();
	$('#art-box').show();
}

var editArtefact = function(project, id) {
	var key = getFullId2(project, id);
	var a = artefacts[key];

	setAllEnabled(true);
	setProjectEnabled(false);
	setArtefactFixEnabled(false);
	populateForm(a);
	$('#art-box-title').text("Edit Artefact '" + a.label + "''");
	$('#btn-submit').text("Update artefact");
	$('#btn-submit').attr("onclick", "updateArtefact();");
	$('#art-box .box-footer').show();
	$('#art-box').show();
}

var deleteArtefact = function(project, id) {
	var key = getFullId2(project, id);
	var a = artefacts[key];
	var domId = getDomId(a);

	if (confirm("Please confirm, that artefact '" + a.label + "' should be deleted.")) {
		var url = apiBaseUrl + "/artefacts/" + project + "/" + id;
		$.ajax({
			url : url,
			type : 'DELETE',
			success : function(result) {
				artefacts[key] = null;
				$('#' + domId).remove();
			}
		});
	}
}

var getProjectFromForm = function() {
	var selection = $('#projectSelection').val();
	if (selection == "---")
		return;
	if (selection == "NEW") {
		return {
			isNew : true,
			id : $.trim($('#projectId').val()),
			label : $.trim($('#projectLabel').val())
		};
	} else {
		var project = projects[$('#projectSelection').val()]
		return {
			isNew : false,
			id : project.id,
			label : project.label
		}
	}
}

var getPackageFromForm = function() {
	var selection = $('#packageSelection').val();
	if (selection == "---")
		return;
	if (selection == "NEW") {
		return {
			isNew : true,
			id : $.trim($('#packageId').val())
		};
	} else {
		var project = projects[$('#projectSelection').val()]
		var pkg = $.grep(project.packages, function(entity, index) {
			return entity.id == selection;
		})[0];
		return {
			isNew : false,
			id : pkg.id
		}
	}
}

var getArtefactFromForm = function() {
	var id = $.trim($('#artefactId').val());
	var label = $.trim($('#artefactLabel').val());
	var type = $('#typeSelection').val();
	var tags = $('#artefactTags').val().split(",");
	tags = $.map(tags, function(val, i) {
		return $.trim(val);
	});
	var categories = $('#categorySelection').val();
	var description = $.trim($('#wmd-input').val());
	return {
		id : id,
		label : label,
		description : description,
		type : type,
		tags : tags,
		categories : categories
	};
}

var validateEmpty = function(jqObject, name) {
	var value = $.trim(jqObject.val());
	if ((value == null) || (value == "")) {
		jqObject.parent().parent().addClass("has-error");
		jqObject.parent().find('.control-label').html(
				'<span class="fa fa-bell"> ' + name + ' cannot be empty.</span>');
		return false;
	} else {
		jqObject.parent().parent().removeClass("has-error");
		jqObject.parent().find('.control-label').html(null);
		return true;
	}
}

var validateRegex = function(jqObject, name, format, regex) {
	var value = $.trim(jqObject.val());
	if (regex.test(value)) {
		jqObject.parent().parent().addClass("has-error");
		jqObject.parent().find('.control-label').html(
				'<span class="fa fa-bell"> ' + name + ' does not conform to ' + format + '.</span>');
		return false;
	} else {
		jqObject.parent().parent().removeClass("has-error");
		jqObject.parent().find('.control-label').html(null);
		return true;
	}
}

var uploadContent = function(artefactUrl, artefact) {
	var content = $('#artefactContent')[0].files[0];
	if (content) {
		var fd = new FormData();
		fd.append('file', content);
		var mimeTypeQP = (content.type.length > 0) ? '?mimeype=' + content.type : '';

		$.ajax({
			url : artefactUrl + '/content' + mimeTypeQP,
			data : fd,
			async : false,
			processData : false,
			contentType : false,
			type : 'POST',
			success : function(data) {
				$('#contentFilename').text(content.name);
				$('#contentSize').text(content.size + ' bytes');
				artefact['content-info'] = {
					filename : content.name,
					size : content.size
				}
			}
		});
	}
};

var uploadImage = function(artefactUrl, artefact) {
	var image = $('#artefactImage')[0].files[0];
	if (image) {
		var match = /.*(jpg|gif|png|jpeg|bmp|tiff)/ig.exec(image.name);
		if (match.length > 1) {
			var imgType = match[1];
			var fd = new FormData();
			fd.append('file', image);

			$.ajax({
				url : artefactUrl + '/image?mimetype=image/' + imgType,
				data : fd,
				async : false,
				processData : false,
				contentType : false,
				type : 'POST',
				success : function(data) {
					artefact['image-info'] = {
						filename : content.name,
						size : content.size
					}
				}
			});
		}
	}
}

var updateArtefact = function() {
	var valid = true;

	var projectData = getProjectFromForm();
	var packageData = getPackageFromForm();
	var artefactData = getArtefactFromForm();

	valid = valid && validateEmpty($('#artefactLabel'), "Artefact Label");

	if (valid) {
		var fullId = projectData.id + ":" + packageData.id + ":" + artefactData.id;
		var art = artefacts[fullId];
		var artefactUrl = apiBaseUrl + "/artefacts/" + art.project + "/" + art.id

		$.ajax({
			url : artefactUrl,
			type : 'PUT',
			async : false,
			dataType : 'json',
			accepts : 'application/json',
			contentType : 'application/json; charset=utf-8',
			data : JSON.stringify({
				id : art.id,
				label : art.label,
				description : art.description,
				type : art.type,
				tags : art.tags,
				categories : art.categories
			}),
			success : function(result) {
				art.label = artefactData.label;
				art.description = artefactData.description;
				art.tags = artefactData.tags;
				art.categories = artefactData.categories;
				art.type = {
					id : artefactData.type
				};
				art.project = projectData.id;

				uploadContent(artefactUrl, art);
				uploadImage(artefactUrl, art);

				if ($("#newVersion").is(':checked')) {
					var message = $.trim($('#commitMessage').val());
					if (message == "") message = "No message";
					$.ajax({
						url : artefactUrl + '/versions?msg=' + encodeURIComponent(message),
						type : 'POST',
						async : false,
						dataType : null,
						accepts : 'application/json',
						contentType : null,
						data : null,
						success : function(result) {
							console.log("Version created");
						},
						error : function(result) {
							alert(result);
						}
					});
				}		

				showArtefact(art.project, art.id);
			},
			error : function(result) {
				alert(result);
			}
		});
	}
}

var submitNewArtefact = function() {
	var valid = true;

	var projectData = getProjectFromForm();
	if (projectData.isNew) {
		valid = valid && validateEmpty($('#projectId'), "Project ID");
		valid = valid && validateRegex($('#projectId'), "Project ID", "[0-9A-Za-z_-]", /[^\da-z_\-]/igm);
		valid = valid && validateEmpty($('#projectLabel'), 'Project Label');
	}

	var packageData = getPackageFromForm();
	if (packageData.isNew) {
		valid = valid && validateEmpty($('#packageId'), "Package ID");
		valid = valid && validateRegex($('#packageId'), "Package ID", "[0-9A-Za-z_-.]", /[^\da-z_\.\-]/igm);
	}

	var artefactData = getArtefactFromForm();
	valid = valid && validateEmpty($('#artefactId'), "Artefact ID");
	valid = valid && validateRegex($('#artefactId'), "Artefact ID", "[0-9A-Za-z_-]", /[^\da-z_\-]/igm);
	valid = valid && validateEmpty($('#artefactLabel'), "Artefact Label");

	if (valid) {
		var artId = packageData.id + ":" + artefactData.id;
		var artefactUrl = apiBaseUrl + "/artefacts/" + projectData.id + "/" + artId;
		var fullId = projectData.id + ":" + packageData.id + ":" + artefactData.id;
		var entity;

		$.ajax({
			url : artefactUrl,
			type : 'PUT',
			async : false,
			dataType : 'json',
			accepts : 'application/json',
			contentType : 'application/json; charset=utf-8',
			data : JSON.stringify({
				id : artId,
				label : artefactData.label,
				description : artefactData.description,
				type : {
					id : artefactData.type
				},
				tags : artefactData.tags,
				categories : artefactData.categories
			}),
			success : function(result) {
				entity = {
					id : artId,
					label : artefactData.label,
					description : artefactData.description,
					type : {
						id : artefactData.type
					},
					tags : artefactData.tags,
					project : projectData.id,
					categories : artefactData.categories
				};
				artefacts[fullId] = entity;

				uploadContent(artefactUrl, entity);
				uploadImage(artefactUrl, entity);

				if ($("#newVersion").is(':checked')) {
					var message = $.trim($('#commitMessage').val());
					if (message == "") message = "No message";
					$.ajax({
						url : artefactUrl + '/versions?msg=' + encodeURIComponent(message),
						type : 'POST',
						async : false,
						dataType : null,
						accepts : 'application/json',
						contentType : null,
						data : null,
						success : function(result) {
							console.log("Version created");
						},
						error : function(result) {
							alert(result);
						}
					});
				}		
				
				showArtefact(projectData.id, artId);
				populateArtefactList(artefacts);
			},
			error : function(result) {
				alert(result);
			}
		});
		
		if ($('#newVersion').checked) {
			var message = $.trim($('commitMessage').val());
			$.ajax({
				url : artefactUrl + '/versions?msg=' + encode(message),
				type : 'POST',
				async : false,
				dataType : null,
				accepts : 'application/json',
				contentType : null,
				data : null,
				success : function(result) {
					console.log("Version created");
				},
				error : function(result) {
					alert(result);
				}
			});
		}		
	}
}

$(function() {

	// Populate My Artefacts
	var loadMyArtefacts = function() {
		var results = {};
		$('#art-list .overlay').show();

		$.getJSON(apiBaseUrl + "/search?permission=MANAGE",
				function(artefacts) {
					$.each(artefacts, function(index, art) {
						results[getFullId(art)] = art;
					});
				}).success(function() {
			populateArtefactList(results)
		});

		if (results.length > 0) {
			$('info-msg').text('The following artefacts are managed by you:');
		} else {
			$('info-msg').text('No artefacts are managed by you.');
		}

		$('#art-list .overlay').hide();
		return results;
	}

	// Populate projects
	var loadProjects = function() {
		var results = {};
		$.getJSON(apiBaseUrl + "/projects?depth=children", function(projects) {
			$.each(projects, function(key, project) {
				results[project.id] = project;
			});
			$('#projectSelection').html(createSelectOptions(results, true));
		}).done(function() {
			// Select first
			var currentProject = $("#projectSelection option:first").val();
			$("#projectSelection").val(currentProject);
		});
		return results;
	}

	var loadCategories = function() {
		// Populate categories
		var results = {};
		var lines = [];
		$.getJSON(apiBaseUrl + "/categories?depth=all", function(categories) {
			recurseCategories(categories, [], results, lines);
		}).done(function() {
			$('#categorySelection').html(lines.join("").toString());

			var lines2 = [];
			recurseCategories(results['type']['sub-categories'], [],
					{}, lines2);
			$('#typeSelection').html(lines2.join("").toString());
		});
		return results;
	}

	var converter = Markdown.getSanitizingConverter();
	var editor = new Markdown.Editor(converter);
	editor.run();

	$.ajaxSetup({
		beforeSend : function(request) {
			request.setRequestHeader('Authorization', 'Bearer ' + accessToken);
			request.setRequestHeader('Accept', 'application/json');
		}
	});

	$('#projectSelection').change(function() {
		var selectedVal = $(this).find(':selected').val();
		if (selectedVal == '---')
			return;
		if (selectedVal == 'NEW') {
			setProjectEnabled(true);
		} else {
			setProjectEnabled(false);
			var pkgs = projects[selectedVal].packages;
			populatePackageSelection(pkgs);
			$("#packageSelection").val(
					$("#packageSelection option:first").val());
		}
		;
	});

	$('#packageSelection').change(function() {
		var selectedVal = $(this).find(':selected').val();
		if (selectedVal == '---')
			return;
		if (selectedVal == 'NEW') {
			$('#packageId').attr('disabled', null);
		} else {
			$('#packageId').attr('disabled', '');
		}
		;
	});

	$('#projectId').blur(function(event) {
		var valid = validateEmpty($('#projectId'), "Project ID");
		if (!valid)
			return;
		validateRegex($('#projectId'), "Project ID", "[0-9A-Za-z_-]", /[^\da-z_\-]/igm);
	});

	$('#projectLabel').blur(function(event) {
		validateEmpty($('#projectLabel'), "Project Label");
	});

	$('#packageId').blur(function(event) {
		var valid = validateEmpty($('#packageId'), "Package ID");
		if (!valid)
			return;
		validateRegex($('#packageId'), "Package ID", "[0-9A-Za-z_-.]", /[^\da-z_\.\-]/igm);
	});

	$('#artefactId').blur(function(event) {
		var valid = validateEmpty($('#artefactId'), "Artefact ID");
		if (!valid)
			return;
		validateRegex($('#artefactId'), "Artefact ID", "[0-9A-Za-z_-]", /[^\da-z_\-]/igm);
	});

	$('#artefactLabel').blur(function(event) {
		validateEmpty($('#artefactLabel'), "Artefact Label");
	});

	$('#artefactContent').change(function(event) {
		var file = event.target.files[0];
	});
	
	$('#newVersion').click(function(event) {
		$('#commitMessage').prop('disabled', !event.target.checked);
	});

	artefacts = loadMyArtefacts();
	projects = loadProjects();
	categories = loadCategories();
});
</#macro>

<#macro homeApp>
$(function(){

	var colors = [ "#f56954", "#00a65a", "#f39c12", "#00c0ef", "#3c8dbc", "#d2d6de" ];
	var colorNames = [ "text-red", "text-green", "#text-yellow", "text-aqua", "text-light-blue", "text-gray" ];
	var baseUrl = "${apiBaseUri}/stats"

	var ratingData = []
	var categoryData = []
	var tagData = []

	var pieChartCanvas1 = $("#pieChart1").get(0).getContext("2d");
	var pieChartCanvas2 = $("#pieChart2").get(0).getContext("2d");
	var pieChartCanvas3 = $("#pieChart3").get(0).getContext("2d");
	
	var categoryChart = new Chart(pieChartCanvas1);
	var tagChart = new Chart(pieChartCanvas2);
	var ratingChart = new Chart(pieChartCanvas3);

	var pieOptions = {
	    segmentShowStroke: true,
	    segmentStrokeColor: "#fff",
	    segmentStrokeWidth: 1,
	    percentageInnerCutout: 50, // This is 0 for Pie charts
	    animationSteps: 100,
	    animationEasing: "easeOutBounce",
	    animateRotate: true,
	    animateScale: false,
	    responsive: true,
	    maintainAspectRatio: false,
	    legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>",
	    tooltipTemplate: "<%=label %> (<%=value %> x)"
	};  
	
	var buildLegend = function(data) {
		var lines = []
		for(var i=0; i<data.length; i++) {
			var d = data[i];
			lines.push('<li><i class="fa fa-circle-o ' + colorNames[i] + '"></i> '+ d.label +'</li>');
		}
		return lines.join("").toString();
	}
	
	$.getJSON(baseUrl, function(stats) {
		$('#artefactsCount').text(stats.artefactsCount);
		$('#downloadCount').text(stats.downloadCount);
		$('#commentCount').text(stats.commentCount);
		$('#ratingsCount').text(stats.ratingsCount);
		
		for(var i=0; i<stats.topCategories.length; i++) {
			var entry = stats.topCategories[i];
			categoryData.push({ value: entry.value, color: colors[i], highlight: colors[i], label: entry.key });
		}
		$('#pieChartLegend1').html(buildLegend(categoryData));
		categoryChart.Pie(categoryData, pieOptions);

		for(var i=0; i<stats.topTags.length; i++) {
			var entry = stats.topTags[i];
			tagData.push({ value: entry.value, color: colors[i], highlight: colors[i], label: entry.key });
		}
		$('#pieChartLegend2').html(buildLegend(tagData));
		tagChart.Pie(tagData, pieOptions);
		
		for(var i=0; i<stats.ratingDistribtion.length; i++) {
			var label = i.toString();
			var value = stats.ratingDistribtion[i];
			ratingData.push({ value: value, color: colors[i], highlight: colors[i], label: label });
		}
		$('#pieChartLegend3').html(buildLegend(ratingData));
		ratingChart.Pie(ratingData, pieOptions);

	});
});
  </#macro>
