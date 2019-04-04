-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema myproject
--

CREATE DATABASE IF NOT EXISTS myproject;
USE myproject;

--
-- Definition of table `model`
--

DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `ModelName` varchar(20) default NULL,
  `ModelId` varchar(10) default NULL,
  `VehicleType` varchar(20) default NULL,
  `Color` varchar(20) default NULL,
  `Engine` varchar(20) default NULL,
  `Price` varchar(20) default NULL,
  `Warranty` varchar(20) default NULL,
  `FuelType` varchar(20) default NULL,
  `TotalSeats` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `model`
--

/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` (`ModelName`,`ModelId`,`VehicleType`,`Color`,`Engine`,`Price`,`Warranty`,`FuelType`,`TotalSeats`) VALUES 
 ('SUZUKI K10','P100','SEDAN','BLUE','T-ENGINE','Rs. 4,45000','4 YEARS','PETROL','4'),
 ('MAHINDRA XYLO','X345','SUV','BLACK','UV-ENGINE','Rs. 8,45000','4 YEARS','PETROL/DIESEL','6'),
 ('HYUNDAI i10','HY768','SEDAN','SILVER','HGT-ENGINE','Rs. 5,45000','4 YEARS','PETROL','4'),
 ('HONDA CITY','CT765','SEDAN','WHITE','TRE-ENGINE','Rs. 9,78000','3 YEARS','DIESEL','5'),
 ('MAHINDRA iXT','V500','TRUCK','RED','XT-ENGINE','Rs. 12,78000','5 YEARS','DIESEl/PETROL','2'),
 ('SUZUKI WAGONAR','WA540','SEDAN','SILVER','T-ENGINE','Rs. 4,78000','4 YEARS','DIESEl/PETROL','4');
/*!40000 ALTER TABLE `model` ENABLE KEYS */;


--
-- Definition of table `prospect`
--

DROP TABLE IF EXISTS `prospect`;
CREATE TABLE `prospect` (
  `ProspectId` varchar(10) default NULL,
  `ProspectName` varchar(20) default NULL,
  `ProspectPhone` varchar(20) default NULL,
  `ProspectAddress` varchar(30) default NULL,
  `InterestedModel` varchar(20) default NULL,
  `InterestedColor` varchar(10) default NULL,
  `DateOfVisit` varchar(15) default NULL,
  `Status` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prospect`
--

/*!40000 ALTER TABLE `prospect` DISABLE KEYS */;
INSERT INTO `prospect` (`ProspectId`,`ProspectName`,`ProspectPhone`,`ProspectAddress`,`InterestedModel`,`InterestedColor`,`DateOfVisit`,`Status`) VALUES 
 ('564','HARSHIT','8889898987','SEC. 17 NOIDA','HYUNDAI i10','BLACK','21-05-2017','WARM'),
 ('900','SAKET','7897255676','INDIRAPURAM GHAZIABAD','SUZUKI K10','WHITE','30-05-2017','COLD'),
 ('009','ANUJ','9098789096','PATIA BHUBANESWAR','SUZUKI K10','VIOLET','8-06-2017','HOT');
/*!40000 ALTER TABLE `prospect` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserId` varchar(5) default NULL,
  `Password` varchar(8) default NULL,
  `Role` varchar(10) default NULL,
  `Status` varchar(20) default NULL,
  `UserFullName` varchar(20) default NULL,
  `UserPhone` varchar(12) default NULL,
  `UserEmail` varchar(20) default NULL,
  `UserAddress` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`UserId`,`Password`,`Role`,`Status`,`UserFullName`,`UserPhone`,`UserEmail`,`UserAddress`) VALUES 
 ('101','101','ADMIN','ACTIVATED','SHUBHAM','9878987654','shubh76@gmail.com','21 STREET NEW DELHI'),
 ('102','102','ADMIN','ACTIVATED','SUMIT','9877353654','sumit6@gmail.com','HOWRAH WEST BENGAL'),
 ('103','103','MONITOR','ACTIVATED','SPANDAN','9877365456','span76@gmail.com','CUTTACK ODISHA'),
 ('104','104','MONITOR','ACTIVATED','JASPRIT','8787656543','jassi8@gmail.com','JAMSHEDPUR JHARKHAND'),
 ('105','105','MONITOR','DEACTIVATED','ASHUTOSH','8787665456','ashu98@gmail.com','PATNA BIHAR'),
 ('106','106','MONITOR','ACTIVATED','ANWAR','8798767890','anwar8@gmail.com','BHUBANESWAR ODISHA'),
 ('107','107','MONITOR','DEACTIVATED','NIKITA','9877876543','niki18@gmail.com','GORAKHPUR U.P.'),
 ('108','108','MONITOR','ACTIVATED','AMAL','7897876543','amal08@gmail.com','NOIDA SEC. 16'),
 ('201','201','MONITOR','ACTIVATED','TESTING','0909090909','Testing1@gmail.com','RCPL'),
 ('202','202','ADMIN','ACTIVATED','TEST ADMIN','01010101010','admin1@gmail.com','HPES NOIDA');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
