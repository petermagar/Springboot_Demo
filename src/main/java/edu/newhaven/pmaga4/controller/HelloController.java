package edu.newhaven.pmaga4.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")

public class HelloController {
@GetMapping(path = "Greeting")
    public String printGreeting(){
        return "Hello World";
    }

}
