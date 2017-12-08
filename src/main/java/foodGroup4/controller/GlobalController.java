package foodGroup4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import foodGroup4.service.ChiNhanhService;
import foodGroup4.service.DanhMucService;

@ControllerAdvice("foodGroup4.controller")
public class GlobalController {
	@Autowired
	private DanhMucService danhMucService;
	@Autowired
	private ChiNhanhService chiNhanhService;
	@ModelAttribute
	public void getDataForHeader(Model model){
		
		model.addAttribute("listDanhMuc", danhMucService.getAllDanhMuc());
		model.addAttribute("listChiNhanh", chiNhanhService.getListChiNhanh());
	}

}
