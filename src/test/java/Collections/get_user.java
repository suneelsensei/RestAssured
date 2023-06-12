package Collections;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class get_user {
	static String url = "https://encorecollections-test.senseitech.com";
	static int id=88;

	@Test
	public static void getuser() {
		
		given().headers("X-Auth-Token", Authority_token.X_auth())
				.get(url+"/api/users/byId/"+id).then().statusCode(200).log()
				.all();
	}

}
