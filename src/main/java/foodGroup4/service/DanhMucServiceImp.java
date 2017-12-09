package foodGroup4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.config.HibernateUtil;
import foodGroup4.dao.DanhMucDao;
import foodGroup4.entity.Danhmuc;

@Component
@Transactional
public class DanhMucServiceImp implements DanhMucService{

	@Autowired
	private DanhMucDao danhMucDao;
	@Override
	public List<Danhmuc> getAllDanhMuc() {
		
		return ((HibernateUtil)danhMucDao).fetchAll("from Danhmuc where active is true");
	}

	
}
