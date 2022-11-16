-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2022 at 09:12 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `the_library_fahym`
--

-- --------------------------------------------------------

--
-- Table structure for table `livres`
--

CREATE TABLE `livres` (
  `ID_LIVRES` int(11) NOT NULL,
  `NOM_LIVRES` varchar(25) NOT NULL,
  `NOM_AUTEUR` varchar(25) NOT NULL,
  `DESPO` varchar(25) NOT NULL,
  `DAT_DESPO` varchar(25) NOT NULL,
  `ETAGE` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `livres`
--

INSERT INTO `livres` (`ID_LIVRES`, `NOM_LIVRES`, `NOM_AUTEUR`, `DESPO`, `DAT_DESPO`, `ETAGE`) VALUES
(1, 'L\'Etranger', 'Albert Camus', 'Disponible', '-- / -- / --', 'A12'),
(2, 'Le Petit Prince', 'Antoine de Saint-Exupéry', 'Non disponible', '22 / 10 / 2022', 'A10'),
(3, 'Paroles', 'Jacques Prévert', 'Disponible', '-- / -- / --', 'B06'),
(4, 'Le Grand Meaulnes', 'Alain-Fournier', 'Disponible', '-- / -- / --', 'A10'),
(5, 'La Condition humaine', 'André Malraux', 'Disponible', '-- / -- / --', 'C01'),
(6, 'Candide', 'Voltaire', 'Non disponible', '02 / 11 / 2022', 'B06'),
(7, 'Antigone', 'Jean Anouilh', 'Disponible', '-- / -- / --', 'A10'),
(8, 'Les maths font leur ciném', 'Jérôme Cottanceau', 'Disponible', '-- / -- / --', 'B06'),
(9, 'Poussières d\'étoiles', 'Hubert Reeves', 'Disponible', '-- / -- / --', 'A10'),
(10, 'La Théorie du chaos', 'James Gleick', 'Non disponible', '29 / 10 / 2022', 'C01'),
(11, 'La Théorie du chaos', 'James Gleick', 'Disponible', '-- / -- / --', 'C01'),
(12, 'L\'Etranger', 'Albert Camus', 'Non disponible', '02 / 01 / 2023', 'C22'),
(13, 'L\'Etranger', 'Albert Camus', 'Non disponible', '02 / 01 / 2023', 'C22'),
(19, 'Roadmap to tssamek', 'Idriss el khalidy', 'Disponible ', '--/--/--', 'B09'),
(21, 'La Supplication', 'Svetlana Alexievitch', 'Disponibel', '--/--/---', 'C01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `livres`
--
ALTER TABLE `livres`
  ADD PRIMARY KEY (`ID_LIVRES`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `livres`
--
ALTER TABLE `livres`
  MODIFY `ID_LIVRES` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
