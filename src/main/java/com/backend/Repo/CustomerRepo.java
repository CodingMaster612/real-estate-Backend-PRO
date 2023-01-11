package com.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Customers;



@Repository         // Between the <,> first put the type of object, next the type of the primary key
public interface CustomerRepo extends JpaRepository<Customers, Integer>{
    
	// You make these to query your DB on non primary key columns
	// The ?1 is to represent the arguments in the function, first argument goes first, then second etc...
	// Annotate and give value= and nativeQuery=true so you can use easy SQL syntax
    @Query(value="select * from customers where username = ?1 && password=?2", nativeQuery=true)
    public Customers signIn(String email, String password);
    
    
} 