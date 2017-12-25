package foodGroup4.dto;

import foodGroup4.entity.Khachhang;

public class KhachhangDto {
    private String sdt;
    private String ten;
    private boolean gioiTinh;
    private String diaChi;

    public KhachhangDto() {
    }

    public KhachhangDto(Khachhang khachhang) {
        this.sdt = khachhang.getSdt();
        this.ten = khachhang.getTen();
        this.gioiTinh = khachhang.getGioiTinh();
        this.diaChi = khachhang.getDiaChi();
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
