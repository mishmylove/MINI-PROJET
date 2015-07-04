<?php
    $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;
 
      $id    = $_POST["id"] ;
      $titre    = $_POST["titre"] ;
      $text    = $_POST["text"] ;
      $dateCreation    = $_POST["dateCreation"] ;
      $gouvernorat    = $_POST["gouvernorat"] ;
      $rubrique    = $_POST["rubrique"] ;
      $nature    = $_POST["nature"] ;
      $type    = $_POST["type"] ;
      $prix    = $_POST["prix"] ;
      $user_id    = $_POST["user_id"] ;

  $sql = "UPDATE post SET titre='$titre',text='$text',dateCreation='$dateCreation',gouvernorat='$gouvernorat',rubrique='$rubrique',nature='$nature',type='$type',prix='$prix ',user_id='$user_id' where id ='$id'" ;


  $requete = mysql_query($sql, $cnx) or die( mysql_error() ) ;
 
 
  if($requete)
  {
    echo("La modification terminé") ;
    header('Location:../modif.html');
  }
  else
  {
    echo("La modification à échouée") ;
	 }
	
?>