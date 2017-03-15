Feature: Alien Age Calculator 

#Test Mercury Age
Scenario: Test Mercury Age
Given I am on the age calculator input page
And I select the planet Mercury
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 124.58 years

