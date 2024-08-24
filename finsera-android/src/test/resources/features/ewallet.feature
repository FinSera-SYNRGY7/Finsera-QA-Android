@Ewallet
Feature: E-wallet

  @positive-test
  Scenario: User should be able to make ShopeePay transfers with a valid pin
    Given User already on Home page
    And User tap ewallet button
    And user user selects ewallet option
    And User input nomor field with "085754237890"
    And user input nominal transfer with "10000"
    When User input payment pin wtih "123456"
    Then User successfully transfer via ewallet

  @negative-test
  Scenario: User should not be able to make ShopeePay transfers with a invalid pin
    Given User already on Home page
    And User tap ewallet button
    And user user selects ewallet option
    And User input nomor field with "085754237890"
    And user input nominal transfer with "10000"
    When User input payment pin wtih "123426"
    Then user gets the error text

  @negative-test
  Scenario: User should not be able to make ShopeePay transfers with wrong numbers
    Given User already on Home page
    And User tap ewallet button
    And user user selects ewallet option
    When User input nomor field with "085754237891"
    Then user gets the error text

  @negative-test
  Scenario: User should not be able to make ShopeePay transfers with exceeding user's balances
    Given User already on Home page
    And User tap ewallet button
    And user user selects ewallet option
    And User input nomor field with "085754237890"
    And user input nominal transfer with "100000000000"
    When User input payment pin wtih "123456"
    Then user gets the error text