
Feature: Sign In
  As a registered user
  I want to sign in to my account

  Scenario: Successful sign in
    Given I am on the sign-in page
    And I have a registered account with email "<email>" and password "<password>"
    When I enter my credentials and submit the sign-in form
    Then I should see my dashboard or profile page
    And Close the application