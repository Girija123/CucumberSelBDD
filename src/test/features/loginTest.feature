Feature: Login Test
  As a user
  I should be authenticated

  @login
  Scenario: Verify user login with valid credentials

    Given I'm on HomePage "http://www.Johnlewis.com"
    When I click sign in link in the header
    And I enter username  "GeorgeLynn@sample.com" and password  "Lynnfgrk"
    And I click login button
    Then I should login successfully