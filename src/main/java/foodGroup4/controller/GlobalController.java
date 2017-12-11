package foodGroup4.controller;


import foodGroup4.service.TrungtamService;
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

	@Autowired
	private TrungtamService trungtamService;

	@ModelAttribute
	public void getDataForHeader(Model model){
		
		model.addAttribute("listDanhMuc", danhMucService.getAllDanhMuc());
		model.addAttribute("listChiNhanh", chiNhanhService.getListChiNhanh());
	}

	@ModelAttribute
	public void getDataForFooter(Model model) {
		model.addAttribute("trungtam", trungtamService.getTrungtam());
	}

}
