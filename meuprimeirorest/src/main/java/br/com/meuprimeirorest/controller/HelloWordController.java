package br.com.meuprimeirorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/helloworld")
    public String helloWorld(String name){
        return "Hello World!" + name + "!";
    }

    @PostMapping("/hellopost")
    public String helloPost(String name){
        return "Hello Post " + name + "!";
    }
}
