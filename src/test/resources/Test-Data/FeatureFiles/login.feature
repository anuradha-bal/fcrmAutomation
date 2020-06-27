Feature: To Launch CRM Application Home Page

Scenario Outline: Free CRM Login Page

Given user is on free crm login page
When user enters email "<email>"
And user enters password "<password>"
And user clicks on login button
Then user is on free crm home page
Then close the browser

Examples:
|email|password|
|abc@gmail.com|abc|
