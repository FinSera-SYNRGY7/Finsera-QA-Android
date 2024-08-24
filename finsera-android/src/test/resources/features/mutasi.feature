@Mutasi
Feature: Mutasi

  @positive-test
  Scenario: User able to sorting mutasi rekening based on different timeframe
    Given User already on Home page
    And User tap the mutasi button
    When Tap the mothly timeframe button
    Then The mothly mutasi appears on screen

  @positive-test
  Scenario: User able to download the mutasi as pdf
    Given User already on Home page
    And User tap the mutasi button
    And Tap the mothly timeframe button
    When User tap the download mutasi button
    Then The mutasi successfully downloaded

