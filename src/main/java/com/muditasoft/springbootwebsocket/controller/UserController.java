package com.muditasoft.springbootwebsocket.controller;

import com.muditasoft.springbootwebsocket.model.User;
import com.muditasoft.springbootwebsocket.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // @MessageMapping annotation ensures that if a message is sent to destination "/user"
    // then the getUser() method is called
    // The payload of the message is bound to a UserResponse object which is passed into getUser()
    // After the 1 second delay, the getUser() method creates a UserResponse object and returns it.
    // The return value is broadcast to all subscribers to "/topic/user" as specified in the @SendTo annotation.
    // Note that the name form the input message is sanitized since in this case it will be echoed back and
    // re-rendered in the browser dom on the client side.
    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {
        return new UserResponse("Hello, " + user.getName());
    }
}
