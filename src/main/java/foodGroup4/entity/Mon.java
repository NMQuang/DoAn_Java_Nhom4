package foodGroup4.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="mon")
public class Mon  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MonID", unique = true)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="DanhMucID", nullable = false)
	private DanhMuc danhMuc;

	@Column(name = "Ten", length = 255)
	private String ten;

	@Column(name = "DonViTinh", length = 10)
	private String donViTinh;

	@Column(name = "MoTa", length = 255)
	private String moTa;

	@Column(name = "HinhAnh", length = 255)
	private String hinhAnh;

	@Column(name = "SoLuongDaBan")
	private int soLuongDaBan;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "mon")
	private Set<HoaDon> hoaDon = new HashSet<HoaDon>(0);

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "mon")
	private Set<ChiNhanh> chiNhanh = new HashSet<ChiNhanh>(0);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public int getSoLuongDaBan() {
		return soLuongDaBan;
	}

	public void setSoLuongDaBan(int soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}

	public Set<HoaDon> getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(Set<HoaDon> hoaDon) {
		this.hoaDon = hoaDon;
	}

	public Set<ChiNhanh> getChiNhanh() {
		return chiNhanh;
	}

	public void setChiNhanh(Set<ChiNhanh> chiNhanh) {
		this.chiNhanh = chiNhanh;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
