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
@Table(name ="danhmuc")
public class DanhMuc  implements Serializable {

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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "danhMuc")
	private Set<Mon> mon = new HashSet<Mon>(0);

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
