package com.example.motel.MyController;

import com.example.motel.Entity.Users;
import com.example.motel.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/register")

public class RegisterController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("")
    public String showSignupForm(Model model){
        model.addAttribute("users", new Users());
        return "signup";
    }
    @PostMapping("/process")
    public String processRegistration(Users users){
        userRepository.save(users);
        return "success";
    }
}
