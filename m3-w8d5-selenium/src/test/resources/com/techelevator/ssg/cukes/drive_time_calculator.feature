Feature: Alien Drive Time Calculator

#Test Mercury Drive Time 20 years old, walking
Scenario: Test Mercury Drive Time 
Given I am on the drive time calculator input page
And I pick the planet Mercury
And I choose the transportation Walking
And I input an age of 20 years old
When I deliver the drive calculator form
Then the result drive time should be 2167.97 years
And the age after arrival will be 2187.97 years

#Test Mercury Drive Time 20 years old, car
Scenario: Test Mercury Drive Time 
Given I am on the drive time calculator input page
And I pick the planet Mercury
And I choose the transportation Car
And I input an age of 20 years old
When I deliver the drive calculator form
Then the result drive time should be 65.04 years
And the age after arrival will be 85.04 years
