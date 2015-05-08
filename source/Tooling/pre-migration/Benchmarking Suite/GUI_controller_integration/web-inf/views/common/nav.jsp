<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>

<head>
<title></title>


<!-- Bootstrap -->
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/assets/styles.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/vendors/datepicker.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/vendors/uniform.default.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/vendors/chosen.min.css" />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value="/resources/vendors/wysiwyg/bootstrap-wysihtml5.css" />"
	rel="stylesheet" media="screen">
</head>
<body>
	<div class="row-fluid">
		<div class="navbar">
			<div class="navbar-inner">
				<ul class="breadcrumb">
					<i class="icon-chevron-left hide-sidebar"><a href='#'
						title="Hide Sidebar" rel='tooltip'>&nbsp;</a></i>
					<i class="icon-chevron-right show-sidebar" style="display: none;"><a
						href='#' title="Show Sidebar" rel='tooltip'>&nbsp;</a></i>
					<li><a href="index">Dashboard</a> <span class="divider">/</span></li>
					<li class="active"><a href="${linkdb}">${page}</a> <span
						class="divider">/</span></li>

				</ul>
			</div>
		</div>
	</div>
	
</body>
</html>