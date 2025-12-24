package SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.SeleniumBasics.Selenium03_commonToAll;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Selenium08_locators extends Selenium03_commonToAll {
    @Test
    @Description("Login with invalid credentials")
    @Severity(SeverityLevel.BLOCKER)
    public void login_Invalid_Login() {
        System.out.println("This is login with invalid credentials test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");
        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.id("login-password")).sendKeys("admin1234");
        driver.findElement(By.id("js-login-btn")).click();
        customWait(5000);
        String errorMessage = driver.findElement(By.id("js-notification-box-msg")).getText();
        Assert.assertEquals(errorMessage, "Your email, password, IP address or location did not match");
        closeBrowser(driver);
    }
}

