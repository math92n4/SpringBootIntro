package com.example.springbootintro.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomeMessage {

    private String message = "Velkommen til KEA";

    public String getWelcomeMessage(int id) {
        if (id == 1) {
            message = "Velkommen til KEA";
        } else if (id == 2) {
            message = message.toUpperCase();
        }
        return message;
    }

}
