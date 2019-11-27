package com.muditasoft.springbootwebsocket.controller;

import com.muditasoft.springbootwebsocket.model.User;
import com.muditasoft.springbootwebsocket.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {
        return new UserResponse("Hello, " + user.getName());
    }
}
