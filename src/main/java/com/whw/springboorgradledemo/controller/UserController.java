package com.whw.springboorgradledemo.controller;

import com.whw.springboorgradledemo.entity.User;
import com.whw.springboorgradledemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user/{id}")
    public @ResponseBody User findUserById(@PathVariable int id){

        return userService.findUserById(id);
    }

}
