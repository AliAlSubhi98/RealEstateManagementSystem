package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Appraisal;
import com.alialsubhi.demoProject1.Repositories.AppraisalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraisalService {

    @Autowired
    AppraisalRepository appraisalRepository;

    public List<Appraisal> getAllAppraisals(){
        return appraisalRepository.findAll();
    }
}
