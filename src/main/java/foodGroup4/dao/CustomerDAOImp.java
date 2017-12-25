package foodGroup4.dao;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Khachhang;
import foodGroup4.entity.Subscriber;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CustomerDAOImp extends HibernateUtil implements CustomerDAO {

	public void subscribe(Subscriber subscriber) {
		this.create(subscriber);
	}

	@Override
	public void save(Khachhang customer) {
		// TODO Auto-generated method stub
		create(customer);
	}

	@Override
	public void update(Khachhang khachhang) {
		super.update(khachhang);
	}

	@Override
	public Khachhang findBySdt(String sdt) {
		return this.fetchById(sdt, Khachhang.class);
	}
}
