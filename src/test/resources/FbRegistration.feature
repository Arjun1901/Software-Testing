Feature: To validate the facebook signup page
Scenario: To create a new account
Given To launch the chrome browser and maximize the window
When To launch the url of facebook application
And To click the create new account button
And To pass the first name in firstname textbox
|Selenium|Java|Python|Ruby|
And To pass the last name in lastname textbox
And To pass the mail id in email textbox
|abc@gamil.com|9897969594|tarjun@gmail.com|8987868584|
|7978767574|xyz@gmail.com|xuv@gmail.com|6968676564|
|ijk@gmail.com|5958575654|4948474645|3938373635|
And To pass new password in password textbox
Then To quit the browser


