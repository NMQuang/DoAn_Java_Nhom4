package foodGroup4.service;

import foodGroup4.entity.Mon;

import java.util.List;

public interface FoodService {
    List<Mon> getList(int maxResult, int begin);
    List<Mon> getTopFoodOrderOfTheWeeks(int maxResult);
    int getCountFoods();
}
