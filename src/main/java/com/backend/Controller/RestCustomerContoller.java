package com.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.backend.Entity.Customers;

import com.backend.Service.CustomerService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/customer")
public class RestCustomerContoller{

	
	
	

 @Autowired
 CustomerService costumerService;

 
 
 
 
 
 @RequestMapping(
 		value = "/signUp",
 		consumes = MediaType.APPLICATION_JSON_VALUE,
 		produces = MediaType.APPLICATION_JSON_VALUE,
 		method = RequestMethod.POST
 		)
 // We return a ResponseEntity<Object> because the object returned may vary, could be user, could be an error
 // The RequestBody is the information sent to us to process, post and put has request body, get and delete do not
 // Request body is encrypted, always send password through a post request
 public ResponseEntity<Object> signUp(@RequestBody Customers customer) {
 
     try {
         Customers signedInCustomer = costumerService.save(customer);
 
         // Give proper status codes, OK 200, BadRequest 400, INTERNAL_SERVER_ERROR 500
         return new ResponseEntity<>(signedInCustomer, HttpStatus.OK);
     } catch(Exception e) {
         return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
     } catch(Error e) {
         return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
     }
 }

 @RequestMapping(value = "/signIn",
         consumes = MediaType.APPLICATION_JSON_VALUE,
         produces = MediaType.APPLICATION_JSON_VALUE,
         method = RequestMethod.POST
         )
 public ResponseEntity<Object> signIn(@RequestBody Customers customer) {

     try {
         Customers signedInCustomer = costumerService.signIn(customer);
         
         if(signedInCustomer == null) {
             
             throw new Error("No user found");
             
         }
 
         return new ResponseEntity<>(signedInCustomer, HttpStatus.OK);
         
     } catch(Exception e) {
         return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
     } catch(Error e) {
         return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
     }
 }
 
 
		 
		 
		 
		 
		 
		 
		 
		 

}
