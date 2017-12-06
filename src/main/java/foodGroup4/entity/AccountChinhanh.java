package foodGroup4.entity;

import javax.persistence.*;

@Entity
@Table(name = "account_chinhanh", schema = "java_foodsystem", catalog = "")
public class AccountChinhanh {
    private String username;
    private String password;
    private Chinhanh chinhanh;
    private Nhanvien nhanvien;

    @Id
    @Column(name = "Username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountChinhanh that = (AccountChinhanh) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ChiNhanh", referencedColumnName = "ChiNhanhID", nullable = false)
    public Chinhanh getChinhanh() {
        return chinhanh;
    }

    public void setChinhanh(Chinhanh chinhanh) {
        this.chinhanh = chinhanh;
    }

    @ManyToOne
    @JoinColumn(name = "Nhanvien", referencedColumnName = "NhanVienID")
    public Nhanvien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }
}
