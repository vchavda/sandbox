package step_definitions;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoColumnTable {

    private Map<String, Integer> priceList;
	private int totalSum;
	
	
	@Given("^the price list for a coffee shop$")
	public void the_price_list_for_a_coffee_shop(Map<String, Integer> priceList) throws Throwable {
		this.priceList = priceList;			
	}

	
	@When("^I order (\\d+) (.*) and (\\d+) (.*)$")
	public void i_order_Coffee_and_Donut(int numberOfFirstItems, String firstItem,
            int numberOfSecondItems, String secondItem) throws Throwable {

		int firstPrice = priceList.get(firstItem);
        int secondPrice = priceList.get(secondItem);

        totalSum += firstPrice * numberOfFirstItems;
        totalSum += secondPrice * numberOfSecondItems;
	}

	@Then("^I should pay (\\d+)$")
	public void i_should_pay(int expectedCost) throws Throwable {
		 Assert.assertEquals(totalSum, expectedCost);
	}
	
}
