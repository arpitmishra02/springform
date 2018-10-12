package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController{
    @RequestMapping("/")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "loginForm";

    }
    @RequestMapping(value ="/addUser", method= RequestMethod.POST)
    public String  addUser(@ModelAttribute("user")  User user){
        String userName= user.getUserName();
        String userPassword= user.getUserPassword();
        int userContact =user.getUserContact();
        return "success";
    }
}