Feature: As a Customer when I search for Alexa, I want to see if the third option
  on the second page is available for purchase and can be added to the cart

  Scenario: The Customer search for Alexa, the third option of second page add to the cart
    Given The user navigates to Amazon
    When  search for Alexa
    And navigates to the second page
    And selects the third item
    Then the user can add it to the cart