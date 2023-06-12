package Collections;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class clearlog {
	static String url="https://encorecollections-test.senseitech.com";

	@Test
	public static void clear_log() {
		
		given().contentType(ContentType.JSON).headers("X-Auth-Token",Authority_token.X_auth()).body(new File("./Collections/clearlog.json")).when().put(url+"/api/receipts/update-error-code").then().log().body();
	}
	
	
}
