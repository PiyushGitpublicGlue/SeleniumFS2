package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LaunchBrowser {


    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(testName = "chrome")
    public void browserLaunch() throws InterruptedException {
        System.out.println("chrome execution");
    }

    @Test(testName = "chrome")
    public void browserLaunchFirefox() throws InterruptedException {
        System.out.println("firefox execution");
    }
}
