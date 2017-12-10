package foodGroup4.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Danhmuc;

@Component
public class DanhMucDaoImp extends HibernateUtil implements DanhMucDao{

    @Override
    public List<Danhmuc> getAllDanhmucs() {
        String hql = "from Danhmuc DM where DM.active=true";
        Query query = getSession().createQuery(hql);
        return query.list();
    }
}
