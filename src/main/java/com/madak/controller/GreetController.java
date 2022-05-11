package com.madak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greetMessage() {
        return "welcome to external tomcat deployed spring boot app using jenkins!!";
    }
}
