package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.victoriassecret.com/us/");
        driver.findElement(By.className("fabric-masthead-pushdown-component")).click();

        String expectedInTitle = "VICTORIA'S SECRET";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedInTitle)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
            Thread.sleep(3000);
        }
        Thread.sleep(3000);

        //"fabric-icon-element fabric-vs-logo-2020-icon-element base"

    }
}
