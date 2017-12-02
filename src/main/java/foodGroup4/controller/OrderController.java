package foodGroup4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {

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
