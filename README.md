//README.md

Requirements:

MySQL 8.0
Apache Tomcat 8.5
JDK 8
JRE 1.8


Database 
CREATE TABLE `reminder` 
(
  `reminderID` int(11) NOT NULL AUTO_INCREMENT,

  `reminderName` varchar(75) NOT NULL,
  
  `reminderDate` timestamp NOT NULL,
  
  PRIMARY KEY (`reminderID`)
)