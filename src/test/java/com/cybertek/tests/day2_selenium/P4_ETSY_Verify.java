package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_ETSY_Verify {
    public static void main(String[] args) {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("https://www.etsy.com");
        //4. search for ws
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);

        //5. verify titles
        //expected ws
        String expectedInTitle = "wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedInTitle)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
            //5. go back
            driver.navigate().back();
            //6.verify title
            String expectedGoogleTitle = "wooden spoon | Etsy";
            String actualGoogleTitle = driver.getTitle();

            if (actualTitle.equals(expectedGoogleTitle)) {
                System.out.println("Title verification PASSED");
            } else {
                System.out.println("Title verification FAILED");
            }



        }
    }
}
