@Feature1
Feature: To define the login functionality of facebook application
Background: 
Given To launch the chrome browser and maximize the window
@RegressionTesting
Scenario: To validate facebook with valid username and invalid password


When To launch the url of facebook application
And To enter the valid email in email field
And To enter the invalid password in password field
And To click the login button
And To check whether navigate to homepage or not
Then To quit the chrome browser

@Smoke
Scenario Outline: To validate the positive and negative combinations of login functionality

When User has to launch the url of facebook
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas          |passworddatas|
|tarjun1901@gmail.com|Arjun@01|
|abc@gmail.com       |12345|
|def@gmail.com       |abc|
|ghi@gmail.com       |67890|
|jkl@gmail.com       |xyz|