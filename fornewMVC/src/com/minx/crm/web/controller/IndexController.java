package com.minx.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/{username}")
    public String index(@PathVariable("username") String username) {
        System.out.print(username);
        return "index";
    }
}