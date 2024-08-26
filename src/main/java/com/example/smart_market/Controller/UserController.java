package com.example.smart_market.Controller;

import com.example.smart_market.Entity.UserEntity;
import com.example.smart_market.Servise.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{username}")
    public Optional<UserEntity> getUser(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }


    @GetMapping("/get-all")
    public List<UserEntity> findUsers(){
        return userService.findAllUsers();
    }




    @PostMapping("/addUser")
    public void addUser( @RequestBody UserEntity userEntity) {
        userService.saveUser(userEntity);
    }
}
