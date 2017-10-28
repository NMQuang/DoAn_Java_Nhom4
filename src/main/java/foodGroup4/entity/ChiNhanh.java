package foodGroup4.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="chinhanh")
public class ChiNhanh  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DanhMucID", unique = true)
	private int id;

	@Column(name = "Ten", length = 255)
	private String ten;

	@Column(name = "DiaChi", length = 255)
	private String diaChi;

	@Column(name = "DienThoai", length = 11)
	private String dienThoai;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TinhThanhID")
	private TinhThanh tinhThanh;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chiNhanh")
	private Set<AccountChiNhanh> accountChiNhanh = new HashSet<AccountChiNhanh>(0);

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "chiNhanh", cascade = CascadeType.ALL)
	private TienThueNha tienThueNha ;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "chiNhanh", cascade = CascadeType.ALL)
	private ChiPhiNgay chiPhiNgay ;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chiNhanh")
	private Set<NhanVien> nhanVien = new HashSet<NhanVien>(0);

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "chinhanhmon", joinColumns = {
			@JoinColumn(name = "ChiNhanhID", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "MonID",
					nullable = false, updatable = false) })
	private Set<Mon> mon = new HashSet<Mon>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chiNhanh")
	private Set<HoaDon> hoaDon = new HashSet<HoaDon>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chiNhanh")
	private Set<Ban> ban = new HashSet<Ban>(0);

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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public TinhThanh getTinhThanh() {
		return tinhThanh;
	}

	public void setTinhThanh(TinhThanh tinhThanh) {
		this.tinhThanh = tinhThanh;
	}

	public Set<AccountChiNhanh> getAccountChiNhanh() {
		return accountChiNhanh;
	}

	public void setAccountChiNhanh(Set<AccountChiNhanh> accountChiNhanh) {
		this.accountChiNhanh = accountChiNhanh;
	}

	public TienThueNha getTienThueNha() {
		return tienThueNha;
	}

	public void setTienThueNha(TienThueNha tienThueNha) {
		this.tienThueNha = tienThueNha;
	}

	public ChiPhiNgay getChiPhiNgay() {
		return chiPhiNgay;
	}

	public void setChiPhiNgay(ChiPhiNgay chiPhiNgay) {
		this.chiPhiNgay = chiPhiNgay;
	}

	public Set<NhanVien> getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(Set<NhanVien> nhanVien) {
		this.nhanVien = nhanVien;
	}

	public Set<Mon> getMon() {
		return mon;
	}

	public void setMon(Set<Mon> mon) {
		this.mon = mon;
	}

	public Set<HoaDon> getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(Set<HoaDon> hoaDon) {
		this.hoaDon = hoaDon;
	}

	public Set<Ban> getBan() {
		return ban;
	}

	public void setBan(Set<Ban> ban) {
		this.ban = ban;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
