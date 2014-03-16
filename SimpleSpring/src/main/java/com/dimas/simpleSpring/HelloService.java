package com.dimas.simpleSpring;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello Spring world!";
    }
}
