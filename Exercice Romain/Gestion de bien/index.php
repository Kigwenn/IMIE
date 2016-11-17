<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css" />
	<title>Gestion des biens de l'agence des Flots bleu</title>
	</head>
	<h2> Gestion des biens de l'agence des flots bleu</h2>
<body>

<?php
$type = ["Maison", "Apart", "Loft"];

$bdd = new PDO('mysql:host=localhost; dbname=gest_bien; charset=utf8','root','Idefix72!');

$req = $bdd->query('SELECT bien.id, bien.nom, prix, surface, fk_type, `option`.nom as nom2,sum(`option`.qte) as qte FROM bien LEFT JOIN posseder ON bien.id = posseder.fk_bien LEFT JOIN `option` ON posseder.fk_bien = `option`.id GROUP BY fk_bien');

echo '<table>';
	echo '<tr>
	    	<strong><th> Nom des biens </th>
	    	<th> prix </th>
	    	<th> surface </th>
	    	<th> type </th>
	    	<th> option </th>
	    	<th> qté </th>
	    </tr>';
echo '</table>';
while ($donnees = $req->fetch()) {
echo '<table>';
echo '<tr> 
  	<td>'.htmlspecialchars($donnees['nom']).'</td>
   	<td>'.($donnees['prix']).'</td>
   	<td>'.($donnees['surface']).'</td>
   	<td>'.$type[($donnees['fk_type'])].'</td>
   	<td>'.($donnees['nom2']).'</td>
   	<td>'.($donnees['qte']).'</td>
</tr>';
}
echo '</table>';
$req->closeCursor()  
?>
<hr/>
<FORM ACTION="pre_post.php">
<input type="submit" value=" Ajout d'un bien "/>
</FORM>
</body>
</html>