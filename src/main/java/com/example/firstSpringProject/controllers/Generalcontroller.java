package com.example.firstSpringProject.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Generalcontroller {

    @GetMapping("/")
    public String welcome(){
       return "Welcome to Spring Boot!";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
      return "Hello " + name;
    }
}
