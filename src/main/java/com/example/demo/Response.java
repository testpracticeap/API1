package com.example.demo;

public class Response {
	
	    private String Name;
	    private String Address;
	    private long PhoneNo ;
	    private int ID ;

	    public Response () {
	    	
	    }
	    public Response (int ID,String Name, String Address,long PhoneNo) {
	    	this.ID=ID;
	    	this.Name=Name;
	    	this.Address=Address;
	    	this.PhoneNo=PhoneNo;
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

	   public long getPhoneNo() {
	        return PhoneNo;
	    }

	   public void setPhoneNo(long PhoneNo) {
	        this.PhoneNo = PhoneNo;
	   }
	   public int getID() {
	        return ID;
	    }

	   public void setID(int ID) {
	        this.ID = ID;
	   }
	}

