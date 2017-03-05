package com.borislav.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@XmlRootElement

public class Services implements Serializable {
	private static final long serialVersionUID = 1L;
	List<Service> services;

	public Services(List<Service> services) {
		this.services = services;
	}

	public Services() {
		this.services = new ArrayList<Service>();
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

}
