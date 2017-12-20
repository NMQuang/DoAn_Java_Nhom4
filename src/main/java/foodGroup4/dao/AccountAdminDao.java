package foodGroup4.dao;

import java.util.List;

import foodGroup4.entity.AccountAdmin;

public interface AccountAdminDao {
	public AccountAdmin findUserByUsername(String username);

	public List<String> getUserRole(String username);
}
