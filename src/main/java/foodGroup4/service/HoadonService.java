package foodGroup4.service;

import foodGroup4.dto.CartInfoDto;
import foodGroup4.dto.InfoOrderDto;
import foodGroup4.entity.Khachhang;

public interface HoadonService {
    void create(Khachhang khachhang, CartInfoDto cartInfoDto, InfoOrderDto infoOrderDto);
}
