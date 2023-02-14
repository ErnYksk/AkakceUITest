Feature: Delete user Functionality


  Background:
    Given Navigate to Akakce
    When Click on Login button and enter valid email and password
    Then User should be able to login with valid data


  @SmokeTest
  Scenario: Delete user

    Given Click on elements
      | assertHesap    |
      | hesapSilButton |

    And   Enter valid password
      | hesapSifre | randomPassword12 |

    And Click on elements
      | hesapSilSubmit |

    Then  User should be able to delete the account successfully

