package foodGroup4.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="hoadon")
public class HoaDon  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HoaDonID", unique = true)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="KhachHangID", nullable = false)
	private KhachHang khachHang;

	@Column(name = "Ngay")
	private String ngay;

	@Column(name = "TongTien")
	private BigDecimal tongTien;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ChiNhanhID", nullable = false)
	private ChiNhanh chiNhanh;

	@Column(name = "TinhTrangThanhToan")
	private int tinhTrangThanhToan;

	@Column(name = "HinhThucMua", length = 50)
	private String hinhThucMua;

	@Column(name = "TinhTrangGiaoHang")
	private int tinhTrangGiaoHang;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BanID")
	private Ban ban;

	@Column(name = "ThoiGianGiaoDuKien")
	private String thoiGianGiaoDuKien;

	@Column(name = "HinhThucThanhToan", length = 50)
	private String hinhThucThanhToan;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NguoiGiaoHang")
	private NhanVien nguoiGiaoHang;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "chitiethoadon", joinColumns = {
			@JoinColumn(name = "HoaDonID", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "MonID",
					nullable = false, updatable = false) })
	private Set<Mon> mon = new HashSet<Mon>(0);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public BigDecimal getTongTien() {
		return tongTien;
	}

	public void setTongTien(BigDecimal tongTien) {
		this.tongTien = tongTien;
	}

	public ChiNhanh getChiNhanh() {
		return chiNhanh;
	}

	public void setChiNhanh(ChiNhanh chiNhanh) {
		this.chiNhanh = chiNhanh;
	}

	public int getTinhTrangThanhToan() {
		return tinhTrangThanhToan;
	}

	public void setTinhTrangThanhToan(int tinhTrangThanhToan) {
		this.tinhTrangThanhToan = tinhTrangThanhToan;
	}

	public String getHinhThucMua() {
		return hinhThucMua;
	}

	public void setHinhThucMua(String hinhThucMua) {
		this.hinhThucMua = hinhThucMua;
	}

	public int getTinhTrangGiaoHang() {
		return tinhTrangGiaoHang;
	}

	public void setTinhTrangGiaoHang(int tinhTrangGiaoHang) {
		this.tinhTrangGiaoHang = tinhTrangGiaoHang;
	}

	public Ban getBan() {
		return ban;
	}

	public void setBan(Ban ban) {
		this.ban = ban;
	}

	public String getThoiGianGiaoDuKien() {
		return thoiGianGiaoDuKien;
	}

	public void setThoiGianGiaoDuKien(String thoiGianGiaoDuKien) {
		this.thoiGianGiaoDuKien = thoiGianGiaoDuKien;
	}

	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public NhanVien getNguoiGiaoHang() {
		return nguoiGiaoHang;
	}

	public void setNguoiGiaoHang(NhanVien nguoiGiaoHang) {
		this.nguoiGiaoHang = nguoiGiaoHang;
	}

	public Set<Mon> getMon() {
		return mon;
	}

	public void setMon(Set<Mon> mon) {
		this.mon = mon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
