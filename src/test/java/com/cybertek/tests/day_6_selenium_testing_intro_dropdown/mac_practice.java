package com.cybertek.tests.day_6_selenium_testing_intro_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class mac_practice {
    public static void main(String[] args) throws InterruptedException {
        //TC #03: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //3. Click to all of the headers one by one
        //  a. Mac, iPad, iPhone, Watch, TV, Music, Support

        // Storing 9 web elements including "apple" logo, and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        //4. Print out the titles of the each page
        //5. Print out total number of links in each page
        //6. While in each page:
        // a. Print out how many link is missing text TOTAL
        // b. Print out how many link has text TOTAL
        for(int eachLink = 1;eachLink< headerLinks.size()-1;eachLink++){
            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

            //4. Print out the titles of the each page
            System.out.println("Current title in the page:" + driver.getTitle());

            //5. Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Number of links in current page: " + allLinks.size());
            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {

                if (each.getText().isEmpty()){
                    linksWithNoText++;
                }else{
                    linksWithText++;
                }

            }


            //6. While in each page:
            // a. Print out how many link is missing text TOTAL
            System.out.println("--> Current page links with NO TEXT: " + linksWithNoText);

            // b. Print out how many link has text TOTAL
            System.out.println("--> Current page links with text: " + linksWithText);

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        }



    }
    }

