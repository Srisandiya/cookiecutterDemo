package com.cookiecutter.cookieDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/welcome")
    public String SpringStarter()
    {
        return "Welcome";
    }
}