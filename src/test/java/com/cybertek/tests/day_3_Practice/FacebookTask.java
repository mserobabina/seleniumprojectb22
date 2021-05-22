package com.cybertek.tests.day_3_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://www.facebook.com");
        //locate the link inside of Web element
        //4. Verify title
        String expectedInTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedInTitle)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
            Thread.sleep(3000);
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
