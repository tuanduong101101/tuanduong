package com.example.motel.Service;

import com.example.motel.Entity.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilitiesServiceiml implements UtilitiesService {
    @Autowired
    com.example.motel.Respository.UtilitiesRepository utilitiesRepository;
    @Override
    public List<Utilities> getListUtilities(){
        return utilitiesRepository.findAll();
    }
}
