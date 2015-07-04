
<!DOCTYPE html>
<html lang="en" class="no-js">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <title>Real State Agency</title>
    <meta name="description" content="Real State Agency" />
    <meta name="keywords" content="Real State Agency, Tunisia, web design, mejri mohamed, halloul mohamed, hamdi saoud" />
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

                <span class="right"><a  href="logout.php"><span>Déconnecté</span></a></span>
        <span class="right"><a  href="AjoutAnnonce.php"><span>Ajouter Annonce</span></a></span>
        <span class="right"><a  href="ListeAnnonce.php"><span>Listes Annonce</span></a></span>
        <span class="right"><a  href="../Acceuil.html"><span>Accueil</span></a></span>
        <div class="logo-site"><h1><a href="../Acceuil.html"> Logo </a> <h1></div>

    </div>
        <header class="site-header">
      </header>
      <div class="search">   
        <div> <a href="ListeAnnonce.php" class="btn-search">Decouvrir nos annonces</a></div>      
        </div>

      <div class="content">
      <div class="grid">
         <h2>Ajouter une Annonce</h2>
           <div class="register_account">
   <form name="Ajout" action="AjouterAnnonce2.php" class="modif" method="POST">
  <table border="0" align="center" cellspacing="2" cellpadding="2">
    <tr align="center">
  <tr align="center">
      <td>Titre :</td>
      <td><input type="text" name="titre"  class="input-form-modif" ></td>
    </tr>
   <tr align="center">
      <td>Description :</td>
      <td><input type="textArea" name="text"  class="input-form-modif" ></td>
    </tr>
    <tr align="center">
      <td>Date de Creation :</td>
      <td><input type="date" name="dateCreation"  class="input-form-modif" ></td>
    </tr>
    <tr align="center">
      <td>gouvernorat</td>
      <td><input type="text" name="gouvernorat"  class="input-form-modif" ></td>
    </tr>
 <tr align="center">
      <td>rubrique</td>
      <td><input type="text" name="rubrique"  class="input-form-modif" ></td>
    </tr>
<tr align="center">
      <td>nature</td>
      <td><input type="text" name="nature"  class="input-form-modif" ></td>
    </tr>
<tr align="center">
      <td>type</td>
      <td><input type="text" name="type"  class="input-form-modif" ></td>
    </tr>
<tr align="center">
      <td>prix</td>
      <td><input type="text" name="prix"  class="input-form-modif" ></td>
    </tr>
<tr align="center">
      <td> Utilisateur </td>
      <td><input type="text" name="user_id"  class="input-form-modif" ></td>
    </tr>
    <tr align="center">
      <td colspan="2"><input type="submit" class="btn-modif" value="Ajouter"></td>
    </tr>
  </table>
</form>
             </div>
        </div>
      </div>
        </div>
    <div class="cntnt">
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