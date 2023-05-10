package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Inspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionRepository extends JpaRepository<Inspection,Long> {
}
