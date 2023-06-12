package Learnings;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Patch {

	@Test
	public void test() {


		JSONObject json = new JSONObject();
		json.put("name", "Suneel");
		json.put("job", "Test");
		System.out.println(json);

		given().body(json.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log()
				.all();

	}

}
