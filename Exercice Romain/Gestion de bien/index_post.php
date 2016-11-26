<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css" />
	<title>Gestion des biens de l'agence des Flots bleu</title>
	</head>
	<h2>Ajout d'un bien</h2>
<body>
<?php

//var_dump($_POST);
echo "<br/>";

$bdd = new PDO('mysql:host=localhost; dbname=gest_bien; charset=utf8','root','Idefix72!');

$req = $bdd->prepare('INSERT INTO bien(nom, prix, surface, type) VALUE( :nom, :prix, :surface, :type)');
$req -> execute(array(
		'nom'=>$_POST['nom'],
		'prix'=>$_POST['prix'],
		'surface'=>$_POST['surface'],
		'type'=>$_POST['type'],
		));

//var_dump($req->errorInfo());

echo 'Resultat enregistrer !';
?>
<hr/>
<input type="button" value=" Retour " onclick="javascript:location.href='index.php'">
</body>
</html>