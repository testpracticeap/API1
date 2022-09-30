package com.API.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.API.Message.SampleResponse;
import com.API.Message.PostRequest;


@RestController
public class MessageController {
	
	@RequestMapping(value="/function", method = RequestMethod.POST)
	public SampleResponse function(@RequestBody PostRequest Test) {
		SampleResponse response = new SampleResponse();
		response.setName(Test.getName());
		response.setEmpID(Test.getEmpID());
		return response;
	}
	
	//	@RequestParam(value = "Name", defaultValue ="Prathik")String Name;	
//		{
//			SampleResponse respose = new 
//		}
//			)
	
	
	
//	@GetMapping(
//			path = "/",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public Messages getMessages()
//	{
//		PostRequest postrequest=new PostRequest();
//		return postrequest.
//	}
//	
//	@PostMapping(
//			path = "/",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public SampleResponse addMessages(
//			@RequestBody SampleResponse response)
//	{
//		PostRequest postrequest = new PostRequest();
//		Integer id =postrequest.size();
//	}
//			
			

	}
	
	
	
	
		
		
	
	
	


