-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2015 at 01:01 AM
-- Server version: 5.6.15-log
-- PHP Version: 5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `realestatedb`
--
CREATE DATABASE IF NOT EXISTS `realestatedb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `realestatedb`;

--
-- Dumping data for table `gouvernorat`
--

INSERT INTO `gouvernorat` (`id`, `nom`) VALUES
(1, 'Ariana'),
(2, 'Béja'),
(3, 'Ben Arous'),
(4, 'Bizerte'),
(5, 'Gabès'),
(6, 'Gafsa'),
(7, 'Jendouba'),
(8, 'Kairouan'),
(9, 'Kasserine'),
(10, 'Kébili'),
(11, 'La Manouba'),
(12, 'Le Kef'),
(13, 'Mahdia'),
(14, 'Médenine'),
(15, 'Monastir'),
(16, 'Nabeul'),
(17, 'Sfax'),
(18, 'Sidi Bouzi'),
(19, 'Siliana'),
(20, 'Sousse'),
(21, 'Tataouine'),
(22, 'Tozeur'),
(23, 'Tunis'),
(24, 'Zaghouan');

--
-- Dumping data for table `nature`
--

INSERT INTO `nature` (`id`, `nom`, `id_rubrique`) VALUES
(1, 'Vente', 1),
(2, 'Location', 1),
(3, 'Terrain', 1),
(4, 'Achat', 2),
(5, 'Location', 2),
(6, 'Terrain', 2);

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`id`, `titre`, `text`, `dateCreation`, `gouvernorat`, `rubrique`, `nature`, `type`, `prix`) VALUES
(1, 'first post', 'azeazdaezrfaezraezraz', NULL, 15, 1, 1, 1, NULL);

--
-- Dumping data for table `rubrique`
--

INSERT INTO `rubrique` (`id`, `nom`) VALUES
(1, 'Offres'),
(2, 'Demandes');

--
-- Dumping data for table `type`
--

INSERT INTO `type` (`id`, `nom`, `id_nature`) VALUES
(1, 'Maison', 1),
(2, 'Appartement', 1),
(3, 'Duplex', 1),
(4, 'Maison', 2),
(5, 'Appartement', 2),
(6, 'Duplex', 2),
(7, 'Maison', 4),
(8, 'Appartement', 4),
(9, 'Duplex', 4),
(10, 'Maison', 5),
(11, 'Appartement', 5),
(12, 'Duplex', 5),
(13, 'Terrain nu', 3),
(14, 'Terrain agricole', 3),
(15, 'Terrain nu', 6),
(16, 'Terrain agricole', 6);

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `mail`, `password`, `adresse`, `telephone`, `type`) VALUES
(1, 'Admin', 'Admin', 'Admin@admin.com', 'admin', NULL, NULL, 1);

--
-- Dumping data for table `user_type`
--

INSERT INTO `user_type` (`id`, `description`) VALUES
(1, 'Admin'),
(3, 'User');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
