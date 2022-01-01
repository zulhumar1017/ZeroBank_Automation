Feature:Navigating to specific accounts in Accounts Activity

  Background:
    Given the user logged in

  @nur
  Scenario: Savings account redirect
    When the user clicks on "Savings" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Savings" selected

  @haha
  Scenario: Brokerage account redirect
    When the user clicks on "Brokerage" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Brokerage" selected


  Scenario: Checking account redirect
    When the user clicks on "Checking" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Checking" selected


  Scenario: Credit Card account redirect
    When the user clicks on "Credit card" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Credit Card" selected


  Scenario: Loan account redirect
    When the user clicks on "Loan" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Loan" selected

    
 @huhu
  Scenario Outline:
    When the user clicks on "<Links>" link on the Account Summary page
    Then the "<Page>" page should be displayed
    And Account drop down should have "<Option>" selected

    Examples:
      | Links       | Page             | Option      |
      | Savings     | Account Activity | Savings     |
      | Brokerage   | Account Activity | Brokerage   |
      | Checking    | Account Activity | Checking    |
      | Credit Card | Account Activity | Credit Card |
      | Loan        | Account Activity | Loan        |
      | Savings     | Account Activity | Savings     |