
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
		        <span class="right"><a  href="logout.php"><span>Déconnecté</span></a></span>
				<span class="right"><a  href="AjoutAnnonce.php"><span>Ajouter Annonce</span></a></span>
				<span class="right"><a  href="#"><span>Listes Annonce</span></a></span>
                <span class="right"><a  href="../Acceuil.html"><span>Accueil</span></a></span>
		     <div class="logo-site"><h1><a href="../Acceuil.html"> Logo </a> <h1></div>
		</div>
		<header class="site-header">
			</header>
</div>
<div class="cntnt">
	<div class="search">   
	<form action="#" >
	<div><input type="text"  class="searchProd"  placeholder=" Location, Pays, Gouvernorat ..." ></div>
	<div>







<select id="Rubrique"   name="Rubrique"  class="select-search required">
			            <option value="null">----- Select Rubrique -----</option>         
			            <option value="De">Demande</option>
			            <option value="Of">Offre</option>
		                </select>
		            	<select id="Nature"   name="Nature"  class="select-search required">
			            <option value="null">----- Select Nature -----</option>         
			            <option value="locatio,">Location</option>
			            <option value="vente">Vente</option>
			            <option value="terrain">Terrain</option>
			            <option value="vacances">Location Vacances</option>
			            <option value="bureaux">Bureaux & Commerces</option>
			            <option value="partage">Partage</option>
		                </select>	   
						<select id="Type"   name="Type"  class="select-search required">
			            <option value="null">----- Select Type -----</option>         
			            <option value="De">Demande</option>
			            <option value="Of">Offre</option>
		                </select>	
		            </div>		  
		            <div></div>
		            <div> <input type="submit" value="Rechercher"  class="btn-search"></input></div>      
		    		</form>
		    	</div>

			<div class="content">
				<h2> Vos Offres  </h2>

<div class="grid">
					<?php
   $cnx = @mysql_connect( "localhost", "root", "" ) ;
    $db = mysql_select_db( "realestatedb",$cnx  ) ;

$sql = 'SELECT * FROM post ORDER BY dateCreation DESC ;';
$req = mysql_query($sql) or die('Erreur SQL !<br />'.$sql.'<br />'.mysql_error());
$nb_message = mysql_num_rows($req);

if ($nb_message == 0) {
	echo 'Aucune Article Enregistrer.';
}
	 while( $result = mysql_fetch_object( $req ) )
    {   
	    echo( "<table border=\"0\" style=\"display: inline-block; float:left; margin-left: 0;    width: 341px; \"  align=\"center\" ><tr><td>" );
	    echo( "<figure class=\"effect-honey\"> " );
	    echo( " <img src=\"../img/bedroom_small.jpg\" /> ");
	    echo( "<figcaption><h2>".$result->titre."<i>Voir</i></h2>");
		echo( "<a href=\"single.html\">Lire La Suite</a></figcaption>");
		echo("</figure>");
			    echo ("</td></tr>");

		echo("<tr><td><a href=\"ModifierAnnonce.php?idArticle=".$result->id."\" style=\"  background: none; width: 100%; border: 1px solid #FF7C00;  color: #f7f7f7; position: relative; padding: 3px 109px 2px 139px; left: -6px; margin-bottom: 5px; margin-top: 5px;\"><font style=\"color: #0B0B0B;font-size: 18px;\">Modifier </a></td></tr>");
		echo("<tr><td><a href=\"SupprimerAnnonce.php?idArticle=".$result->id."\" style=\"  top: 4px;  background: none; width: 100%; border: 1px solid #FF7C00;  color: #f7f7f7; position: relative; padding: 2px 103px 2px 138px; left: -6px; margin-bottom: 5px; margin-top: 5px;\"><font style=\"color: #0B0B0B;font-size: 18px;\">supprimer</a></td></tr>");
	    echo ("</table>");

		
		
    }
mysql_free_result ($req);
mysql_close ();
?>
		  </div>
		 </div>
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