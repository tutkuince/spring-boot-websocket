package com.muditasoft.springbootwebsocket.model;

// UserResponse is our message wrapper class.
public class UserResponse {

    private String content;

    public UserResponse() {
    }

    public UserResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
