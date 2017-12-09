package foodGroup4.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.Mon;

public interface ChiNhanhMonService {

	HashMap<Integer, ArrayList<Integer>> getListPriceMinMax(List<Mon> dsMon);

	List<ChiNhanhMonDto> getListFoodByBranchID(int branchID);
}
