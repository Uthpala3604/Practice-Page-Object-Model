package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUpdated {

    WebDriver driver;

    public LoginPageUpdated(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='userName']")
    WebElement userNameLoc_ele;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordLoc_ele;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitLoc_ele;

    public void enterUserName(String userName){

        userNameLoc_ele.sendKeys(userName);
    }
    public void enterPassword(String password){
        passwordLoc_ele.sendKeys(password);
    }
    public void submit(){

        submitLoc_ele.click();
    }
}
