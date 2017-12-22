package foodGroup4.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "khachhang", schema = "java_foodsystem")
public class Khachhang {
    private String sdt;
    private String ten;
    private String cmnd;
    private String password;
    private String rePassword;
    private Date ngayTao;
    private String diaChi;
    private Boolean gioiTinh;
    private Set<Hoadon> hoadons;

    @Id
    @Column(name = "SDT")
    @NotNull
    @Size(min = 10, max = 11)
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "Ten")
    @NotNull
    @Size(min = 5, max = 50)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "CMND")
    @NotNull
    @Size(min = 11, max = 11)
    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Basic
    @Column(name = "Password")
    @NotNull
    @Size(min = 5, max = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Password")
    @NotNull
    @Size(min = 5, max = 45)
    @Transient
    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String repPassword) {
        this.rePassword = repPassword;
    }

    @Basic
    @Column(name = "NgayTao")
    @NotNull
    @CreationTimestamp
    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Basic
    @Column(name = "GioiTinh")
    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column
    @NotNull
    @Size(min = 5, max = 100)
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Khachhang khachhang = (Khachhang) o;

        if (sdt != null ? !sdt.equals(khachhang.sdt) : khachhang.sdt != null) return false;
        if (ten != null ? !ten.equals(khachhang.ten) : khachhang.ten != null) return false;
        if (cmnd != null ? !cmnd.equals(khachhang.cmnd) : khachhang.cmnd != null) return false;
        if (password != null ? !password.equals(khachhang.password) : khachhang.password != null) return false;
        if (ngayTao != null ? !ngayTao.equals(khachhang.ngayTao) : khachhang.ngayTao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sdt != null ? sdt.hashCode() : 0;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (cmnd != null ? cmnd.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "khachhang")
    public Set<Hoadon> getHoadons() {
        return hoadons;
    }

    public void setHoadons(Set<Hoadon> hoadons) {
        this.hoadons = hoadons;
    }

    @Transient
    public List<String> getRoles() {
        List<String> roles = new ArrayList<>();
        roles.add("KHACH_HANG");

        return roles;
    }
}
