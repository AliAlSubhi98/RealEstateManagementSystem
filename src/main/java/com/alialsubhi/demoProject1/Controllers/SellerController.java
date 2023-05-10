package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Seller;
import com.alialsubhi.demoProject1.Services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Seller> getAllSellers(){
        return sellerService.getAllSellers();
        // http://localhost:8080/Seller/getAll

    }
}
