package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Appraisal;
import com.alialsubhi.demoProject1.Models.Buyer;
import com.alialsubhi.demoProject1.Services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Buyer")
public class BuyerController {

    @Autowired
    BuyerService buyerService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
        // http://localhost:8080/Buyer/getAll
    }
}
