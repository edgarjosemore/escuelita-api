package com.example.escuelita.persistence.repository;

import com.example.escuelita.persistence.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    Optional<Admin>findByUser(String user);
    Optional<Admin>findByPassword(String password);
}
