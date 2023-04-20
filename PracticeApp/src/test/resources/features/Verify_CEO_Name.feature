Feature: This feature is to get the CEO name from OrangeHRM app
Scenario Outline:This test is to verify CEO name
Given the user logged is successfully and is on Homepage
When the user cliks on the directory option from the menu bar
And the user select the job title as "CEO" from the dropdown
And the user click the search button
Then user should see the CEO Name as "<CEO_Name>"

Examples:
     |CEO_Name|
     |MuthuKumar|  