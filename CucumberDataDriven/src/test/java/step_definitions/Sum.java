package step_definitions;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sum {

	private List<Integer> numbers;
	private int sum;
	
	@Given("^a list of numbers$")
	public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
		this.numbers = numbers;
	}

	@When("^I summarize them$")
	public void i_summarize_them() throws Throwable {
		for (Integer number : numbers) {
			System.out.println(number);
			sum += number;
		}
	}

	@Then("^I should get (\\d+)$")
	public void i_should_get(int expectedSum) throws Throwable {
		assertThat(sum, is(expectedSum));
	}

}
