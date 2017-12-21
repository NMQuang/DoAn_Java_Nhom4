package foodGroup4.controller;

import javax.validation.Valid;

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

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String customer(Model model) {
		return "profile-customer";
	}

	@RequestMapping(value = "/change-password", method = RequestMethod.GET)
	public String changePassword(Model model) {

		return "change-password";
	}
}
