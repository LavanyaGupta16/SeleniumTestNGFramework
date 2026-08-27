package com.automation.SeleniumTestNGFramework.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.SeleniumTestNGFramework.pages.HomePage;
import com.automation.SeleniumTestNGFramework.pages.LoginPage;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test(groups = "smoke")
    public void validLogin() {

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        homePage = new HomePage(driver);

        String heading = homePage.getProductsTitle();

        Assert.assertEquals(heading, "Products");
    }
    @Test(groups = "regression")
    public void invalidLogin() {
        System.out.println("Invalid Login Test");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}