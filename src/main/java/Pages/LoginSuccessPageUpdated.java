package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPageUpdated {
    WebDriver driver;

    public LoginSuccessPageUpdated(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[normalize-space()='Thank you for Loggin.']")
    WebElement loginSuccessText_ele;

    public String loginSuccessText(){
        String loginSuccessText = loginSuccessText_ele.getText();
        return loginSuccessText;
    }

}
