Feature: user can see the Account summary page.

  Background:
    Given the user logged in



  Scenario: the user see the following Account types
    Then verify that the user sees the following titles
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


  Scenario: the user see the following Credit Accounts columns
    Then verify that the user sees the following columns
      | Account     |
      | Credit Card |
      | Balance     |