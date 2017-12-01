package foodGroup4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/food")
public class FoodController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getListFood(Model model){
		
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
