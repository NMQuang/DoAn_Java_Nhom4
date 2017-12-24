package foodGroup4.dto;

import foodGroup4.common.state.TinhTrangGiaoHang;
import foodGroup4.entity.Hoadon;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class HoadonDto {
    private int maHd;
    private Timestamp ngayTao;
    private String tinhTrangGiaoHang;

    public static List<HoadonDto> convertListHoaDonToHoaDonDto(List<Hoadon> hoadonList) {
        List<HoadonDto> hoadonDtos = new ArrayList<>();
        for(Hoadon hoadon: hoadonList) {
            HoadonDto hoadonDto = new HoadonDto();
            hoadonDto.setMaHd(hoadon.getHoaDonId());
            hoadonDto.setNgayTao(hoadon.getNgay());
            hoadonDto.setTinhTrangGiaoHang(TinhTrangGiaoHang.codeToString(hoadon.getTinhTrangGiaoHang()));

            hoadonDtos.add(hoadonDto);
        }
        return hoadonDtos;
    }

    public int getMaHd() {
        return maHd;
    }

    public void setMaHd(int maHd) {
        this.maHd = maHd;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTinhTrangGiaoHang() {
        return tinhTrangGiaoHang;
    }

    public void setTinhTrangGiaoHang(String tinhTrang) {
        this.tinhTrangGiaoHang = tinhTrang;
    }
}
