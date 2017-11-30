package foodGroup4.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name ="account_chinhanh")
public class AccountChiNhanh implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Username", unique = true, length = 20)
	private String username;

	@Column(name = "Password", length = 255)
	private String password;

	@Column(name = "Ten",  length = 255)
	private String ten;

	@Column(name = "CMND", length = 11)
	private String cmnd;

	@Column(name = "GioiTinh", length = 10)
	private String gioiTinh;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ChiNhanhID", nullable = false)
	private ChiNhanh chiNhanh;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public ChiNhanh getChiNhanh() {
		return chiNhanh;
	}
	public void setChiNhanh(ChiNhanh chiNhanh) {
		this.chiNhanh = chiNhanh;
	}


}
