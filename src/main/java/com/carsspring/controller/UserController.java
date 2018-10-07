package com.carsspring.controller;

import com.carsspring.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserManager userManager;


   @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcomePage(HttpServletRequest request){
       return "index";
   }



   @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("email")String email, @ModelAttribute("password") String password){

      if(userManager.getByEmail(email) !=null){
          return new ModelAndView("home","user",userManager.getByEmail(email));
      }

      return new ModelAndView("index");
   }
}
