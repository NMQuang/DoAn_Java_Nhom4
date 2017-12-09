package foodGroup4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import foodGroup4.entity.Mon;
import foodGroup4.service.ChiNhanhMonService;
import foodGroup4.service.FoodService;


@Controller
@RequestMapping("/food")
public class FoodController {

//	public void setFoodService(FoodService foodService) {
//		this.foodService = foodService;
//	}
//	@Autowired
//	FoodService foodService;
//
//	@Autowired
//	ChiNhanhMonService chiNhanhMonService;
//
//	@RequestMapping(value = "", method = RequestMethod.GET)
//	public String getListFoods(@RequestParam Optional<Integer> index, Model model){
//		int begin;
//		int id = 1;
//		if(!index.isPresent() || index.get() < 1)
//			begin = 0;
//		else
//			id = index.get();
//		begin = 12 * (id - 1);
//		int count = foodService.getCountFood();
//		int pages = count / 12 + (count %12 == 0 ? 0 : 1);
//		List<Mon> dsMon = foodService.getList(12, begin);
//		model.addAttribute("foodlist", dsMon);
//		model.addAttribute("listPrices", chiNhanhMonService.getListPriceMinMax(dsMon));
//		model.addAttribute("pages", pages);
//		model.addAttribute("id", id);
//		System.out.println("count" + count + "pages" + pages);
//		return "food-list";
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public String getFood(Model model, @PathVariable int id){
//		foodService.getFood(id);
//		return "food";
//	}
//
//	@RequestMapping(value = "/category/{categoryID}", method = RequestMethod.GET)
//	public String getListFoodsCategory(Model model, @PathVariable int categoryID, @RequestParam Optional<Integer> index){
//		int begin;
//		int id = 1;
//		if(!index.isPresent() || index.get() < 1)
//			begin = 0;
//		else
//			id = index.get();
//		begin = 12 * (id - 1);
//		int count = foodService.getCountFoodinCategory(categoryID);
//		int pages = count / 12 + (count %12 == 0 ? 0 : 1);
//		List<Mon> dsMon = foodService.getListFoodinCategory(categoryID, 12, begin);
//		model.addAttribute("foodlist", dsMon);
//		model.addAttribute("listPrices", chiNhanhMonService.getListPriceMinMax(dsMon));
//		model.addAttribute("pages", pages);
//		model.addAttribute("id", id);
//		System.out.println("count" + count + "pages" + pages);
//		return "food-list";
//	}
//
//
//	@RequestMapping(value= "/search", method = RequestMethod.GET)
//	public String search(Model model, @RequestParam(value = "q") String keyword, @RequestParam Optional<Integer> index){
//		int begin;
//		int id = 1;
//		if(!index.isPresent() || index.get() < 1)
//			begin = 0;
//		else
//			id = index.get();
//		begin = 12 * (id - 1);
//		int count = foodService.getCountFoodNameContain(keyword);
//		int pages = count / 12 + (count %12 == 0 ? 0 : 1);
//		List<Mon> dsMon = foodService.getListFoodFoodNameContain(keyword, 12, begin);
//		model.addAttribute("foodlist", dsMon);
//		model.addAttribute("listPrices", chiNhanhMonService.getListPriceMinMax(dsMon));
//		model.addAttribute("pages", pages);
//		model.addAttribute("id", id);
//		System.out.println("count" + count + "pages" + pages);
//		return "food-list";
//	}
}
