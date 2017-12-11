package foodGroup4.dao;

import foodGroup4.config.HibernateUtil;
import foodGroup4.entity.Mon;

import java.util.List;

public interface FoodDAO {
    List<Mon> getList(int maxResult, int begin);
    List<Mon> getTopFoodOrderOfTheWeeks(int maxResult);
    int getCountFood();
    int getCountFoodinCategory(int idCategory);
    List<Mon> getListFoodinCategory(int idCategory, int maxResult, int begin);
    int getCountFoodNameContain(String keyword);
    List<Mon> getListFoodFoodNameContain(String keyword, int maxResult, int begin);
}
