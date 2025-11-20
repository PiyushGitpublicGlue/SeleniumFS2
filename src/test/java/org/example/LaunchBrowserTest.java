package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchBrowserTest {


    @Test(testName = "chrome")
    public void browserLaunch() throws InterruptedException {
        System.out.println("chromeTest execution");
    }

}
