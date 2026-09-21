package com.example.app;

public class GreetingService {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            name = "World";
        }
        return "Hello, " + name + "!";
    }
}
