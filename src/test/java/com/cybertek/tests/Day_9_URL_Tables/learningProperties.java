package com.cybertek.tests.Day_9_URL_Tables;

import org.testng.annotations.Test;

public class learningProperties {
    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperties(\"user.name\") = " + System.getProperties("user.name"));
        System.out.println("System.getProperties(\"os.name\") = " + System.getProperties("os.name"));

    }
}
