package foodGroup4.dao;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Trungtam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrungtamDAOImp extends HibernateUtil implements TrungtamDAO {

    public Trungtam getById(int id) {
        Trungtam trungtam = this.fetchById(id, Trungtam.class);
        return trungtam;
    }

    public void updateTrungtam(Trungtam trungtam) {
        this.update(trungtam);
    }

    @Override
    public Trungtam getTrungtam() {
        List<Trungtam> listTrungTams = this.fetchAll(Trungtam.class);
        if(listTrungTams == null) {
            return null;
        }
        return listTrungTams.get(0);
    }
}
