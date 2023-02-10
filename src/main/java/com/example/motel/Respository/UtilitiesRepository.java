package com.example.motel.Respository;

import com.example.motel.Entity.Utilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilitiesRepository extends JpaRepository<Utilities,Integer> {
}
