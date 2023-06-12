package Collections;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Authority_token {
	static String URL = "https://encorecollections-test.senseitech.com";
	
	
	public static String X_auth() {
		JSONObject json = new JSONObject();
		json.put("username", "sharan");
		json.put("password", "Admin@123");
		
		String token = given().contentType(ContentType.JSON).body(json.toJSONString()).when().post(URL+"/api/sign-in").getHeaders()
				.getValue("X-Auth-Token");
//		System.out.println(token);
		return token;
	}
	
	@Test
	public static void test() {
		System.out.println(X_auth());
	}
	
}
