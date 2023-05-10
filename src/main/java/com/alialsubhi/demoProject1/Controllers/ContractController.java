package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Appraisal;
import com.alialsubhi.demoProject1.Models.Contract;
import com.alialsubhi.demoProject1.Services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Contract")
public class ContractController {
    @Autowired
    ContractService contractService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();
        // http://localhost:8080/Contract/getAll

    }

}
