package com.example.helloWorld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/")
    String home() {
        return "Hello World!!!";
    }
    // after input "mvn spring-boot:run" on the terminal open the "http://localhost:8080/"
}
