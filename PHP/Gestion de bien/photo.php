<?php

if (isset($_FILES_['nomFichier'])) {
    //var_dump($_FILES);
    move_uploaded_file($_FILES['monFichier']['tmp_name'], "telechargements/" . $_FILES['monFichier']['name']);
}
$id=$_GET['id'];
?>
<form action="uploadimage.php" enctype="multipart/form-data" method="post">
    <input name="monFichier" type="file"/>
         <br/>
    <input name="id" type="hidden" value="<?php echo $id ?>" />
    <input name="submit" type="submit" value="Envoyer"/>
</form>
