package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Agent;
import com.alialsubhi.demoProject1.Services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Agent")
public class AgentController {

    @Autowired
    AgentService agentService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Agent> getAllCustomers() {
        return agentService.getAllAgents();
        // http://localhost:8080/Agent/getAll

    }
}
