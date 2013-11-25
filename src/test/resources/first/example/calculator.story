Scenario:  A scenario where numbers are given
Given a calculator
When I add 5 and 5
Then the outcome should be 10

Scenario:  A scenario where numbers are a table
Given a calculator
When I add <number1> an <number2>
Then the outcome should be <result>

Examples:
|number1|number2|result|
|5|5|10|
|0|0|0|


