Feature: As a user, I should see the pricing of products as per the currency selection

  Scenario: I should be able to select Euro and see the products pricing in Euro
    Given I am on HomePage
    When I select Euro from the drop down menu
    Then I should be able to see pricing on products in Euro

 Scenario: I should be able to select Dollar and see the products pricing in Dollar
   Given I am on HomePage
   When I select Dollar from the drop down menuu
   Then I should be able to see pricing on products in Dollar