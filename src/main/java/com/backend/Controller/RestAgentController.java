package com.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.backend.Entity.Agent;
import com.backend.Service.AgentService;

@RequestMapping
public class RestAgentController {

	@Autowired
	AgentService agentService;
	
    @RequestMapping(
        value="/createProduct",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
       
        method = RequestMethod.POST
    )                                 
    public ResponseEntity<Object> createSchool(@RequestBody Agent agent) {

        try {

            // send data to service for processing
            Agent savedProduct = agentService.save(agent);

            // return the data on success
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);

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
//add property 