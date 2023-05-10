package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Listing;
import com.alialsubhi.demoProject1.Repositories.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {
    @Autowired
    ListingRepository listingRepository;

    public List<Listing> getAllListings(){
        return listingRepository.findAll();
    }

}
