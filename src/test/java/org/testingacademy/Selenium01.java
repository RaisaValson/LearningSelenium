package org.testingacademy;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;
import java.util.List;
import java.util.Set;

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
        driver.get("https://www.google.com");

    }
}
