package foodGroup4.dao;

import java.util.List;

import foodGroup4.entity.Chinhanh;

public interface ChiNhanhDao {

	List<Chinhanh> getListBranch();

	Chinhanh getInfoBranch(int branchID);

}
