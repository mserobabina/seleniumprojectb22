package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAttrVerification {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://zero.webappsecurity.com/login.html");
        //locate the link inside of Web element
        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        //4. Verify header text
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");

        }

        //Verify Link href attribute value contains
        //expected index "index.html"
        String expectedInHrefValue = "index.html";
        String actualInHrefValue = zeroBankLink.getAttribute("href");

        if (actualInHrefValue.contains(expectedInHrefValue)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");

        }

        Thread.sleep(3000);
        driver.quit();
    }
}
