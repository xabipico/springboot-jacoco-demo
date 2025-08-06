package com.xabipico.springBootJacoco.application.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public String kaixo(String name) {
        return "Kaixo, " + name + "!";
    }

    public String iep(String name) {
        return "Iep, " + name + "!";
    }
}
