Feature: PayBills functionality

  Scenario: user should be able to make pay operation
    Given  the user logged in
    When the user selects Pay Bills Module
    And the user selects "Sprint" from the Payee Dropdown
    And user selects "Savings" from the Account Dropdown
    And the user enters the amount "100"
    And the user enters the date "2021-11-23"
    When the user clicks on the pay button
    Then verify that the system display "The payment was successfully submitted." message


  Scenario Outline: user should be able to make pay operation
    Given  the user logged in
    When the user selects Pay Bills Module
    And the user selects "<PayeeOption>" from the Payee Dropdown
    And user selects "<AccountOption>" from the Account Dropdown
    And the user enters the amount "<Amount>"
    And the user enters the date "<Date>"
    When the user clicks on the pay button
    Then verify that the system display "The payment was successfully submitted." message

    Examples:
      | PayeeOption     | AccountOption | Amount | Date       |
      | Sprint          | Savings       | 100    | 2021-11-21 |
      | Apple           | Checking      | 777    | 2020-03-09 |
      | Bank of America | Loan          | 6      | 2021-11-09 |
      | Wells Fargo     | Credit Card   | 89     | 2021-06-23 |
      | Apple           | Brokerage     | 1020   | 2020-12-07 |

   @wip
  Scenario Outline: user should not be able to make pay operation <Description>
    Given  the user logged in
    When the user selects Pay Bills Module
    And the user selects "<PayeeOption>" from the Payee Dropdown
    And user selects "<AccountOption>" from the Account Dropdown
    And the user enters the amount "<Amount>"
    And the user enters the date "<Date>"
    When the user clicks on the pay button
    Then verify that the system not display "The payment was successfully submitted." message

    Examples:
      | Description         | PayeeOption     | AccountOption | Amount | Date       |
      | Without Amount      | Sprint          | Savings       |        | 2021-11-21 |
      | Without Date        | Apple           | Checking      | 777    |            |
      | Without Amount&Date | Bank of America | Loan          |        |            |
      | With Invalid Amount | Wells Fargo     | Credit Card   | nur    | 2021-06-23 |
      | With invalid Date   | Apple           | Brokerage     | 1020   | 9.11.2023  |










