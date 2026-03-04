Feature: Test Amazon search funcionality

  Scenario: As a Customer when I search for Alexa, I want to see if the third option
  on the second page is available for purchase and can be added to the cart
    Given The user navigates to Amazon
    When  search for Alexa
    And navigates to the second page
    And selects the third item
    Then the user can add it to the cart