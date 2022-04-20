package com.example.escuelita.models;

import lombok.Data;

@Data
public class AdminDTO {

    private String userDTO;
    private String passwordDTO;

    public AdminDTO(String userDTO, String passwordDTO) {
        this.userDTO = userDTO;
        this.passwordDTO = passwordDTO;
    }
}
