package com.example.motel.Respository;

import com.example.motel.Entity.Breakdown;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakdownRepository extends JpaRepository<Breakdown,Integer> {

}
