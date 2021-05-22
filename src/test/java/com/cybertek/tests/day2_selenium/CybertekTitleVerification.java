package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.className("nav-link")).click();

        String expectedInTitle = "Practice";
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
