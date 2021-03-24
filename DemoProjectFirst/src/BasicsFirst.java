import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicsFirst {

	public static void main(String[] args) {
		// Validate if Add Place APIis working as expected.
		//Principles of Rest Assured
		// given : All input details
		// when : Submit the API - resource , http method
		// Then : Validate the response
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/jason")
		.body(" \"location\": {\n" + 
				"    \"lat\": -38.383494,\n" + 
				"    \"lng\": 33.427362\n" + 
				"  },\n" + 
				"  \"accuracy\": 50,\n" + 
				"  \"name\": \"Frontline house\",\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\n" + 
				"  \"types\": [\n" + 
				"    \"shoe park\",\n" + 
				"    \"shop\"\n" + 
				"  ],\n" + 
				"  \"website\": \"http://google.com\",\n" + 
				"  \"language\": \"French-IN\"").when().post("maps/api/place/add/jason")
		.then().log().all().assertThat().statusCode(200);

	}

}
