package Learnings;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.sun.xml.fastinfoset.util.StringArray;

import groovy.json.JsonParser;
import io.restassured.http.ContentType;
import io.restassured.internal.mapping.JsonbMapper;
import io.restassured.path.json.JsonPath;

public class Put {

	
	
	
	
/*	@Test
	*
	 * public void test() {
	 * 
	 * // Map<String, Object> map = new HashMap<String, Object>(); //
	 * map.put("name", "Suneel"); // map.put("job","TEst"); // //
	 * System.out.println(map);
	 * 
	 * JSONObject json = new JSONObject(); json.put("name", "Suneel");
	 * json.put("job", "Test"); System.out.println(json);
	 * 
	 * given().body(json.toJSONString()).when().put("https://reqres.in/api/users/2")
	 * .then().statusCode(200).log().all();
	 * 
	 * }
	 */
	
	
	
//	@Test
	public void test() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Suneel");
//		map.put("job","TEst");
//		
//		System.out.println(map);
		
		JSONObject json = new JSONObject();
		json.put("name", "Suneel");
		json.put("job", "Test");
		
		System.out.println(json);
		
		given().body(json.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
	}

	@Test
	public void test1() {
		
//		JsonPath.from(new java.io.File("./body/body.json"))
		given().contentType(ContentType.JSON).headers("X-Auth-Token",POST_learning.Automaticallypass_KEY_API()).body(new File("./body/user.json")).when().put("https://encorecollections-test.senseitech.com/api/users").then().log().body();
	
		
	}
	
	
	
	
	
}
