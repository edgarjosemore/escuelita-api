package com.example.escuelita.controller;

import com.example.escuelita.models.AdminDTO;
import com.example.escuelita.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("login")
    public Boolean userExist(@RequestBody AdminDTO adminDTO){
        return adminService.status(adminDTO);
    }

}
