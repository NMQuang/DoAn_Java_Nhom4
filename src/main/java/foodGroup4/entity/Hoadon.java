package foodGroup4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "hoadon", schema = "java_foodsystem")
public class Hoadon {
    private int hoaDonId;
    private Timestamp ngay;
    private Timestamp ngayTraTien;
    private int tongTien;
    private int tinhTrangThanhToan;
    private String hinhThucMua;
    private int tinhTrangGiaoHang;
    private Timestamp thoiGianGiaoDuKien;
    private String hinhThucThanhToan;
    private String diaChiGiao;
    private String sdtNguoiNhan;
    private String hoTenNguoiNhan;
    private Set<Chitiethoadon> chitiethoadons;
    private Khachhang khachhang;
    private Chinhanh chinhanh;
    private Ban ban;
    private Nhanvien nhanvien;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HoaDonID")
    public int getHoaDonId() {
        return hoaDonId;
    }

    public void setHoaDonId(int hoaDonId) {
        this.hoaDonId = hoaDonId;
    }

    @Basic
    @Column(name = "Ngay")
    @CreationTimestamp
    public Timestamp getNgay() {
        return ngay;
    }

    public void setNgay(Timestamp ngay) {
        this.ngay = ngay;
    }

    @Basic
    @Column(name = "NgayTraTien")
    public Timestamp getNgayTraTien() { return this.ngayTraTien; }

    public void setNgayTraTien(Timestamp ngayTraTien) { this.ngayTraTien = ngayTraTien; }

    @Basic
    @Column(name = "TongTien")
    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Basic
    @Column(name = "TinhTrangThanhToan")
    public int getTinhTrangThanhToan() {
        return tinhTrangThanhToan;
    }

    public void setTinhTrangThanhToan(int tinhTrangThanhToan) {
        this.tinhTrangThanhToan = tinhTrangThanhToan;
    }

    @Basic
    @Column(name = "HinhThucMua")
    public String getHinhThucMua() {
        return hinhThucMua;
    }

    public void setHinhThucMua(String hinhThucMua) {
        this.hinhThucMua = hinhThucMua;
    }

    @Basic
    @Column(name = "TinhTrangGiaoHang")
    public int getTinhTrangGiaoHang() {
        return tinhTrangGiaoHang;
    }

    public void setTinhTrangGiaoHang(int tinhTrangGiaoHang) {
        this.tinhTrangGiaoHang = tinhTrangGiaoHang;
    }

    @Basic
    @Column(name = "ThoiGianGiaoDuKien")
    public Timestamp getThoiGianGiaoDuKien() {
        return thoiGianGiaoDuKien;
    }

    public void setThoiGianGiaoDuKien(Timestamp thoiGianGiaoDuKien) {
        this.thoiGianGiaoDuKien = thoiGianGiaoDuKien;
    }

    @Basic
    @Column(name = "HinhThucThanhToan")
    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    @Basic
    @Column(name = "DiaChiGiao")
    public String getDiaChiGiao() {
        return diaChiGiao;
    }

    public void setDiaChiGiao(String diaChiGiao) {
        this.diaChiGiao = diaChiGiao;
    }

    @Basic
    @Column(name = "SDTNguoiNhan")
    public String getSdtNguoiNhan() {
        return sdtNguoiNhan;
    }

    public void setSdtNguoiNhan(String sdtNguoiNhan) {
        this.sdtNguoiNhan = sdtNguoiNhan;
    }

    @Basic
    @Column(name = "HoTenNguoiNhan")
    public String getHoTenNguoiNhan() { return this.hoTenNguoiNhan; }

    public void setHoTenNguoiNhan(String hoTenNguoiNhan) { this.hoTenNguoiNhan = hoTenNguoiNhan; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hoadon hoadon = (Hoadon) o;

        if (hoaDonId != hoadon.hoaDonId) return false;
        if (tongTien != hoadon.tongTien) return false;
        if (tinhTrangThanhToan != hoadon.tinhTrangThanhToan) return false;
        if (tinhTrangGiaoHang != hoadon.tinhTrangGiaoHang) return false;
        if (ngay != null ? !ngay.equals(hoadon.ngay) : hoadon.ngay != null) return false;
        if (hinhThucMua != null ? !hinhThucMua.equals(hoadon.hinhThucMua) : hoadon.hinhThucMua != null) return false;
        if (thoiGianGiaoDuKien != null ? !thoiGianGiaoDuKien.equals(hoadon.thoiGianGiaoDuKien) : hoadon.thoiGianGiaoDuKien != null)
            return false;
        if (hinhThucThanhToan != null ? !hinhThucThanhToan.equals(hoadon.hinhThucThanhToan) : hoadon.hinhThucThanhToan != null)
            return false;
        if (diaChiGiao != null ? !diaChiGiao.equals(hoadon.diaChiGiao) : hoadon.diaChiGiao != null) return false;
        if (sdtNguoiNhan != null ? !sdtNguoiNhan.equals(hoadon.sdtNguoiNhan) : hoadon.sdtNguoiNhan != null)
            return false;
        if (hoTenNguoiNhan != null ? !hoTenNguoiNhan.equals(hoadon.hoTenNguoiNhan) : hoadon.hoTenNguoiNhan != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hoaDonId;
        result = 31 * result + (ngay != null ? ngay.hashCode() : 0);
        result = 31 * result + tongTien;
        result = 31 * result + tinhTrangThanhToan;
        result = 31 * result + (hinhThucMua != null ? hinhThucMua.hashCode() : 0);
        result = 31 * result + tinhTrangGiaoHang;
        result = 31 * result + (thoiGianGiaoDuKien != null ? thoiGianGiaoDuKien.hashCode() : 0);
        result = 31 * result + (hinhThucThanhToan != null ? hinhThucThanhToan.hashCode() : 0);
        result = 31 * result + (diaChiGiao != null ? diaChiGiao.hashCode() : 0);
        result = 31 * result + (sdtNguoiNhan != null ? sdtNguoiNhan.hashCode() : 0);
        result = 31 * result + (hoTenNguoiNhan != null ? hoTenNguoiNhan.hashCode() : 0);

        return result;
    }

    @OneToMany(mappedBy = "pk.hoadon", orphanRemoval=true)
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    public Set<Chitiethoadon> getChitiethoadons() {
        return chitiethoadons;
    }

    public void setChitiethoadons(Set<Chitiethoadon> chitiethoadons) {
        this.chitiethoadons = chitiethoadons;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "KhachHang", referencedColumnName = "SDT", nullable = true)
    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ChiNhanh", referencedColumnName = "ChiNhanhID", nullable = false)
    public Chinhanh getChinhanh() {
        return chinhanh;
    }

    public void setChinhanh(Chinhanh chinhanh) {
        this.chinhanh = chinhanh;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Ban", referencedColumnName = "BanID", nullable = true)
    public Ban getBan() {
        return ban;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "NguoiGiaoHang", referencedColumnName = "NhanVienID", nullable = true)
    public Nhanvien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }
}
