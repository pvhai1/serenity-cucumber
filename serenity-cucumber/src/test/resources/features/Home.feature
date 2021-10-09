
Feature: Home
 QA Test

  @1
  Scenario Outline: QA Test Survey
    Given Open home page
    When Click on radio button Good
    And Click on radio button Next
    Then Assert text Have a nice day exists "<text>"
    Examples:
      | text |
      | Have a nice day. |
    