package com.example.motel.MyController;

import com.example.motel.Entity.Utilities;
import com.example.motel.Service.UtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilities")
public class UtilitiesController {
    @Autowired
    private UtilitiesService utilitiesService;
    @GetMapping("/list")
    public ResponseEntity<?> getListUtilities(){
        return ResponseEntity.ok(utilitiesService.getListUtilities());
    }
}
