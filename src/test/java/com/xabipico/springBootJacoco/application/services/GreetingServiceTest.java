package com.xabipico.springBootJacoco.application.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void testGreet() {
        String result = service.greet("Alice");
        assertEquals("Hello, Alice!", result);
    }

    @Test
    void testKaixo() {
        String result = service.kaixo("Alice");
        assertEquals("kaixo, Alice!", result);
    }
}
