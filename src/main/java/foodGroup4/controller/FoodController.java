package foodGroup4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import foodGroup4.service.FoodService;
import foodGroup4.service.FoodServiceImp;


@Controller
@RequestMapping("/foods")
public class FoodController {

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
	@Autowired
	FoodService foodService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getListFoods(Model model){
		
		model.addAttribute("foodlist", foodService.getList(12));
		return "food-list";
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String getListFoodsCategory(Model model){
		foodService.getList(12);
		System.out.println(foodService);
		return "food-list";
	}
	@RequestMapping(params = "id", method = RequestMethod.GET)
	public String getFood(Model model, @RequestParam(value = "id") int id){

		return "food";
	}
	
	@RequestMapping(value= "/search", params = "keyword", method = RequestMethod.GET)
	public String search(Model model, @RequestParam(value = "keyword") String keyword){
		System.out.println(keyword);
		return "food-list";
	}
}
