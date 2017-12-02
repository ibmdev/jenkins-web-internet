<%@page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <s4p:include build="false">
    	<!--  CSS -->
        <link rel="stylesheet" type="text/css" href="css/particulier/bootstrap-sma.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	</s4p:include> 
	<s4p:include build="true">
		<link rel="stylesheet" type="text/css" href="css/app.part.css" />
	</s4p:include>        
    </head>
<body>
	
	<fieldset class='erreur'>
		<legend>Déconnexion locale</legend>
		Vous venez de vous déconnecter localement. Tout appel à l'application vous reconnectera automatiquement.<br>
		Si vous désirez vous déconnecter globalement <i style='color: #d91734'>(toutes les autres sessions Intranet ouvertes seront impactées)</i> cliquer sur le bouton ci-dessous.
		<br><br>
		<a href='/ww-web/api/log/deconnexion/globale?GLO=true'><button class='btn btn-primary' >Déconnexion totale</button></a>
		<a href='/ww-web/'><button class='btn btn-success' >Accueil</button></a>
	</fieldset>
	

</body>
</html>