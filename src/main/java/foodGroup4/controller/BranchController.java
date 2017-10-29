package foodGroup4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/branch")
public class BranchController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getList(Model model){
		
		return "branch";
	}
	
	
}
