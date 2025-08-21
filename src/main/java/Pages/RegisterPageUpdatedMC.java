package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdatedMC {

    WebDriver driver;

    public RegisterPageUpdatedMC(WebDriver driver){

        this.driver = driver; //this = driver of this class (this class's driver)
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "firstName")
    WebElement firstName_ele;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName_ele;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement email_ele;

    @FindBy(xpath = "//select[@name='country']")
    WebElement countrySelect_ele;

    @FindBy(xpath = "//input[@id='email']")
    WebElement userName_ele;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password_ele;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    WebElement confirmPassword_ele;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitBtn_ele;

    public RegisterPageUpdatedMC setFirstName(String firstName){
        firstName_ele.sendKeys(firstName);
        return this;
        }
    public RegisterPageUpdatedMC setLastName(String lastName){

        lastName_ele.sendKeys(lastName);
        return this;
    }
    public RegisterPageUpdatedMC setEmail(String email){

        email_ele.sendKeys(email);
        return this;
    }
    public RegisterPageUpdatedMC selectCountry(){
            Select dropDownCountry = new Select(countrySelect_ele);
            dropDownCountry.selectByIndex(2);
        return this;
    }
    public RegisterPageUpdatedMC setUsername(String username){

        userName_ele.sendKeys(username);
        return this;
    }
    public RegisterPageUpdatedMC setPassword(String password){

        password_ele.sendKeys(password);
        return this;
    }
    public RegisterPageUpdatedMC setConfirmPassword(String confirmPassword){
        confirmPassword_ele.sendKeys(confirmPassword);
        return this;
    }
    public RegisterSuccessPageUpdatedMC setSubmitBtn(){
        submitBtn_ele.click();
        return new RegisterSuccessPageUpdatedMC(driver);
    }


}
