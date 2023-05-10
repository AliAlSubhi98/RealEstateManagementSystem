package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Property;
import com.alialsubhi.demoProject1.Services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Property")
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Property> getAllProperties(){
        return propertyService.getAllProperties();
        // http://localhost:8080/Listing/getAll

    }
}
