package com.cybertek.tests.day_3_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://www.facebook.com");
        //locate the link inside of Web element
        //4. Verify title
        WebElement inputUserName = driver.findElement(By.id("email"));
        inputUserName.sendKeys("mariaserobabina@gmail.com");

        WebElement inputPassWord = driver.findElement(By.id("pass"));
        inputPassWord.sendKeys("wrong password"+Keys.ENTER);


        Thread.sleep(5000);
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
            Thread.sleep(3000);
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
