package foodGroup4.service;

import foodGroup4.dao.FoodDAO;
import foodGroup4.dao.FoodDAOImp;
import foodGroup4.entity.Mon;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class FoodServiceImp implements FoodService {

    @Autowired
    private FoodDAO foodDAO;

    public List<Mon> getList(int maxResult, int begin) {
        return foodDAO.getList(maxResult, begin);
    }

    public List<Mon> getTopFoodOrderOfTheWeeks(int maxResult) {
        return foodDAO.getTopFoodOrderOfTheWeeks(maxResult);
    }
    public int getCountFood(){
    	return foodDAO.getCountFood();
    }

	@Override
	public int getCountFoodinCategory(int idCategory) {
		return foodDAO.getCountFoodinCategory(idCategory);
	}

	@Override
	public List<Mon> getListFoodinCategory(int idCategory, int maxResult,
			int begin) {
		return foodDAO.getListFoodinCategory(idCategory, maxResult, begin);
	}

	@Override
	public int getCountFoodNameContain(String keyword) {
		// TODO Auto-generated method stub
		return foodDAO.getCountFoodNameContain(keyword);
	}

	@Override
	public List<Mon> getListFoodFoodNameContain(String keyword, int maxResult,
			int begin) {
		// TODO Auto-generated method stub
		return  foodDAO.getListFoodFoodNameContain(keyword, maxResult, begin);
	}
}
