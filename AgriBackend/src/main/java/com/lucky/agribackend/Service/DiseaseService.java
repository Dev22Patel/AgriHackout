package com.lucky.agribackend.Service;

import com.lucky.agribackend.Dao.DiseaseInterface;
import com.lucky.agribackend.entity.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseService {

    @Autowired
    private DiseaseInterface diseaseRepo;
    public List<Disease> searchDiseases(String keyword) {

    }

    public Disease createDisease(Disease disease) {

    }

    public Disease updateDisease(Disease disease) {
    }

    public void deleteDisease(int id) {

    }
}
