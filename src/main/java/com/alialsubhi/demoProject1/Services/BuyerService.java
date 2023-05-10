package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Buyer;
import com.alialsubhi.demoProject1.Repositories.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }
}
