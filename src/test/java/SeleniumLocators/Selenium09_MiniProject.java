package SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.SeleniumBasics.Selenium03_commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium09_MiniProject extends Selenium03_commonToAll {
    @Test
    @Description("Verify negative scenario for account creation")
    @Link("TC02_JIRA")
    public void create_acct_vmo_negative(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        WebElement trialLink = driver.findElement(By.linkText("Start a free trial"));
        trialLink.click();
        customWait(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial/"));
        WebElement email_field = driver.findElement(By.id("page-v1-step1-email"));
        email_field.sendKeys("abcdefgh");
        WebElement checkMsg = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkMsg.click();
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();
        customWait(2000);
        WebElement messageErr=driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(messageErr.getText(),"The email address you entered is incorrect.");
        driver.close();
    }
}
