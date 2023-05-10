package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {
}
