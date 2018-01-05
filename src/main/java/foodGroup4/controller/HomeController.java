package foodGroup4.controller;

import foodGroup4.entity.Mon;
import foodGroup4.service.ChiNhanhMonService;
import foodGroup4.service.CustomerService;
import foodGroup4.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
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

	public void setChiNhanhMonService(ChiNhanhMonService chiNhanhMonService) {
		this.chiNhanhMonService = chiNhanhMonService;
	}

	@Autowired
	FoodService foodService;

	@Autowired
	ChiNhanhMonService chiNhanhMonService;

	@Autowired
	CustomerService customerService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getHomePage(Model model){
	 	List<Mon> topFoodOrders = foodService.getTopFoodOrderOfTheWeeks(MAX_TOP_INTRO_FOOD);
		HashMap<Integer, ArrayList<Integer>> topFoodOrderPrices =
				chiNhanhMonService.getListPriceMinMax(topFoodOrders);
		model.addAttribute("topFoodOrders", topFoodOrders);
		model.addAttribute("topFoodOrderPrices", topFoodOrderPrices);
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

	@RequestMapping(value = "/introduce", method = RequestMethod.GET)
	public String getIntroduce() {
		return "introduce";
	}
}














