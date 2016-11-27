

<?php
try
{
	$bdd = new PDO('mysql:host=localhost; dbname=chp_sport; charset=utf8','root','???????');
}
catch(Exception $e)
{
        die('Erreur : '.$e->getMessage());
}

// On ajoute une equipe
$sqr = $bdd->prepare('INSERT INTO equipes(nom) values(:nom)');
$sqr -> execute(array('nom'=> $_POST['nom']));

$doublon = $sqr->errorcode();
//ar_dump($doublon);
 if ($doublon == 23000) {
 	echo "l'equipe existe deja";
 	}
 else{
 	echo "\n l equipe à bien été ajouté !";
 	 }
?>
  	<FORM ACTION="index.php">
 	<input type="submit" value=" Retour "/>
 	</FORM>
 	<?php

?>
