
@Regression
Feature: Login Screen Test
  As a user I want to login to the application

  Background: required browser is opened


  @high
  Scenario Outline: Valid user test
    Given User enters "<username>" as user id
    And user enters "<password>" as password
    When user click on login button

    Examples:
      | username | password |
      | admin    | manager  |
      | trainee  | trainee  |


  @low
  Scenario Outline: Invalid user test
    Given User enters "<username>" as user id
    And user enters "<password>" as password
    When user click on login button
    Then  user should see the  error message as "User name or Password is incorrect"
    Examples:
      | username  | password   |
      | admin1243 | manager123 |


