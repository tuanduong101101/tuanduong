package com.example.motel.Service;

import com.example.motel.Entity.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceimpl implements HomeService {
    @Autowired
    private com.example.motel.Respository.HomeRepository homeRepository;

    @Override
    public List<Home> getListHome(){
        return homeRepository.findAll();
    }
    @Override
    public Optional<Home> getHomeById(Integer Id){
        return homeRepository.findById(1);
    }


}
