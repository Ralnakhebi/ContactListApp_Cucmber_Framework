Feature: I will try to login with different Scenarios
  Background: I will be on the desired page
    Given I am on the login page

  Scenario: login with valid credentials
    When I fill in "Email" with "Reemah@sda.test.com"
    And I fill in "Password" with "test123pass"
    And I press Login Button
    Then I should be on the users home page
    And I should see "Contact List"
    And I close the page

  Scenario Outline: login with Invalid credentials
    When I fill in "Email" with "<email@example>"
    And I fill in "Password" with "<password>"
    And I press Login Button
    Then I should see an error message
    And I close the page

    Examples:
      | email@example | password |
      | rr@example    | 2135     |
      | r2@example    | 623620   |
      | r4@example    | 5435     |
