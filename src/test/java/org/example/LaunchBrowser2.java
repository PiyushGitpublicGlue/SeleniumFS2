package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser2 {

    @Test
    public void browserLaunchFirefox() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Thread.sleep(10000);
        driver.quit();
    }
}
