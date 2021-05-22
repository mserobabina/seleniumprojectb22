package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //2 create the instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //3 get the page
        driver.get("https://www.yahoo.com");
        System.out.println("first title is: "+ driver.getTitle());
    }
}
