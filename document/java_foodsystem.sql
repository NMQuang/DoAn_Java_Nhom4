-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: java_foodsystem
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `account_chinhanh`
--

DROP TABLE IF EXISTS `account_chinhanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account_chinhanh` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `ChiNhanh` int(11) NOT NULL,
  `Nhanvien` int(11) DEFAULT NULL,
  PRIMARY KEY (`Username`),
  KEY `FK_ac_nv_idx` (`Nhanvien`),
  KEY `Fk_acn_cn_idx` (`ChiNhanh`),
  CONSTRAINT `FK_ac_nv` FOREIGN KEY (`Nhanvien`) REFERENCES `nhanvien` (`NhanVienID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Fk_acn_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_chinhanh`
--

LOCK TABLES `account_chinhanh` WRITE;
/*!40000 ALTER TABLE `account_chinhanh` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_chinhanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_quanly`
--

DROP TABLE IF EXISTS `account_quanly`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account_quanly` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `NhanVien` int(11) DEFAULT NULL,
  PRIMARY KEY (`Username`),
  KEY `FK_ac_nv_idx` (`NhanVien`),
  CONSTRAINT `FK_acql_nv` FOREIGN KEY (`NhanVien`) REFERENCES `nhanvien` (`NhanVienID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_quanly`
--

LOCK TABLES `account_quanly` WRITE;
/*!40000 ALTER TABLE `account_quanly` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_quanly` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_tongdai`
--

DROP TABLE IF EXISTS `account_tongdai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account_tongdai` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `NhanVien` int(11) DEFAULT NULL,
  PRIMARY KEY (`Username`),
  KEY `FK_actd_nv_idx` (`NhanVien`),
  CONSTRAINT `FK_actd_nv` FOREIGN KEY (`NhanVien`) REFERENCES `nhanvien` (`NhanVienID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_tongdai`
--

LOCK TABLES `account_tongdai` WRITE;
/*!40000 ALTER TABLE `account_tongdai` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_tongdai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ban`
--

DROP TABLE IF EXISTS `ban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ban` (
  `BanID` int(11) NOT NULL AUTO_INCREMENT,
  `ChiNhanh` int(11) NOT NULL,
  `TenBan` varchar(50) NOT NULL,
  `TinhTrang` int(11) NOT NULL,
  PRIMARY KEY (`BanID`),
  KEY `fk_ban_cn_idx` (`ChiNhanh`),
  CONSTRAINT `fk_ban_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ban`
--

LOCK TABLES `ban` WRITE;
/*!40000 ALTER TABLE `ban` DISABLE KEYS */;
/*!40000 ALTER TABLE `ban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chinhanh`
--

DROP TABLE IF EXISTS `chinhanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chinhanh` (
  `ChiNhanhID` int(11) NOT NULL AUTO_INCREMENT,
  `Ten` varchar(50) NOT NULL,
  `DiaChi` varchar(50) NOT NULL,
  `DienThoai` varchar(50) NOT NULL,
  `TinhThanh` int(11) NOT NULL,
  PRIMARY KEY (`ChiNhanhID`),
  KEY `fk_cn_tt_idx` (`TinhThanh`),
  CONSTRAINT `fk_cn_tt` FOREIGN KEY (`TinhThanh`) REFERENCES `tinhthanh` (`TinhThanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chinhanh`
--

LOCK TABLES `chinhanh` WRITE;
/*!40000 ALTER TABLE `chinhanh` DISABLE KEYS */;
/*!40000 ALTER TABLE `chinhanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chinhanhmon`
--

DROP TABLE IF EXISTS `chinhanhmon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chinhanhmon` (
  `ChiNhanh` int(11) NOT NULL,
  `Mon` int(11) NOT NULL,
  `Gia` decimal(10,0) NOT NULL,
  PRIMARY KEY (`ChiNhanh`,`Mon`),
  KEY `fk_cnm_mon_idx` (`Mon`),
  CONSTRAINT `fk_cnm_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cnm_mon` FOREIGN KEY (`Mon`) REFERENCES `mon` (`MonID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chinhanhmon`
--

LOCK TABLES `chinhanhmon` WRITE;
/*!40000 ALTER TABLE `chinhanhmon` DISABLE KEYS */;
/*!40000 ALTER TABLE `chinhanhmon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chiphingay`
--

DROP TABLE IF EXISTS `chiphingay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chiphingay` (
  `ChiPhiNgayID` int(11) NOT NULL AUTO_INCREMENT,
  `Ten` varchar(255) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  `Ngay` date NOT NULL,
  `ChiNhanh` int(11) NOT NULL,
  PRIMARY KEY (`ChiPhiNgayID`),
  KEY `fk_cpn_cn_idx` (`ChiNhanh`),
  CONSTRAINT `fk_cpn_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chiphingay`
--

LOCK TABLES `chiphingay` WRITE;
/*!40000 ALTER TABLE `chiphingay` DISABLE KEYS */;
/*!40000 ALTER TABLE `chiphingay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitiethoadon`
--

DROP TABLE IF EXISTS `chitiethoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chitiethoadon` (
  `HoaDon` int(11) NOT NULL,
  `Mon` int(11) NOT NULL,
  `SoLuong` int(255) NOT NULL,
  `TongTien` decimal(10,0) NOT NULL,
  PRIMARY KEY (`HoaDon`,`Mon`),
  KEY `fk_cthd_mon_idx` (`Mon`),
  CONSTRAINT `fk_cthd_hd` FOREIGN KEY (`HoaDon`) REFERENCES `hoadon` (`HoaDonID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cthd_mon` FOREIGN KEY (`Mon`) REFERENCES `mon` (`MonID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitiethoadon`
--

LOCK TABLES `chitiethoadon` WRITE;
/*!40000 ALTER TABLE `chitiethoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `chitiethoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chucvu`
--

DROP TABLE IF EXISTS `chucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chucvu` (
  `ChucVuID` int(11) NOT NULL AUTO_INCREMENT,
  `Ten` varchar(255) NOT NULL,
  `MoTa` int(255) NOT NULL,
  PRIMARY KEY (`ChucVuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danhmuc`
--

DROP TABLE IF EXISTS `danhmuc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `danhmuc` (
  `DanhMucID` int(11) NOT NULL AUTO_INCREMENT,
  `Ten` varchar(50) NOT NULL,
  PRIMARY KEY (`DanhMucID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhmuc`
--

LOCK TABLES `danhmuc` WRITE;
/*!40000 ALTER TABLE `danhmuc` DISABLE KEYS */;
/*!40000 ALTER TABLE `danhmuc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hoadon` (
  `HoaDonID` int(11) NOT NULL AUTO_INCREMENT,
  `KhachHang` varchar(20) NOT NULL,
  `Ngay` datetime NOT NULL,
  `ChiNhanh` int(11) NOT NULL,
  `TongTien` decimal(10,0) NOT NULL,
  `TinhTrangThanhToan` int(11) NOT NULL,
  `HinhThucMua` varchar(50) NOT NULL,
  `TinhTrangGiaoHang` int(11) NOT NULL,
  `Ban` int(11) NOT NULL,
  `ThoiGianGiaoDuKien` datetime NOT NULL,
  `HinhThucThanhToan` varchar(50) NOT NULL,
  `NguoiGiaoHang` int(11) NOT NULL,
  `DiaChiGiao` varchar(450) DEFAULT NULL,
  `SDTNguoiNhan` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`HoaDonID`),
  KEY `fk_hd_cn_idx` (`ChiNhanh`),
  KEY `fk_hd_ban_idx` (`Ban`),
  KEY `fk_hd_nv_idx` (`NguoiGiaoHang`),
  KEY `fk_hd_kh_idx` (`KhachHang`),
  CONSTRAINT `fk_hd_ban` FOREIGN KEY (`Ban`) REFERENCES `ban` (`BanID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hd_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hd_kh` FOREIGN KEY (`KhachHang`) REFERENCES `khachhang` (`SDT`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hd_nv` FOREIGN KEY (`NguoiGiaoHang`) REFERENCES `nhanvien` (`NhanVienID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khachhang` (
  `SDT` varchar(20) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `CMND` varchar(11) NOT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `NgayTao` date DEFAULT NULL,
  PRIMARY KEY (`SDT`),
  UNIQUE KEY `SDT_UNIQUE` (`SDT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES ('2323','sfdsd','324234',NULL,NULL);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `luongchonhanvien`
--

DROP TABLE IF EXISTS `luongchonhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `luongchonhanvien` (
  `NhanVien` int(11) NOT NULL,
  `Thang` varchar(2) NOT NULL,
  `Nam` varchar(4) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  PRIMARY KEY (`NhanVien`,`Thang`,`Nam`),
  CONSTRAINT `fk_lcnv_nv` FOREIGN KEY (`NhanVien`) REFERENCES `nhanvien` (`NhanVienID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `luongchonhanvien`
--

LOCK TABLES `luongchonhanvien` WRITE;
/*!40000 ALTER TABLE `luongchonhanvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `luongchonhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mon`
--

DROP TABLE IF EXISTS `mon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mon` (
  `MonID` int(11) NOT NULL AUTO_INCREMENT,
  `DanhMuc` int(11) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `DonViTinh` varchar(10) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  `HinhAnh` varchar(255) NOT NULL,
  `SoLuongDaBan` int(255) NOT NULL,
  PRIMARY KEY (`MonID`),
  KEY `fk_mon_dm_idx` (`DanhMuc`),
  CONSTRAINT `fk_mon_dm` FOREIGN KEY (`DanhMuc`) REFERENCES `danhmuc` (`DanhMucID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mon`
--

LOCK TABLES `mon` WRITE;
/*!40000 ALTER TABLE `mon` DISABLE KEYS */;
/*!40000 ALTER TABLE `mon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `NewID` int(11) NOT NULL AUTO_INCREMENT,
  `ChuDe` varchar(255) NOT NULL,
  `NoiDung` text NOT NULL,
  `Ngay` date NOT NULL,
  PRIMARY KEY (`NewID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nhanvien` (
  `NhanVienID` int(11) NOT NULL AUTO_INCREMENT,
  `ChiNhanh` int(11) NOT NULL,
  `ChucVu` int(11) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` varchar(10) NOT NULL,
  `CMND` varchar(11) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `Luong` decimal(10,0) NOT NULL,
  PRIMARY KEY (`NhanVienID`),
  KEY `fk_nv_cv_idx` (`ChucVu`),
  KEY `fk_nv_cn_idx` (`ChiNhanh`),
  CONSTRAINT `fk_nv_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_nv_cv` FOREIGN KEY (`ChucVu`) REFERENCES `chucvu` (`ChucVuID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscriber`
--

DROP TABLE IF EXISTS `subscriber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscriber` (
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscriber`
--

LOCK TABLES `subscriber` WRITE;
/*!40000 ALTER TABLE `subscriber` DISABLE KEYS */;
/*!40000 ALTER TABLE `subscriber` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tienthuenha`
--

DROP TABLE IF EXISTS `tienthuenha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tienthuenha` (
  `Thang` varchar(2) NOT NULL,
  `Nam` varchar(4) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  `NgayChi` date NOT NULL,
  `ChiNhanh` int(11) NOT NULL,
  PRIMARY KEY (`Thang`,`Nam`),
  KEY `fk_ttn_cn_idx` (`ChiNhanh`),
  CONSTRAINT `fk_ttn_cn` FOREIGN KEY (`ChiNhanh`) REFERENCES `chinhanh` (`ChiNhanhID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tienthuenha`
--

LOCK TABLES `tienthuenha` WRITE;
/*!40000 ALTER TABLE `tienthuenha` DISABLE KEYS */;
/*!40000 ALTER TABLE `tienthuenha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tinhthanh`
--

DROP TABLE IF EXISTS `tinhthanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tinhthanh` (
  `TinhThanhID` int(11) NOT NULL AUTO_INCREMENT,
  `TenTinh` varchar(50) NOT NULL,
  PRIMARY KEY (`TinhThanhID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tinhthanh`
--

LOCK TABLES `tinhthanh` WRITE;
/*!40000 ALTER TABLE `tinhthanh` DISABLE KEYS */;
/*!40000 ALTER TABLE `tinhthanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trungtam`
--

DROP TABLE IF EXISTS `trungtam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trungtam` (
  `TrungTamID` int(11) NOT NULL AUTO_INCREMENT,
  `SoLuongTruyCap` bigint(20) NOT NULL,
  `Hotline` varchar(11) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  PRIMARY KEY (`TrungTamID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trungtam`
--

LOCK TABLES `trungtam` WRITE;
/*!40000 ALTER TABLE `trungtam` DISABLE KEYS */;
/*!40000 ALTER TABLE `trungtam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-06  2:08:14
