@Virtualaccount
Feature: Virtual Account

  @positive-test
  Scenario: User should be able to make virtual account transfers with a valid pin
    Given User already on Home page
    And User tap virtual account button
    And User input virtual account numbers with "543216789"
    When user input payment pin wtih "123456"
    Then User successfully pay the VA

  @negative-test
  Scenario: User should not be able to make virtual account transfers with a invalid pin
    Given User already on Home page
    And User tap virtual account button
    And User input virtual account numbers with "543216789"
    When user input payment pin wtih "123132"
    Then user gets error message

  @negative-test
  Scenario: User should not be able to make virtual account transfers with wrong virtual account numbers
    Given User already on Home page
    And User tap virtual account button
    When User input virtual account numbers with "543216709"
    Then user gets error message

  @negative-test
  Scenario: User should not be able to make virtual account transfers while exceeding user's balances
    Given User already on Home page
    And User tap virtual account button
    When User input virtual account numbers with "987654321"
    Then user gets error message