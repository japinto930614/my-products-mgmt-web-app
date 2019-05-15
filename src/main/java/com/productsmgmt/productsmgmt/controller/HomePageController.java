package com.productsmgmt.productsmgmt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/productsmgmt", "/productsmgmt/home"})
    public String displayHomePage(){
        return "home/index";
    }

}