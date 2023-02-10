package com.example.motel.MyController;

import com.example.motel.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }
    @GetMapping("/{Id}")
    public ResponseEntity<?> getUserbyId(){
        return ResponseEntity.ok(userService.searchUser(2));
    }




}
