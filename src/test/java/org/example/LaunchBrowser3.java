package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser3 {

    @Test(testName = "chrome", groups = {"positive"})
    public void browserLaunch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.evershop.io/");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='SHOP NOW']")).click();
        //Thread.sleep(5000);
        driver.quit();
    }

    @Test(testName = "chrome", groups = {"Negative"})
    public void browserLaunchFirefox() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        //Thread.sleep(10000);
        driver.quit();
    }
}
