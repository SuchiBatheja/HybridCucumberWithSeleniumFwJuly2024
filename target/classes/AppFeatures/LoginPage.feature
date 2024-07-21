Feature: Login Page Feature

Scenario: Login Page Title
Given use is on login page
When user gets the title of the page
Then page title should be "Cogmento CRM"


Scenario: Forgot Password Link
Given use is on login page
Then forgot password link should be displayed


Scenario: Login with correct credentials
Given use is on login page
When user enters username "suchitest1988@gmail.com"
And user enters password "Nisha@1234"
And user clicks on the Login Button
Then user gets the title of the page
Then page title should be "Cogmento CRM"

