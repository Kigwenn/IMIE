<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css" />
	<title>Gestion des biens de l'agence des Flots bleu</title>
	</head>
	<h2> Ajout d'un bien</h2>
<body>
<form action="index_post.php" method="post">
	<table>
	<hr/>
		<label for="nom"><h3>saisie des champs<h3></label>
		<tr>
			<td><label for="nom">Nom du bien</label> : <input type="text" name="nom" id="nom" /></td>
			<td><label for="nom">Type du bien </label> : <input type="text" id="type" name="type" /></td>
			<td><label for="nom">Prix</label> : <input type="text" id="prix" name="prix" /></td>
			<td><label for="nom">Surface</label> : <input type="text" id="surface" name="surface" /></td>
		</tr>	
	</table>
	<p>Type (1) Maison - (2) Apart. - (3) Loft </p>
<input type="submit" value="Enregistrer" />
</form>
<form action="post_opt.php" method="post">
<table>
<hr/>
	<label for="nom"><h3>affectation des options</h3></label>
		<tr>
			<td><label for="nom">Id du bien</label> : <input type="text" name="bien" id="bien" /></td>
			<td><label for="nom">Id de l'option </label> : <input type="text" name="option" id="option" /></td>
		</tr>
	</table>
	<br/>
<?php
$bdd = new PDO('mysql:host=localhost; dbname=gest_bien; charset=utf8','root','Idefix72!');
echo"<h2> Ref option</h2>";
$req = $bdd->query('SELECT id, nom FROM `option`');
echo '<table>';
echo '<tr>
   	<strong>
   		<th> id </th>
    	<th> nom </th>
	</tr></strong>';
echo '</table>';
while ($donnees =  $req->fetch()){
	echo '<table>';
	echo '<tr> 
		<td>'.htmlspecialchars($donnees['id']).'</td>
   		<td>'.($donnees['nom']).'</td>
 	</tr>';
}
echo '</table>';
$req->closeCursor();  
?>

<input type="submit" value=" Enregistrer "/>
</form>
<hr/>
<input type="button" value=" Retour " onclick="javascript:location.href='index.php'">
</body>
</html>