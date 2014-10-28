Feature: As A programmer, I want to be able to convert the BigInteger Class to the standard types of java, so that it is easy to use that data with in BigInteger Class in other forms.

Scenario: Converting to Standard types

Given A is a BigInteger of value 3
When I convert A to an integer
Then the result is an integer of value 3

Given A is a BigInteger of value 34456
When I convert A to an long
Then the result is a long of value 34456

Given A is a BigInteger of value 34232432
When I convert A to a string
Then the result is a string of value 34232432