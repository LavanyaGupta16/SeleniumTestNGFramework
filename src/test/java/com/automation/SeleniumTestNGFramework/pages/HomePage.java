package com.automation.SeleniumTestNGFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By productsTitle = By.className("title");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductsTitle() {
        return driver.findElement(productsTitle).getText();
    }
}