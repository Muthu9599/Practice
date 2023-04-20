Feature: This feature is to get Pending Timesheets
Scenario Outline:This test is to verify the Pending Timesheets
Given the user is on the Homepage
When the user cliks on the time option from the menu bar
And the user enter name as "Muthu Kumar"
And the user click on the view button
Then the user should see the message as "<Message>"

Examples:
     |Message|
     |No Time Sheet Found|