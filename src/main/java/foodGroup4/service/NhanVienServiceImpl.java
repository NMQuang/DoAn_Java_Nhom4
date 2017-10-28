package foodGroup4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.dao.INhanVienDao;
import foodGroup4.entity.NhanVien;

@Service
@Transactional
public class NhanVienServiceImpl implements INhanVienService {

	@Autowired
	private INhanVienDao nhanVienDao;

	@Override
	public List<NhanVien> getAllNhanVien() {
		return nhanVienDao.getAllNhanVien();
	}
}
