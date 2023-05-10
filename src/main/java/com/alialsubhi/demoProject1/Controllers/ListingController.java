package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Listing;
import com.alialsubhi.demoProject1.Services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Listing")
public class ListingController {

    @Autowired
    ListingService listingService;
    @RequestMapping(value = "getAll" , method = RequestMethod.GET)
    public List<Listing> getAllListings(){
        return listingService.getAllListings();
        // http://localhost:8080/Listing/getAll

    }
}
