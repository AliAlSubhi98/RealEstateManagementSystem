package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Inspection;
import com.alialsubhi.demoProject1.Repositories.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionService {
    @Autowired
    InspectionRepository inspectionRepository;

   public List<Inspection> getAllInspections(){
        return inspectionRepository.findAll();
    }

}
