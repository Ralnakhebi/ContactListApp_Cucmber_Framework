package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddContactPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AddContactTest {
    AddContactPage addContactPage=new AddContactPage();
    @Given("I am on Add contact page")
    public void iAmOnAddContactPage() {
        Driver.getDriver().get(ConfigReader.getProperty("contactListAppUrl"));

        LoginPage loginPage=new LoginPage();
        loginPage.enterEmail(ConfigReader.getProperty("email"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLoginButton();

        HomePage homePage =new HomePage();
        homePage.clickAddContactButton();
    }


    @When("I start to fill in First Name with {string}")
    public void iStartToFillInFirstNameWith(String arg0) {
        addContactPage.enterFirstName(arg0);
    }

    @And("I fill in Last Name with {string}")
    public void iFillInLastNameWith(String arg0) {
        addContactPage.enterLastName(arg0);
    }

    @And("I fill in Date of Birth with {string}")
    public void iFillInDateOfBirthWith(String arg0) {
        addContactPage.enterBirthDate(arg0);
    }

    @And("I press Submit Button")
    public void iPressSubmitButton() {
        addContactPage.clickSubmitButton();
    }

    @Then("An error {string} should appear")
    public void anErrorShouldAppear(String arg0) {
        String errorMessage =addContactPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains(arg0));
    }

    @And("I fill in Phone number with {string}")
    public void iFillInPhoneNumberWith(String arg0) {

        addContactPage.enterPhone(arg0);
    }
}
