package foodGroup4.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="nhanvien")
public class NhanVien  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NhanVienID", unique = true)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ChiNhanhID", nullable = false)
	private ChiNhanh chiNhanh;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ChucVuID")
	private ChucVu chucVu;

	@Column(name = "Ten", length = 255)
	private String ten;

	@Column(name = "NgaySinh")
	private String ngaySinh;

	@Column(name = "GioiTinh", length = 10)
	private String gioiTinh;

	@Column(name = "CMND", length = 11)
	private String cmnd;

	@Column(name = "SDT", length = 11)
	private String sdt;

	@Column(name = "DiaChi", length = 255)
	private String diaChi;

	@Column(name = "Luong")
	private BigDecimal luong;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "nhanVien", cascade = CascadeType.ALL)
	private LuongChoNhanVien luongChoNhanVien;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "nguoiGiaoHang", cascade = CascadeType.ALL)
	private HoaDon hoaDon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ChiNhanh getChiNhanh() {
		return chiNhanh;
	}

	public void setChiNhanh(ChiNhanh chiNhanh) {
		this.chiNhanh = chiNhanh;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public BigDecimal getLuong() {
		return luong;
	}

	public void setLuong(BigDecimal luong) {
		this.luong = luong;
	}

	public LuongChoNhanVien getLuongChoNhanVien() {
		return luongChoNhanVien;
	}

	public void setLuongChoNhanVien(LuongChoNhanVien luongChoNhanVien) {
		this.luongChoNhanVien = luongChoNhanVien;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
