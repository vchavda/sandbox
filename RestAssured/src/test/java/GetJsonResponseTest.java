import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class GetJsonResponseTest {

	@BeforeClass
	public static void setBaseUri() {

		RestAssured.baseURI = "https://maps.googleapis.com";
	}

	
	@Test
	public void myFirstRestAssuredTest1() {

		 {
		        given().
		        when().
		           get("https://maps.googleapis.com/maps/api/place/textsearch/json?query=Churchgate%20Station&key=AIzaSyBrhdZP1wWpMXVEvzpY4-3W-FKieCYhVXg").
		        then().
		           statusCode(200);
		        
		    }	       
	}
	
	@Test
	public void myFirstRestAssuredTest2() {

		given()
				.params("query","Churchgate Station")
				.param("key", "AIzaSyBrhdZP1wWpMXVEvzpY4-3W-FKieCYhVXg")
		.when()
				.get("https://maps.googleapis.com/maps/api/place/textsearch/json")
		.then().statusCode(200).and().contentType(ContentType.JSON);
		

	}
	
	@Test
	public void myFirstRestAssuredTest3() {

		Response response = 
		given(getGenericRequestSpec())
		.expect().spec(getGenericResponseSpec())
		 .when()
				.get("https://maps.googleapis.com/maps/api/place/textsearch/json")
		.then()
		.extract().response();
		
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		

	}
	

	public  RequestSpecification getGenericRequestSpec() {
		RequestSpecBuilder rs = new RequestSpecBuilder();
		rs.setContentType(ContentType.JSON);
		rs.addQueryParam("query","Churchgate Station");
		rs.addQueryParam("key", "AIzaSyBrhdZP1wWpMXVEvzpY4-3W-FKieCYhVXg");
		return rs.build();
	}
	

	public  ResponseSpecification getGenericResponseSpec() {
		ResponseSpecBuilder rqs = new ResponseSpecBuilder();
		rqs.expectResponseTime(org.hamcrest.Matchers.lessThan(5L), TimeUnit.SECONDS);
		return rqs.build();

	}
	
	
}
