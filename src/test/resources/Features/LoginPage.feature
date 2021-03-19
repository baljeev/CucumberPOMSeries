Feature: Login Page Feature

Scenario: Login Page Title
Given  user is on login page
When  user get the title of the page
Then  page title should be "Login - My Store"

Scenario: Forgot Password Link
Given  user is on login page
Then  forgot password link should be displayed

Scenario: Login with Correct Credentials
Given  user is on login page
When  user enters username "baljeev@gmail.com"
And  user enters password "Selenium12345"
And user clicks on login button
Then user get the title of the page
And  page title should be "My account - My Store"


