package dev.Innocent.DTO;

import dev.Innocent.enums.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}