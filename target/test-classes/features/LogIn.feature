Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
   
   Given user is on login
    When user enters username and password
    Then close browser