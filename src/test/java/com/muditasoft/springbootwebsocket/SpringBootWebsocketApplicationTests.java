package com.muditasoft.springbootwebsocket;

import com.muditasoft.springbootwebsocket.controller.UserController;
import com.muditasoft.springbootwebsocket.model.User;
import com.muditasoft.springbootwebsocket.model.UserResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWebsocketApplicationTests {

    @Test
    void testUserResponse() {
        UserController userController = new UserController();
        UserResponse userResponse = userController.getUser(new User("Tutku"));
        Assertions.assertEquals(userResponse.getContent(), "Hello, Tutku");
    }

}
