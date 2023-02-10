package com.example.motel.Service;


import com.example.motel.Entity.Utilities;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilitiesService {
    public List<Utilities> getListUtilities();
}
