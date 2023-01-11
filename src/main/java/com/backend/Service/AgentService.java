package com.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.Entity.Agent;
import com.backend.Repo.AgentRepo;

public class AgentService {
	@Autowired
    AgentRepo agentRepo;


    public Agent save(Agent agent) {

        return agentRepo.save(agent);
        
    }
    
 
}
