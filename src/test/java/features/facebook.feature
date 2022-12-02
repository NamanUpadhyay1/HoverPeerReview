Feature: As a user, I should be able to use facebook function on homepage

  Scenario: I should be redirected to the facebook page when i click on the FB icon

    Given I am on the HomePage
    When I click on the Facebook icon
    Then I should be redirected to new tab of facebook page of nopcommerce