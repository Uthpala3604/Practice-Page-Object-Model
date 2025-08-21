package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPageUpdatedMC {
    WebDriver driver;

    public LoginSuccessPageUpdatedMC(WebDriver driver){
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
