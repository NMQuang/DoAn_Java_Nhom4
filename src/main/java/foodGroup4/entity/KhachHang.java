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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="khachhang")
public class KhachHang  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "KhachHangID", unique = true)
	private int id;

	@Column(name = "Ten", length = 50)
	private String ten;

	@Column(name = "SDT", length = 11)
	private String sdt;

	@Column(name = "CMND", length = 11)
	private String cmnd;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachHang")
	private Set<HoaDon> hoaDon = new HashSet<HoaDon>(0);

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
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public Set<HoaDon> getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(Set<HoaDon> hoaDon) {
		this.hoaDon = hoaDon;
	}


}
