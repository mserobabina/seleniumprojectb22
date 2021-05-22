package com.cybertek.tests.day_3_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttreibuteValueVerification {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //3 get the page
        driver.get("http://www.facebook.com");

        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
        String expectedInHref = "registration_form";
        String actualHref = createPageLink.getAttribute(("href"));
        System.out.println("actualHref"+ actualHref);

        if (actualHref.contains(expectedInHref)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");

        }

        Thread.sleep(3000);
        driver.quit();
    }
}
