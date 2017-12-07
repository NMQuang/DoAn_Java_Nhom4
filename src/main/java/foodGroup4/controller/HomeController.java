package foodGroup4.controller;

import foodGroup4.entity.Mon;
import foodGroup4.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class HomeController {

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}

	@Autowired
	FoodService foodService;

	 @RequestMapping(value="/", method = RequestMethod.GET)
	public String getHomePage(Model model){
	 	List<Mon> foods = foodService.getList(10);
	 	System.out.println("Food count: " + foods.size());
	 	System.out.println("Top food of week count: " + foodService.getTopFoodOrderOfTheWeeks(12).size());
	 	model.addAttribute("foods", foods);


		return "home";
	}
}
