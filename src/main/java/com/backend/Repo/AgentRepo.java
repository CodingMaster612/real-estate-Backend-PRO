package com.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Agent;

@Repository
public interface AgentRepo extends JpaRepository<Agent, Integer>{
    
}
