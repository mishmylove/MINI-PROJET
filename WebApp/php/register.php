<?php
 $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;

    $nom    = $_POST["nom"] ;
    $prenom = $_POST["prenom"] ;
    $mail   = $_POST["mail"] ;
    $pass   = hash( 'sha512',$_POST["pass"]) ;
    $Tcompte= $_POST["Tcompte"] ;
    $adresse= $_POST["adresse"] ;
    $tel    = $_POST["tel"] ;

$sql = 'SELECT * FROM user WHERE mail ="'.$mail.'"' ;


 if (mysql_query($sql)>=1) {    
       
        echo "<p>Insertion Failed <br/> Utilisateur existe ...!!</p>";
}

else {
        $query = mysql_query("INSERT INTO `user`(`id`, `nom`, `prenom`, `mail`, `password`, `adresse`, `telephone`, `type`)
        VALUES ('','$nom','$prenom','$mail','$pass','$adresse','$tel','$Tcompte')") or die('Erreur SQL !<br />'.$query .'<br />'.mysql_error());

if ($query) {

	echo "<br/><br/><span>Data Inserted successfully...!!</span>";
}
else{

echo "<p>Insertion Failed <br/> Some Fields are Blank....!!</p>";
}

mysql_close($cnx); 
}
?>


