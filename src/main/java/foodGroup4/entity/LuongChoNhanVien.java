package foodGroup4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="luongchonhanvien")
public class LuongChoNhanVien implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NhanVienID")
	private NhanVien nhanVien;

	@Column(name = "Thang", length = 2)
	private String thang;

	@Column(name = "Nam", length = 4)
	private String nam;

	@Column(name = "NgayChi")
	private String ngayChi;

	@Column(name = "Ten", length = 255)
	private String ten;

	@Column(name = "MoTa", length = 255)
	private String moTa;

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public String getThang() {
		return thang;
	}

	public void setThang(String thang) {
		this.thang = thang;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getNgayChi() {
		return ngayChi;
	}

	public void setNgayChi(String ngayChi) {
		this.ngayChi = ngayChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
