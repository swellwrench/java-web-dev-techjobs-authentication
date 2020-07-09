package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(max = 100, message = "Invalid username. Must be less than 100 characters.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 100, message = "Invalid password. Must be between 5 and 100 characters.")
    private String password;

    public LoginFormDTO() {    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
