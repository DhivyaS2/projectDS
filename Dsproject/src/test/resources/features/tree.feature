 @j
Feature: Automates tree page
@tree1
Scenario: home
Given logged in DS Home page
When Clicks Get started to enter into the tree page
Then Shows information about tree
@tree2
Scenario Outline: subtopics
Given Shows options to read more about Tree
When Clicks tree "<options>"
Then Shows Explanation of tree 
When Clicks tree Try here to run the program
Then It shows tree text area to type the phython code
When clicks tree Run 
Then It runs the progam and Shows output in tree page
Examples:
|options|
|Overview of Trees|
|Terminologies|
|Types of Trees|
|Tree Traversals|
|Traversals-Illustration|
|Binary Trees|
|Types of Binary Trees|
|Implementation in Python|
|Binary Tree Traversals|
|Implementation of Binary Trees|
|Applications of Binary trees|
|Binary Search Trees|
|Implementation Of BST|
@treesignout
Scenario: signout
When Clicks signout from tree page
Then logged out from tree Data structure