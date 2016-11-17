<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css" />
	<title>Gestion des biens de l'agence des Flots bleu</title>
	</head>
	<h2>Ajout d'une option</h2>
<body>
<?php

var_dump($_POST);
echo "<br/>";

$bdd = new PDO('mysql:host=localhost; dbname=gest_bien; charset=utf8','root','Idefix72!');

$req = $bdd->prepare('INSERT INTO posseder(fk_option, fk_bien) VALUE(:fk_option, :fk_bien)');
$req -> execute(array(
		'fk_bien'=>$_POST['bien'],
		'fk_option'=>$_POST['option'],
		));

var_dump($req->errorInfo());

echo 'Resultat enregistrer !';
?>
<hr/>
<FORM ACTION="index.php">
<input type="submit" value=" Retour "/>
</FORM>
</body>
</html>