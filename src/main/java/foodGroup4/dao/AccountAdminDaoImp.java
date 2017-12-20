package foodGroup4.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import foodGroup4.config.HibernateUtil;
import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.AccountAdmin;

@Component
public class AccountAdminDaoImp extends HibernateUtil implements AccountAdminDao {

	@Override
	public AccountAdmin findUserByUsername(String username) {
		String hql = "from account_admin where username = :username";
		Query query = getSession().createQuery(hql).setParameter("username", username);
		List<AccountAdmin> userList = query.list();
		if (userList.size() > 0 && userList != null) {
			return userList.get(0);
		}
		return null;
	}

	@Override
	public List<String> getUserRole(String username) {
		String hql = "select quyen from account_admin where username = :username";
		Query query = getSession().createQuery(hql).setParameter("username", username);
		List<String> roleList = query.list();

		if (roleList.size() > 0 && roleList != null) {
			return roleList;
		}
		return null;
	}

}
