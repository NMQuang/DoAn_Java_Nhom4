package foodGroup4.controller;

import foodGroup4.common.Utils;
import foodGroup4.dto.CartInfoDto;
import foodGroup4.dto.FoodInfoDto;
import foodGroup4.dto.MapQuantityFoodDto;
import foodGroup4.entity.Chinhanh;
import foodGroup4.entity.Mon;
import foodGroup4.service.ChiNhanhMonService;
import foodGroup4.service.ChiNhanhService;
import foodGroup4.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}

	public void setChiNhanhService(ChiNhanhService chiNhanhService) {
		this.chiNhanhService = chiNhanhService;
	}

	public void setChiNhanhMonService(ChiNhanhMonService chiNhanhMonService) {
		this.chiNhanhMonService = chiNhanhMonService;
	}

	@Autowired
	FoodService foodService;

	@Autowired
	ChiNhanhService chiNhanhService;

	@Autowired
	ChiNhanhMonService chiNhanhMonService;

	@RequestMapping(value = "/add-to-cart/{idFood}")
	public String getAddToCart(HttpServletRequest request, Model model, @PathVariable int idFood) {
		Mon mon = foodService.getFood(idFood);
		CartInfoDto cartInfoDto = Utils.getCartInfoFromSession(request);
		cartInfoDto.addFoodToCart(mon);

		return "redirect:/food";
	}

	@RequestMapping(value="/cart", method = RequestMethod.GET)
	public String getCart(HttpServletRequest request, Model model, @RequestParam(value = "idChinhanh", required = false) Integer idChinhanh){
		List<Chinhanh> chinhanhs = chiNhanhService.getListChiNhanh();
		model.addAttribute("chinhanhs", chinhanhs);

		CartInfoDto cartInfoDto = Utils.getCartInfoFromSession(request);

		if(idChinhanh != null) {
			Chinhanh chinhanh = chiNhanhService.getInfoBranch(idChinhanh);
			cartInfoDto.setChinhanh(chinhanh);
		}

		if(cartInfoDto.getChinhanh() != null) {
			HashMap<Integer, Integer> mapPrice = chiNhanhMonService.getListPriceFromCartInfo(cartInfoDto);
			cartInfoDto.setPriceForFoodFromMapPrice(mapPrice);
		}

		HashMap<Integer, Integer> mapQuantityFood = createMapQuantityFood(cartInfoDto);
		model.addAttribute("mapQuantityFood", mapQuantityFood);

		return "cart";
	}

	private HashMap<Integer, Integer> createMapQuantityFood(CartInfoDto cartInfo) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(FoodInfoDto foodInfoDto: cartInfo.getFoodInfoDtos()) {
			map.put(foodInfoDto.getMon().getMonId(), foodInfoDto.getQuantity());
		}
		return map;
	}

	@RequestMapping(value = "/remove-food-from-cart/{idFood}", method = RequestMethod.GET)
	public String getRemoveFoodFromCart(HttpServletRequest request, @PathVariable int idFood, Model model) {
		CartInfoDto cartInfoDto = Utils.getCartInfoFromSession(request);
		cartInfoDto.removeFoodFromCart(idFood);

		return "redirect:/order/cart";
	}

	@RequestMapping(value="/order-info", method = RequestMethod.POST)
	public String order(HttpServletRequest request, Model model,
						@ModelAttribute(value = "mapQuantityFood") MapQuantityFoodDto mapQuantityFoodDto,
						RedirectAttributes redirectAttributes){
		CartInfoDto cartInfoDto = Utils.getCartInfoFromSession(request);
		cartInfoDto.setQuantityForFoodFromMapQuantity(mapQuantityFoodDto);

		if(cartInfoDto.getChinhanh() == null) {
			redirectAttributes.addFlashAttribute("error", "Chưa chọn chi nhánh");
			return "redirect:/order/cart";
		}

		if(cartInfoDto.getQuantity() <= 0 || cartInfoDto.getTotalPrice() <= 0) {
			return "redirect:/order/cart";
		}

		return "order";
	}
	
	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public String getOrderHistory(Model model){
		
		return "order-history";
	}
}
