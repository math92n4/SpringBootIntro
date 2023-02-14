package com.example.springbootintro.services;

import org.springframework.stereotype.Service;
import com.example.springbootintro.repositories.WelcomeMessage;

@Service
public class WelcomeService {

    private WelcomeMessage message;

    public WelcomeService(WelcomeMessage message) {
        this.message = new WelcomeMessage();
    }

    public String getWelcomeMessage(int id) {
        return message.getWelcomeMessage(id);
    }

}
