Feature: Login On Stakk

  Scenario: User Login on stakk with valid id and password
    Given open chrome and start application
    Then I click on Login buttton
    And i enter emali And password
    Then i click on login button
    Then user should be able to login successfully
    Then application sholud be closed
