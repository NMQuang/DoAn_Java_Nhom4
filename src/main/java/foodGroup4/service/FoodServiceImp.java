package foodGroup4.service;

import foodGroup4.config.HibernateUtil;
import foodGroup4.dao.FoodDAO;
import foodGroup4.dao.FoodDAOImp;
import foodGroup4.entity.Mon;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

	public List<List<Mon>> convertListFoodToChunk(List<Mon> listMons, int itemOneChunk) {
    	List<List<Mon>> chunks = new ArrayList<List<Mon>>();
    	int total = listMons.size();

    	for(int i = 0; i < total/itemOneChunk*itemOneChunk; i+= itemOneChunk) {
			chunks.add(listMons.subList(i, i + itemOneChunk));
		}

		int modSize = total % itemOneChunk;
    	if(modSize > 0) {
			chunks.add(listMons.subList(total - modSize, total - 1));
		}

    	return chunks;
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

	@Override
	public Mon getFood(int id) {
		// TODO Auto-generated method stub
		return ((HibernateUtil)(FoodDAOImp)foodDAO).fetchById(id, Mon.class);
	}
}
