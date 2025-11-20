package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LaunchBrowser {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeGroups(alwaysRun = true)
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @AfterGroups(alwaysRun = true)
    public void afterGroups() {
        System.out.println("After Groups");
    }


    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(testName = "chrome", groups = {"Smoke"})
    public void browserLaunch() throws InterruptedException {
        System.out.println("TEST chrome execution");
    }

    @Test(testName = "safari", groups = {"Regression"})
    public void browserLaunchSafari() throws InterruptedException {
        System.out.println("TEST safari execution");
    }

    @Test(testName = "firefox", groups = {"Sanity"})
    public void browserLaunchFirefox() throws InterruptedException {
        System.out.println("TEST firefox execution");
    }
}
