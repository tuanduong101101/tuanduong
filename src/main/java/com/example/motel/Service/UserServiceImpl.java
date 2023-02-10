package com.example.motel.Service;

import com.example.motel.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    private com.example.motel.Respository.UserRepository userRepository;

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();


    }

    @Override
    public Optional<Users> searchUser(Integer Id) {
        return userRepository.findById(2);
    }
}





