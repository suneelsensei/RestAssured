package Collections;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BranchCreation {

//	static String url="https://encorecollections-test.senseitech.com";

	@Test
	public static void branch_creation() {

		given().contentType(ContentType.JSON).headers("X-Auth-Token", Authority_token.X_auth())
				.body(new File("./Collections/branchcreation.json")).when().post(Authority_token.URL + "/api/branches")
				.then().log().body();
		
	}
}
