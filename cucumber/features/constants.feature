Feature: As a Programmer, I want the BigInteger Class to have some constants, so that I have easy access to BigInteger Values that I am going to use often

Scenario: Constants
Given A is set to BigInteger Constant ONE
And B is set to a conversion of the integer 1
When I test for equality 
Then the two should be equal

Given A is set to BigInteger Constant ZERO
And B is set to a conversion of the integer 0
When I test for equality 
Then the two should be equal