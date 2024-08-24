@Transfersesama
Feature: Transfer sesama bank

  @positive-test
  Scenario: User should be able to make same-bank transfers with a valid pin
    Given User already on Home page
    And User tap the transfer sesama button
    And User tap input baru button
    And user input nomor rekening with "987654321"
    And User tap lanjut button
    And User input nominal transfer with "100000"
    And User input catatan transfer with "testing"
    And User tap the Lanjut button
    When User input valid Payment PIN
    Then User successfully transfer the money

  @negative-test
  Scenario: User should not be able to make same-bank transfers with a invalid pin
    Given User already on Home page
    And User tap the transfer sesama button
    And User tap input baru button
    And user input nomor rekening with "987654321"
    And User tap lanjut button
    And User input nominal transfer with "100000"
    And User input catatan transfer with "testing"
    And User tap the Lanjut button
    When User input invalid Payment PIN
    Then User got wrong pin error message

  @negative-test
  Scenario: User should not be able to make same-bank transfers with issuficent balance
    Given User already on Home page
    And User tap the transfer sesama button
    And User tap input baru button
    And user input nomor rekening with "987654321"
    And User tap lanjut button
    And User input nominal transfer with "10000000000"
    And User input catatan transfer with "testing"
    When User tap the Lanjut button
    Then User got issuficient balance alert

  @negative-test
  Scenario: User should not be able to make same-bank transfers with wrong account numbers
    Given User already on Home page
    And User tap the transfer sesama button
    And User tap input baru button
    And user input nomor rekening with "12323435"
    When User tap lanjut button
    Then User got account numbers not found alert