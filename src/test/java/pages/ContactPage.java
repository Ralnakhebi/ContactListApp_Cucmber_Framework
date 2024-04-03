package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    @FindBy(id = "logout")
    private WebElement logoutButton;

    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void clickLogoutButton() {

        logoutButton.click();
    }
}
