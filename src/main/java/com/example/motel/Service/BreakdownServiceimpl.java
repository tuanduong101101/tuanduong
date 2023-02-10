package com.example.motel.Service;

import com.example.motel.Entity.Breakdown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreakdownServiceimpl implements BreakdownService{
    @Autowired
    com.example.motel.Respository.BreakdownRepository breakdownRepository;
    @Override
    public List<Breakdown> getListBreakdown(){
        return breakdownRepository.findAll();
    }
}
