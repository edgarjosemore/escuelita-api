package com.example.escuelita.controller;

import com.example.escuelita.models.UserDTO;
import com.example.escuelita.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("create")
    public void createUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }

    @PutMapping("update")
    public void updateUser(@RequestBody UserDTO userDTO){
        userService.updateUser(userDTO);
    }
}
