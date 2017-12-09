package foodGroup4.service;

import foodGroup4.entity.Mon;

import java.util.List;

public interface FoodService {
    List<Mon> getList(int maxResult, int begin);
    List<List<Mon>> getTopFoodOrderOfTheWeeks(int maxResult, int itemInRow);
    int getCountFood();
    int getCountFoodinCategory(int idCategory);
    List<Mon> getListFoodinCategory(int idCategory, int maxResult, int begin);
    int getCountFoodNameContain(String keyword);
    List<Mon> getListFoodFoodNameContain(String keyword, int maxResult, int begin);
    Mon getFood(int id);
}
