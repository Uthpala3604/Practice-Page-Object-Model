package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By userNameLocator = By.xpath("//input[@name='userName']");
    By passwordLocator = By.xpath("//input[@name='password']");
    By submitLocator = By.xpath("//input[@name='submit']");

    public void enterUserName(String userName){
        driver.findElement(userNameLocator).sendKeys(userName);
    }
    public void enterPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public void submit(){
        driver.findElement(submitLocator).click();
    }
}
