Feature: I will try to login with different Scenarios
  Background: I will be on the desired page
    Given I am on the signup page
  @signup
  Scenario: signup with valid credentials
    When I fill in "First Name" as "Reemah"
    And I fill in "Last Name" as "Alnakhebi"
    And I fill in "Email" as "example@test.sda"
    And I fill in "Password" as "test1pass"
    And I press signup Button
    Then I should be on the users home page
    And I should Login with the valid credentials
    And I close the page
  @signup
  Scenario Outline: signup with Invalid credentials
    When I fill in "<First Name>"
    And I fill in "<Last Name>"
    And I fill in "<Email>"
    And I fill in "<Pass>"
    And I press signup Button
    Then I should see an specific error message
    And I close the page
    Examples:
      | First Name | Last Name | Email | Pass |


