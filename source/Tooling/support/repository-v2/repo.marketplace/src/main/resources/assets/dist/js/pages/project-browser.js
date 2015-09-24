$(function() {

	var projectId = "public";
	var artefactId = "profiles:jaas_profile";
	var accessToken = "76e0314c1773e6bb455babe875535e40";

	var converter = Markdown.getSanitizingConverter();
	var editor = new Markdown.Editor(converter);
	editor.run();

	var baseUrl = "http://localhost:8080/api/artefacts/" + projectId + "/"
			+ artefactId;

	$.ajaxSetup({
		beforeSend : function(request) {
			request.setRequestHeader('Authorization', 'Bearer ' + accessToken);
			request.setRequestHeader('Accept', 'application/json');
		}
	});

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
		// $("#rating-slider").attr("value", result.rating.rating);

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
		}
		;

	}); // End of ajax call

	var appendComment = function(title, text, posted, author) {
		$("#comments").append(
				'<li class="time-label"><span class="bg-red">'
				+ posted + '</span></li>'
				+ '<li><i class="fa fa-comments bg-yellow"></i>'
				+ '<div class="timeline-item"><span class="time"><i class="fa fa-clock-o"></i>'
				+ 'Posted by ' + author + '</span><h3 class="timeline-header"><b>'
				+ title + '</b></h3><div class="timeline-body">'
				+ converter.makeHtml(text) + '</div></div></li>');
	}

	// Fetch comments
	$.getJSON(baseUrl + "/comments", function(comments) {
		for (i = 0; i < comments.length; i++) {
			var comment = comments[i];
			var posted = new Date(comment.date).toLocaleString();
			var text = converter.makeHtml(comment.text);

			appendComment(comment.title, comment.text, posted,
					comment.author.realname);
		};
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
					+ created.toLocaleString() '</td><td><a href="'
					+ baseUrl + ":" + version.version
					+ '/content" class="btn btn-block btn-sm btn-primary">Download</a></td></tr>');
			};
		});

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
				alert(response);
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
				appendComment(title, text, posted, author);
			});
		}
	});

});
