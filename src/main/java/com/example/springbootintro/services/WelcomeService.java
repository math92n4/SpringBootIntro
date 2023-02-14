package com.example.springbootintro.services;
import com.example.springbootintro.model.Message;
import org.springframework.stereotype.Service;
import com.example.springbootintro.repositories.WelcomeMessage;

import java.util.List;

@Service
public class WelcomeService {

    private WelcomeMessage message;

    public WelcomeService(WelcomeMessage message) {
        this.message = new WelcomeMessage();
    }

    public String getWelcomeMessage(int id) throws Exception {
        return message.getWelcomeMessage(id - 1);
    }

    public List<Message> getListOfMessages() {
        return message.getListOfMessages();
    }


}
