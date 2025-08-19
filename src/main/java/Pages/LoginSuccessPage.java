package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSuccessPage {
    WebDriver driver;

    public LoginSuccessPage(WebDriver driver){
        this.driver=driver;
    }

    By loginSuccessText_loc = By.xpath("//b[normalize-space()='Thank you for Loggin.']");

    public String loginSuccessText(){
        String loginSuccessText = driver.findElement(loginSuccessText_loc).getText();
        return loginSuccessText;
    }

}
