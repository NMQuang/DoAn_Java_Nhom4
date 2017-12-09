package foodGroup4.service;

import foodGroup4.dao.CenterDAO;
import foodGroup4.entity.Trungtam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@Scope("prototype ")
public class CenterServiceImp implements CenterService {
    public void setCenterDAO(CenterDAO centerDAO) {
        this.centerDAO = centerDAO;
    }

    @Autowired
    CenterDAO centerDAO;

    public void increaseCountingAccess() {
        Trungtam trungtam = centerDAO.getById(1);
        trungtam.setSoLuongTruyCap(trungtam.getSoLuongTruyCap() + 1);
        centerDAO.updateCenter(trungtam);
    }
}
