package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUpdatedMC {

    WebDriver driver;

    public LoginPageUpdatedMC(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='userName']")
    WebElement userNameLoc_ele;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordLoc_ele;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitLoc_ele;

    public LoginPageUpdatedMC enterUserName(String userName){

        userNameLoc_ele.sendKeys(userName);
        return this;
    }
    public LoginPageUpdatedMC enterPassword(String password){
        passwordLoc_ele.sendKeys(password);
        return this;
    }
    public LoginSuccessPageUpdatedMC submit(){

        submitLoc_ele.click();
        return new LoginSuccessPageUpdatedMC(driver);
    }
}
