package Engrow;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class login_BearerKey {
	static String url = "https://engrow.conatus.co.in/engrow-server";

	/*
	 * @Test public void user() {
	 * given().headers("Authorization",bearer()).get(url+"/api/users/111").then().
	 * statusCode(200).log().body();
	 * 
	 * }
	 */

	@Test
	public static String bearer() {
		String bearer = given().contentType(ContentType.JSON).body(new File("./Engrow/Engrowlogin.json")).when()
				.post(url + "/api/authenticate").getHeader("Authorization");
//		System.out.println(bearer);

		return bearer;
	}

}
