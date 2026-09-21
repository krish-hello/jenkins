package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void greetsByName() {
        assertEquals("Hello, Alice!", service.greet("Alice"));
    }

    @Test
    void fallsBackToWorld() {
        assertEquals("Hello, World!", service.greet(" "));
    }
}
