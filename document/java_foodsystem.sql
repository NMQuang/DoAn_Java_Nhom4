-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2017 at 10:34 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_foodsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `account_chinhanh`
--

CREATE TABLE `account_chinhanh` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `CMND` varchar(11) NOT NULL,
  `GioiTinh` varchar(10) NOT NULL,
  `ChiNhanhID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `account_quanly`
--

CREATE TABLE `account_quanly` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `CMND` varchar(11) NOT NULL,
  `GioiTinh` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `account_tongdai`
--

CREATE TABLE `account_tongdai` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `CMND` varchar(11) NOT NULL,
  `GioiTinh` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ban`
--

CREATE TABLE `ban` (
  `BanID` int(11) NOT NULL,
  `ChiNhanhID` int(11) NOT NULL,
  `TenBan` varchar(50) NOT NULL,
  `TinhTrang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chinhanh`
--

CREATE TABLE `chinhanh` (
  `ChiNhanhID` int(11) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `DiaChi` varchar(50) NOT NULL,
  `DienThoai` varchar(50) NOT NULL,
  `TinhThanhID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chinhanhmon`
--

CREATE TABLE `chinhanhmon` (
  `ChiNhanhID` int(11) NOT NULL,
  `MonID` int(11) NOT NULL,
  `Gia` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chiphingay`
--

CREATE TABLE `chiphingay` (
  `ChiPhiNgayID` int(11) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  `Ngay` date NOT NULL,
  `ChiNhanhID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `HoaDonID` int(11) NOT NULL,
  `MonID` int(11) NOT NULL,
  `SoLuong` int(255) NOT NULL,
  `TongTien` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `ChucVuID` int(11) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `MoTa` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `danhmuc`
--

CREATE TABLE `danhmuc` (
  `DanhMucID` int(11) NOT NULL,
  `Ten` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `HoaDonID` int(11) NOT NULL,
  `KhachHangID` int(11) NOT NULL,
  `Ngay` datetime NOT NULL,
  `ChiNhanhID` int(11) NOT NULL,
  `TongTien` decimal(10,0) NOT NULL,
  `TinhTrangThanhToan` int(11) NOT NULL,
  `HinhThucMua` varchar(50) NOT NULL,
  `TinhTrangGiaoHang` int(11) NOT NULL,
  `BanID` int(11) NOT NULL,
  `ThoiGianGiaoDuKien` datetime NOT NULL,
  `HinhThucThanhToan` varchar(50) NOT NULL,
  `NguoiGiaoHang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `KhachHangID` int(11) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `CMND` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `luongchonhanvien`
--

CREATE TABLE `luongchonhanvien` (
  `NhanVienID` int(11) NOT NULL,
  `Thang` varchar(2) NOT NULL,
  `Nam` varchar(4) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `MoTa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `mon`
--

CREATE TABLE `mon` (
  `MonID` int(11) NOT NULL,
  `DanhMucID` int(11) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `DonViTinh` varchar(10) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  `HinhAnh` varchar(255) NOT NULL,
  `SoLuongDaBan` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `NewID` int(11) NOT NULL,
  `ChuDe` varchar(255) NOT NULL,
  `NoiDung` text NOT NULL,
  `Ngay` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `NhanVienID` int(11) NOT NULL,
  `ChiNhanhID` int(11) NOT NULL,
  `ChucVuID` int(11) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` varchar(10) NOT NULL,
  `CMND` varchar(11) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `Luong` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `subscriber`
--

CREATE TABLE `subscriber` (
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tienthuenha`
--

CREATE TABLE `tienthuenha` (
  `Thang` varchar(2) NOT NULL,
  `Nam` varchar(4) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `MoTa` varchar(255) NOT NULL,
  `NgayChi` date NOT NULL,
  `ChiNhanhID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tinhthanh`
--

CREATE TABLE `tinhthanh` (
  `TinhThanhID` int(11) NOT NULL,
  `TenTinh` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `trungtam`
--

CREATE TABLE `trungtam` (
  `TrungTamID` int(11) NOT NULL,
  `SoLuongTruyCap` bigint(20) NOT NULL,
  `Hotline` varchar(11) NOT NULL,
  `Ten` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account_chinhanh`
--
ALTER TABLE `account_chinhanh`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `account_quanly`
--
ALTER TABLE `account_quanly`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `account_tongdai`
--
ALTER TABLE `account_tongdai`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `ban`
--
ALTER TABLE `ban`
  ADD PRIMARY KEY (`BanID`);

--
-- Indexes for table `chinhanh`
--
ALTER TABLE `chinhanh`
  ADD PRIMARY KEY (`ChiNhanhID`);

--
-- Indexes for table `chinhanhmon`
--
ALTER TABLE `chinhanhmon`
  ADD PRIMARY KEY (`ChiNhanhID`,`MonID`);

--
-- Indexes for table `chiphingay`
--
ALTER TABLE `chiphingay`
  ADD PRIMARY KEY (`ChiPhiNgayID`);

--
-- Indexes for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`HoaDonID`,`MonID`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`ChucVuID`);

--
-- Indexes for table `danhmuc`
--
ALTER TABLE `danhmuc`
  ADD PRIMARY KEY (`DanhMucID`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`HoaDonID`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`KhachHangID`);

--
-- Indexes for table `luongchonhanvien`
--
ALTER TABLE `luongchonhanvien`
  ADD PRIMARY KEY (`NhanVienID`,`Thang`,`Nam`);

--
-- Indexes for table `mon`
--
ALTER TABLE `mon`
  ADD PRIMARY KEY (`MonID`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`NewID`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`NhanVienID`);

--
-- Indexes for table `subscriber`
--
ALTER TABLE `subscriber`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `tienthuenha`
--
ALTER TABLE `tienthuenha`
  ADD PRIMARY KEY (`Thang`,`Nam`);

--
-- Indexes for table `tinhthanh`
--
ALTER TABLE `tinhthanh`
  ADD PRIMARY KEY (`TinhThanhID`);

--
-- Indexes for table `trungtam`
--
ALTER TABLE `trungtam`
  ADD PRIMARY KEY (`TrungTamID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ban`
--
ALTER TABLE `ban`
  MODIFY `BanID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `chinhanh`
--
ALTER TABLE `chinhanh`
  MODIFY `ChiNhanhID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `chiphingay`
--
ALTER TABLE `chiphingay`
  MODIFY `ChiPhiNgayID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `ChucVuID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `danhmuc`
--
ALTER TABLE `danhmuc`
  MODIFY `DanhMucID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `HoaDonID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `KhachHangID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `mon`
--
ALTER TABLE `mon`
  MODIFY `MonID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `NewID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `NhanVienID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tinhthanh`
--
ALTER TABLE `tinhthanh`
  MODIFY `TinhThanhID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `trungtam`
--
ALTER TABLE `trungtam`
  MODIFY `TrungTamID` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
