package com.backend.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {

	
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="username")
	private String username;
	
	
	@Column(name="password")
	private String password;
	
	
	@OneToMany
    @JoinColumn(name="Property_id", referencedColumnName = "id")
    private List<Property> property;


	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customers(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Property> getProperty() {
		return property;
	}


	public void setProperty(List<Property> property) {
		this.property = property;
	}


	@Override
	public String toString() {
		return "Customers [id=" + id + ", username=" + username + ", password=" + password + ", property=" + property
				+ "]";
	}


	


	
	
	
	
}
