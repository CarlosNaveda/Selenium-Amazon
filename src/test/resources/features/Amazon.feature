Feature: Test Amazon search funcionality

  @Exercise
  Scenario Outline: As a Customer when I search for a Product, I go to the second page, want to see choose a item for
  purchase and can be added to the cart
    Given The user navigates to Amazon
    When  search for "<product>"
    And navigates to the second page
    And selects the <itemNumber> item
    And the user can add it to the cart
    Then the product is added to the cart

    Examples:
    | product           | itemNumber |
    | alexa             | 1          |
    | playstation       | 2          |
    | nintendo switch   | 3          |