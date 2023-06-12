package Engrow;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getallcollateraltype {

//	String uid = "442261519368342016";

	@Test
	public void getalluids() {
		JSONObject json = new JSONObject();
		json.put("show", "ALL");

first:		for (int i = 0;; i++) {
			Response res = given().contentType(ContentType.JSON).headers("Authorization", login_BearerKey.bearer())
					.body(json.toJSONString())
					.post(login_BearerKey.url + "/api/application/list?page=" + i + "&size=50&sort=submissionDate,desc")
					.then().extract().response();
			for (int j = 0; j < 50; j++) {
				String alluids = res.jsonPath().getString("content.uid[" + j + "]");
//				System.out.println(alluids);
				String collateral_type = given().contentType(ContentType.JSON)
						.headers("Authorization", login_BearerKey.bearer())
						.get(login_BearerKey.url + "/api/application/" + alluids + "/collateral").then().extract()
						.response().jsonPath().getString("collateral.collateralType");
				try {
					boolean present_coll = collateral_type.equals("[SORCP_RCC]")
							|| collateral_type.equals("[SORCP_NRCC]");

					if (present_coll) {
						System.out.println(alluids + ":" + collateral_type);
					}
				} catch (NullPointerException e) {
					System.out.println("Applications search is completed");
					break first;
				}
			}
		}
	}

//	@Test
//	public void getallapplicationscollateraltype() {
//
//		String collateral_type = given().contentType(ContentType.JSON)
//				.headers("Authorization", login_BearerKey.bearer())
//				.get(login_BearerKey.url + "/api/application/" + uid + "/collateral").then().extract().response()
//				.jsonPath().getString("collateral.collateralType");
//
//		System.out.println(collateral_type);
//
//	}
}
