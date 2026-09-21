package com.example.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) {
        Properties config = loadConfig();
        String name = config.getProperty("app.name", "base-app");
        String version = config.getProperty("app.version", "unknown");

        System.out.println(name + " v" + version + " started");
        System.out.println(new GreetingService().greet(args.length > 0 ? args[0] : "World"));
    }

    static Properties loadConfig() {
        Properties props = new Properties();
        try (InputStream in = App.class.getResourceAsStream("/application.properties")) {
            if (in != null) {
                props.load(in);
            }
        } catch (IOException e) {
            System.err.println("Could not load application.properties: " + e.getMessage());
        }
        return props;
    }
}
