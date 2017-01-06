package com.demo.module1.service.impl;


import com.demo.module1.model.Message;
import com.demo.module1.service.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

	public List<Message> test() {
        ArrayList<Message> messages = new ArrayList<Message>();

        messages.add(new Message("Message1", "Hello, world!"));
        messages.add(new Message("Message2", "Another one!"));

        return messages;
    }

}
