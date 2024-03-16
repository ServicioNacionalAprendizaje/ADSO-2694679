package com.sena.servicesecurity.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "module", schema = "security")
public class Module  extends ABaseEntity { 
	@Column(name = "name", length = 50, nullable = false)
    private String name;
    
    @Column(name = "route", length = 50, nullable = false)
    private String route;
    
    @Column(name = "description", length = 50, nullable = false, unique = true)
    private String description;

	@NotNull
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "module_view", schema = "security", joinColumns = @JoinColumn(name = "module_id"), inverseJoinColumns = @JoinColumn(name = "view_id"))
	private Set<View> view = new HashSet<>();

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
