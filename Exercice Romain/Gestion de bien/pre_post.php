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
			<td><label for="nom">Type du bien </label> : <input type="text" id="type" name="fk_type" /></td>
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
<input type="submit" value=" Enregistrer "/>
</form>
<hr/>
<FORM ACTION="index.php">
<input type="submit" value=" Retour "/>
</FORM>
</body>
</html>