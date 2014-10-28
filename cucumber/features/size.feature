Feature: As a programmer, I want the BigInteger class to be able to hold values greater than the max that a float or long can hold, So that I can easily hold large numbers.

Scenario: Size

Given A is a BigInteger
And C is a integer
When I compare the length of the bitstrings of the integer and BigInteger
Then the size of the bitstring of the BigInteger should be much greater than the integer.

Given C is an integer containing the MAXINT of an integer
When I convert C to an BigInteger and store it in B
And multiply B by two
Then B holds the correct max value


Given C is an integer containing the MININT of an integer
When I convert C to an BigInteger and store it in B
And multiply B by two
Then B holds the correct min value
