# language: en
Feature: Multiply of two numbers
  As a user, I would like to be able to multiply numbers successfully
  in the calculator app.

  Rule:
- The user must have a valid numbers
- The user must have only make multiply operations

Background: The user starts out on the calculator app

@UseCalculatorAndroid

  Scenario: Multiply of two numbers
    Given Charles open calculator app
    When  Charles adds two numbers
    Then  Charles validates multiply of two numbers as 650
    Then  Charles closed calculator app