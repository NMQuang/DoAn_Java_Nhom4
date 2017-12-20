package foodGroup4.service;

import java.util.ArrayList;
import java.util.List;

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

@Component
@Transactional
public class LoginService implements UserDetailsService {

	AccountAdminDao aAdminDao;

	@Autowired
	public void setaAdminDao(AccountAdminDao aAdminDao) {
		this.aAdminDao = aAdminDao;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AccountAdmin aAdmin = aAdminDao.findUserByUsername(username);

		if (aAdmin == null) {
			throw new UsernameNotFoundException("not found");
		}

		List<String> roles = aAdminDao.getUserRole(username);
		List<GrantedAuthority> grandList = new ArrayList<GrantedAuthority>();

		if (roles != null) {
			for (String role : roles) {
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				grandList.add(authority);
			}
		}
		UserDetails userDetails = new User(aAdmin.getUsername(), aAdmin.getPassword(), grandList);

		return userDetails;
	}



}
