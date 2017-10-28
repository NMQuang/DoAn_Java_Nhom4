package foodGroup4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import foodGroup4.service.INhanVienService;

@Controller
@RequestMapping(value="/nhanvien")
public class NhanVienController {

	@Autowired
	private INhanVienService nhanVienService;

	@RequestMapping(value = "/getAll",method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String getAllNhanVien() {
		System.out.println(nhanVienService.getAllNhanVien());
		return " ";
	}
}
