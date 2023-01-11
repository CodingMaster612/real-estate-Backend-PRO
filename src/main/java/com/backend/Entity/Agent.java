package com.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agent")
public class Agent {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="UserName")
	private String username;
	
	
	
	
	@Column(name="AccessKey")
	private Integer accesskey;

	public Agent() {
		super();
	}


	public Agent(Integer id, String username, Integer accesskey) {
		super();
		this.id = id;
		this.username = username;
		this.accesskey = accesskey;
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


	public Integer getAccesskey() {
		return accesskey;
	}


	public void setAccesskey(Integer accesskey) {
		this.accesskey = accesskey;
	}


	@Override
	public String toString() {
		return "Agent [id=" + id + ", username=" + username + ", accesskey=" + accesskey + "]";
	}
	
	
}
