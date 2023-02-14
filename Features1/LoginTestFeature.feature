Feature: This feature about login test case

@loginwithvaliddata
Scenario: User is able to login successfully with valid data

Given User is in login page
When User enters emailid "prashanthi.skvl@gmail.com"
And User enters password "Test@123"
And User clicks singin button
Then User should be able to login successfully


@loginwithinvaliddata 
Scenario Outline: User should not login with invalid data

Given User is in login page
When User enters emailid "<Emailid>"
And User enters password "<Password>"
And User clicks singin button
Then User should not be able to login with invalid data


Examples:
|Emailid|Password|
|testing43215@gmail.com|test1234|
|testing6543@gmail.com|test3421|
|testing45789@gmail.com|test34781|