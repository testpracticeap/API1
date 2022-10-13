package RestassuredAutomation.RestassuredAutomation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETandPOST_Request {
	@Before
	public void setup()

	{

		RestAssured.baseURI = "https://reqres.in/api/users";

	}
	@Test
	public void GetRequest() throws IOException

	{

		byte[] b = Files.readAllBytes(Paths.get("src/test/resource/json/Test.json"));

		String bdy = new String(b);

		Response response = given().
                 header("Content-Type", "application/json").
				and()
				.body(bdy)
				.when()
				.post("/users")
				.then()
				.log().all().extract().response();

		Assert.assertEquals(201, response.statusCode());
		Assert.assertEquals("TEST", response.jsonPath().getString("name"));
		Assert.assertEquals("tester", response.jsonPath().getString("job"));

	}
	}