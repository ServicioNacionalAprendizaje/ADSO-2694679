package com.sena.servicesecurity.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "view")
public class View  extends ABaseEntity { 
	
	@Column(name = "name", length = 50, nullable = false)
    private String name;
    
    @Column(name = "route", length = 50, nullable = false)
    private String route;
    
    @Column(name = "description", length = 50, nullable = false, unique = true)
    private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
