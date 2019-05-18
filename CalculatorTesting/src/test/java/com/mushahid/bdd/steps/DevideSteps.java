package com.mushahid.bdd.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.mushahid.bdd.calculator.Calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DevideSteps {
	private Calculator calculator;
	 @Before
	    public void setUp() {
	        calculator = new Calculator();
	    }
	    
	   @Given("^I have a calculator1$")
	    public void i_have_a_calculator() throws Throwable {
	    	assertNotNull(calculator);
	    }

	    @When("^I devide (\\d+) and (\\d+)$")
	    public void i_devide_and(int arg1, int arg2) throws Throwable {
	    	calculator.devide(arg1, arg2);
	    }

	    @Then("^the answer should be (\\d+)$")
	    public void the_answer_should_be(int result) throws Throwable {
	    	assertEquals(result, calculator.getResult());
	    }

}
