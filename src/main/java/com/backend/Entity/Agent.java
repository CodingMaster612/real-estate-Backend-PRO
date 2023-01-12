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
@Table(name="agent")
public class Agent {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="username")
	private String username;
	
	
	
	
	@Column(name="AccessKey")
	private Integer accesskey;
	
	@OneToMany
    @JoinColumn(name="Agent_id", referencedColumnName = "id")
    private List<Property> property;

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

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", username=" + username + ", accesskey=" + accesskey + ", property=" + property
				+ "]";
	}

	


	
	
}
