package com.alialsubhi.demoProject1.Controllers;


import com.alialsubhi.demoProject1.Models.Appraisal;
import com.alialsubhi.demoProject1.Services.AppraisalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Appraisal")
public class AppraisalController {

    @Autowired
    AppraisalService appraisalService;

   @RequestMapping(value = "getAll", method = RequestMethod.GET)
   public List<Appraisal> getAllAppraisals() {
       return appraisalService.getAllAppraisals();
       // http://localhost:8080/Appraisal/getAll

   }

}
