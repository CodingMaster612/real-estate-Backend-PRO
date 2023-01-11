package com.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.Entity.Agent;
import com.backend.Repo.AgentRepo;

public class AgentService {
	@Autowired
    AgentRepo agentrepo;


    public Agent save(Agent agent) {

        return agentrepo.save(agent);
        
    }
}
