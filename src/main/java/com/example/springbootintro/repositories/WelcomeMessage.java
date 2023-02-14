package com.example.springbootintro.repositories;
import com.example.springbootintro.model.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WelcomeMessage {

    private final List<Message> messages = List.of(new Message(1,"Velkommen til KEA"),
            new Message(2, "Welcome to KEA"),
            new Message(3, "Jeg ville ønske jeg vidste hvad jeg lavede"));

    public String getWelcomeMessage(int id) throws Exception {
        if (id > messages.size() - 1) {
            throw new Exception("Element findes ikke");
        }
        return messages.get(id).getMsg();
    }

    public List<Message> getListOfMessages() {
        return messages;
    }

}
