Feature: Test the login functionality

  Scenario Outline: Check the login is successful with valid credentials
    Given Browser is open
    And user is on login page
    When user enters <Username> and <Passowrd>
    And user clicks login
    Then user should be navigated to home page
    And clickonLogout
    And browser is closed

    Examples: 
      | Username | Passowrd |
      | User1    |    12345 |
      | User2    |    12345 |
