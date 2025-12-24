package org.testingacademy;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium05 {
    //Navigation

    @Test
    public void navigation(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.navigate().to("http://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}
