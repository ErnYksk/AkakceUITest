Feature: Login functionality
  @SmokeTest

  Scenario: Login Functionality

    Given Navigate to Akakce
    When Click on Login button and enter valid email and password
    Then User should be able to login with valid data
