Feature: Form functionality test
@SmokeTests 
  Scenario: Check FillFormPage with valid product
    Given user is on FillForm page
    When  user enters Name
    And user enter Country 
    And user enters City 
    And user enters CreditCard 
    And user enters Month 
    And user enters Year 
    And clicks on purchase button
    Then user validate the title and purchase message
    And clicks on ok button
    Then close browser
    
