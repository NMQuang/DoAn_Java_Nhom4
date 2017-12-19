package foodGroup4.service;

import foodGroup4.entity.Khachhang;

public interface CustomerService {
	void subscribe(String email);

	void save(Khachhang customer);

	boolean login(String username, String password);
}
