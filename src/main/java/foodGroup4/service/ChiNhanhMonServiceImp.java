package foodGroup4.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.dao.ChiNhanhMonDAO;
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

}
