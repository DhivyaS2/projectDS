@i
Feature: Autamates the Queue
@queue1
Scenario: Home
Given logged in Ds home screen
When Clicks to Queue Get started to explore
Then Shows Queue explanation
@queue2
Scenario Outline: Queue subtopics
Given Shows option to explore more about Queue
When Clicks Queue "<subtopics>"
Then Navigates to queue sub topics page
When Clicks Queue Try here in bottom of page 
Then Shows  Queue Textarea to run Python code
When Clicks Queue run to execute the program
Then Shows Queue output of program
Examples:
|subtopics|
|Implementation of Queue in Python|
|Implementation using collections.deque|
|Implementation using array|
|Queue Operations|

@stacksignout
Scenario: signout
When Clicks signout from Queue page
Then logged out from Queue Data Structure