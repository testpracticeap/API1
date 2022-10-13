package RestassuredAutomation.RestassuredAutomation;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_ValidatingJSONResponse {
	
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
        
//        //Verification of Response Body
        Assert.assertEquals(responseBody.contains("id"), true);
        
        
        //Verification of all Response Body
//        JsonPath jsonpath = response.jsonPath();
//         
//        System.out.println(jsonpath.get("id"));
//        System.out.println(jsonpath.get("email"));
//        System.out.println(jsonpath.get("first_name"));
//        System.out.println(jsonpath.get("last_name"));
//        
	}
}
