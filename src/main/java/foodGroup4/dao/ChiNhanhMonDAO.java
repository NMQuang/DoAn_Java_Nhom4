package foodGroup4.dao;

import java.util.List;

import foodGroup4.dto.ChiNhanhMonDto;

public interface ChiNhanhMonDAO {

	int getMinPrice(int idMon);
	int getMaxPrice(int idMon);
	List<ChiNhanhMonDto> getListFoodByBranchID(int branchID);
}
