package foodGroup4.controller;

import javax.validation.Valid;

import foodGroup4.common.ChangeProfileCustomerValidator;
import foodGroup4.dto.KhachhangDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import foodGroup4.common.CustomerValidator;
import foodGroup4.dao.CustomerDAO;
import foodGroup4.entity.Khachhang;
import foodGroup4.service.CustomerService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
    ChangeProfileCustomerValidator changeProfileCustomerValidator;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String customer(Model model, Principal principal) {
		Khachhang khachhang = customerService.findBySdt(principal.getName());
		KhachhangDto khachhangDto = new KhachhangDto(khachhang);

		model.addAttribute("khachhang", khachhangDto);

		return "profile-customer";
	}

	@RequestMapping(value = "/change-profile", method = RequestMethod.POST)
	public String postChangeProfile(Model model,
                                    Principal principal,
                                    @ModelAttribute(value = "khachhang") KhachhangDto khachhangDto,
                                    BindingResult result, RedirectAttributes redirectAttributes) {

        changeProfileCustomerValidator.validate(khachhangDto, result);
		if(result.hasErrors()) {
			return "profile-customer";
		}

		Khachhang khachhang = customerService.findBySdt(principal.getName());
		khachhang.setTen(khachhangDto.getTen());
		khachhang.setGioiTinh(khachhangDto.getGioiTinh());
		khachhang.setDiaChi(khachhangDto.getDiaChi());

		customerService.update(khachhang);

		redirectAttributes.addFlashAttribute("message", "Cập nhật thông tin thành công");
		return "redirect:/customer/profile";
	}

	@RequestMapping(value = "/change-password", method = RequestMethod.GET)
	public String changePassword(Model model) {
		return "change-password";
	}
}
