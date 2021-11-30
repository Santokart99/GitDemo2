Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser has started

@RegTest
Scenario: Home Page default login
Given User is on landing page
When User login into application with "username" and "password"
Then Home Page is displayed
And Cards are displayed "true"

@SmokeTest
Scenario: Home Page Santi Login
Given User is on landing page
When User login into application with "Santokart" and "password123"
Then Home Page is displayed
And Cards are displayed "false"

@RegTest
Scenario Outline: Multiple users Login
Given User is on landing page
When User login into application with "<Username>" and "<password>"
Then Home Page is displayed
And Cards are displayed "true"

Examples:
	
	|Username |password   |
	|San1234  |santo123   |
	|miguel345|password345|