package foodGroup4.dao;

import foodGroup4.entity.Trungtam;

public interface TrungtamDAO {
    Trungtam getById(int id);
    void updateTrungtam(Trungtam trungtam);
    Trungtam getTrungtam();
}
