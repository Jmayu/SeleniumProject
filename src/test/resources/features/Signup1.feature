
Feature: signup page functionality 
Scenario Outline: check with valid credentilas
Given user is on signup page
When  user enters "<un>" and "<pw>"
And clicks on signup button
Then navigate to main page

    Examples: 
      | un  | pw | 
      | Mayuj | Mayuj | 
      
