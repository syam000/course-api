package com.nobuyuki.javatest.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtr {
    
    @GetMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
