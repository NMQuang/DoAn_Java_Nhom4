package foodGroup4.service;

import foodGroup4.entity.Khachhang;

public interface CustomerService {
	void subscribe(String email);

	void save(Khachhang khachhang);

	void update(Khachhang khachhang);

	Khachhang findBySdt(String sdt);
}
