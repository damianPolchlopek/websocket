package com.example.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/send-message")
    @SendTo("/topic/livechat")
    public ChatMessage onMessage(@Payload ChatMessage message) {
        System.out.println("Msg: " + message);
        return message;
    }

}
