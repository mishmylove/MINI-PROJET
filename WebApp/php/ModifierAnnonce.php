<!DOCTYPE html>
<html lang="en" class="no-js">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <title>Real State Agency</title>
    <meta name="description" content="Real State Agency" />
    <meta name="keywords" content="Real State Agency, web design, mejri mohamed, halloul mohamed, hamdi saoud" />
    <meta name="author" content="Esprit" />
    <link rel="shortcut icon" href="#">
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,800,300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="../css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
    <link rel="stylesheet" type="text/css" href="../css/content.css" />
    <!--[if IE]>
      <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
  </head>
  <body>
<div class="container">
      <!-- Top Navigation -->
      <div class="site-top clearfix">
        <span class="right"><a  href="#"><span>Déconnecté</span></a></span>
        <span class="right"><a  href="php/AjoutAnnonce.php"><span>Ajouter Annonce</span></a></span>
        <span class="right"><a  href="#"><span>Listes Annonce</span></a></span>
        <span class="right"><a  href="index.html"><span>Acceuil</span></a></span>


         <div class="logo-site"><h1><a href="index.html"> Logo </a> <h1></div>
    </div>
    <header class="site-header">
        
      </header>
</div>
<div class="cntnt">
  

    <?php
    $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;
 
  $id  = $_GET["idArticle"] ;
 
  //requête SQL:
  $sql = "SELECT *
            FROM post
	    WHERE id = ".$id ;
 

  $requete = mysql_query( $sql, $cnx ) ;
  if( $result = mysql_fetch_object( $requete ) )
  {
  ?>

<form name="Modification" action="ModifierAnnonce2.php" class="modif" method="POST">
  <input type="text" name="id" value="<?php echo($id);?>">
  <table border="0" align="center" cellspacing="2" cellpadding="2">
    <tr align="center">
  <tr align="center">
      <td>Titre :</td>
      <td><input type="text" name="titre"  class="input-form-modif" value="<?php echo($result->titre) ;?>"></td>
    </tr>
   <tr align="center">
      <td>Description :</td>
      <td><input type="textArea" name="text"  class="input-form-modif" value="<?php echo($result->text) ;?>"></td>
    </tr>
    <tr align="center">
      <td>Date de Creation :</td>
      <td><input type="date" name="dateCreation"  class="input-form-modif" value="<?php echo($result->dateCreation) ;?>"></td>
    </tr>
    <tr align="center">
      <td>gouvernorat</td>
      <td><input type="text" name="gouvernorat"  class="input-form-modif" value="<?php echo($result->gouvernorat) ;?>"></td>
    </tr>
 <tr align="center">
      <td>rubrique</td>
      <td><input type="text" name="rubrique"  class="input-form-modif" value="<?php echo($result->rubrique) ;?>"></td>
    </tr>
<tr align="center">
      <td>nature</td>
      <td><input type="text" name="nature"  class="input-form-modif" value="<?php echo($result->nature) ;?>"></td>
    </tr>
<tr align="center">
      <td>type</td>
      <td><input type="text" name="type"  class="input-form-modif" value="<?php echo($result->type) ;?>"></td>
    </tr>
<tr align="center">
      <td>prix</td>
      <td><input type="text" name="prix"  class="input-form-modif" value="<?php echo($result->prix) ;?>"></td>
    </tr>
<tr align="center">
      <td> Utilisateur </td>
      <td><input type="text" name="user_id"  class="input-form-modif" value="<?php echo($result->user_id) ;?>"></td>
    </tr>
    <tr align="center">
      <td colspan="2"><input type="submit" class="btn-modif" value="modifier"></td>
    </tr>
  </table>
</form>
  <?php
  }//fin if 
  ?>




  <div class="discover">
    <a href="../Products.html" class="shop-btn">Decouvrir nos annonces </a>
    </div>
 </div>
     <!-- footer !-->
        <div class="footer">
          <div style="  display: inline-block;   margin-right: 6%;">
          <h3 >Location</h3>
          <ul >
            <li><a href="#">Location</a></li>
              <li><a href="#">Vente</a></li>
                  <li><a href="#">Location Vacances</a></li>
                  <li><a href="#">Bureaux & Commerces</a></li>
                </ul>
        </div>
          <div style="  display: inline-block;   margin-right: 6%;">
          <h3 >Location</h3>
          <ul >
            <li><a href="#">Location</a></li>
              <li><a href="#">Vente</a></li>
                  <li><a href="#">Location Vacances</a></li>
                  <li><a href="#">Bureaux & Commerces</a></li>
                </ul>
        </div>
        
  <div style="  display: inline-block;   margin-right: 6%;">
          <h3 >Location</h3>
          <ul >
            <li><a href="#">Location</a></li>
              <li><a href="#">Vente</a></li>
                  <li><a href="#">Location Vacances</a></li>
                  <li><a href="#">Bureaux & Commerces</a></li>
                </ul>
        </div>
       </div>
    <div class="copy">
           <div class="wrap">
              <p>© All rights reserved | by EspritGroupe6</p>
           </div>
         </div>



    <script>
      // For Demo purposes only (show hover effect on mobile devices)
      [].slice.call( document.querySelectorAll('a[href="#"') ).forEach( function(el) {
        el.addEventListener( 'click', function(ev) { ev.preventDefault(); } );
      } );
    </script>
    
  </body>
</html>