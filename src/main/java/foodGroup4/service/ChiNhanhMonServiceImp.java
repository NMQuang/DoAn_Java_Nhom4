package foodGroup4.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import foodGroup4.dto.CartInfoDto;
import foodGroup4.dto.FoodInfoDto;
import foodGroup4.entity.ChinhanhmonId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.config.HibernateUtil;
import foodGroup4.dao.ChiNhanhMonDAO;
import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.Chinhanh;

import foodGroup4.entity.Chinhanhmon;
import foodGroup4.entity.Mon;

@Component
@Transactional
public class ChiNhanhMonServiceImp implements ChiNhanhMonService{

	@Autowired
	ChiNhanhMonDAO chiNhanhMonDAO;

	@Override
	public HashMap<Integer, ArrayList<Integer>> getListPriceMinMax(List<Mon> dsMon) {
		HashMap<Integer, ArrayList<Integer>> kq = new HashMap<Integer, ArrayList<Integer>>();
		for(Mon m : dsMon){
			int min = chiNhanhMonDAO.getMinPrice(m.getMonId());
			int max = chiNhanhMonDAO.getMaxPrice(m.getMonId());
			ArrayList<Integer> prices = new ArrayList<Integer>();
			prices.add(min);
			prices.add(max);
			kq.put(m.getMonId(), prices);
		}
		return kq;
	}

	/**
	 * get list food of a branch by branchID
	 * @param branchID int
	 * */
	@Override
	public List<ChiNhanhMonDto> getListFoodByBranchID(int branchID) {
		return chiNhanhMonDAO.getListFoodByBranchID(branchID);
	}

	@Override
	public List<Chinhanhmon> getListChiNhanhMonByMon(int idMon) {
		return chiNhanhMonDAO.getListChiNhanhMon(idMon);
	}

	@Override
	public HashMap<Integer, Integer> getListPriceFromCartInfo(CartInfoDto cartInfo) {
		HashMap<Integer, Integer> listPrice = new HashMap<>();
		for(FoodInfoDto foodInfoDto: cartInfo.getFoodInfoDtos()) {
			Mon mon = foodInfoDto.getMon();
			ChinhanhmonId chinhanhmonId = new ChinhanhmonId(cartInfo.getChinhanh(), mon);
			Chinhanhmon chinhanhmon = chiNhanhMonDAO.getById(chinhanhmonId);
			listPrice.put(mon.getMonId(), chinhanhmon.getGia());
		}
		return listPrice;
	}

}
