package foodGroup4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.config.HibernateUtil;
import foodGroup4.dao.ChiNhanhDao;
import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.Chinhanh;

@Component
@Transactional
public class ChiNhanhServiceImp implements ChiNhanhService{

	@Autowired
	private ChiNhanhDao chiNhanhDao;
	@Override
	public List<Chinhanh> getListChiNhanh() {
//		return ((HibernateUtil)chiNhanhDao).fetchAll(Chinhanh.class);
		return chiNhanhDao.getListBranch();
	}

	@Override
	public Chinhanh getInfoBranch(int branchID) {

		if (branchID < 0) {
			return null;
		}
		return chiNhanhDao.getInfoBranch(branchID);
	}

}
