Feature: Verify login page
  Scenario: Verify user entering invalid credentials
    Given The user is on the login page
    When the user enters invalid credentials
    And the user clicks on the login button
    Then the "Invalid username or password. attempts remaining" error message should be displayed