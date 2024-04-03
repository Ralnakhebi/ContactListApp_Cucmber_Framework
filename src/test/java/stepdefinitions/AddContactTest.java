import io.cucumber.java.en.Given;
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
}
