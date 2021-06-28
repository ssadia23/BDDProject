#@OtherLogin @Regression
#Feature: Validate TechFios login functionality using scenario outline
#
#Background: 
#	Given User is on the Techfios login page
#
#@OtherScenario1 @Smoke
#Scenario Outline: User should be able to login with valid credentials
#	When User enters the "<username>" and "<password>"
#	And User clicks on login button 
#	Then User should be able to see the dashboard
#	Examples: 
#	|username           | password|
#	|demo@techfios.com  | abc123  |
#	|demo2@techfios.com | abc123  |
#	
#@OtherScenario2 @Smoke
#Scenario Outline: User should be able to login with valid credentials
#	When User enters "<username>" and "<password>"
#	And User clicks on signin button 
#	Then User should be land on Dashboard page
#	Examples: 
#	|username           | password |
#	|demo@techfios.com  | abc1233  |              