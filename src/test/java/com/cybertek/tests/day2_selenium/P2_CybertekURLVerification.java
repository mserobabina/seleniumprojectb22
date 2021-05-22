package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl = "cyberteckshool";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED");

        }else {
            System.out.println("Test FAILED!");
        }
        driver.navigate().back();
        String newTitle = "Google";
        if (driver.getTitle().equals(newTitle)) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
            Thread.sleep(3000);
        }
        driver.quit();


    }
}
