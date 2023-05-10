package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Property;
import com.alialsubhi.demoProject1.Repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    PropertyRepository propertyRepository;

    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }


}
