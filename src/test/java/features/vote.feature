Feature: As a user, I should be able to see error message in vote

  Scenario: I should be able to see simple alert when i click vote without selecting any radio
    Given I am on the HomePage
    When I click on the vote button
    Then I should be able to see the simple alert box with error message
    And accept the alert

