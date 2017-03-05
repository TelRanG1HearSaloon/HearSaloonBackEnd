package com.borislav.project.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class Master{
	  String email;
	  String password;
	  String name;
	  String lastName;
	  String phoneNumber;
	  String info;
	  ArrayList<Service> services;
	  ArrayList<String> arrLocations;
	  ArrayList<String> languages;
	  
	  public void addService(Service service){
		  this.services.add(service);
	  }
	  
	  public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public ArrayList<String> getArrLocations() {
		return arrLocations;
	}

	public void setArrLocations(ArrayList<String> arrLocations) {
		this.arrLocations = arrLocations;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public Master() {
	
	}

	public Master(String email, String password, String name, String lastName, String phoneNumber)
	  {
	    this.email = email;
	    this.password = password;
	    this.name = name;
	    this.lastName = lastName;
	    this.phoneNumber = phoneNumber;
	    this.services = new ArrayList();
	    this.arrLocations = new ArrayList();
	  }

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
		      return false;
		    }
		Master master = (Master) obj;
		return master.email == null ? true: this.email != null ? this.email.equals(master.email):false;
		
	}

	@Override
	public int hashCode() {
		int result = this.email != null ? this.email.hashCode():0;
		result = 31 * result + this.name != null ? this.name.hashCode():0;
		result = 32 * result + this.password != null ? this.password.hashCode():0;
		result = 32 * result + this.lastName != null ? this.lastName.hashCode():0;

		return result;
	}
	  
/*	  public void changesServices(ArrayList<Service> tempService) {}
*/	
	




}