package foodGroup4.dao;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Hoadon;
import org.springframework.stereotype.Component;

@Component
public class HoadonDAOImp extends HibernateUtil implements HoadonDAO {
    @Override
    public void create(Hoadon hoadon) {
        super.create(hoadon);
    }
}
