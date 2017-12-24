package foodGroup4.service;

import foodGroup4.common.state.HinhThucMua;
import foodGroup4.common.state.HinhThucThanhToan;
import foodGroup4.common.state.TinhTrangGiaoHang;
import foodGroup4.common.state.TinhTrangThanhToan;
import foodGroup4.dao.HoadonDAO;
import foodGroup4.dto.CartInfoDto;
import foodGroup4.dto.FoodInfoDto;
import foodGroup4.dto.InfoOrderDto;
import foodGroup4.entity.Chitiethoadon;
import foodGroup4.entity.Hoadon;
import foodGroup4.entity.Khachhang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Transactional
public class HoadonServiceImp implements HoadonService {

    @Autowired
    HoadonDAO hoadonDAO;

    @Override
    public void create(Khachhang khachhang, CartInfoDto cartInfoDto, InfoOrderDto infoOrderDto) {
        Hoadon hoadon = new Hoadon();
        hoadon.setTongTien(0);
        hoadon.setTinhTrangThanhToan(TinhTrangThanhToan.CHUA_THANH_TOAN);
        hoadon.setHinhThucMua(HinhThucMua.ONLINE);
        hoadon.setTinhTrangGiaoHang(TinhTrangGiaoHang.DANG_XU_LY);
        hoadon.setHinhThucThanhToan(HinhThucThanhToan.TIEN_MAT_KHI_NHAN_HANG);

        if(infoOrderDto.getUseNewInfo()) {
            hoadon.setDiaChiGiao(infoOrderDto.getNewDiaChi());
            hoadon.setSdtNguoiNhan(infoOrderDto.getNewSdt());
            hoadon.setHoTenNguoiNhan(infoOrderDto.getNewTen());
        } else {
            hoadon.setDiaChiGiao(khachhang.getDiaChi());
            hoadon.setSdtNguoiNhan(khachhang.getSdt());
            hoadon.setHoTenNguoiNhan(khachhang.getTen());
        }

        hoadon.setKhachhang(khachhang);
        hoadon.setChinhanh(cartInfoDto.getChinhanh());

        Set<Chitiethoadon> chitiethoadons = new HashSet<>();

        for(FoodInfoDto foodInfoDto: cartInfoDto.getFoodInfoDtos()) {
            if(foodInfoDto.getPrice() < 0)
                continue;
            Chitiethoadon chitiethoadon = new Chitiethoadon();
            chitiethoadon.setHoadon(hoadon);
            chitiethoadon.setMon(foodInfoDto.getMon());
            chitiethoadon.setSoLuong(foodInfoDto.getQuantity());
            chitiethoadon.setTongTien(foodInfoDto.getTotalPrice());

            chitiethoadons.add(chitiethoadon);

            hoadon.setTongTien(hoadon.getTongTien() + chitiethoadon.getTongTien());
        }
        hoadon.setChitiethoadons(chitiethoadons);

        hoadonDAO.create(hoadon);
    }

    @Override
    public List<Hoadon> getHoaDonBySdtKhachHang(String sdt) {
        return hoadonDAO.getHoaDonBySdtKhachHang(sdt);
    }

    @Override
    @Transactional
    public Hoadon findById(int id) {
        return hoadonDAO.findByid(id);
    }
}














