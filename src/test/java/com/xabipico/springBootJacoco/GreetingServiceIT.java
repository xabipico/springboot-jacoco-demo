package com.xabipico.springBootJacoco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xabipico.springBootJacoco.SpringBootJacocoApplication;
import com.xabipico.springBootJacoco.application.services.GreetingService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootJacocoApplication.class)
public class GreetingServiceIT {

    @Autowired
    private GreetingService service;

    @Test
    void testGreetIntegration() {
        String result = service.greet("IntegrationTest");
        assertEquals("Hello, IntegrationTest!", result);
    }
}