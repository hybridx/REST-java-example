<!DOCTYPE html>
<meta content="text/html;charset=utf-8" http-equiv="Content-Type">
<meta content="utf-8" http-equiv="encoding">
<html ng-app="assignment">
	<head>
		<title>Student Managment</title>
		<!-- Scripts -->
		<script src="https://code.angularjs.org/1.7.5/angular.js"></script>
		<script src="https://code.angularjs.org/1.7.5/angular-messages.js"></script>
		<script src="https://code.angularjs.org/1.7.5/angular-route.js"></script>
		<script src="https://code.angularjs.org/1.7.5/angular-animate.js"></script>
		<script src="https://code.angularjs.org/1.7.5/angular-aria.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.1.12/angular-material.min.js"></script>
		<script src="//angular-ui.github.io/bootstrap/ui-bootstrap-tpls-1.2.4.js"></script>
		<script src="resources/js/app/app.js"></script>
		<script src="/resources/js/app/services.js"></script>
		<script src="/resources/js/contollers/studentController.js"></script>
		<script src="/resources/js/contollers/subjectController.js"></script>
		<script src="/resources/js/contollers/marksController.js"></script>
		<!-- CSS -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.1.12/angular-material.min.css">
		<link rel="stylesheet" type="text/css" href="resources/styles/style.css" />
		<link rel="shortcut icon" type="image/x-icon" href="resources/images/title_icon.png" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	</head>
<body>
	<div class="grids">
		<div>
			<table  width="100%" border="2" class="table" style="text-align: center; box-shadow: 5px 5px #888888;">
				<tr>
					<td>
						<a href="#!/student" >
							Student
						</a>
					</td>
					<td>
						<a href="#!/subject">
							Subject
						</a>
					</td>
					<td>
						<a href="#!/marks" >
							Marks
						</a>
					</td>
				</tr>
			</table>
		</div>
		<main ng-view>
			
		</main>
	</div>
</body>
</html>