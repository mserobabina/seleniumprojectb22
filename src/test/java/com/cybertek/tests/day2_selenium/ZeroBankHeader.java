package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeader {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://zero.webappsecurity.com/login.html");

        //4. Verify header text
        String expectedHeader = "Log in to ZeroBank";

        //String actualHeader = driver.getTitle();

        //1. locate web element
        //2. get the text
        WebElement actualHeader = driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();

        if (actualHeaderText.equals(expectedHeader)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");

        }
        Thread.sleep(3000);
        driver.quit();

    }
}
