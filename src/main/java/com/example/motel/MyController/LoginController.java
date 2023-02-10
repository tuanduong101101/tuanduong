package com.example.motel.MyController;

import com.example.motel.Entity.Users;
import com.example.motel.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login ")
public class LoginController {
    @GetMapping("")
    public String showSigninPage(){
        return "signin";
    }

}
