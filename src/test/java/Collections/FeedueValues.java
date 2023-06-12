package Collections;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Engrow.login_BearerKey;
import io.restassured.http.ContentType;

public class FeedueValues {
	@Test
	public void feedue() {
	String feedue = given().contentType(ContentType.JSON).headers("X-Auth-Token", Authority_token.X_auth())
				.get(Authority_token.URL
						+ "/api/collectionItems?page=0&size=50&sort=dpd,desc&openFlag=true&taskCategories=COLLECT")
				.then().extract().response().jsonPath().getString("feeDue");
	System.out.println(feedue);
	}
}
