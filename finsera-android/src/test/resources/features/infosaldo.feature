@Infosaldo
Feature: InfoSaldo

  @positive-test
  Scenario: User be able to view balance information on my account
    Given User already on Home page
    When User tap the info saldo button
    Then User's balance appears on screen

  @positive-test
  Scenario: User be able to copy account numbers information on user's account
    Given User already on Home page
    And User tap the info saldo button
    When User tap copy account numbers button
    Then User's account numbers copied

