package com.cybertek.tests.day_4_selenium_css_selector;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");


        WebElement amazonSearchBar = driver.findElement(By.cssSelector(("input[id='twotabsearchtextbox']")));

        Thread.sleep(3000);
        amazonSearchBar.sendKeys("wooden spoon"+ Keys.ENTER);
        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();
        driver.quit();


    }
}
