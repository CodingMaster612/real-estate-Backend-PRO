package com.backend.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Customers;
import com.backend.Entity.Property;
import com.backend.Repo.CustomerRepo;
import com.backend.Repo.PropertyRepo;




@Service
public class CustomerService {
	
		
	   
	    @Autowired
	    CustomerRepo customerRepo;
		
	    @Autowired
	    PropertyRepo propertyRepo;
	    
		@Autowired
		PropertyService propertyService;
		
		public Customers save(Customers customer) {
			
		    return customerRepo.save(customer);
		}
	    
	    public Customers signIn(Customers customer) {
	        
	       
	        return customerRepo.signIn(customer.getUsername(), customer.getPassword());

	       
	    }
	    
	    
	    public Customers buyProperty(Integer customerId, Integer propertyId) {

	        Customers loggedInCustomer = findCustomerById(customerId);

	       Property property = propertyService.findPropertyeById(propertyId);

	        loggedInCustomer.getProperty().add(property);

	        return save(loggedInCustomer);
	    }

	    public Customers findCustomerById(Integer customerId) {
	        return customerRepo.findById(customerId).get();
	    }
	    
	    
	        
	    
}
