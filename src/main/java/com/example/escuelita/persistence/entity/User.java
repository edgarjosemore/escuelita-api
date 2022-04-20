package com.example.escuelita.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name ="apellido")
    private String lastname;

    @Column(name = "area")
    private String area;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "status")
    private Boolean status;
}
