package com.example.motel.Service;

import com.example.motel.Entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public List<Users> findAll();

    Optional<Users> searchUser(Integer Id);






}
