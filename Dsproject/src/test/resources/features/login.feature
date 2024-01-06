@d
Feature: Automation of login  site
@login
Scenario Outline: Signing in
Given User registered already clicks Login
When  Enters Different combination of username and password from Excel "<sheetname>" file
Then Shows respective messages And Navigates to home page when enters correct username and password
Examples:
 | sheetname| 
 |login     |       
   
@logout
Scenario: logout
When Clicks logout after logged in
Then logged out from the page
