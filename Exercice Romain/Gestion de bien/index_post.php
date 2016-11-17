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

$req = $bdd->prepare('INSERT INTO bien(nom, prix, surface, fk_type) VALUE( :nom, :prix, :surface, :fk_type)');
$req -> execute(array(
		'nom'=>$_POST['nom'],
		'prix'=>$_POST['prix'],
		'surface'=>$_POST['surface'],
		'fk_type'=>$_POST['fk_type'],
		));

//var_dump($req->errorInfo());

echo 'Resultat enregistrer !';
?>
<hr/>
<FORM ACTION="index.php">
<input type="submit" value=" Retour "/>
</FORM>
</body>
</html>