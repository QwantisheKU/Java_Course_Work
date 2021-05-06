package com.carshare.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public class RegisterDTO {
    @NotNull
    @NotEmpty
    private final String username;
    @NotNull
    @NotEmpty
    private final String password;
    private final String matchingPassword;
}
