Feature: Vehicle Search

  @smoke @regression
  Scenario Outline: User is able to search Vehicle insurance
    Given user is on homePage
    When user input valid vehicle registration as "<Reg>"
    Then user should see outcome as "<Result>"

    Examples:
    |Reg     |Result            |
    |OV12UYY |Result for : OV12UYY|
    |SE53PWZ  |Sorry record not found|

