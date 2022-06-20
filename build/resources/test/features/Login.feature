Feature: Login

  As a website user
  I want to login into the site
  for get access to my account

  Scenario: As a user, I want to login successfully into the site
    Given the user is on the home page
    When the user navigates to the login form
    And the user enters valid credentials
    Then the user should be successfully logged in