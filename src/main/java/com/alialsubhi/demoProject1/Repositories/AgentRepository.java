package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {
}
