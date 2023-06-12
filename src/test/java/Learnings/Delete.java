package Learnings;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Delete {

	@Test
	public void test() {

		when().delete("https://reqres.in/api/users/2").then().statusCode(200).log().all();

	}

}
