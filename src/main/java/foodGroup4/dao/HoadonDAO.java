package foodGroup4.dao;

import foodGroup4.entity.Hoadon;

import java.util.List;

public interface HoadonDAO {
    void create(Hoadon hoadon);

    List<Hoadon> getHoaDonBySdtKhachHang(String sdt);
}
