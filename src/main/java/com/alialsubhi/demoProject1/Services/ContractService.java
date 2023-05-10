package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Contract;
import com.alialsubhi.demoProject1.Repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    ContractRepository contractRepository;

   public List<Contract>getAllContracts(){
      return contractRepository.findAll();
   }
}
