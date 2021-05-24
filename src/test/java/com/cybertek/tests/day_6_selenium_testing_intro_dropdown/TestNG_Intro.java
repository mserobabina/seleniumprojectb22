package com.cybertek.tests.day_6_selenium_testing_intro_dropdown;


import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("-----> Before CLASS is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> After CLASS is running...");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("---> Before method is running...");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("---> After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Running test 1...");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2...");

    }


}
