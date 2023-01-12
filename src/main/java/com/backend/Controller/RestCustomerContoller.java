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
import com.backend.Entity.Property;
import com.backend.Service.CustomerService;
import com.backend.Service.PropertyService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/customer")
public class RestCustomerContoller{

	
	
	

 @Autowired
 CustomerService customerService;

 
 @Autowired 
 PropertyService propertyService;
 
 
 
 @RequestMapping(
 		value = "/signUp",
 		consumes = MediaType.APPLICATION_JSON_VALUE,
 		produces = MediaType.APPLICATION_JSON_VALUE,
 		method = RequestMethod.POST
 		)
 
 public ResponseEntity<Object> signUp(@RequestBody Customers customer) {
 
     try {
         Customers signedInCustomer = customerService.save(customer);
 
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
         Customers signedInCustomer = customerService.signIn(customer);
         
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
 
 @RequestMapping(value = "/purchase/{propertyId}/{customerId}",
         consumes = MediaType.APPLICATION_JSON_VALUE,
         produces = MediaType.APPLICATION_JSON_VALUE,
         method = RequestMethod.POST
         )
 public ResponseEntity<Object> purchaseProperty(@RequestBody Property property , @PathVariable Integer propertyId , @PathVariable Integer customerId) {

     try {
         
    	 Customers purchase = customerService.buyProperty(propertyId, customerId);
    	 
         
         if(purchase == null) {
             
             throw new Error("Invalid purchase");
             
         }
 
         return new ResponseEntity<>(purchase, HttpStatus.OK);
         
     } catch(Exception e) {
         return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
     } catch(Error e) {
         return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
     }
 }
		 
		 //make a purshase mapping that saves to tey databases 
		 
		 
		 
		 
		 

}
