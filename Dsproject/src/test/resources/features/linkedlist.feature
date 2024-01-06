@g
Feature: Autamates the Linked List
@linkedlist1
Scenario: Home
Given logged in Ds homescreen
When Clicks to Linked List Get started to explore
Then Shows Linked List explanation
@linkedlist2
Scenario Outline: Linked List subtopics
Given Shows option to explore more about Linked list
When Clicks Linked list "<subtopics>"
Then Navigates to Linked list sub topics page
When Clicks Linked list Try here in bottom of page 
Then Shows  Linked list  Textarea to run Python code
	When Clicks Linked list  run to execute the program
Then Shows Linked list output of program
Examples:
|subtopics|
|Introduction|
|Creating Linked LIst|
|Types of Linked List|
|Implement Linked List in Python|
|Traversal|
|Insertion|
|Deletion|

@linkedlistsignout
Scenario: signout
When Clicks signout from Linked list  page
Then logged out from Linked list Data Structure