package foodGroup4.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Chinhanh;

@Component
public class ChiNhanhDaoImp extends HibernateUtil implements ChiNhanhDao {

	@Override
	public List<Chinhanh> getListBranch() {
		String hql = "from Chinhanh";
		Query query = getSession().createQuery(hql);
		List<Chinhanh> chiNhanhs = query.list();
		return chiNhanhs;
	}

	@Override
	public Chinhanh getInfoBranch(int branchID) {
		Chinhanh chiNhanh = new Chinhanh();
		String hql = "from Chinhanh where chiNhanhId = :branchID";
		Query query = getSession().createQuery(hql).setParameter("branchID", branchID);
		chiNhanh = (Chinhanh) query.list().get(0);
		return chiNhanh;
	}

}
