@h
Feature: Autamates the stack
@stack1
Scenario: home
Given logged in home screen
When Clicks to Stack Get started to explore
Then Shows explanation
@stack2
Scenario Outline: Stack subtopics
Given Shows option to explore more about Stack
When Clicks Stack "<subtopics>"
Then Navigates to topic page
When Clicks Stack Try here in bottom of page 
Then Shows  Stack Textarea to run Python code
When Clicks run to execute the program
Then Shows output of program
Examples:
|subtopics|
|Operations in Stack|
|Implementation|
|Applications|

@stacksignout
Scenario: signout
When Clicks signout from Stack page
Then logged out from Stack Data Structure