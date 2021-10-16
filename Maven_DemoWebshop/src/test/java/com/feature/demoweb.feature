Feature: Demowebshop search functionality
Scenario: To verify if result displayed is as per the entered data
Given Browser is open
And Home page is visible
When User enters the data in search text bar
And Click on search button
Then Result should displayed

Scenario: To verify if system is suggesting a keyword relevant to entered data
Given Relevant data
When As user enters the data in search text bar
Then System should suggest some keywords relevant to entered data

Scenario: To verify if user is able to enter the data with 2 characters
Given Search text box is visible
When As User enters data with 2 letters
And Click enter
Then System will display a message as no search result found 

Scenario: To verify if search advanced is searching the result
Given Search box is enabled 
When User enters a data in search bar
And Click on search 
Then Search advanced must be visible

Scenario: To verify if user is able to search the products by its manufacturer or company's name
Given Search button is visible
When User is enter the data from company's name
And Click on search buttton
Then System should display result