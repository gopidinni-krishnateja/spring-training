package com.example.user.controller;

import com.example.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {
    @RequestMapping("/")
    public ModelAndView showform(){
        return new ModelAndView("addUser","User",new User());
    }
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("user") User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.getAge());
        return  new ModelAndView("view","user",user);

    }

}
