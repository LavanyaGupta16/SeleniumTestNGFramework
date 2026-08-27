package com.automation.SeleniumTestNGFramework.tests;

import org.testng.annotations.Test;

public class SearchTest {

    @Test(groups = "smoke")
    public void searchProduct() {
        System.out.println("Search Product Test");
    }

    @Test(groups = "regression")
    public void advancedSearch() {
        System.out.println("Advanced Search Test");
    }
}