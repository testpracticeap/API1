package RestassuredAutomation.RestassuredAutomation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Delete_Request {
	
	@Before
	public void setup()

	{

		RestAssured.baseURI = "https://reqres.in/api/users";
	}
	
	@Test
	public  void delete() throws IOException
	{
	byte[] b = Files.readAllBytes(Paths.get("src/test/resource/json/Test.json"));

	String bdy = new String(b);

	Response response = given().

			header("Content-Type", "application/json").
			and()
			.body(bdy)
			.when()
			.delete("/users")
			.then()
			.log().all().extract().response();
	
	//Assert.assertEquals("TEST", response.jsonPath().getString("name"));
	//Assert.assertEquals("tester", response.jsonPath().getString("job"));
	}

}
