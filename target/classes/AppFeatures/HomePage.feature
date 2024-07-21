
Feature: Account Page Feature

Background: 
Given user has already logged in to application
| username | password |
| suchitest1988@gmail.com | Nisha@1234 |



Scenario: Accounts Page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "Cogmento CRM"


Scenario: Accounts Page settings
Given user is on Accounts page
When user selects settings icon
Then settings drop down should be shown

