Feature: Two column data driven.

Scenario: The sum of a list of numbers should be calculated
Given the price list for a coffee shop
    | coffee | 1 |
    | donut  | 2 |
When I order 1 coffee and 1 donut 
Then I should pay 3