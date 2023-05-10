package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Seller;
import com.alialsubhi.demoProject1.Repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;

    public List<Seller> getAllSellers(){
        return sellerRepository.findAll();
    }

}
