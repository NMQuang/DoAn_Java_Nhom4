package foodGroup4.controller;

import foodGroup4.common.Utils;
import foodGroup4.dto.CartInfoDto;
import foodGroup4.entity.Mon;
import foodGroup4.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/order")
public class OrderController {
	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}

	@Autowired
	FoodService foodService;

	@RequestMapping(value = "/add-to-cart/{idFood}")
	public String getAddToCart(HttpServletRequest request, Model model, @PathVariable int idFood) {
		Mon mon = foodService.getFood(idFood);
		CartInfoDto cartInfoDto = Utils.getCartInfoFromSession(request);
		cartInfoDto.addFoodToCart(mon);

		return "redirect:/food";
	}

	@RequestMapping(value="/cart", method = RequestMethod.GET)
	public String getCart(Model model){

		return "cart";
	}

	@RequestMapping(value="/order", method = RequestMethod.GET)
	public String order(Model model){

		return "order";
	}
	
	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public String getOrderHistory(Model model){
		
		return "order-history";
	}
}
