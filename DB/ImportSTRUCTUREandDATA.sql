-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2015 at 01:52 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE IF NOT EXISTS `post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(45) DEFAULT NULL,
  `text` varchar(45) DEFAULT NULL,
  `dateCreation` varchar(45) DEFAULT NULL,
  `gouvernorat` varchar(45) NOT NULL,
  `rubrique` varchar(45) NOT NULL,
  `nature` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `prix` int(11) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `gouvernorat` (`gouvernorat`),
  KEY `rubrique` (`rubrique`),
  KEY `nature` (`nature`),
  KEY `type` (`type`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`id`, `titre`, `text`, `dateCreation`, `gouvernorat`, `rubrique`, `nature`, `type`, `prix`, `user_id`) VALUES
(9, 'first post', 'azeazdaezrfaezraezraz', NULL, 'Ariana', 'Offres', 'Location', 'Duplex', 10, 1),
(10, 'azeaze post', 'azeazdaezrfaezraezraz', NULL, 'Kasserine', 'Demandes', 'Vente', 'Maison', 0, 1),
(12, 'test ', 'a', '12/12/2012', 'Ariana', 'Offres', 'Achat', 'Appartement', 50000, 1),
(13, 'a', 'aze', '04/07/2015', 'Ariana', 'Offres', 'Achat', 'Appartement', 2222, 1),
(14, '', '', '04/07/2015', 'Ariana', 'Offres', 'Achat', 'Appartement', 102, 1),
(15, '', '', '04/07/2015', 'Ariana', 'Offres', 'Achat', 'Appartement', 100000, 1),
(16, '$$', '', '04/07/2015', 'Siliana', 'Demandes', 'Terrain', 'Duplex', 10000, 1),
(17, 'test 2 ', '', '04/07/2015', 'Ariana', 'Offres', 'Achat', 'Appartement', 1000000, 3),
(18, 'test3', '', '04/07/2015', 'Ariana', 'Offres', 'Achat', 'Appartement', 1000000, 3),
(20, '', '', '04/07/2015', 'Siliana', 'Demandes', 'Terrain', 'Maison', 230000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `adresse` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `mail`, `password`, `adresse`, `telephone`, `type`) VALUES
(1, 'Admin', 'Admin', 'admin@admin.com', 'admin', 'null', 'null', 'Admin'),
(3, 'User121321', 'AdUserin2', 'user@user.com', 'user', 'azeaze', 'azeazeaze', 'User');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `post`
--
ALTER TABLE `post`
  ADD CONSTRAINT `post_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
