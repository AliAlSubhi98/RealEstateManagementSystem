package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {
}
