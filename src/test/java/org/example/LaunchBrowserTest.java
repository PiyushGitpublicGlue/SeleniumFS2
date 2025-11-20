package org.example;

import org.testng.annotations.*;

public class LaunchBrowserTest {

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @Test(testName = "chrome", groups = {"Smoke"})
    public void browserLaunch() throws InterruptedException {
        System.out.println("TEST chromeTest execution");
    }

}
