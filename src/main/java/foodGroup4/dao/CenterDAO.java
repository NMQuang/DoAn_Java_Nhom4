package foodGroup4.dao;

import foodGroup4.entity.Trungtam;

public interface CenterDAO {
    Trungtam getById(int id);
    void updateCenter(Trungtam trungtam);
}
