package com.gunnsproject.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "" , "/home"})
    public String index(Model model){
        model.addAttribute("title", "Hi Spring Framework!");
        return "index";
    }
}
