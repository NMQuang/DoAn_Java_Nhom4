package foodGroup4.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import foodGroup4.service.FoodService;
import foodGroup4.service.FoodServiceImp;


@Controller
@RequestMapping("/food")
public class FoodController {

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
	@Autowired
	FoodService foodService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getListFoods(@RequestParam Optional<Integer> index, Model model){
		int begin; 
		int id = 1;
		if(!index.isPresent() || index.get() < 1)
			begin = 0;
		else
			id = index.get();
		begin = 12 * (id - 1);
		int count = foodService.getCountFood();
		int pages = count / 12 + (count %12 == 0 ? 0 : 1);
		model.addAttribute("foodlist", foodService.getList(12, begin));
		model.addAttribute("pages", pages);
		model.addAttribute("id", id);
		System.out.println("count" + count + "pages" + pages);
		return "food-list";
	}

	@RequestMapping(value = "/category/{categoryID}", method = RequestMethod.GET)
	public String getListFoodsCategory(Model model, @PathVariable int categoryID, @RequestParam Optional<Integer> index){
		int begin; 
		int id = 1;
		if(!index.isPresent() || index.get() < 1)
			begin = 0;
		else
			id = index.get();
		begin = 12 * (id - 1);
		int count = foodService.getCountFoodinCategory(categoryID);
		int pages = count / 12 + (count %12 == 0 ? 0 : 1);
		model.addAttribute("foodlist", foodService.getListFoodinCategory(categoryID, 12, begin));
		model.addAttribute("pages", pages);
		model.addAttribute("id", id);
		System.out.println("count" + count + "pages" + pages);
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
