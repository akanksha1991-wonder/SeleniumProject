import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.ReUsableMethods;
import Files.payLoad;

import static io.restassured.RestAssured.*;
public class basicThird {

	public static void main(String[] args) {
		RestAssured.baseURI= "https://www.rahulshettyacademy.com";
		String response= given().queryParam("key", "qaclick123").header("Content-Type","application/jason")
		.body(payLoad.AddPlace()).when().post("maps/api/place/add/jason")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP" ))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);//for parsing json
		String placeId=js.getString("place_id");
		System.out.println("place_id");
		
		//Update place
		String newAddress = "Summer walk, Africa";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/jason")
		.body("\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\",\r\n")
		.when().put("maps/api/place/add/jason")
		.then().statusCode(200).body("msg",equalTo ("Address successfully updated"));
		String getPlaceResponse;
		JsonPath js1=ReUsableMethods.rawToJson(getPlaceResponse);
		//Get Place
		String getPlaceResponse1=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/jason").then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath.js1=new JsonPath(getPlaceResponse1);
		String actualAddress=js1.getString("address");
		System.out.println(actualAddress);
		String expected;
		Assert.assertEquals(actualAddress, expected);
		
		

	}

}