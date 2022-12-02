Feature: As a user, I should be able to refer product to a friend

  Scenario: I should be able to refer Apple MacBook Pro - 13 inch to a friend
    Given I am on the Apple MacBook Pro page
    When I click on email a friend button
    Then I should be able to enter my friend's email
    And I should be able to enter my email
    And click on the submit button
    Then I should be able to see the success message