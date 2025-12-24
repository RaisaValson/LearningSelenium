package org.testingacademy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Selenium02 {
    @Test
    public void test_1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        assertThat(driver.getTitle().contains("G"));
        driver.close();
    }
}
