package cucumber;

import cucumber.api.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import sun.security.util.PendingException;

public class AdderSteps extends TestCase {
	
	String inputBox;
	int result = 0;

	@Given("^An input box$")
	public void An_input_box() throws Throwable {
		// Express the Regexp above with the code you wish you had
		
		inputBox = "";
		//throw new PendingException();
	}

	@When("^The user enters a value$")
	public void The_user_enters_a_value() throws Throwable {
		// Express the Regexp above with the code you wish you had
		
		inputBox = "5";
		//throw new PendingException();
	}

	@Then("^The value is incremented by one$")
	public void The_value_is_incremented_by_one() throws Throwable {
		// Express the Regexp above with the code you wish you had
		//throw new PendingException();
		
		int operand = Integer.parseInt(inputBox);
		result = operand + 1;
		
		assertEquals(6, result);
	}

}
