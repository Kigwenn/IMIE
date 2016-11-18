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

$req = $bdd->query('SELECT bien.id, bien.nom, prix, surface, type, `option`.nom as nom2,sum(`option`.qte) as qte FROM bien LEFT JOIN posseder ON bien.id = posseder.fk_bien LEFT JOIN `option` ON posseder.fk_bien = `option`.id GROUP BY fk_bien');

echo '<table>';
	echo '<tr>
	    	<strong>
			<th> id </th>
	    	<th> Nom des biens </th>
	    	<th> prix </th>
	    	<th> surface </th>
	    	<th> type </th>
	    	<th> option </th>
	    	<th> qté </th>
	    	<th> photos </th>

	    </tr>';
echo '</table>';
while ($donnees = $req->fetch()) {
echo '<table>';
echo '<tr> 
  	<td>'.htmlspecialchars($donnees['id']).'</td>
  	<td>'.($donnees['nom']).'</td>
   	<td>'.($donnees['prix']).'</td>
   	<td>'.($donnees['surface']).'</td>
   	<td>'.$type[($donnees['type'])-1].'</td>
   	<td>'.($donnees['nom2']).'</td>
   	<td>'.($donnees['qte']).'</td>
   	<td><input type="button" value=" Ajouter " onclick="top.location=\'photo.php?id='.$donnees['id'].'\'"></td>
</tr>';
}
echo '</table>';
$req->closeCursor();  
?>
<hr/>
<input type="button" value=" Ajouter un bien " onclick="javascript:location.href='pre_post.php'">
</body>
</html>