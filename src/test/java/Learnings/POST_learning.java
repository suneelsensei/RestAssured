package Learnings;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class POST_learning {
	static String URL = "https://encorecollections-test.senseitech.com/api/sign-in";

	/*
	 * @Test public void test() {
	 * 
	 * // Map<String, Object> map = new HashMap<String, Object>(); //
	 * map.put("name", "Suneel"); // map.put("job","TEst"); // //
	 * System.out.println(map);
	 * 
	 * JSONObject json = new JSONObject(); json.put("name", "Suneel");
	 * json.put("job", "Test"); System.out.println(json);
	 * 
	 * given().body(json.toJSONString()).when().post("https://reqres.in/api/users").
	 * then().statusCode(201).log().all();
	 * 
	 * }
	 */

//	@Test
	public static String Automaticallypass_KEY_API() {

		JSONObject json = new JSONObject();

		json.put("username", "sharan");
		json.put("password", "Admin@123");

//		  json.put("status",true); 
//		  json.put("reasonCode",null);
//		  json.put("reason",null);

//		System.out.println(json);
		
		String token = given().contentType(ContentType.JSON).body(json.toJSONString()).when().post(URL).getHeaders()
				.getValue("X-Auth-Token");

//		System.out.println(f);

//		given().headers("X-Auth-Token", token).get("https://encorecollections-test.senseitech.com/api/users/byId/88")
//				.then().statusCode(200).log().body();
		return token;
	}
	
	@Test
	public void createuser(){
		
		given().contentType(ContentType.JSON).headers("X-Auth-Token",Automaticallypass_KEY_API()).body(new File("./body/createuser.json")).when().post("https://encorecollections-test.senseitech.com/api/users").then().log().all();

		
		
	}
	
	
	
	
	
	
}
