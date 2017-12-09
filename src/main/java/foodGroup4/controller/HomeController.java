package foodGroup4.controller;

import foodGroup4.entity.Mon;
import foodGroup4.service.CustomerService;
import foodGroup4.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class HomeController {

	public static final int MAX_TOP_INTRO_FOOD = 12;
	public static final int ITEM_IN_ROW_INTRO = 4;

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Autowired
	FoodService foodService;

	@Autowired
	CustomerService customerService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getHomePage(Model model){
	 	List<List<Mon>> topOrderChunks =
				foodService.getTopFoodOrderOfTheWeeks(MAX_TOP_INTRO_FOOD, ITEM_IN_ROW_INTRO);

		model.addAttribute("topOrderChunks", topOrderChunks);
		return "home";
	}

	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	public String postSubscribe(@RequestParam(value = "email") String email, Model model) {
		try {
			customerService.subscribe(email);
			return "subscribe";
		} catch (DataIntegrityViolationException ex) {
			return "subscribe";
		}
	}
}














