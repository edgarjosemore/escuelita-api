package com.example.escuelita.service;

import com.example.escuelita.models.AdminDTO;
import com.example.escuelita.persistence.entity.Admin;
import com.example.escuelita.persistence.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Boolean status(AdminDTO adminDTO){
        Optional<Admin> adminOptional = adminRepository.
                findByUser(adminDTO.getUserDTO());
        Optional<Admin> adminOpt = adminRepository
                .findByPassword(adminDTO.getPasswordDTO());
        if(!adminOptional.isPresent()){
            throw new IllegalStateException("Admin does not exist");
        }
        if(!adminOpt.isPresent()){
            throw new IllegalStateException("Admin does not exist");
        }
        return Boolean.TRUE;
    }
}
