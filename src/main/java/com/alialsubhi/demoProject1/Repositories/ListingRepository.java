package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends JpaRepository<Listing,Long> {
}
