  <?php
    $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;
 
  $id  = $_GET["idArticle"] ;
 
  
 
  $sql = "DELETE 
            FROM post
	    WHERE id = ".$id ;
    
  $requete = mysql_query( $sql, $cnx ) ;
 
  if($requete)
  {
    echo("La suppression à été correctement effectuée") ;
    header('Location:../suppression.html');
  }
  else
  {
    echo("La suppression à échouée") ;
  }

?> 