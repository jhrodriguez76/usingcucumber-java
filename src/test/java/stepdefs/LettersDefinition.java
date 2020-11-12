package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class LettersDefinition {

    Letter letter = new Letter();
    String theLetter;
    String actualLetter;

    @Given("Am I letter A")
    public void am_I_letter_A() {
        this.theLetter = "A";
    }

    @When("I check the letter is A")
    public void i_check_the_letter_is_A() {
        this.actualLetter = this.theLetter;
    }

    @Then("That is the first letter ni alphabet")
    public void that_is_the_first_letter_ni_alphabet() {
        //letter.giveLetter().equals(this.actualLetter);
        assertEquals(letter.giveLetter(),actualLetter);
    }

}
