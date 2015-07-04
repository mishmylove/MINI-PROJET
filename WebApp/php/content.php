		<?php
include('login.php');
session_start();
if(!isset($_SESSION['login']) || !$_SESSION["pass"])){
header("Location:logout.php");
}
?>
