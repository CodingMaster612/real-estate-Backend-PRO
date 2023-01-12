package com.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Property;
import com.backend.Repo.PropertyRepo;
@Service
public class PropertyService {
	@Autowired
    PropertyRepo propertyRepo;


    public Property save(Property property) {

        return propertyRepo.save(property);
        
    }
    
    public List<Property> viewAllProperty() {
        return propertyRepo.findAll();
    }
    
    
    public Property getPropertyAgentById(Integer agentId) {

        return propertyRepo.findById(agentId).get();
    }
}
