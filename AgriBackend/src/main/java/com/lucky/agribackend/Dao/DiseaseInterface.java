package com.lucky.agribackend.Dao;

import com.lucky.agribackend.entity.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseInterface extends JpaRepository<Disease,Integer> {
}
