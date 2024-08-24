@Transferantar
Feature: Transfer antar bank

  @positive-test
  Scenario: User should be able to make cross-bank transfers with a valid pin
    Given User already on Home page
    And User tap the transfer antar button
    And User tap the input baru button
    And User select BRI bank
    And user input nomor rekening tujuan with "789012345"
    And User tap lanjut button
    And User input nominal field with "100000"
    And User input catatan field with "testing"
    And User tap the lanjut button
    When User input the valid Payment PIN
    Then User successfully cross transfer bank

  @negative-test
  Scenario: User should not be able to make cross-bank transfers with a invalid pin
    Given User already on Home page
    And User tap the transfer antar button
    And User tap the input baru button
    And User select BRI bank
    And user input nomor rekening tujuan with "789012345"
    And User tap lanjut button
    And User input nominal field with "100000"
    And User input catatan field with "testing"
    And User tap the lanjut button
    When User input the invalid Payment PIN
    Then the transaction failed

  @negative-test
  Scenario: User should not be able to make cross-bank transfers with wrong account numbers
    Given User already on Home page
    And User tap the transfer antar button
    And User tap the input baru button
    And User select BRI bank
    And user input nomor rekening tujuan with "789012435"
    When User tap lanjut button
    Then user gets alert account number not found

  @negative-test
  Scenario: User should not be able to make cross-bank transfers with insufficient balance
    Given User already on Home page
    And User tap the transfer antar button
    And User tap the input baru button
    And User select BRI bank
    And user input nomor rekening tujuan with "789012345"
    And User tap lanjut button
    And User input nominal field with "10000000000"
    And User input catatan transfer with "testing"
    When User tap the lanjut button
    Then User got issuficient balance alert