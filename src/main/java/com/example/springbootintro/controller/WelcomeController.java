package com.example.springbootintro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.springbootintro.services.WelcomeService;

@Controller
public class WelcomeController {

    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/hej/{id}")
    public ResponseEntity<String> sayWelcome(@PathVariable int id) {
        return new ResponseEntity<>(welcomeService.getWelcomeMessage(id), HttpStatus.OK);
    }


}
