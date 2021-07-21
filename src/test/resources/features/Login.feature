Feature: As a user, I should be able tp login
@librarian
  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian credentials
    Then home page should be shown
@student
  Scenario: Login as student
    Given user is on the login page
    When user enter student credentials
    Then home page should be shown