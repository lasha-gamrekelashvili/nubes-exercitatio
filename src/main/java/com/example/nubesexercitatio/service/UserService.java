package com.example.nubesexercitatio.service;

import com.example.nubesexercitatio.entity.UserEntity;
import com.example.nubesexercitatio.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity saveUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
