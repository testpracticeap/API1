package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ResponseTest {
	 public List<Response> responseList;
     
     // Method to return the list
     // of employees
     public List<Response> getresponseList()
     {
   
         if (responseList == null) {
   
        	 responseList= new ArrayList<>();
   
                    
         }
   
         return responseList ;
   
            
     }
   
     public void
     setresponseList(
         List<Response> messageList)
     {
         this.responseList= responseList;
     }
 
}



