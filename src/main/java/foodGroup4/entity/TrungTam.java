package foodGroup4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="trungtam")
public class TrungTam implements Serializable  {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TrungTamID", unique = true)
	private int id;

	@Column(name = "SoLuongTruyCap")
	private long soLuongTruyCap;

	@Column(name = "Hotline", length = 11)
	private String hotline;

	@Column(name = "Ten", length = 255)
	private String ten;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSoLuongTruyCap() {
		return soLuongTruyCap;
	}

	public void setSoLuongTruyCap(long soLuongTruyCap) {
		this.soLuongTruyCap = soLuongTruyCap;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
