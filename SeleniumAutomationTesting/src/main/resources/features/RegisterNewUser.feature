Feature: Register a new user 

  @runthis
  Scenario:  Register new user 
  	Given I navigate to the register page
    When I fill in the new user details
    Then I should be registered to the system