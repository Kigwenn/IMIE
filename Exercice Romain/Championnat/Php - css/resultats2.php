
<?php
//var_dump($_POST);
//echo "<br/>";
try
{
	$bdd = new PDO('mysql:host=localhost; dbname=chp_sport; charset=utf8','root','???????');
}
catch(Exception $e)
{
        die('Erreur : '.$e->getMessage());
}
// On ajoute des resultats
$sqr = $bdd->prepare('UPDATE equipes SET victoire = :victoire , defaite = :defaite , nul = :nul , forfait = :forfait WHERE nom = :nom');
$sqr -> execute(array(
	'nom'=> $_POST['nom'],
	'victoire'=> !empty($_POST['victoire']) ? $_POST['victoire'] : 0,
	'defaite'=> $_POST['defaite'],
	'nul'=> $_POST['nul'],
	'forfait'=> $_POST['forfait']
	));

//var_dump($sqr->errorInfo());

echo 'Resultat enregistrer !';


$req = $bdd->query('SELECT * FROM equipes');

while ($donnees = $req->fetch())

{
   echo ($donnees['contenu']);
}
?>
<FORM ACTION="index.php">
<input type="submit" value=" Retour "/>
</FORM>
