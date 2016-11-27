<?php
echo '<pre>';
var_dump($_POST["id"]);
if(isset($_FILES['monFichier']))
     { 
     $dossier = 'telechargements/';
     $fichier = basename($_FILES['monFichier']['name']);
     if(move_uploaded_file($_FILES['monFichier']['tmp_name'], $dossier . $fichier)) //Si la fonction renvoie TRUE, c'est que ça a fonctionné...
     {
          echo 'Upload effectué avec succès !';
     }
     else //Sinon (la fonction renvoie FALSE).
     {
          echo 'Echec de l\'upload !';
     }
}
$bdd = new PDO('mysql:host=localhost; dbname=gest_bien; charset=utf8','root','Idefix72!');
$lien = $dossier.$fichier;
$req = $bdd->prepare('INSERT INTO image(fk_id, lien) VALUES (:fk_id, :lien)');
$req -> execute(array(
          'fk_id'=>$_POST["id"],
          'lien'=>$lien
          ));

echo "\nResultat enregistrer !";
?>