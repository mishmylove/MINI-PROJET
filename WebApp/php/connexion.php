
<?php 
$link = mysql_connect( 'localhost', 'root', '');
if (!$link) die('Erreur de connection');
mysql_select_db( 'realestatedb' , $link );
?>
