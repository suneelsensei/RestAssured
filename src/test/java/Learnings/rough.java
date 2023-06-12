package Learnings;

import static io.restassured.RestAssured.given;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;

public class rough {

//	@Test
	public void auth() {
		JSONObject json = new JSONObject();

		json.put("username", "sharan");
		json.put("password", "Admin@123");

		
		  Headers e = given().contentType(ContentType.JSON).body(json.toJSONString()).when().post("https://encorecollections-test.senseitech.com/api/sign-in").getHeaders();
		
		 System.out.println(e.toString());
		 
		String r = e.getValue("X-Auth-Token");
		 System.out.println(r);
		 
//		 given().headers("X-Auth-Token", r)
//			.get("https://encorecollections-test.senseitech.com/api/users/byId/88").then().statusCode(200).log()
//			.body();
	}

}







