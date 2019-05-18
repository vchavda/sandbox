Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5

  Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 9 and 3
    Then the result should be 27

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 9 and 3
    Then the result should be 6
