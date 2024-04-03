Feature: I will try to add contact with different Scenarios
  Background:
    Given  I am on Add contact page
    @addContact
    Scenario Outline: fill all the fields with Invalid Date of Birth
      When I start to fill in First Name with "Reema"
      And  I fill in Last Name with "Alnakhebi"
      And I fill in Date of Birth with "<yyyy-mm-dd>"
      And I press Submit Button
      Then An error "<message>" should appear

      Examples:
        | yyyy-mm-dd | message              |
        | 2023-02-29 | Birthdate is invalid |
        | 2024-13-01 | Birthdate is invalid |
        | 2024-01-32 | Birthdate is invalid |
  @addContact
  Scenario Outline: fill all the fields with Invalid Phone number
    When I start to fill in First Name with "Reema"
    And  I fill in Last Name with "Alnakhebi"
    And I fill in Phone number with "<1234567891>"
    And I press Submit Button
    Then An error "<message>" should appear

    Examples:
      | 1234567891 | message                 |
      | s251534512 | Phone number is invalid |
      | 0000S      | Phone number is invalid |
      | 123        | Phone number is invalid |
      | 124-222-3  | Phone number is invalid |

  @addContact
  Scenario Outline: fill all the fields with Invalid Name
    When I start to fill in First Name with "<Name>"
    And  I fill in Last Name with "<Surname>"
    And I press Submit Button
    Then An error "<message>" should appear
    Examples:
      | Name  | Surname   | message                 |
      |       | Alnakhebi | `firstName` is required |
      | Reema |           | `lastName` is required  |



