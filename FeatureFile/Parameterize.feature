Feature: To Open Orange Hrm Website and login
Scenario Outline: Open the Orange HRM with right username and password
Given User enters the Orange HRM url in login screen
When  Enters the <Username> and <password>
And   Clicks on 1 login button


Examples:
|Username |password|
|Admin | admin123|