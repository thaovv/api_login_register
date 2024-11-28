package com.do_again_first.the_first.Dto.Response;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AuthenticationResponse {
    private String token;
    private boolean authenticated;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
}
