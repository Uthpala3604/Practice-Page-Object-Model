package testCases;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTestUpdatedMC {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC001(){

        HomePageUpdatedMC homePage = new HomePageUpdatedMC(driver);


        String actualText = homePage.selectRegisterMenu()
                                .setFirstName("Uthpala")
                                .setLastName("Pathirana")
                                .setEmail("test01@gmail.com")
                                .selectCountry()
                                .setUsername("Uthpala123")
                                .setPassword("test1234")
                                .setConfirmPassword("test1234")
                                .setSubmitBtn()
                                .registerSuccessText();

        Assert.assertTrue(actualText.contains("Dear"), "Registration Attempt Failed");


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
