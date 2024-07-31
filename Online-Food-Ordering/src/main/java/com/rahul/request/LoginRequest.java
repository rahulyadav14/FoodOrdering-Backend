package com.rahul.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
