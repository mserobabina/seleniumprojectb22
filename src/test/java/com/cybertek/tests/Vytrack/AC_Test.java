package com.cybertek.tests.Vytrack;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC_Test {
    WebDriver driver;

    @BeforeMethod
    public void setDriver() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user151");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        Thread.sleep(2000);
        WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
        logIn.click();
        Thread.sleep(2000);
    }

    @Test
    public void checkVehicleOption() throws InterruptedException {
        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();
        Thread.sleep(2000);
        WebElement vehicle = driver.findElement((By.xpath("(//span[@class='title title-level-2'])[1]")));
        vehicle.click();
        Thread.sleep(2000);
        WebElement selectCar = driver.findElement(By.xpath("(//tbody//tr)[1]"));
        selectCar.click();
        Thread.sleep(2000);
        WebElement carInfo = driver.findElement(By.xpath("//h1[@class = 'user-name']"));
        String actual = carInfo.getText();
        Assert.assertFalse(actual.isEmpty());
        Thread.sleep(3000);
        driver.close();
    }
}