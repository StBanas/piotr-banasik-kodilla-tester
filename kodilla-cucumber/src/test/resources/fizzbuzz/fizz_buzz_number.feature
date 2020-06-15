Feature: Is 0 the result of division of the number?
  FizzBuzzNone - set the name of number

Scenario: Does this number comply conditions?
  Given the <number> is positive Integer
  When I ask what is the result of division of <number> by any value
  Then I should be told <name>
#  Examples:
#    |number|name|
#    |105|"Fizz"|
#    |1|"None"|
#    |5|"Buzz"|
#    |15|"FizzBuzz"|
#    |40|"None"|


