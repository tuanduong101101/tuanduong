package com.example.motel.Service;

import com.example.motel.Entity.Home;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HomeService {
    public List<Home> getListHome();
    public Optional<Home> getHomeById(Integer Id);




}
