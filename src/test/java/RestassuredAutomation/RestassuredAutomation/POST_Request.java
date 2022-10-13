package RestassuredAutomation.RestassuredAutomation;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request {
	
	@Test
    public void PostDetails() {
		//Specify Base URL
		RestAssured.baseURI = "https://reqres.in/api/users";
		//RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		//Request Object
        RequestSpecification httpRequest = RestAssured.given();
        
        
        //Request payload sending along with post request
        JSONObject request=new JSONObject();
        
        request.put("id","1");
        request.put("email","prathik@gmail.com");
        request.put("first_name","Prathik");
        request.put("last_name","Hiremane");
        
        httpRequest.header("Content-Type","application/json");
        
        //Attach above data to the Request
        httpRequest.body(request.toJSONString());
        
      //Response Object
        Response response = httpRequest.request(Method.POST, " ");
        
        //Print response in Console Window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is" + responseBody);
      //  System.out.println(response.prettyPrint());
        
        //Status Code Validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is :" +statusCode);
        Assert.assertEquals(statusCode, 201);
        
//      String successCode=  response.jsonPath().get("SuccessCode");
//      Assert.assertEquals(successCode, "SUCCESS");
      
	}
}
