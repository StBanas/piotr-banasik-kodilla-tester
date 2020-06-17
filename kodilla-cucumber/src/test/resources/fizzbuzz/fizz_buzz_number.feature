Feature: is 0 the remainder of division of the number by three or five?
  FizzBuzzNone - set the name of number


  Scenario: Does this number comply conditions?
    Given number is one houndred and five
    When I ask if the remainder of division is 0
    Then I should be told "FizzBuzz"

  Scenario: And what about this?
    Given number is one
    When I ask if the remainder of division is 0
    Then I should be told "None"

  Scenario: fourty would do?
    Given number is fourty
    When I ask if the remainder of division is 0
    Then I should be told "Buzz"

  Scenario: something completly different
    Given number is five
    When I ask if the remainder of division is 0
    Then I should be told "Buzz"

  Scenario:
    Given number is fiveteen
    When I ask if the remainder of division is 0
    Then I should be told "FizzBuzz"

#  Scenario Outline: Does this number comply conditions?
#    Given I have number four
#    When I ask if the remainder of division is <value>
#    Then I should be told <result>
#    Examples:
#    |value|result|
#    |4   |"None"|
#    |105|"FizzBuzz"|
#    |1|"None"|
#    |40|"Buzz"|
#    |5|"Buzz"|
#    |12|"Fizz"|



