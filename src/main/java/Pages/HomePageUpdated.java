package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdated {

    //WebDriver driver;  //to handle actions like waits, windows, alerts etc.

    public HomePageUpdated(WebDriver driver){
       // this.driver=driver;
       PageFactory.initElements(driver, this);  //to identify element
    }

//    @FindBy(how = How.LINK_TEXT, using = "REGISTER")  //to identify the locator
//    public WebElement registerBtn_ele;


    @FindBy(linkText = "REGISTER")
    public WebElement registerBtn_ele;


    public void selectRegisterMenu(){
        registerBtn_ele.click();
    }

}
