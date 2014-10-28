Feature: As A programmer, I want to be able to convert the standard types of java to the BigInteger Class, so that it is easy to create a BigInteger Object.

Scenario: Converting to BigInteger

Given C is an integer of value 3
When I convert C to a BigInteger
Then the result is a BigInteger of value 3

Given D is a long of value 34456
When I convert D to a BigInteger
Then the result is a BigInteger of value 34456

Given S is a string of value 34232432
When I convert S to a BigInteger
Then the result is a BigInteger of value 34232432