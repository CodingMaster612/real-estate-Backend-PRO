package com.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Agent;
import com.backend.Repo.AgentRepo;
@Service
public class AgentService {
	@Autowired
    AgentRepo agentRepo;


    public Agent save(Agent agent) {

        return agentRepo.save(agent);
        
    }
    
 
}
