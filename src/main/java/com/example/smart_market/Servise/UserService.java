package com.example.smart_market.Servise;

import com.example.smart_market.Entity.UserEntity;
import com.example.smart_market.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;



    //GET METHOD

    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();

    }


    // POST METHOD

    public void saveUser(UserEntity userEntity) {
        if (userRepository.findByUsername(userEntity.getUsername()).isPresent()){

            throw new IllegalStateException("username" + userEntity.getUsername() + "is already exist");
        }

        userRepository.save(userEntity);

    }

    public Optional<UserEntity> getUserByUsername(String username) {
        Optional<UserEntity> userEntity = userRepository.findByUsername(username);
        return Optional.ofNullable(userEntity.orElseThrow(() -> new IllegalStateException(" user " + username + " doesnt exist ")));

    }


}
