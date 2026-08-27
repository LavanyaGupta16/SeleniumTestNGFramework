package com.automation.SeleniumTestNGFramework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGDemo {
	WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
    
    }

    @Test
    public void openWebsite() {

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("Title: " + title);

       // Assert.assertTrue(title.contains("Google"));
        Assert.assertEquals(title, "Google");
    }
  
    @Test
    public void openBing() {

        driver.get("https://www.bing.com");

        String title = driver.getTitle();

        System.out.println("Title: " + title);

        Assert.assertTrue(title.contains("Bing"));
    }
    @AfterMethod
    public void tearDown() {
        if(driver != null) {
        	
        	driver.quit();
        	}
        }
}