package foodGroup4.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.config.HibernateUtil;

import foodGroup4.entity.NhanVien;

@Repository
@Transactional
public class NhanVienDaoImpl implements INhanVienDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<NhanVien> getAllNhanVien() {
		return hibernateUtil.fetchAll(NhanVien.class);
	}

}
