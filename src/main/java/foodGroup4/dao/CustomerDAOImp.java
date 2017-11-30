package foodGroup4.dao;

import foodGroup4.entity.KhachHang;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class CustomerDAOImp implements CustomerDAO{

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    SessionFactory sessionFactory;

    public KhachHang getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        KhachHang khachHang = (KhachHang) session.get(KhachHang.class, id);
        return khachHang;
    }
}










