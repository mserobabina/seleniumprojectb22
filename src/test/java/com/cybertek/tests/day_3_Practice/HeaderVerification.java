package com.cybertek.tests.day_3_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://www.facebook.com");

        //1. locate web element
        //2. get the text
        Thread.sleep(5000);
        WebElement header = driver.findElement(By.className("_8eso"));

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");

        }
        Thread.sleep(3000);
        driver.quit();
    }
}
