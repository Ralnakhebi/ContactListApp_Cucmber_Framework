package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupTest {
    @Given("I am on the signup page")
    public void iAmOnTheSignupPage() {
    }
    @When("I fill in {string} as {string}")
    public void iFillInAs(String arg0, String arg1) {
    }

    @And("I press signup Button")
    public void iPressSignupButton() {
    }

    @And("I should Login with the valid credentials")
    public void iShouldLoginWithTheValidCredentials() {
    }

    @When("I fill in {string}")
    public void iFillIn(String arg0) {

    }

    @Then("I should see an specific error message")
    public void iShouldSeeAnSpecificErrorMessage() {

    }


}
