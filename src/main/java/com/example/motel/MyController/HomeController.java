package com.example.motel.MyController;

import com.example.motel.Service.HomeService;
import com.example.motel.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
   private HomeService homeService;
    @GetMapping("/list")
    public ResponseEntity<?> getListHome(){
        return ResponseEntity.ok(homeService.getListHome());
    }
    @GetMapping("/{Id}")
    public ResponseEntity<?> getHomeById(Integer Id){
        return ResponseEntity.ok(homeService.getHomeById(1));
    }

}
