package Learnings;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.gson.*;

import groovy.json.JsonParser;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseLogSpec;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GET_Learning {

	/*
	 * @Test public void test() {
	 * 
	 * Response r = get("https://reqres.in/api/users?page=2");
	 * 
	 * // System.out.println("Status code:"+r.getStatusCode()); //
	 * System.out.println("Time to load:"+r.getTime()); //
	 * System.out.println("Body:"+r.getBody().asString()); //
	 * System.out.println("Status Line:"+r.getStatusLine()); //
	 * System.out.println("header:"+r.getHeader("content-type"));
	 * 
	 * Assert.assertEquals(r.getStatusCode(), 200); }
	 * 
	 * 
	 * @Test public void test1() {
	 * 
	 * baseURI = "https://reqres.in/api";
	 * 
	 * given().get("/users?page=2").then().body("data[0].first_name",
	 * equalTo("Michael"));
	 * 
	 * }
	 * 
	 * @Test public void test2() {
	 * 
	 * given().get("https://reqres.in/api/users/23").then().statusCode(404);
	 * 
	 * }
	 * 
	 * @Test public void test3(){
	 * 
	 * given().get("https://reqres.in/api/users?page=2").then().body(
	 * "data.first_name", hasItems("Lindsay","Tobias"));
	 * 
	 * }
	 */

//	@Test
	public void collections() {


		/*
		  given().headers("X-Auth-Token", "e01f5b68-c2fc-4803-80ae-d7d13b76a1f7").get(
		  "https://encorecollections-test.senseitech.com/api/users/byId/88")
		  .then().statusCode(200).log().all();
		 */

//		String y = given().headers("X-Auth-Token", "829a5e1a-0cef-4539-9edc-959ef876db9f")
//				.get("https://encorecollections-test.senseitech.com/api/users/byId/88").getContentType();
//		System.out.println(y);
		
		
		
		given().headers("X-Auth-Token", POST_learning.Automaticallypass_KEY_API()).get(
				  "https://encorecollections-test.senseitech.com/api/users/byId/88")
				  .then().statusCode(200).log().all();
		
		
	}
		
		@Test
		public void test1() throws Exception {
			
		 
//		given().headers("X-Auth-Token", POST_learning.Automaticallypass_KEY_API()).get(
//					  "https://encorecollections-test.senseitech.com/api/users?page=0&size=10&sort=id,desc")
//					  .then().statusCode(200).log().body();
		
		Response R = given().headers("X-Auth-Token", POST_learning.Automaticallypass_KEY_API()).get(
				  "https://encorecollections-test.senseitech.com/api/users?page=0&size=10&sort=id,desc");
	
		com.google.gson.JsonParser jp = new com.google.gson.JsonParser();
		JsonArray d = jp.parse(R.asString()).getAsJsonArray();
		List<POJO> pojo = new ArrayList<POJO>();
//		Map<String, String>  values = new HashMap<String,String>();
//		List<String> q = new ArrayList<String>();
		for (JsonElement o : d) {
			JsonObject f = o.getAsJsonObject().get("userDTO").getAsJsonObject();
//			values.put(f.get("id").getAsString(), f.get("emailAddress").getAsString());
//			q.add(f.get("id").getAsString());
//			q.add(f.get("emailAddress").getAsString());
			

		
			pojo.add(new com.fasterxml.jackson.databind.ObjectMapper().readValue(f.toString(), POJO.class));
		}
		System.out.println(pojo.get(0).getId());
		}

}
