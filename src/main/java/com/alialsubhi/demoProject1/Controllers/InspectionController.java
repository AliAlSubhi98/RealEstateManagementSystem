package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Inspection;
import com.alialsubhi.demoProject1.Services.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Inspection")
public class InspectionController {

    @Autowired
    InspectionService inspectionService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    List<Inspection> getAllInspections(){
        return inspectionService.getAllInspections();
        // http://localhost:8080/Inspection/getAll

    }
}
