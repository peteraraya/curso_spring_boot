package com.peter.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/")

    public String details(Model model) {
      model.addAttribute("title", "hola como estas");
      model.addAttribute("name", "Pedro");
      model.addAttribute("lastName", "Araya");
      return  "details";
    }
}
