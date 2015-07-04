<?php
    $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;
    $pseudo   = $_POST["login"] ;
    $mdp   = $_POST["pass"] ;
$requete="select * from user where mail='".$pseudo."' and password='".$mdp."'";
$resultat = mysql_query($requete);
$resultat1 = mysql_fetch_array($resultat);
if ($resultat1['mail']!="") {
  session_start();
  $_SESSION['id']= $resultat1['id'];
 $_SESSION['login'] = $_POST["login"];
 $_SESSION["pass"] = $_POST["pass"] ;
	header('Location: ../vendeur.html');
}
else {
  	echo 'login ou mot de passse incorrecte ...';
    header("Location:logout.php");
}
mysql_close ();
?>