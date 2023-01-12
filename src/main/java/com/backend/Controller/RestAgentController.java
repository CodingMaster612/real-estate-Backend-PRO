package com.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Entity.Agent;
import com.backend.Entity.Property;
import com.backend.Service.AgentService;
import com.backend.Service.PropertyService;



@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/agent")
public class RestAgentController {

	@Autowired
	AgentService agentService;



@RequestMapping(
        value="/createProperty",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
       
        method = RequestMethod.POST
    )                                 
    public ResponseEntity<Object> createProperty(@RequestBody Agent agent) {

        try {

            // send data to service for processing
            Agent savedProperty = agentService.save(agent);

            // return the data on success
            return new ResponseEntity<>(savedProperty, HttpStatus.CREATED);

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