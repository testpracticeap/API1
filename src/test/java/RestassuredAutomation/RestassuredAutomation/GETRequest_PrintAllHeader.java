package RestassuredAutomation.RestassuredAutomation;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETRequest_PrintAllHeader {
	
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
        
       //Capture all the headers from Response 
        Headers allheaders = response.headers();
        
        for(Header header:allheaders)
        {
        System.out.println(header.getName()+ "   "+ header.getValue());
        }

}
}