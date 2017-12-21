package foodGroup4.controller;

import foodGroup4.common.CustomerValidator;
import foodGroup4.entity.Khachhang;
import foodGroup4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ValidationController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerValidator customerValidator;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegister(Model model) {

        model.addAttribute("customerForm", new Khachhang());
        return "register";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String login(ModelMap model, @ModelAttribute(value = "customer") @Valid Khachhang customer, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("customer", customer);
            return "";
        }
        return "home";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postRegister(@ModelAttribute(value = "customerForm") Khachhang customer, BindingResult bindingResult, Model model) throws Exception {

        System.out.println(customer.getTen());
        customerValidator.validate(customer, bindingResult);

        if (bindingResult.hasErrors()) {
            return "register";
        }
        customerService.save(customer);

        return "redirect:/login";
    }
}
