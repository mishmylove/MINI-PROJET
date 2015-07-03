<?php
 $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;

    $nom    = $_POST["nom"] ;
    $prenom = $_POST["prenom"] ;
    $mail   = $_POST["mail"] ;
    $pass   = $_POST["pass"] ;
    $Tcompte= $_POST["Tcompte"] ;
    $adresse= $_POST["adresse"] ;
    $tel    = $_POST["tel"] ;

$sql = 'SELECT * FROM user WHERE mail ="'.$mail.'"' ;
$req= mysql_query($sql)or die('Erreur SQL !<br />'.$cnx .'<br />'.mysql_error());
if(mysql_num_rows($req) != 0) 
{ 
echo "login déja existe"; 
} 
else {
        $query = mysql_query("INSERT INTO `user`(`id`, `nom`, `prenom`, `mail`, `password`, `adresse`, `telephone`, `type`)
        VALUES ('','$nom','$prenom','$mail','$pass','$adresse','$tel','$Tcompte')") or die('Erreur SQL !<br />'.$cnx .'<br />'.mysql_error());
        if ($query) {
	    echo "<br/><br/><span>votre demande a été enregistré ..!!</span>";
     
        header('Location: ../connexion.html');
       }

  else{
        echo "<p>Insertion Failed <br/> Some Fields are Blank....!!</p>";
        } 
    }
mysql_close($cnx); 
?>


