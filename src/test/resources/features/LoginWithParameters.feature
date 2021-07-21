Feature: Login functionality
  Agile Story: As a user , I should be able to login

#  Background:Assuming user is on the login page
#    Given user is on the login page

  @librarian
  Scenario: Login as librarian 13
    Given user is on the login page
    When user enters librarian username "librarian13@librarian"
    And user enters librarian password "9rf6axdD"
    Then home page should be shown

  Scenario: Login as student 12
    Given user is on the login page
    When user enters student username "student12@library"
    And user enters student password "UC0LC9Hj"
    Then home page should be shown