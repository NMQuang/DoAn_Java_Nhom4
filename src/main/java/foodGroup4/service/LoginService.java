package foodGroup4.service;

import java.util.ArrayList;
import java.util.List;

import foodGroup4.common.CustomUserDetails;
import foodGroup4.dao.CustomerDAO;
import foodGroup4.entity.Khachhang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import foodGroup4.dao.AccountAdminDao;
import foodGroup4.entity.AccountAdmin;

@Transactional
public class LoginService implements UserDetailsService {
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public UserDetails loadUserByUsername(String sdt) throws UsernameNotFoundException {
		Khachhang khachhang = customerDAO.findBySdt(sdt);

		if (khachhang == null) {
			throw new UsernameNotFoundException("not found");
		}

		System.out.println(khachhang.getPassword());

		List<String> roles = khachhang.getRoles();
		List<GrantedAuthority> grandList = new ArrayList<>();

		if (roles != null) {
			for (String role : roles) {
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				grandList.add(authority);
			}
		}
		UserDetails userDetails = new CustomUserDetails(khachhang, grandList);

		return userDetails;
	}



}
