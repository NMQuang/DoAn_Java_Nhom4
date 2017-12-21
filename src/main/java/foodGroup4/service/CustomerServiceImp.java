package foodGroup4.service;

import foodGroup4.dao.CustomerDAO;
import foodGroup4.entity.Khachhang;
import foodGroup4.entity.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void subscribe(String email) {
		Subscriber subscriber = new Subscriber();
		subscriber.setEmail(email);
		customerDAO.subscribe(subscriber);
	}

	@Override
	public void save(Khachhang customer) {
		customerDAO.save(customer);
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
