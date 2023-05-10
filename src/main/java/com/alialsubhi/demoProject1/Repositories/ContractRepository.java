package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Long> {

}
