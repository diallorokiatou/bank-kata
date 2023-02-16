Feature: Deposit of money

  Scenario: account has a positive balance
    Given an account with 30 euros
    When I deposit 20 euros
    Then account balance is 50 euros

  Scenario: account has a negative balance
    Given an account with -30 euros
    When I deposit 20 euros
    Then account balance is -10 euros

  Scenario: account has a negative balance
    Given an account with -100 euros
    When I deposit 10 euros
    Then account balance is -90 euros

  Scenario: deposit an balance with a minimum sum
    Given an account with 10 euros
    When I deposit 0 euros
    Then a error message minimun amout is 1 euros

