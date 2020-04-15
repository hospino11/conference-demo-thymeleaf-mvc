package com.pluralsight.conferencedemothymeleafmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ThymeController {

    @GetMapping("thyme")
    public String greeting(Map<String, String> model) {
        model.put("message", "Hello to Thymeleaf integration!");
        return "thyme";
    }
}
