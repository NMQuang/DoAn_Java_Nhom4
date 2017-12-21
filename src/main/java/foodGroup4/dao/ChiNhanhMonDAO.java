package foodGroup4.dao;

import java.util.List;

import foodGroup4.dto.ChiNhanhMonDto;

import java.util.List;

import foodGroup4.entity.Chinhanhmon;
import foodGroup4.entity.ChinhanhmonId;

public interface ChiNhanhMonDAO {

	int getMinPrice(int idMon);
	int getMaxPrice(int idMon);
	List<ChiNhanhMonDto> getListFoodByBranchID(int branchID);

	List<Chinhanhmon> getListChiNhanhMon(int idMon);

    Chinhanhmon getById(ChinhanhmonId chinhanhmonId);
}
