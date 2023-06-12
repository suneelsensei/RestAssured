package Engrow;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class updatemobilenumber {
	//personcontextuid
//	String uid="205917478214271488";
//	String personuid="205920634889404928";

	@Test
	public void updateapplicant() {
		given().contentType(ContentType.JSON).headers("Authorization",login_BearerKey.bearer()).body(new File("./Engrow/updateapplicant.json")).put("https://engrow-uat.senseitech.com/engrow-server-new/api/v1/applications/"+uid+"/person/"+personuid+"/applicant/save").then().statusCode(200).log().body();
	}
}
