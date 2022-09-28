package com.example.demo;

public class ResponseDAO {
	public static ResponseTest list = new ResponseTest();
	//This static block is executed
	//before executing the main
	//block
 static
 {
	   // Creating a few employees
	    // and adding them to the list
	    list.getresponseList().add(new Response( 1,"Prathik","ABCD",1234567));
	   list.getresponseList().add(new Response(2,"RAVI","HOME",456));
       list.getresponseList().add(new Response(3,"RAJU","XYZ",1234));
	   list.getresponseList().add(new Response(4, "RAM","ABCD",567));    
	}

	//Method to return the list
	public ResponseTest getAllResponseTest()
	{
	   return list;
	}


}
