Feature: Search Test
  As a user
  I should search and retrieve relevant products

  @Search
  Scenario: Verify search with relevant product

    Given I'm on HomePage "http://www.Johnlewis.com" with cookie heading as "Banner"
    When I enter searchTerm "Jeans"
    When I click search icon
    Then I should get relevant products listed


  @Search
  Scenario: Verify search with irrelevant product

    Given I'm on HomePage "http://www.Johnlewis.com"
    When I enter searchTerm "yogurt"
    When I click search icon
    Then I should get relevant products listed