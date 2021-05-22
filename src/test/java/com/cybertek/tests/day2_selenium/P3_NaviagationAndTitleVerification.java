package com.cybertek.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NaviagationAndTitleVerification {
    public static void main(String[] args) {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("https://www.google.com");
        //4. click on gmail from top right
        driver.findElement(By.linkText("Gmail")).click();

        //4.verify title contains
        //expected gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title Verification PASSED");
        }else {
            System.out.println("Title Verification FAILED");
            //5. go back
            driver.navigate().back();
            //6.verify title
             String expectedGoogleTitle = "Google";
             String actualGoogleTitle = driver.getTitle();

             if(actualTitle.equals(expectedGoogleTitle)){
                 System.out.println("Title verif PASSED");
             }else{
                 System.out.println("Title verif Failed");
             }



        }




    }
}
