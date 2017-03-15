Feature: Alien Weight Calculator

#Test Mercury Weight (# comment)
Scenario: Test Mercury Weight 
Given I am on the weight calculator input page
And I choose the planet Mercury
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 37.0 pounds

#Test Venus Weight
Scenario: Test Venus Weight
Given I am on the weight calculator input page
And I choose the planet Venus
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 90.0 pounds

#Test Martian Weight 
Scenario: Test Martian Weight
Given I am on the weight calculator input page
And I choose the planet Mars
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 38.0 pounds

#Test Jupiter Weight
Scenario: Test Jupiter Weight
Given I am on the weight calculator input page
And I choose the planet Jupiter
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 265.0 pounds

#Test Saturn Weight
Scenario: Test Saturn Weight
Given I am on the weight calculator input page
And I choose the planet Saturn
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 112.99999999999999 pounds

#Test Uranus Weight
Scenario: Test Uranus Weight
Given I am on the weight calculator input page
And I choose the planet Uranus
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 109.00000000000001 pounds

#Test Neptune Weight
Scenario: Test Neptune Weight
Given I am on the weight calculator input page
And I choose the planet Neptune
And I enter a weight of 100 pounds
When I submit the weight calculator form
Then the calculated weight should be 143.0 pounds