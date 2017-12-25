package foodGroup4.service;

import foodGroup4.dto.CartInfoDto;
import foodGroup4.dto.InfoOrderDto;
import foodGroup4.entity.Hoadon;
import foodGroup4.entity.Khachhang;

import java.util.List;

public interface HoadonService {
    void create(Khachhang khachhang, CartInfoDto cartInfoDto, InfoOrderDto infoOrderDto);
    List<Hoadon> getHoaDonBySdtKhachHang(String sdt);

    Hoadon findById(int id);

    void deleteHoadonById(int id);
}
