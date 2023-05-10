package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Long> {
}
