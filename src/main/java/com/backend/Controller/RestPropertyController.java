package com.backend.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import com.backend.Service.PropertyService;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.backend.Entity.Property;

@CrossOrigin(origins="*")
@RequestMapping(value="/property")
public class RestPropertyController {

	@Autowired
	PropertyService propertyService;
	
    
        @RequestMapping(
                value="/viewAll",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE,
               
                method = RequestMethod.POST
            )                                 
            public ResponseEntity<Object> viewAllProperty(@RequestBody Property property) {

                try {

                    
                    List<Property> getProperty = propertyService.viewAllProperty();

                    // return the data on success
                    return new ResponseEntity<>(getProperty, HttpStatus.CREATED);

                    //  Catches will catch any error that happens in the process and return the message
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
                } catch(Error e) {
                    System.out.println(e.getMessage());
                    return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
                }
        
    }
        
        
        @RequestMapping(
                value="/viewAll/{agentId}",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE,
               
                method = RequestMethod.POST
            )                                 
            public ResponseEntity<Object> viewPropertyAgentbyId(@PathVariable Integer agentId) {

                try {

                    
                	 Property getProperty = propertyService.getPropertyAgentById(agentId);
                	 

                    // return the data on success
                    return new ResponseEntity<>(getProperty, HttpStatus.CREATED);
                    

                    //  Catches will catch any error that happens in the process and return the message
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
                } catch(Error e) {
                    System.out.println(e.getMessage());
                    return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
                }
        
    }
        
        
}