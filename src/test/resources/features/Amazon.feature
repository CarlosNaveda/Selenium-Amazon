Feature: Test Amazon search funcionality

  @Exercise
  Scenario: As a Customer when I search for Alexa, I want to see if the second option
  on the second page is available for purchase and can be added to the cart
    Given The user navigates to Amazon
    When  search for Alexa
    And navigates to the second page
    And selects the second item
    And the user can add it to the cart
    Then the product is added to the cart