package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1 set browser driver
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //3 get the page
        driver.get("https://www.tesla.com");
        System.out.println("first title is: "+ driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is "+ currentUrl);
        //3 sec to wait
        Thread.sleep(3000);
        //"go back" using navigations
        driver.navigate().back();

        //going forward using navigations
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        //going to another url using.to() method
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        currentUrl= driver.getCurrentUrl();
        System.out.println("The title is: "+ currentUrl);

        driver.manage().window().maximize();
        driver.close();
    }
}
