package com.peter.springboot.webapp.springboot_web.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @RequestMapping(path="/details", method = RequestMethod.GET)

    public Map<String, Object> details(Model model) {
      Map<String, Object> body = new HashMap<>();
      body.put("title", "hola como estas");
      body.put("name", "Pedro");
      body.put("lastName", "Araya");
      return  body;
    }
}
