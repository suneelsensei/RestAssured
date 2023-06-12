package Engrow;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.io.File;

public class loanproposed {
	static String uid="225569421601636864";

	@Test
	public void updateloanproposed() {
		
		given().contentType(ContentType.JSON).headers("Authorization",login_BearerKey.bearer()).body(new File("./Engrow/loanproposed.json")).when().put("https://engrow-uat.senseitech.com/engrow-test-server/api/v1/applications/"+uid+"/save").then().statusCode(200).log().body();
		
	}

}
