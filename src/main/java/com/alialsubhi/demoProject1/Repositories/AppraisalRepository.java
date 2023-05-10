package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Appraisal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppraisalRepository extends JpaRepository<Appraisal,Long> {
}
