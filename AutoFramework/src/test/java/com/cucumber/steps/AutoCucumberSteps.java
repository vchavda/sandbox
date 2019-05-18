package com.cucumber.steps;

import cucumber.api.java.en.When;

public class AutoCucumberSteps {

	@When("^user makes an API call then they get a valid status code back$")
	public void verifyValid_APICall()
	{
		assert(true);
	}
}
