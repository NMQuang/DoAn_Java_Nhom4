package foodGroup4.controller;

import foodGroup4.dao.CustomerDAO;
import foodGroup4.dao.CustomerDAOImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDAO customerDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @RequestMapping(value="/profile", method = RequestMethod.GET)
    public String customer(Model model){
        return "profile-customer";
    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String getCart(Model model){

        return "register";
    }

    @RequestMapping(value="/change-password", method = RequestMethod.GET)
    public String changePassword(Model model){

        return "change-password";
    }

}
