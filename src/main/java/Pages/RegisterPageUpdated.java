package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdated {

    WebDriver driver;

    public RegisterPageUpdated(WebDriver driver){

        this.driver = driver;
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

    public void setFirstName(String firstName){
        firstName_ele.sendKeys(firstName);
        }
    public void setLastName(String lastName){

        lastName_ele.sendKeys(lastName);
    }
    public void setEmail(String email){

        email_ele.sendKeys(email);
    }
    public void selectCountry(){
            Select dropDownCountry = new Select(countrySelect_ele);
            dropDownCountry.selectByIndex(2);
    }
    public void setUsername(String username){

        userName_ele.sendKeys(username);
    }
    public void setPassword(String password){

        password_ele.sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        confirmPassword_ele.sendKeys(confirmPassword);
    }
    public void setSubmitBtn(){
        submitBtn_ele.click();
    }


}
