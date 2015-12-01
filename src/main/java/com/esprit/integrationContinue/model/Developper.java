package com.esprit.integrationContinue.model;

public class Developper  {

	private int idDevelopper;
	private String firstName;
	private String lastname;
	private String address;
	private String technologieKhnowledge;
	
	public Developper(){
		
	}

	public Developper(int idDevelopper, String firstName, String lastname, String address,
			String technologieKhnowledge) {
		super();
		this.idDevelopper = idDevelopper;
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.technologieKhnowledge = technologieKhnowledge;
	}

	public int getIdDevelopper() {
		return idDevelopper;
	}

	public void setIdDevelopper(int idDevelopper) {
		this.idDevelopper = idDevelopper;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTechnologieKhnowledge() {
		return technologieKhnowledge;
	}

	public void setTechnologieKhnowledge(String technologieKhnowledge) {
		this.technologieKhnowledge = technologieKhnowledge;
	}
	
	
	
	
}
