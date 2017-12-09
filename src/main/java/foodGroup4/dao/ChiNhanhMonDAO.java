package foodGroup4.dao;

import java.util.List;

import foodGroup4.entity.Chinhanhmon;

public interface ChiNhanhMonDAO {

	int getMinPrice(int idMon);
	int getMaxPrice(int idMon);
	List<Chinhanhmon> getListChiNhanhMon(int idMon);
}
