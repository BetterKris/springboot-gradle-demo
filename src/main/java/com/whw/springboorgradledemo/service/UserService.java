package com.whw.springboorgradledemo.service;

import com.whw.springboorgradledemo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    public User findUserById(int i) {
        return User.builder()
                .name("whw")
                .password("123")
                .sex("male")
                .build();
    }
}
