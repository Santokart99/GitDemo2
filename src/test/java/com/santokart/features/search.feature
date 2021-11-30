Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for items and then move to checkout page
Given User is on Greencart Landing page
When User searched for "Brinjal" vegetable
And Added items to cart
And User proceed to Checkout page to purchase
Then Verify selected "Brinjal"