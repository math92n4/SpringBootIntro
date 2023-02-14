package com.example.springbootintro.controller;
import com.example.springbootintro.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.springbootintro.services.WelcomeService;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class WelcomeController {

    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/hej/{id}")
    public ResponseEntity<String> sayWelcome(@PathVariable int id) {
        try {
            String msg = welcomeService.getWelcomeMessage(id);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
        }
    }

    @GetMapping("/velkommen")
    public ResponseEntity<List<Message>> getListOfMessages() {
        List listOfMessages = welcomeService.getListOfMessages();
        return new ResponseEntity<List<Message>>(listOfMessages, HttpStatus.OK);
    }

}
