Feature: facebook Login validation

Background: 
Given open browser
And navigate to url

@smoke
Scenario: As a user should login using valid credential
When user type userid on user text box
And user type password on password text box
And user click on login button
Then user should login to the profile page
And close browser


@reg
Scenario Outline: As a user should not login using invalid credential

When user type "<userid>" on user text box
And user type "<password>" on password text box
And user click on login button
Then user should not login to the profile page
And close browser

Examples: 
|userid|password|
|user1|dfghrty3456|
|user2|ertyu234|
|user3|ghjk2345|


Scenario: As a user should not login using invalid credential
When user type userid on user text box
And user type password on password text box
And user click on login button
Then user should login to the profile page
And close browser
