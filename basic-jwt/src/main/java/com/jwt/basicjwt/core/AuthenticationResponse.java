package com.jwt.basicjwt.core;

public class AuthenticationResponse {
    private String token;

    public AuthenticationResponse(String jwt) {
        this.token = jwt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
