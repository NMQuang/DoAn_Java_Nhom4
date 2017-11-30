package foodGroup4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/branch")
public class BranchController {
	
	@RequestMapping(params = "id", method = RequestMethod.GET)
	public String getBranch(Model model){
		
		return "branch";
	}
	
	
}
