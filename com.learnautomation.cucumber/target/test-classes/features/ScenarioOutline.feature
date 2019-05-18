Feature: Test Facebook

@facebook
  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid <username> and valid <password>
    Then user should be able to login successfully
    Then application should be closed

    Examples: 
      | username | password  |
      | userid1  | passwors1 |
      | userid2  | password2 |
      | userid3  | password3 |
