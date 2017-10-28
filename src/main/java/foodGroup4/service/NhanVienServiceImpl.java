package foodGroup4.service;

import org.springframework.beans.factory.annotation.Autowired;

import foodGroup4.dao.INhanVienDao;

public class NhanVienServiceImpl implements INhanVienService {

	@Autowired
	private INhanVienDao nhanVienDao;
}
