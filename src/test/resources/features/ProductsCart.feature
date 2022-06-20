Feature: Products cart

  In order to buy products
  As a website user
  I want to add/delete products to the cart

  Background:
    Given the user is on the home page
    When the user logged in with valid credentials
    Then the username is displayed in the navigation bar

   Scenario: As a user, I want to add products to the cart to get details