package com.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.backend.Entity.Property;

@Repository         // Between the <,> first put the type of object, next the type of the primary key
public interface PropertyRepo extends JpaRepository<Property, Integer>{
    
	
    
    
} 
