/*
SQLyog Ultimate v8.32 
MySQL - 5.7.35 : Database - weatherdata
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`weatherdata` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `weatherdata`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `city_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `city` */

insert  into `city`(`id`,`city_name`) values (1,'北京'),(2,'太原'),(3,'大同'),(4,'上海'),(6,'晋中'),(10,'深圳'),(15,'介休');

/*Table structure for table `weather` */

DROP TABLE IF EXISTS `weather`;

CREATE TABLE `weather` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `address` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地名',
  `weather_condition` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '晴天' COMMENT '天气状况',
  `min` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '最低气温',
  `max` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT '100' COMMENT '最高气温',
  `date` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=190 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `weather` */

insert  into `weather`(`id`,`address`,`weather_condition`,`min`,`max`,`date`,`create_time`,`update_time`) values (60,'太原','晴','13','31','2022-06-14 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(61,'太原','晴转多云','13','32','2022-06-15 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(62,'太原','多云转阴','15','36','2022-06-16 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(63,'太原','阴','17','35','2022-06-17 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(64,'太原','多云转晴','19','35','2022-06-18 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(65,'太原','晴转多云','19','36','2022-06-19 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(66,'太原','阴','20','35','2022-06-20 00:00:00','2022-06-14 21:20:14','2022-06-14 21:20:14'),(67,'太原','阴','20','35','2022-06-21 00:00:00','2022-06-14 21:20:36','2022-06-14 21:20:36'),(68,'太原','小雨','22','36','2022-06-22 00:00:00','2022-06-14 21:20:36','2022-06-14 21:20:36'),(69,'太原','晴转多云','22','33','2022-06-23 00:00:00','2022-06-14 21:20:36','2022-06-14 21:20:36'),(70,'太原','晴转多云','21','33','2022-06-24 00:00:00','2022-06-14 21:21:08','2022-06-14 21:21:08'),(71,'太原','阴','18','33','2022-06-25 00:00:00','2022-06-14 21:21:08','2022-06-14 21:21:08'),(72,'太原','阴到小雨','16','32','2022-06-26 00:00:00','2022-06-14 21:21:08','2022-06-14 21:21:08'),(73,'太原','晴','19','35','2022-06-27 00:00:00','2022-06-14 21:21:08','2022-06-14 21:21:08'),(74,'太原','多云转阴','18','29','2022-06-28 00:00:00','2022-06-14 21:21:08','2022-06-14 21:21:08'),(110,'大同','多云','8','25','2022-06-14 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(111,'大同','阴转多云','8','29','2022-06-15 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(112,'大同','多云','11','34','2022-06-16 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(113,'大同','阴转雨','13','38','2022-06-17 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(114,'大同','阴','17','35','2022-06-18 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(115,'大同','多云转阴','16','35','2022-06-19 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(116,'大同','阴','16','33','2022-06-20 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(117,'大同','阴','16','30','2022-06-21 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(118,'大同','阴转多云','20','33','2022-06-22 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(119,'大同','小雨','19','29','2022-06-23 00:00:00','2022-06-14 23:10:08','2022-06-14 23:10:08'),(120,'北京','多云','19','27','2022-06-15 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(121,'北京','阴转多云','19','28','2022-06-16 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(122,'北京','多云转阴','20','31','2022-06-17 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(123,'北京','阴转多云','21','32','2022-06-18 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(124,'北京','多云','22','33','2022-06-19 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(125,'北京','多云','23','33','2022-06-20 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(126,'北京','阴转雨','24','33','2022-06-21 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(127,'北京','阴转多云','23','37','2022-06-22 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(128,'北京','阴转多云','26','37','2022-06-23 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(129,'北京','多云','20','28','2022-06-24 00:00:00','2022-06-15 01:32:35','2022-06-15 01:32:35'),(130,'北京','多云转阴','23','36','2022-06-25 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(131,'北京','小雨到中雨','23','35','2022-06-26 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(132,'北京','小雨到中雨','23','37','2022-06-27 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(133,'北京','多云','20','35','2022-06-28 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(134,'北京','晴','20','27','2022-06-29 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(135,'北京','多云','25','33','2022-06-30 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(136,'北京','多云','25','33','2022-07-01 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(137,'北京','多云','25','33','2022-07-02 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(138,'北京','多云','25','33','2022-07-03 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(139,'北京','多云','25','33','2022-07-04 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(140,'北京','多云','25','33','2022-07-05 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(141,'北京','多云','25','33','2022-07-06 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(142,'北京','多云','25','33','2022-07-07 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(143,'北京','多云','25','32','2022-07-08 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(144,'北京','多云','25','33','2022-07-09 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(145,'北京','多云','25','32','2022-07-10 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(146,'北京','多云','25','32','2022-07-11 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(147,'北京','多云','26','33','2022-07-12 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(148,'北京','多云','25','33','2022-07-13 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(149,'北京','多云','25','33','2022-07-14 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(150,'北京','多云','25','33','2022-07-15 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(151,'北京','多云','25','33','2022-07-16 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(152,'北京','多云','25','32','2022-07-17 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(153,'北京','多云','25','33','2022-07-18 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(154,'北京','多云','25','33','2022-07-19 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(155,'北京','多云','25','33','2022-07-20 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(156,'北京','雨','25','32','2022-07-21 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(157,'北京','多云','25','32','2022-07-22 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(158,'北京','雨','25','33','2022-07-23 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(159,'北京','多云','25','33','2022-07-24 00:00:00','2022-06-15 17:57:23','2022-06-15 17:57:23'),(160,'介休','多云','18','34','2022-06-15 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(161,'介休','晴转多云','20','36','2022-06-16 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(162,'介休','多云','20','37','2022-06-17 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(163,'介休','多云转晴','19','36','2022-06-18 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(164,'介休','多云转晴','20','36','2022-06-19 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(165,'介休','多云转阴','21','36','2022-06-20 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(166,'介休','阴转多云','20','36','2022-06-21 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(167,'介休','多云转阴','22','37','2022-06-22 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(168,'介休','多云','21','37','2022-06-23 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(169,'介休','多云','20','33','2022-06-24 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(170,'介休','多云转雨','19','38','2022-06-25 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(171,'介休','中雨到大雨','19','37','2022-06-26 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(172,'介休','多云','21','37','2022-06-27 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(173,'介休','晴','16','37','2022-06-28 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(174,'介休','小雨到中雨','15','24','2022-06-29 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(175,'介休','多云','20','32','2022-06-30 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(176,'介休','多云','21','32','2022-07-01 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(177,'介休','多云','21','32','2022-07-02 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(178,'介休','多云','21','33','2022-07-03 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(179,'介休','多云','22','33','2022-07-04 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(180,'介休','多云','22','33','2022-07-05 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(181,'介休','多云','22','33','2022-07-06 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(182,'介休','多云','22','32','2022-07-07 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(183,'介休','多云','22','33','2022-07-08 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(184,'介休','多云','22','33','2022-07-09 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(185,'介休','多云','22','33','2022-07-10 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(186,'介休','多云','22','33','2022-07-11 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(187,'介休','多云','22','32','2022-07-12 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(188,'介休','多云','22','33','2022-07-13 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35'),(189,'介休','多云','22','33','2022-07-14 00:00:00','2022-06-15 17:58:35','2022-06-15 17:58:35');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
