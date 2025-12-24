package org.testingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03_commonToAll {
    ChromeDriver driver;

    public void loadBrowser(WebDriver driver,String url){
    driver.get(url);
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    }

    public void closeBrowser(WebDriver driver){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
