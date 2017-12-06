package foodGroup4.dao;

import foodGroup4.entity.Mon;

import java.util.List;

public interface FoodDAO {
    List<Mon> getList(int maxResult);
    List<Mon> getTopFoodOrderOfTheWeeks(int maxResult);
}
