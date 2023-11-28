package com.danray.controllers;

import com.danray.models.Services;
import com.danray.repo.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private ServicesRepository servicesRepository;

    @GetMapping("/")
    public String home(Map<String, Object> model) {
         model.put("name", "Java-Framework!");
         return "home";
    }
    @GetMapping("/services")
    public String services(Map<String, Object> model) {
        Iterable<Services> services = servicesRepository.findAll();
         model.put("title", "This is a template for mod10");
         model.put("services", services);
         return "services";
    }



}
