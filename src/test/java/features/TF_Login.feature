#@Login @Regression
#Feature: Validate TechFios login functionality
#
#Background: 
#	Given User is on the techfios login page
#
#@Scenario1 @Smoke
#Scenario: User should be able to login with valid credentials
#	When User enters username as "demo@techfios.com" 
#	When User enters password as "abc123"
#	And User clicks on signin button 
#	Then User should be land on Dashboard page
#	
#@Scenario2
#Scenario: User should be able to login with valid credentials
#	When User enters username as "demo222@techfios.com" 
#	When User enters password as "abc123"
#	And User clicks on signin button 
#	Then User should be land on Dashboard page
#
#@Scenario3	
#Scenario: User should be able to login with valid credentials
#	When User enters username as "demo@techfios.com" 
#	When User enters password as "abc12345"
#	And User clicks on signin button 
#	Then User should be land on Dashboard page
#
#@Scenario4 @Smoke	
#Scenario: User should be able to login with valid credentials
#	When User enters username as "demo23@techfios.com" 
#	When User enters password as "abc12323"
#	And User clicks on signin button 
#	Then User should be land on Dashboard page