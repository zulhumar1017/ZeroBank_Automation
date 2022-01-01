Feature: user can login


  Scenario: user should be able to login whit valid credential
    Given the user navigate to url
    When the user enter the username
    And  the user enter the password
    And the user clicks the login button
    Then verify the user login successfully



  Scenario Outline:  user should not able to login with invalid "<description>"

    Given the user navigate to url
    When the user enter the username "<username>"
    And the user enter the password "<password>"
    And the user clicks the login button
    Then verify the user can not login

    Examples:

      | description       | username | password |
      | username          | yasin    | password |
      | password          | username | nur      |
      | username+password | jgjhg    | hjgfjhg  |
      | blankUsername     |          | password |
      | blankPassword     |username  |          |
      | blank both of them|          |          |








