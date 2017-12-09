package foodGroup4.service;

import foodGroup4.dao.FoodDAO;
import foodGroup4.entity.Mon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    public List<List<Mon>> getTopFoodOrderOfTheWeeks(int maxResult, int itemInRow) {
        List<List<Mon>> topOrderChunks = new ArrayList<List<Mon>>();

        List<Mon> topOrders = foodDAO.getTopFoodOrderOfTheWeeks(maxResult);
        int totalItem = topOrders.size();
        for(int i = 0; i < totalItem/itemInRow*itemInRow; i+= itemInRow) {
            topOrderChunks.add(topOrders.subList(i, i + itemInRow));
        }
        int modSize = topOrders.size() % itemInRow;
        if(modSize > 0) {
            topOrderChunks.add(topOrders.subList(totalItem - modSize, topOrders.size() - 1));
        }
        return topOrderChunks;
    }
}
