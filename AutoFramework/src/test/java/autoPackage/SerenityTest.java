package autoPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import autoSteps.AutoSteps;
import autoUtils.ReusableSpecifications;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class SerenityTest {


	@Steps
	AutoSteps steps;
	
	@BeforeClass
	public static void setBaseUri() {

		RestAssured.baseURI = "https://maps.googleapis.com";
	}
		
	@Test
    public void test1 () {
		assert(false);
    }
	

	// to run the tag in the maven command just put clean verify -Dtags="autoFrame:PENDING"
	@WithTag("autoFrame:PENDING")
	@Pending
	@Test
    public void test2 () {
    }
	
	// to run multiple tags in the maven command just put clean verify -Dtags="autoFrame:PENDING,autoFrame:SMOKE"
	@WithTag("autoFrame:SMOKE")
	@Ignore
	@Test
    public void test3 () {
    }
	
	@Test
    public void test4 () {
		System.out.println("this is an error " + (5/0));
    }
	
	
	
	@Test
	// this one is a compromised test which the error (fileNotFoundException) is defined in the serenity.properties file
    public void test5 () throws FileNotFoundException
	{
			File file = new File("E://dummy.txt");
			FileReader fr = new FileReader(file);
    }


	@Manual
	@Test
    public void test6 () {
		System.out.println("this is manual test");
    }

	
	@Title("this test will make an API call")
	@Test
    // the title annotaion is suppose to print this on the report to give it a more meaningful description of the test
	public void myFirstRestAssuredTest1() {

		 {
			 	// we can have steps for reusable methods - this step will also show in the serenity report.
			 	steps.reusableStep("Bob");
			 	steps.reusableStep2("joe");
			 
			 	// we use SerenityRest instead of RestAssured here to give the request/response back on the serenity report.
		        SerenityRest.given().
		        spec(ReusableSpecifications.getGenericRequestSpec()).
		        when().
		           get("/maps/api/place/textsearch/json?query=Churchgate&key=AIzaSyBrhdZP1wWpMXVEvzpY4-3W-FKieCYhVXg").
		        then().
		           statusCode(200);
		        
		    }	       
	}
}
