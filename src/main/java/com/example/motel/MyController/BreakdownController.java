package com.example.motel.MyController;

import com.example.motel.Service.BreakdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breakdown")
public class BreakdownController {
    @Autowired
    private BreakdownService breakdownService;
    @GetMapping("/list")
    public ResponseEntity<?> getListBreakdown(){
        return ResponseEntity.ok(breakdownService.getListBreakdown());
    }
}
