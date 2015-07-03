<?php
    $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;


    $pseudo   = $_POST["login"] ;
    $mdp   = $_POST["pass"] ;



$requete="select * from user where mail='".$pseudo."' and password='".$mdp."'";
$resultat = mysql_query($requete);
$resultat1 = mysql_fetch_array($resultat);

if ($resultat1['mail']!="") {
	    echo 'profile';
	
}
else {
  	echo 'login ou mot de passse incorrecte ...';
}
// on ferme la connexion à la base de données
mysql_close ();





/*
  $cnx = mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb" ) ;


    $login   = $_POST["login"] ;
    $pass   = $_POST["pass"] ;


$sql = 'SELECT * FROM user Where  mail ="'.$mail.'" and  password ='.$pass;
$req = mysql_query($sql) or die('Erreur SQL !<br />'.$sql.'<br />'.mysql_error());

$nb_message = mysql_num_rows($req);

if ($nb_message == 0) {
	echo 'Aucune message enregistrée.';
}
	 while( $result = mysql_fetch_object( $req ) )
    {
	echo( "<table border=\"2\"  width=\"50\" align=\"center\">\n" );


		echo ("<font style=\"color:#003366 ; font-size:18px\"> admin         : </font><font style=\"color:#000 ; font-size:16px\">" .$result->id."</font><br>");
		echo ("<tr><td><div  width=\"75 px\"><font style=\"color:#003366 ; font-size:18px\"> " .$result->nom. "</font></div></td></tr> ");
				echo ("<tr><td><div  width=\"75 px\"><font style=\"color:#003366 ; font-size:18px\"> " .$result->prenom. "</font></div></td></tr> ");

		echo("<td><a href=\"SupprimerAdmin.php?idadmin=".$result->mail."\"><font style=\"color:#CC3300 ; font-size:18px\">supprimer</a></div>\n</td></tr>");
		
       echo("</table><br> <br><br><br>");
    }
// on libère l'espace mémoire alloué à cette requête
mysql_free_result ($req);
// on ferme la connexion à la base de données
mysql_close ();*/
?>