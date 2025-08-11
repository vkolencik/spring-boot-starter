package com.example.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    @PostMapping("/")
    public String respondToHello(@RequestBody Object name) {
        return "Hello " + name + "!";
    }
}
