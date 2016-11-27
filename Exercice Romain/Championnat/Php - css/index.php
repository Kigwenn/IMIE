<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css" />
	<title>Competitions Sportives</title>
	</head>
<body>
<form action="resultats.php " method="post">
	<p>
	<label for="nom">Nouvelle l'equipe</label> : <input type="text" name="nom" id="nom" />
	<input type="submit" value="Enregistrer" />
	</p>
</form>
<br/>
<hr/>
<form action="resultats2.php " method="post">
	<table>
		<label for="nom">Saisies des resultats </label>
		<tr>
			<td><label for="nom">Nom de l'equipe</label> : <input type="text" name="nom" id="nom" /></td>
			<td><label for="nom">NB Victoire </label> : <input type="text" id="vitoire" name="victoire" /></td>
			<td><label for="nom">NB Defaite</label> : <input type="text" id="defaite" name="defaite" /></td>
			<td><label for="nom">NB Nuls</label> : <input type="text" id="nul" name="nul" /></td>
			<td><label for="nom">NB Forfaits</label> : <input type="text" id="forfait" name="forfait" /></td>
		</tr>	
	</table>
	</br>
		<input type="submit" value="Enregistrer" />
</form>
<hr/>
<br/>
<?php
$bdd = new PDO('mysql:host=localhost; dbname=chp_sport; charset=utf8','root','???????');

$req = $bdd->query('SELECT `id`, `nom`, (`victoire`*3 + `defaite`* 1 + `nul`*2 ) as Score , `victoire`, `defaite`, `nul`, `forfait` FROM `equipes` order by Score Desc');

echo '<table>';
	echo '<tr>
	    	<strong><th> Equipes </th>
	    	<th> Nb de victoires </th>
	    	<th> Nb de faites </th>
	    	<th> Nb de nuls </th>
	    	<th> Nb de forfaits </th>
	    	<th> Nb de points </th></strong>
   	 	</tr>';
echo '</table>';
while ($donnees = $req->fetch()) {
echo '<table>';
echo '<tr>
  	<td>'.htmlspecialchars($donnees['nom']).'</td>
   	<td>'.($donnees['victoire']).'</td>
   	<td>'.($donnees['defaite']).'</td>
   	<td>'.($donnees['nul']).'</td>
  	<td>'.($donnees['forfait']).'</td>
	<td>'.($donnees['Score']).'</td>
</tr>';
}
echo '</table>';

$req->closeCursor()  
?>
</body>
</html>