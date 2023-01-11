package com.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.Entity.Property;
import com.backend.Repo.PropertyRepo;

public class PropertyService {
	@Autowired
    PropertyRepo propertyRepo;


    public Property save(Property property) {

        return propertyRepo.save(property);
        
    }
    
    public List<Property> viewAllProperty() {
        return propertyRepo.findAll();
    }
}
