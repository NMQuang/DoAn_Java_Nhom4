package foodGroup4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/food")
public class FoodController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getListFood(Model model){
		
		return "Food";
	}
	
	@RequestMapping(value= "/search", method = RequestMethod.GET)
	public String search(Model model){
		
		return "";
	}
}
