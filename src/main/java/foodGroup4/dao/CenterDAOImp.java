package foodGroup4.dao;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Trungtam;
import org.springframework.stereotype.Component;

@Component
public class CenterDAOImp extends HibernateUtil implements CenterDAO {

    public Trungtam getById(int id) {
        Trungtam trungtam = this.fetchById(id, Trungtam.class);
        return trungtam;
    }

    public void updateCenter(Trungtam trungtam) {
        this.update(trungtam);
    }
}
