package foodGroup4.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import foodGroup4.config.HibernateUtil;
import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.Chinhanhmon;

@Component
public class ChiNhanhMonDAOImp extends HibernateUtil implements ChiNhanhMonDAO {

	@Override
	public int getMinPrice(int idMon) {
		String hql = "from Chinhanhmon where pk.mon.monId = :idMon order by gia asc";
		Query q = getSession().createQuery(hql).setParameter("idMon", idMon);
		q.setMaxResults(1);
		Chinhanhmon cnm = (Chinhanhmon) q.uniqueResult();
		if(cnm == null)
			return -1;
		return cnm.getGia();
	}

	@Override
	public int getMaxPrice(int idMon) {
		String hql = "from Chinhanhmon where pk.mon.monId = :idMon order by gia desc";
		Query q = getSession().createQuery(hql).setParameter("idMon", idMon);
		q.setMaxResults(1);
		Chinhanhmon cnm = (Chinhanhmon) q.uniqueResult();
		if(cnm == null)
			return -1;
		return cnm.getGia();
	}

	@Override
	public List<ChiNhanhMonDto> getListFoodByBranchID(int branchID) {
//		String hql = "select (pk.mon), gia from Chinhanhmon, Mon where pk.chinhanh.chiNhanhId = :branchID and Mon.monId = pk.chinhanhmon.monId ";
		String hql = "from Chinhanhmon where pk.chinhanh.chiNhanhId = :branchID";
		Query query = getSession().createQuery(hql).setParameter("branchID", branchID);
		List<ChiNhanhMonDto> dto = query.list();
		return dto;
	}

}
