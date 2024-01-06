@f
Feature: Automates array page
@array1
Scenario: home
Given logged in Home page
When Clicks Get started to enter into the page
Then Shows information about arrays
@array2
Scenario Outline: subtopics
Given Shows options to read more about Arrays
When Clicks "<options>"
Then Shows Explanation 
When Clicks Try here to run the program
Then It shows text area to type the phython code
When clicks Run 
Then It runs the progam and Shows output
Examples:
|options|
|Arrays in Python|
|Arrays using List|
|Basic operations in List|
|Applications of Array|
@array3
Scenario Outline: practise questions
Given Clicks Practise Questions
When Clicks Question "<topics>"
Then Shows Questions and text area to run the code
When Enters code And Runs or Submit
Then Shows Output or Alert message or error message
Examples:
|topics|
|Search the array|
|Max Consecutive Ones|
|Find Numbers with Even Number of Digits|
|Squares of  a Sorted Array|
@arraysignout
Scenario: signout
When Clicks signout from array page
Then logged out from array Data structure