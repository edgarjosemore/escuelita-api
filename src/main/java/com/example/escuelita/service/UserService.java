package com.example.escuelita.service;

import com.example.escuelita.models.UserDTO;
import com.example.escuelita.persistence.entity.User;
import com.example.escuelita.persistence.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private UserDTO userDTO;

    public List<UserDTO> getUsers(){
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> userList = userRepository.findAll();
        for (User i: userList){
            UserDTO dto = map(i);
            userDTOList.add(dto);
        }
        return userDTOList;
    }

    private UserDTO map(User user){
        UserDTO response = new UserDTO();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastname(user.getLastname());
        response.setArea(user.getArea());
        response.setEdad(user.getEdad());
        response.setStatus(user.getStatus());
        return response;
    }

    private User mapUser(UserDTO dto){
        User response = new User();
        response.setName(dto.getName());
        response.setLastname(dto.getLastname());
        response.setArea(dto.getArea());
        response.setEdad(dto.getEdad());
        response.setStatus(dto.getStatus());
        return response;
    }

    public void addUser(UserDTO userDTO){
        User user = mapUser(userDTO);
        userRepository.save(user);
    }

    public void updateUser(UserDTO userDTO){
        Optional<User> userOpt = userRepository.findById(userDTO.getId());
        if(userOpt.isPresent()){
            User user = userOpt.get();
            if(userDTO.getName() != null){
            user.setName(userDTO.getName());}
            if (userDTO.getLastname() != null){
            user.setLastname(userDTO.getLastname());}
            if (userDTO.getArea() != null){
            user.setArea(userDTO.getArea());}
            if(userDTO.getEdad() != null){
            user.setEdad(userDTO.getEdad());}
            if (userDTO.getStatus() != null){
            user.setStatus(userDTO.getStatus());}

         //   User user = mapUser(userDTO);
            userRepository.save(user);
        }
    }
}
