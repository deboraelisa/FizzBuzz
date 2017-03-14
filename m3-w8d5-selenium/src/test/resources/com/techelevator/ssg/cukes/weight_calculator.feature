Feature: Alien Weight Calculator

#Test Martian Weight (# comment)
Scenario: Test Martian Weight
Given I am on the weight calculator input page
And I choose the planet Mars
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 38.0 pounds

Scenario: Test Jupiter Weight
Given I am on the weight calculator page
And I choose the planet Jupiter
And I enter a weight 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 234 pounds