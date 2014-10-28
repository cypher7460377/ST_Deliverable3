package cucumber.features;

import java.math.*;

import cucumber.api.*;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;


public class StepDefinition {
	
	private BigInteger A, B, bigIntResult;
	private int C, intResult;
	private long D, longResult;
	private String S, stringResult;
	private boolean comparison = false;
	
	@Given("^A is a BigInteger of value (\\d+)$")
	public void a_is_a_BigInteger_of_value(int arg1) throws Throwable {
	    this.A = new BigInteger(Integer.toString(arg1));
	}

	@Given("^B is a BigInteger of value (\\d+)$")
	public void b_is_a_BigInteger_of_value(int arg1) throws Throwable {
		this.B = new BigInteger(Integer.toString(arg1));
	}

	@When("^I add A and B$")
	public void i_add_A_and_B() throws Throwable {
	    this.bigIntResult = A.add(B);
	}

	@When("^I divide A by B$")
	public void i_divide_A_by_B() throws Throwable {
	    this.bigIntResult = A.divide(B);
	}

	@When("^I multiply A and B$")
	public void i_multiply_A_and_B() throws Throwable {
	    this.bigIntResult = A.multiply(B);
	}

	@When("^I subtract A by B$")
	public void i_subtract_A_by_B() throws Throwable {
	    this.bigIntResult = A.subtract(B);
	}

	@When("^I negate A$")
	public void i_negate_A() throws Throwable {
	    this.bigIntResult = A.negate();
	}

	@Then("^the result is (\\d+)$")
	public void the_result_is(int arg1) throws Throwable {
	    assertEquals(this.bigIntResult.intValue(), arg1);
	}
	
	@Then("^the result is -(\\d+)$")
	public void the_result_is_(int arg1) throws Throwable {
		assertEquals(this.bigIntResult.intValue(), -arg1);
	}
	
	@When("^I find the max A and B$")
	public void i_find_the_max_A_and_B() throws Throwable {
	    this.bigIntResult = A.max(B);
	}

	@When("^I find the min A and B$")
	public void i_find_the_min_A_and_B() throws Throwable {
	    this.bigIntResult = A.min(B);
	}
	
	@Given("^A is set to BigInteger Constant ONE$")
	public void a_is_set_to_BigInteger_Constant_ONE() throws Throwable {
	    this.A =  BigInteger.ONE;
	}

	@Given("^B is set to a conversion of the integer (\\d+)$")
	public void b_is_set_to_a_conversion_of_the_integer(int arg1) throws Throwable {
	    this.B = BigInteger.valueOf(arg1);
	}

	@When("^I test for equality$")
	public void i_test_for_equality() throws Throwable {
	    comparison = A.equals(B);
	}

	@Then("^the two should be equal$")
	public void the_two_should_be_equal() throws Throwable {
		assertTrue(comparison);
	}

	@Given("^A is set to BigInteger Constant ZERO$")
	public void a_is_set_to_BigInteger_Constant_ZERO() throws Throwable {
		this.A =  BigInteger.ZERO;
	}
	
	@Given("^C is an integer of value (\\d+)$")
	public void c_is_an_integer_of_value(int arg1) throws Throwable {
	    this.C = arg1;
	}

	@When("^I convert C to a BigInteger$")
	public void i_convert_C_to_a_BigInteger() throws Throwable {
	    this.bigIntResult = BigInteger.valueOf(this.C);
	}

	@Then("^the result is a BigInteger of value (\\d+)$")
	public void the_result_is_a_BigInteger_of_value(int arg1) throws Throwable {
	    assertEquals(this.bigIntResult.intValue(), arg1);
	}

	@Given("^D is a long of value (\\d+)$")
	public void d_is_a_long_of_value(int arg1) throws Throwable {
	    this.D = arg1;
	}

	@When("^I convert D to a BigInteger$")
	public void i_convert_D_to_a_BigInteger() throws Throwable {
		this.bigIntResult = BigInteger.valueOf(this.D);
	}

	@Given("^S is a string of value ?(\\d+)?$")
	public void s_is_a_string_of_value(int arg1) throws Throwable {
	    this.S = Integer.toString(arg1);
	}

	@When("^I convert S to a BigInteger$")
	public void i_convert_S_to_a_BigInteger() throws Throwable {
	    this.bigIntResult = new BigInteger(this.S);
	}

	@When("^I convert A to an integer$")
	public void i_convert_A_to_an_integer() throws Throwable {
	    this.intResult = A.intValue();
	}

	@Then("^the result is an integer of value (\\d+)$")
	public void the_result_is_an_integer_of_value(int arg1) throws Throwable {
	    assertEquals(this.intResult, arg1);
	}

	@When("^I convert A to an long$")
	public void i_convert_A_to_an_long() throws Throwable {
	    this.longResult = A.longValue();
	}

	@Then("^the result is a long of value (\\d+)$")
	public void the_result_is_a_long_of_value(int arg1) throws Throwable {
	    assertEquals(this.longResult, arg1);
	}

	@When("^I convert A to a string$")
	public void i_convert_A_to_a_string() throws Throwable {
	    this.stringResult = A.toString();
	}

	@Then("^the result is a string of value ?(\\d+)?$")
	public void the_result_is_a_string_of_value(int arg1) throws Throwable {
	    assertTrue(this.stringResult.equals(Integer.toString(arg1)));
	}
	
	@Given("^A is a BigInteger$")
	public void a_is_a_BigInteger() throws Throwable {
	    this.A = new BigInteger("99999999999999999999999");
	}

	@Given("^C is a integer$")
	public void c_is_a_integer() throws Throwable {
		this.C = 0;
	}

	@When("^I compare the length of the bitstrings of the integer and BigInteger$")
	public void i_compare_the_length_of_the_bitstrings_of_the_integer_and_BigInteger() throws Throwable {
	    comparison = A.toByteArray().length > (Integer.SIZE/Byte.SIZE);
	}

	@Then("^the size of the bitstring of the BigInteger should be much greater than the integer\\.$")
	public void the_size_of_the_bitstring_of_the_BigInteger_should_be_much_greater_than_the_integer() throws Throwable {
	    assertTrue(comparison);
	}

	@Given("^C is an integer containing the MAXINT of an integer$")
	public void c_is_an_integer_containing_the_MAXINT_of_an_integer() throws Throwable {
	    this.C = Integer.MAX_VALUE;
	}

	@When("^I convert C to an BigInteger and store it in B$")
	public void i_convert_C_to_an_BigInteger_and_store_it_in_B() throws Throwable {
	    this.B = BigInteger.valueOf(this.C);
	}

	@When("^multiply B by two$")
	public void multiply_B_by_two() throws Throwable {
	    this.bigIntResult = B.multiply(BigInteger.valueOf(2));
	}

	@Given("^C is an integer containing the MININT of an integer$")
	public void c_is_an_integer_containing_the_MININT_of_an_integer() throws Throwable {
	    this.C = Integer.MIN_VALUE;
	}
	
	@Then("^B holds the correct max value$")
	public void b_holds_the_correct_max_value() throws Throwable {
		assertTrue(this.bigIntResult.equals(new BigInteger("4294967294")));
	}

	@Then("^B holds the correct min value$")
	public void b_holds_the_correct_min_value() throws Throwable {
		assertTrue(this.bigIntResult.equals(new BigInteger("-4294967296")));
	}
}
