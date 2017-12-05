package foodGroup4.dao;

import foodGroup4.entity.HoaDon;
import foodGroup4.entity.Mon;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Component
@Transactional
public class FoodDAOImp implements FoodDAO {

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    SessionFactory sessionFactory;

    public List<Mon> getFoodSales(int maxResult) {
        Session session = sessionFactory.getCurrentSession();

        String hql = "from Mon M where M.giamGia > 0 order by M.giamGia desc";
        Query query = session.createQuery(hql);
        query.setMaxResults(maxResult);

        List<Mon> foodSales = query.list();
        return foodSales;
    }

    public List<Mon> getTopFoodOrderOfTheWeeks(int maxResult) {
        Session session = sessionFactory.getCurrentSession();

//        Calendar toDay = Calendar.getInstance();
//        Calendar first = (Calendar) toDay.clone();
//        first.add(Calendar.DAY_OF_WEEK,
//                first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));
//        Calendar last = (Calendar) first.clone();
//        last.add(Calendar.DAY_OF_YEAR, 6);
//
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        HoaDon hoaDon = (HoaDon) session.get(HoaDon.class, 1);
        System.out.println(hoaDon.getNgay());
        return null;
    }
}


















