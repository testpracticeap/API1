package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController

public class Controller {
	   
//    @Autowired
//   private  Response response;   
//    
    @RequestMapping("/Function")
    public Response Sample(
    	@RequestParam(value = "Name", defaultValue = "Prathik") String Name,
        @RequestParam(value = "Address ", defaultValue = "ABC") String Address ,
        @RequestParam(value = "PhoneNo ", defaultValue = "9483084638") long PhoneNo ,
        @RequestParam(value = "ID ", defaultValue = "11") int ID )
    {
        Response response = new Response();
    	//response.setStudentName(StudentName);
        response.setName("Your name is "+Name);
        response.setAddress("Your Address is "+Address);
        response.setPhoneNo(PhoneNo);
        response.setID(ID);
        return response;

   }
    @GetMapping(
            path = "/",
            produces = MediaType.APPLICATION_JSON_VALUE)
      
  public ResponseTest getResponseTest()
   {
    	ResponseDAO messagedao=new ResponseDAO();
       return messagedao.getAllResponseTest();
           
   }
    
    }

	
	

