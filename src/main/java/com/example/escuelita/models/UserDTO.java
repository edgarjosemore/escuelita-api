package com.example.escuelita.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String lastname;
    private String area;
    private Integer edad;
    private Boolean status;

    public UserDTO(String name, String lastname, String area, Integer edad, Boolean status) {
        this.name = name;
        this.lastname = lastname;
        this.area = area;
        this.edad = edad;
        this.status = status;
    }

}
