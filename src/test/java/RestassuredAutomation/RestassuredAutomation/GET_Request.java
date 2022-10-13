package RestassuredAutomation.RestassuredAutomation;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Request {
	
	@Test
    public void GetDetails() {
		//Specify Base URL
		RestAssured.baseURI = "https://reqres.in/api/users";
		//RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		//Request Object
        RequestSpecification httpreq = RestAssured.given();
        //Response Object
        Response response = httpreq.request(Method.GET, "");
        //Print response in Console Window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is" + responseBody);
      //  System.out.println(response.prettyPrint());
        
      //Status Code Validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is :" +statusCode);
        Assert.assertEquals(statusCode, 200);
        
        //Validating Header
        
       //Capture detailes of Content-Type header
        String contentType = response.header("content-Type");
        System.out.println("content Type is :" +contentType);
        Assert.assertEquals(contentType,"application/json; charset=utf-8");
        
//        //Capture detailes of Content-Encoding header
        String contentEncoding = response.header("content-Encoding");
        System.out.println("content Encoding is :" +contentEncoding);
        Assert.assertEquals(contentEncoding,"gzip");
        
        
       
       
		//Status Line Verification
//        String statusLine = response.getStatusLine(); 
//        System.out.println("Status Line is :" +statusLine);
//        Assert.assertEquals(statusLine, "HIIP/1.1 200 OK");
//	
	}

}
