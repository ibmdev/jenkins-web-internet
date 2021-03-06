<html ng-app="app">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">



<meta content="initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no,width=device-width" name="viewport">
	<!-- CSS -->

	<link rel="stylesheet" href="vendor/bootstrap-datepicker.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/artifact.css">
	
	<!-- JAVASCRIPT LIBRAIRIES -->
	
	<script src="components/angular/angular.js"></script>
	<script	src="components/angular-ui-router/release/angular-ui-router.min.js"></script>
	<script src="components/angular-messages/angular-messages.min.js"></script>
	<script src="components/angular-file-upload/dist/angular-file-upload.min.js"></script>
	<script src="components/lodash-compat/lodash.min.js"></script>
	<script src="vendor/jquery-2.1.4.js" type="text/javascript"></script>
	<script src="vendor/bootstrap.js" type="text/javascript"></script>
	<script src="vendor/bootstrap-datepicker.js" type="text/javascript"></script>
	<script src="vendor/bootstrap-datepicker.fr.js" type="text/javascript"></script>

	<!-- APPLICATION  -->
	<script src="src/private/app.js"></script>


	<!-- ================ SHARED  ===================== -->

	<script src="src/private/shared/shared.module.js"></script>
	<script src="src/private/shared/shared.controller.js"></script>


	<!-- ================ FONCTIONS  ====================== -->

	<script src="src/private/fonction/fonction.module.js"></script>
	<script src="src/private/fonction/fonction.service.js"></script>
	<script src="src/private/fonction/fonction.controller.js"></script>
	


</head>

<body>
	<div ui-view></div>
</body>

</html>
