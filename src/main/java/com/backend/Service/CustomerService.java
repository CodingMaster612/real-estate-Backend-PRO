package com.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Customers;
import com.backend.Repo.CustomerRepo;




@Service
public class CustomerService {
	
		
	   
	    @Autowired
	    CustomerRepo customerRepo;
		
	    
	    
		
		
		public Customers save(Customers customer) {
			
		    return customerRepo.save(customer);
		}
	    
	    public Customers signIn(Customers customer) {
	        
	       
	        return customerRepo.signIn(customer.getUsername(), customer.getPassword());

	       
	    }
	    
	    
	        
	    
}
