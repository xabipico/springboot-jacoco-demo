package com.xabipico.springBootJacoco.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {

    @GetMapping(value = "/greetings")
    public String greetings() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/kaixo")
    public String kaixo() {
        return "Kaixo from Spring Boot!";
    }
}