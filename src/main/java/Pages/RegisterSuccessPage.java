package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {

    WebDriver driver;

    public RegisterSuccessPage(WebDriver driver){
        this.driver = driver;
    }

    By successText_loc = By.xpath("//b[contains(text(), 'Dear')]");

    public String registerSuccessText(){
        String successText = driver.findElement(successText_loc).getText();
        return successText;
    }

    By signInBtnLocator = By.xpath("//a[normalize-space()='sign-in']");

    public void selectSignInBtn(){
        driver.findElement(signInBtnLocator).click();
    }

}
