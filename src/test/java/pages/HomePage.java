package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    @FindBy(id = "add-contact")
    private WebElement addContactButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    @FindAll(@FindBy(xpath = "//tr[@class='contactTableBodyRow']"))
    private List<WebElement> viewContacts;
    @FindBy (tagName = "h1")
    private WebElement header;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement getHeader(){
        return header;
    }
    public void clickAddContactButton() {

        addContactButton.click();
    }
    public void clickLogoutButton() {

        logoutButton.click();
    }

    public void clickToViewContact(int contactRow){
        viewContacts.get(contactRow).click();
    }

}
