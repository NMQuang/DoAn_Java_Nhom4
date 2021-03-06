package foodGroup4.dao;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Mon;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class FoodDAOImp extends HibernateUtil implements FoodDAO {

    public List<Mon> getList(int maxResult, int begin) {

        String hql = "from Mon where active is true";
        Query query = getSession().createQuery(hql);
        query.setFirstResult(begin).setMaxResults(maxResult);
        List<Mon> mons = query.list();
        return mons;
    }

    public List<Mon> getTopFoodOrderOfTheWeeks(int maxResult) {
        Calendar toDay = Calendar.getInstance();
        Calendar first = (Calendar) toDay.clone();
        first.add(Calendar.DAY_OF_WEEK,
                first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));
        Calendar last = (Calendar) first.clone();
        last.add(Calendar.DAY_OF_YEAR, 6);

        String hql = "select (pk.mon) from Chitiethoadon CTHD where CTHD.pk.hoadon.ngay >= :first and CTHD.pk.hoadon.ngay <= :last group by CTHD.pk.mon order by sum(CTHD.soLuong) desc";
        Query query = getSession().createQuery(hql);
        query.setParameter("first", first.getTime());
        query.setParameter("last", last.getTime());
        query.setMaxResults(maxResult);

        List<Mon> topMonOfWeeks = query.list();

        System.out.println("Top order week count: " + topMonOfWeeks.size());

        return topMonOfWeeks;
    }
    public int getCountFood(){
    	Query query = getSession().createQuery("select count(*) from Mon where active is true");
    	int count = ((Long) query.uniqueResult()).intValue();
    	return count;
    }

	@Override
	public int getCountFoodinCategory(int idCategory) {
		Query query = getSession().createQuery("select count(*) from Mon where active is true and danhmuc.id = :idC").setParameter("idC", idCategory);
    	int count = ((Long) query.uniqueResult()).intValue();
    	return count;
	}

	@Override
	public List<Mon> getListFoodinCategory(int idCategory, int maxResult, int begin) {
		String hql = "from Mon where active is true and danhmuc.id = :idC";
        Query query = getSession().createQuery(hql).setParameter("idC", idCategory);
        query.setFirstResult(begin).setMaxResults(maxResult);
        List<Mon> mons = query.list();
        return mons;
	}

	@Override
	public int getCountFoodNameContain(String keyword) {
		Criteria criteria = getSession().createCriteria(Mon.class, "mon"); 
		criteria.add(Restrictions.sqlRestriction( "{alias}.ten like ? collate utf8_bin", "%"+keyword+"%", new StringType()));
		criteria.add(Restrictions.eq("active", true));
		return criteria.list().size();

	}

	@Override
	public List<Mon> getListFoodFoodNameContain(String keyword, int maxResult, int begin) {
		Criteria criteria = getSession().createCriteria(Mon.class, "mon"); 
		criteria.add(Restrictions.sqlRestriction( "{alias}.ten like ? collate utf8_bin", "%"+keyword+"%", new StringType()));
		criteria.add(Restrictions.eq("active", true));
		criteria.setFirstResult(begin).setMaxResults(maxResult);
        List<Mon> mons = criteria.list();
        return mons;
	}
}


















