package foodGroup4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import foodGroup4.dto.ChiNhanhMonDto;
import foodGroup4.entity.Chinhanh;
import foodGroup4.service.ChiNhanhMonService;
import foodGroup4.service.ChiNhanhService;

@Controller
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private ChiNhanhService chiNhanhService;

	@Autowired
	private ChiNhanhMonService chiNhanhMonService;

	@RequestMapping(params = "id", method = RequestMethod.GET)
	public String getBranch(Model model){

		return "branch";
	}

	@RequestMapping(value="/{branchID}", method = RequestMethod.GET)
	public String getInfoBranch(Model model, @PathVariable("branchID") int branchID) {

		Chinhanh chiNhanh = chiNhanhService.getInfoBranch(branchID);

		if (chiNhanh != null) {
			model.addAttribute("branch", chiNhanh);
			List<ChiNhanhMonDto> dto = chiNhanhMonService.getListFoodByBranchID(branchID);
			model.addAttribute("listFood", dto);
		}

		return "branch";
	}

}
