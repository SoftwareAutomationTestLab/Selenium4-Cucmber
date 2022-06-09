Feature: Test the Loginpage of website 
#https://www.saucedemo.com/

#Background:
#Given validate the browser
#When browser is triggered
#Then check if the browser is started

@RegTest
Scenario Outline: Login as a Standard  User
Given website1 is launched
When form1 is displayed
And enter valid credentials for1 <username> and <password>
Then product page must be displayed1
Examples:
|username |password |
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |