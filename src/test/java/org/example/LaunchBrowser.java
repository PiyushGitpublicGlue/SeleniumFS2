package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
    @Test
    public void browserLaunch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.evershop.io/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='SHOP NOW']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
