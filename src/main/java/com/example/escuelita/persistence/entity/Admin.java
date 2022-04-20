package com.example.escuelita.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="admin")
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name = "user")
    private String user;

    @Column(name="password")
    private String password;

    public Admin(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
