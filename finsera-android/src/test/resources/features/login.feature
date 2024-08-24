@Login
Feature: Login

  @positive-test
  Scenario: Login using valid username and valid password
    Given User is on Login page
    And User input username with "johndoe"
    And User input password with "password123"
    And User click login button
    And User create new PIN
    When User input valid PIN
    Then User is on Home page

  @negative-test
  Scenario: Login using valid username and invalid password
    Given User is on Login page
    And User input username with "johndoe"
    And User input password with "wrong_pass"
    When User click login button
    Then User got error message

  @negative-test
  Scenario: Login using valid username, valid password, and invalid PIN
    Given User is on Login page
    And User input username with "johndoe"
    And User input password with "password123"
    And User click login button
    And User create new PIN
    When User input invalid PIN
    Then User got invalid PIN error

  @negative-test
  Scenario: Login using valid username, valid password, and create missmatch PIN
    Given User is on Login page
    And User input username with "johndoe"
    And User input password with "password123"
    And User click login button
    When User create missmatch PIN
    Then User got error missmatch PIN message
