package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage {

    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id = "lastName")
    private WebElement lastNameField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(xpath = "//p/input[@type='password']")
    private WebElement passwordField;
    @FindBy(id = "submit")
    private WebElement submit;
    @FindBy(id = "cancel")
    private WebElement cancel;

   public SignupPage(){
       PageFactory.initElements(Driver.getDriver(),this);

   }

   public void EnterFirstName(String firstName){
       firstNameField.sendKeys(firstName);
   }
    public void EnterLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }
    public void EnterEmail(String email){
        emailField.sendKeys(email);
    }
    public void EnterPassword(String password){
        passwordField.sendKeys(password);
    }


}
