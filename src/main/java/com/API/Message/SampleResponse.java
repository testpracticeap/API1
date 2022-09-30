package com.API.Message;

import org.springframework.stereotype.Repository;

@Repository
public class SampleResponse {
	private String Name;
	private String Address;
	private int EmpID;
	private String Technicaldomain;
	private String Designation;

	public SampleResponse() {

	}

	public SampleResponse(String Name, String Address, String Technicaldomain, String Designation, int EmpID) {
		this.Name = Name;
		this.Address = Address;
		this.EmpID = EmpID;
		this.Technicaldomain = Technicaldomain;
		this.Designation = Designation;

	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	
	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int EmpID) {
		this.EmpID = EmpID;
	}

	public String getTechnicaldomain() {
		return Technicaldomain;
	}

	public void setTechnicaldomain(String Technicaldomain) {
		this.Technicaldomain = Technicaldomain;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}

}
