@run
Feature: Price sort

  Scenario: User be able to sort prices low to high

    Given launch cimri mobile app
    Then click sport and outdoor
    Then click mountain bikes
    Then click electricity bikes
    Then click sort price from low to high
    And verify that prices sorted from low to high