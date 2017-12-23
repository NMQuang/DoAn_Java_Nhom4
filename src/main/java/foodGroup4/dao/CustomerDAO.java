package foodGroup4.dao;

import foodGroup4.entity.Khachhang;
import foodGroup4.entity.Subscriber;

public interface CustomerDAO {
    void subscribe(Subscriber subscriber);

	void save(Khachhang customer);

	void update(Khachhang khachhang);

	Khachhang findBySdt(String sdt);
}
