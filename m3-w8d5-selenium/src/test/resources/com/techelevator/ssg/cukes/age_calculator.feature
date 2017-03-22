Feature: Alien Age Calculator 

#Test Mercury Age
Scenario: Test Mercury Age
Given I am on the age calculator input page
And I select the planet Mercury
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 124.58 years

#Test Venus Age
Scenario: Test Venus Age
Given I am on the age calculator input page
And I select the planet Venus
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 48.77 years

#Test Mars Age
Scenario: Test Mars Age
Given I am on the age calculator input page
And I select the planet Mars
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 15.95 years


#Test Jupiter Age
Scenario: Test Jupiter Age
Given I am on the age calculator input page
And I select the planet Jupiter
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 2.53 years


#Test Saturn Age
Scenario: Test Saturn Age
Given I am on the age calculator input page
And I select the planet Saturn
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 1.02 years


#Test Uranus Age
Scenario: Test Uranus Age
Given I am on the age calculator input page
And I select the planet Uranus
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 0.36 years


#Test Neptune Age
Scenario: Test Neptune Age
Given I am on the age calculator input page
And I select the planet Neptune
And I enter an age of 30 years old
When I submit the age calculator form
Then the calculated age should be 0.18 years

