package org.testingacademy;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */

public class Selenium01
{

    public static void main( String[] args )
    {
        System.out.println("Hello Raisa");
        //System.setProperty(,"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.quit();

    }
}

