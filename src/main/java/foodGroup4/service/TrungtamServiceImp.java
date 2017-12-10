package foodGroup4.service;

import foodGroup4.dao.TrungtamDAO;
import foodGroup4.entity.Trungtam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TrungtamServiceImp implements TrungtamService {
    public void setTrungtamDAO(TrungtamDAO trungtamDAO) {
        this.trungtamDAO = trungtamDAO;
    }

    @Autowired
    TrungtamDAO trungtamDAO;

    public void increaseCountingAccess() {
        Trungtam trungtam = trungtamDAO.getById(1);
        trungtam.setSoLuongTruyCap(trungtam.getSoLuongTruyCap() + 1);
        trungtamDAO.updateTrungtam(trungtam);
    }

    @Override
    public Trungtam getTrungtam() {
        return trungtamDAO.getTrungtam();
    }
}
