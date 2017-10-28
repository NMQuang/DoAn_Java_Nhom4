package foodGroup4.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="chucvu")
public class ChucVu implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ChucVuID", unique = true)
	private int id;

	@Column(name = "Ten", length = 255)
	private String ten;

	@Column(name = "MoTa", length = 255)
	private String moTa;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "chucVu", cascade = CascadeType.ALL)
	private NhanVien luongChoNhanVien;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public NhanVien getLuongChoNhanVien() {
		return luongChoNhanVien;
	}

	public void setLuongChoNhanVien(NhanVien luongChoNhanVien) {
		this.luongChoNhanVien = luongChoNhanVien;
	}


}
