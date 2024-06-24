 
 Feature: Account Creation
  As a potential user
  I want to create a new account
  So that I can access the platform

  Scenario: Successful account creation
    Given I am on the registration page
    When I fill in the registration form with valid details
    And I submit the registration form
    Then I should see a success message
    And Close the browser
    
 