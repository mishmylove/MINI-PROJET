<?php
//include "connexion.php";

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "realestatedb";

// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);



if(isset($_GET['gouvernorat']))
$gouvernorat = $_GET['gouvernorat'];
else
$gouvernorat="";
if(isset($_GET['rubrique']))
$rubrique = $_GET['rubrique'];
else
$rubrique="#";
if(isset($_GET['nature']))
$nature = $_GET['nature'];
else
$nature = "#";
if(isset($_GET['type']))
$type = $_GET['type'];
else
$type = "#";





$sql = "SELECT * FROM post where gouvernorat like {{gouvernorat}} and rubrique like {{rubrique}} and nature like {{nature}} and type like {{type}} ";

if($gouvernorat=="")
	$sql=str_replace("{{gouvernorat}}"," '%' ",$sql);
else
	$sql=str_replace("{{gouvernorat}}","'$gouvernorat%'",$sql);

if($rubrique=="#")
	$sql=str_replace("{{rubrique}}"," '%' ",$sql);
else
	$sql=str_replace("{{rubrique}}","'$rubrique%'",$sql);
if($nature=="#")
	$sql=str_replace("{{nature}}"," '%' ",$sql);
else
	$sql=str_replace("{{nature}}","'$nature%'",$sql);
if($type=="#")
	$sql=str_replace("{{type}}"," '%' ",$sql);
else
	$sql=str_replace("{{type}}","'$type%'",$sql);



$result = mysqli_query($conn, $sql);
$rows;

if (mysqli_num_rows($result) > 0) {
    // output data of each row
 

    while($row = mysqli_fetch_assoc($result)) {
        $rows[]=$row;
    }
    echo json_encode($rows);
} else {
    echo json_encode($rows);
}

mysqli_close($conn);





?>