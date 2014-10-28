Feature: As a programmer, I want the BigInteger Class to perform all basic arithmetic functions, So that I can do arithmetic functions on numbers larger than MAXINT.

Scenario: Arithmetic

Given A is a BigInteger of value 8888
And B is a BigInteger of value 9999
When I add A and B
Then the result is 18887

Given A is a BigInteger of value 8888
And B is a BigInteger of value 2
When I divide A by B
Then the result is 4444

Given A is a BigInteger of value 8888
And B is a BigInteger of value 123
When I multiply A and B
Then the result is 1093224

Given A is a BigInteger of value 8888
And B is a BigInteger of value 123
When I subtract A by B
Then the result is 8765

Given A is a BigInteger of value 88888888
When I negate A
Then the result is -88888888

Given A is a BigInteger of value 889988
And B is a BigInteger of value 123123123
When I find the max A and B
Then the result is 123123123

Given A is a BigInteger of value 881231288
And B is a BigInteger of value 123123111
When I find the min A and B
Then the result is 123123111