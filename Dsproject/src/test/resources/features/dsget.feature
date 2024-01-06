@b
Feature: Starts without login
Automation of DsPortal app  site
@getstart
Scenario: Trying to get started in Home page
Given Trys to get start by clicking Get started
Then  Alerts You are not logged in
When  Clicks Data Structure drop down
Then  Shows six lists of data structure
When  Clicks List in Data structure
Then  Alerts You are not logged in
When  Clicks Sign in To login
Then  Navigates to login page