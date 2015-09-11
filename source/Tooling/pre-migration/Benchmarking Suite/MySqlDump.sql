CREATE DATABASE  IF NOT EXISTS `cloudbench` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `cloudbench`;
-- MySQL dump 10.13  Distrib 5.6.19, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: cloudbench
-- ------------------------------------------------------
-- Server version	5.6.19-1~exp1ubuntu2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `DaCapo`
--

DROP TABLE IF EXISTS `DaCapo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DaCapo` (
  `Date` varchar(45) DEFAULT NULL,
  `CloudProvider` varchar(45) DEFAULT NULL,
  `User` varchar(45) DEFAULT NULL,
  `InstanceType` varchar(45) DEFAULT NULL,
  `Tool` varchar(45) DEFAULT NULL,
  `Workload` varchar(45) DEFAULT NULL,
  `Platform` varchar(45) DEFAULT NULL,
  `PerformanceTime_ms` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Filebench`
--

DROP TABLE IF EXISTS `Filebench`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Filebench` (
  `Date` varchar(45) DEFAULT NULL,
  `CloudProvider` varchar(45) DEFAULT NULL,
  `User` varchar(45) DEFAULT NULL,
  `InstanceType` varchar(45) DEFAULT NULL,
  `Tool` varchar(45) DEFAULT NULL,
  `Workload` varchar(45) DEFAULT NULL,
  `Platform` varchar(45) DEFAULT NULL,
  `Ops` float DEFAULT NULL,
  `OpsPerSecond` float DEFAULT NULL,
  `ReadWrite` varchar(45) DEFAULT NULL,
  `MbPerSecond` float DEFAULT NULL,
  `CpuOperations` float DEFAULT NULL,
  `Latency` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `YCSB`
--

DROP TABLE IF EXISTS `YCSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `YCSB` (
  `Date` varchar(45) DEFAULT NULL,
  `CloudProvider` varchar(45) DEFAULT NULL,
  `User` varchar(45) DEFAULT NULL,
  `InstanceType` varchar(45) DEFAULT NULL,
  `Tool` varchar(45) DEFAULT NULL,
  `Workload` varchar(45) DEFAULT NULL,
  `Platform` varchar(45) DEFAULT NULL,
  `Runtime_ms` varchar(45) DEFAULT NULL,
  `Throughput_ops_sec` varchar(45) DEFAULT NULL,
  `UPDATE_Operations` varchar(45) DEFAULT NULL,
  `UPDATE_Averagelatency_ms` varchar(45) DEFAULT NULL,
  `UPDATE_MinLatency_ms` varchar(45) DEFAULT NULL,
  `UPDATE_MaxLatency_ms` varchar(45) DEFAULT NULL,
  `UPDATE_95thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `UPDATE_99thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `READ_Operations` varchar(45) DEFAULT NULL,
  `READ_Averagelatency_ms` varchar(45) DEFAULT NULL,
  `READ_MinLatency_ms` varchar(45) DEFAULT NULL,
  `READ_MaxLatency_ms` varchar(45) DEFAULT NULL,
  `READ_95thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `READ_99thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `INSERT_Operations` varchar(45) DEFAULT NULL,
  `INSERT_Averagelatency_ms` varchar(45) DEFAULT NULL,
  `INSERT_MinLatency_ms` varchar(45) DEFAULT NULL,
  `INSERT_MaxLatency_ms` varchar(45) DEFAULT NULL,
  `INSERT_95thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `INSERT_99thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `SCAN_Operations` varchar(45) DEFAULT NULL,
  `SCAN_Averagelatency_ms` varchar(45) DEFAULT NULL,
  `SCAN_MinLatency_ms` varchar(45) DEFAULT NULL,
  `SCAN_MaxLatency_ms` varchar(45) DEFAULT NULL,
  `SCAN_95thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `SCAN_99thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `READ_MODIFY_WRITE_Operations` varchar(45) DEFAULT NULL,
  `READ_MODIFY_WRITE_Averagelatency_ms` varchar(45) DEFAULT NULL,
  `READ_MODIFY_WRITE_MinLatency_ms` varchar(45) DEFAULT NULL,
  `READ_MODIFY_WRITE_MaxLatency_ms` varchar(45) DEFAULT NULL,
  `READ_MODIFY_WRITE_95thPercentileLatency_ms` varchar(45) DEFAULT NULL,
  `READ_MODIFY_WRITE_99thPercentileLatency_ms` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dbstats`
--

DROP TABLE IF EXISTS `dbstats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dbstats` (
  `iddbstats` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date DEFAULT NULL,
  `LoadOVERALLRunTime` varchar(45) DEFAULT NULL,
  `LoadOVERALLThroughput` varchar(45) DEFAULT NULL,
  `LoadInsertOperations` varchar(45) DEFAULT NULL,
  `LoadInsertAverageLatency` varchar(45) DEFAULT NULL,
  `LoadInsertMinLatency` varchar(45) DEFAULT NULL,
  `LoadInsertMaxLatency` varchar(45) DEFAULT NULL,
  `LoadInsertPercentileLatency95th` varchar(45) DEFAULT NULL,
  `LoadInsertPercentileLatency99th` varchar(45) DEFAULT NULL,
  `LoadInsertReturn` varchar(45) DEFAULT NULL,
  `record_count` varchar(45) DEFAULT NULL,
  `db_type` varchar(45) DEFAULT NULL,
  `OverallRunTime` varchar(45) DEFAULT NULL,
  `OVERALLThroughput` varchar(45) DEFAULT NULL,
  `UPDATEOperations` varchar(45) DEFAULT NULL,
  `UPDATEAverageLatency` varchar(45) DEFAULT NULL,
  `UPDATEMinLatency` varchar(45) DEFAULT NULL,
  `UPDATEMaxLatency` varchar(45) DEFAULT NULL,
  `UPDATEPercentileLatency95th` varchar(45) DEFAULT NULL,
  `UPDATEPercentileLatency99th` varchar(45) DEFAULT NULL,
  `READOperations` varchar(45) DEFAULT NULL,
  `READAverageLatency` varchar(45) DEFAULT NULL,
  `READMinLatency` varchar(45) DEFAULT NULL,
  `READMaxLatency` varchar(45) DEFAULT NULL,
  `READPercentileLatency95th` varchar(45) DEFAULT NULL,
  `READPercentileLatency99th` varchar(45) DEFAULT NULL,
  `READReturn` varchar(45) DEFAULT NULL,
  `UPDATEReturn` varchar(45) DEFAULT NULL,
  `operation_count` varchar(45) DEFAULT NULL,
  `threads` varchar(45) DEFAULT NULL,
  `target` varchar(45) DEFAULT NULL,
  `vmtype` varchar(60) DEFAULT NULL,
  `workload` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`iddbstats`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dfsioparser_read`
--

DROP TABLE IF EXISTS `dfsioparser_read`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dfsioparser_read` (
  `iddfsioparser_read` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date NOT NULL,
  `nrFiles` varchar(45) DEFAULT NULL,
  `fileSize` varchar(45) DEFAULT NULL,
  `throughput` double DEFAULT NULL,
  `average_io` double DEFAULT NULL,
  `io_rate_std` double DEFAULT NULL,
  `test_exec_time` double DEFAULT NULL,
  `total_mb_processed` double DEFAULT NULL,
  PRIMARY KEY (`iddfsioparser_read`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dfsioparser_write`
--

DROP TABLE IF EXISTS `dfsioparser_write`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dfsioparser_write` (
  `iddfsioparser_write` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date NOT NULL,
  `nrFiles` varchar(45) DEFAULT NULL,
  `fileSize` varchar(45) DEFAULT NULL,
  `throughput` varchar(45) DEFAULT NULL,
  `average_io` varchar(45) DEFAULT NULL,
  `io_rate_std` varchar(45) DEFAULT NULL,
  `test_exec_time` varchar(45) DEFAULT NULL,
  `total_mb_processed` double DEFAULT NULL,
  PRIMARY KEY (`iddfsioparser_write`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mrparser`
--

DROP TABLE IF EXISTS `mrparser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mrparser` (
  `idmrbench` int(11) NOT NULL AUTO_INCREMENT,
  `maps` int(11) DEFAULT NULL,
  `reduces` int(11) DEFAULT NULL,
  `inputLines` int(11) DEFAULT NULL,
  `inputType` varchar(100) DEFAULT NULL,
  `DataLines` int(11) DEFAULT NULL,
  `maps_output` int(11) DEFAULT NULL,
  `Reduces_output` int(11) DEFAULT NULL,
  `AvgTime` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `vmtype` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`idmrbench`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `nnparser_delete`
--

DROP TABLE IF EXISTS `nnparser_delete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nnparser_delete` (
  `idnnparser_delete` int(11) NOT NULL AUTO_INCREMENT,
  `operation` varchar(45) DEFAULT NULL,
  `maps` int(11) DEFAULT NULL,
  `reduces` int(11) DEFAULT NULL,
  `blockSize` int(11) DEFAULT NULL,
  `bytesToWrite` int(11) DEFAULT NULL,
  `numberOfFiles` int(11) DEFAULT NULL,
  `bytesPerChecksum` int(11) DEFAULT NULL,
  `replicationFactorPerFile` int(11) DEFAULT NULL,
  `Successful_file_operations` int(11) NOT NULL,
  `exceptions` int(11) DEFAULT NULL,
  `tps_delete` int(11) DEFAULT NULL,
  `avg_exec_time_delete` double DEFAULT NULL,
  `avg_lat_delete` double DEFAULT NULL,
  `raw_data_tps_total_delete` double DEFAULT NULL,
  `raw_data_longetst_map_time` double DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`idnnparser_delete`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `nnparser_read`
--

DROP TABLE IF EXISTS `nnparser_read`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nnparser_read` (
  `idnnparser_read` int(11) NOT NULL AUTO_INCREMENT,
  `operation` varchar(45) DEFAULT NULL,
  `maps` int(11) DEFAULT NULL,
  `reduces` int(11) DEFAULT NULL,
  `blockSize` int(11) DEFAULT NULL,
  `bytesToWrite` int(11) DEFAULT NULL,
  `numberOfFiles` int(11) DEFAULT NULL,
  `bytesPerChecksum` int(11) DEFAULT NULL,
  `replicationFactorPerFile` int(11) DEFAULT NULL,
  `Successful_file_operations` int(11) NOT NULL,
  `exceptions` int(11) DEFAULT NULL,
  `tps_open_read` int(11) DEFAULT NULL,
  `avg_exec_time_open_read` double DEFAULT NULL,
  `avg_lat_open` double DEFAULT NULL,
  `raw_data_tps_total` double DEFAULT NULL,
  `raw_data_longetst_map_time` double DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`idnnparser_read`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `nnparser_write`
--

DROP TABLE IF EXISTS `nnparser_write`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nnparser_write` (
  `idnnparser_write` int(11) NOT NULL AUTO_INCREMENT,
  `operation` varchar(45) DEFAULT NULL,
  `maps` int(11) DEFAULT NULL,
  `reduces` int(11) DEFAULT NULL,
  `blockSize` int(11) DEFAULT NULL,
  `bytesToWrite` int(11) DEFAULT NULL,
  `numberOfFiles` int(11) DEFAULT NULL,
  `bytesPerChecksum` int(11) DEFAULT NULL,
  `replicationFactorPerFile` int(11) DEFAULT NULL,
  `Successful_file_operations` int(11) NOT NULL,
  `exceptions` int(11) DEFAULT NULL,
  `tps_open_create_write_close` int(11) DEFAULT NULL,
  `Avg_Exec_time` double DEFAULT NULL,
  `avg_lat_create_write` double DEFAULT NULL,
  `avg_lat_close` double DEFAULT NULL,
  `AL_Total_1` double DEFAULT NULL,
  `AL_Total_2` double DEFAULT NULL,
  `TPS_Total` double DEFAULT NULL,
  `Longest_Map_Time` double DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`idnnparser_write`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `teragenparser`
--

DROP TABLE IF EXISTS `teragenparser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teragenparser` (
  `idteragenparser` int(11) NOT NULL AUTO_INCREMENT,
  `teragen` int(11) DEFAULT NULL,
  `basesplits` int(11) DEFAULT NULL,
  `inputsplits` int(11) DEFAULT NULL,
  `computepartitions` int(11) DEFAULT NULL,
  `spentcomputepartitions` int(11) DEFAULT NULL,
  `computebasesplits` int(11) DEFAULT NULL,
  `computeteraschedulersplits` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `exectime_in` int(11) DEFAULT NULL,
  `exectime_out` int(11) DEFAULT NULL,
  `exectime_val` int(11) DEFAULT NULL,
  PRIMARY KEY (`idteragenparser`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `webserving`
--

DROP TABLE IF EXISTS `webserving`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `webserving` (
  `idwebserving` int(11) NOT NULL AUTO_INCREMENT,
  `seconds` int(11) DEFAULT NULL,
  `millisec` int(11) DEFAULT NULL,
  `microsec` int(11) DEFAULT NULL,
  `reqpersec` int(11) DEFAULT NULL,
  `kbpersec` int(11) DEFAULT NULL,
  `totalreq` int(11) DEFAULT NULL,
  `startedreq` int(11) DEFAULT NULL,
  `donereq` int(11) DEFAULT NULL,
  `succededreq` int(11) DEFAULT NULL,
  `failedreq` int(11) DEFAULT NULL,
  `erroredreq` int(11) DEFAULT NULL,
  `statuscodes2` int(11) DEFAULT NULL,
  `statuscodes3` int(11) DEFAULT NULL,
  `statuscodes4` int(11) DEFAULT NULL,
  `statuscodes5` int(11) DEFAULT NULL,
  `trafficdata` int(11) DEFAULT NULL,
  `traffichttp` int(11) DEFAULT NULL,
  `traffictotal` int(11) DEFAULT NULL,
  `webserver` varchar(100) DEFAULT NULL,
  `conc_req` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `threads` int(11) DEFAULT NULL,
  `vmtype` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`idwebserving`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-15 14:54:12
