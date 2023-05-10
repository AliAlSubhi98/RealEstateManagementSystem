package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Agent;
import com.alialsubhi.demoProject1.Repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    @Autowired
    AgentRepository agentRepository;

    public List<Agent> getAllAgents(){
        return agentRepository.findAll();

    }
}
