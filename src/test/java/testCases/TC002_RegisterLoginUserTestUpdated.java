package testCases;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC002_RegisterLoginUserTestUpdated {
    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC002() {
        registerUser();
        verifyRegistrationSuccess();
        loginUser();
        verifyLoginSuccess();

    }

    public void registerUser(){
        HomePageUpdated homePage = new HomePageUpdated(driver);
        homePage.selectRegisterMenu();

        RegisterPageUpdated registerPage = new RegisterPageUpdated(driver);
        registerPage.setFirstName("Uthpala");
        registerPage.setLastName("Pathirana");
        registerPage.setEmail("test01@gmail.com");
        registerPage.selectCountry();
        registerPage.setUsername("Uthpala123");
        registerPage.setPassword("test1234");
        registerPage.setConfirmPassword("test1234");
        registerPage.setSubmitBtn();
    }

    public void verifyRegistrationSuccess(){
        RegisterSuccessPageUpdated registerSuccessPage = new RegisterSuccessPageUpdated(driver);
        String actualText = registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear"), "Registration Attempt Failed");

        registerSuccessPage.selectSignInBtn();
    }

    public void loginUser(){
        LoginPageUpdated loginPage = new LoginPageUpdated(driver);
        loginPage.enterUserName("Uthpala123");
        loginPage.enterPassword("test1234");
        loginPage.submit();
    }

    public void verifyLoginSuccess(){
        LoginSuccessPageUpdated loginSuccessPage = new LoginSuccessPageUpdated(driver);
        String  actualLoginSuccessText = loginSuccessPage.loginSuccessText();
        Assert.assertTrue(actualLoginSuccessText.contains("Thank you for Loggin"), "Login attempt failed");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
