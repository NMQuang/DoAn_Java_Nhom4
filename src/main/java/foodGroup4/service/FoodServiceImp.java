package foodGroup4.service;

import foodGroup4.dao.FoodDAO;
import foodGroup4.entity.Mon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class FoodServiceImp implements FoodService {
    public void setFoodDAO(FoodDAO foodDAO) {
        this.foodDAO = foodDAO;
    }

    @Autowired
    private FoodDAO foodDAO;

    public List<Mon> getList(int maxResult) {
        return foodDAO.getList(maxResult);
    }

    public List<Mon> getTopFoodOrderOfTheWeeks(int maxResult) {
        return foodDAO.getTopFoodOrderOfTheWeeks(maxResult);
    }
}
