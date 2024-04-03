package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPageTest {
    LoginPage loginPage=new LoginPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("contactListAppUrl"));
    }
    @When("I fill in {string} with {string}")
    public void iFillInWith(String arg0, String arg1) {
        switch (arg0){
            case "Email":
                loginPage.enterEmail(arg1);
                break;
            case "Password":
                loginPage.enterPassword(arg1);
                break;
            default:
                System.out.println("Invalid Type .. ");
                break;
        }
    }

    @And("I press Login Button")
    public void iPressLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be on the users home page")
    public void iShouldBeOnTheUsersHomePage() throws InterruptedException {
        Thread.sleep(500);
        String homePageUrl =Driver.getDriver().getCurrentUrl();
        Assert.assertFalse(homePageUrl.equals(ConfigReader.getProperty("contactListAppUrl")));
    }

    @And("I should see {string}")
    public void iShouldSee(String arg0) {
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.getHeader().getText().equals(arg0));
    }



    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        loginPage.verifyErrorMessage();
    }


    @And("I close the page")
    public void iCloseThePage() {
        Driver.closeDriver();
    }
}
