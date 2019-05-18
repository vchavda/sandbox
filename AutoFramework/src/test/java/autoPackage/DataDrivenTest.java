package autoPackage;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;

//-----------------------------------------------------------------------------//
// this test class demos how you can read values from csv using Serenity       //
//-----------------------------------------------------------------------------//


//serenity knows upto the resource folder and therfore no need to provide the whole path
//we use @RunWith(SerenityParameterizedRunner.class) for when you run with data driven tests (eg reading from csv)
//@Concurrent runs 2 threads per CPU by default (eg if is duel core then 4 tests will run in parallel) but you can also specify the number of threads
// you want per cpu eg 4 threads per cpu would be defined as @Concurrent(threads="4x")
// note @Concurrent can only be used with paramatersized tests 
@Concurrent
@UseTestDataFrom("testdata/testdata.csv")
@RunWith(SerenityParameterizedRunner.class)
public class DataDrivenTest {

	//create member variables for the column names in the csv file
	private String firstname;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private String lastname;
	
	@Test
	public void displayStudents() {
		System.out.println("firstname: " + firstname + " lastname: " + lastname);
	}
	
	
}

