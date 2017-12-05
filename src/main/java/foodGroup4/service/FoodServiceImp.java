package foodGroup4.service;

import foodGroup4.dao.FoodDAO;
import foodGroup4.entity.Mon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodServiceImp implements FoodService {
    public void setFoodDAO(FoodDAO foodDAO) {
        this.foodDAO = foodDAO;
    }

    @Autowired
    private FoodDAO foodDAO;

    public List<Mon> getFoodSales(int maxResult) {
        return foodDAO.getFoodSales(maxResult);
    }
}
