Feature: Cart Page

Scenario: Check AddToCartPage product
Given user is on cart page
When clicks on cart link
And handles the alert pop up
Then user navigated to placeOrderpage
