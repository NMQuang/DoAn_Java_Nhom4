package foodGroup4.service;

import java.util.List;

import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.Chinhanh;

public interface ChiNhanhService {

	List<Chinhanh> getListChiNhanh();

	Chinhanh getInfoBranch(int branchID);

}
