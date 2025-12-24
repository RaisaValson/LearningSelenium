package org.testingacademy;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium04 extends Selenium03_commonToAll{
    @Description("TC01_Compare URL Texts")
    @Link("TC01_JIRA1")
    @Test
    public void openBrowser(){
        WebDriver driver = new ChromeDriver();
        String url= "https://www.vwo.com";
        loadBrowser(driver, url);
        if(driver.getPageSource().contains("Optimize digital experiences")){
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Test case failed");
        }
        closeBrowser(driver);
    }
}
