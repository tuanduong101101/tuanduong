package com.example.motel.Service;

import com.example.motel.Entity.Breakdown;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BreakdownService {
    public List<Breakdown> getListBreakdown();
}
