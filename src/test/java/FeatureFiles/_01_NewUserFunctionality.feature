Feature: New user functionality

  @SmokeTest

  Scenario: Create a new user

    Given Navigate to Akakce
    When  Click on Hesap ac button and fill the content
    Then  New user should be created
