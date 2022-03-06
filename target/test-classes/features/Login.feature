Feature: Application Login


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "user1" and "pass1"
Then Home page is populated
And Cards are displayed

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "user2" and "pass2"
Then Home page is populated
And Cards are displayed