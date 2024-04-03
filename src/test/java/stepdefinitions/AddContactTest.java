package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddContactPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AddContactTest {
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

    @When("I start to fill in {string} with {string}")
    public void iStartToFillInWith(String arg0, String arg1) {
        AddContactPage addContactPage=new AddContactPage();
        switch (arg0){
            case "First Name":
                addContactPage.enterFirstName(arg1);
                break;
            case "Last Name":
                addContactPage.enterLastName(arg1);
                break;
        }
    }
}
