Feature: Facebook login
As a fb user, I want to enter username and password

Scenario: validate fb login scenario1
Given the user is on facebook login page
When he enters "Anuja" as user name 
And he enters "pwd" as password
Then check username is present in textbox
Then i am check facebook login page