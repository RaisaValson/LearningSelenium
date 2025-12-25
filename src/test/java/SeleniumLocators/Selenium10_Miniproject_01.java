package SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import net.bytebuddy.description.type.TypeDescription;
import org.SeleniumBasics.Selenium03_commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10_Miniproject_01 extends Selenium03_commonToAll {
    WebDriver driver = new ChromeDriver();
    @Test
    @Description("Add Beneficiary")
    @Severity(SeverityLevel.CRITICAL)
    public void createAccount(){

        loadBrowser(driver,"https://tta-bank-digital-973242068062.us-west1.run.app/");
        WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signup.click();
        customWait(2000);
        WebElement fullNameField = driver.findElement(By.xpath("//input[@placeholder='John Doe']"));
        fullNameField.sendKeys("Valson Jacob");
        WebElement emailAdd= driver.findElement(By.xpath("//input[@placeholder='you@example.com']"));
        emailAdd.sendKeys("valsonjacob@gmail.com");
        WebElement passwordSignup = driver.findElement(By.xpath("//input[@type='password']"));
        passwordSignup.sendKeys("123");
        WebElement createAcct = driver.findElement(By.xpath("//button[text()='Create Account']"));
        createAcct.click();
        customWait(5000);
//        WebElement username = dri
//        ver.findElement(By.xpath("//input[@type='email']"));
//        username.clear();
//        username.sendKeys("valsonjacob@gmail.com");
//        WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
//        pwd.sendKeys("123");
//        WebElement submit = driver.findElement(By.xpath("//button[text()='Sign In']"));
//        submit.click();

        WebElement addBeneMenu = driver.findElement(By.xpath("//*[local-name()='svg' and @class='lucide lucide-arrow-right-left h-5 w-5']"));
        addBeneMenu.click();
        WebElement addMenuOption = driver.findElement(By.xpath("//button[text()='Manage Beneficiaries']"));
        addMenuOption.click();
        customWait(3000);

        /* Add beneficiary*/
        WebElement beneName=driver.findElement(By.xpath("//input[@placeholder='e.g. John Doe']"));
        beneName.sendKeys("Raisa Valson");
        WebElement beneBank = driver.findElement(By.xpath("//input[@placeholder='e.g. Citibank']"));
        beneBank.sendKeys("SBI");
        WebElement beneAcct=driver.findElement(By.xpath("//input[@placeholder='8-12 digits']"));
        beneAcct.sendKeys("201233445");
        WebElement createBene = driver.findElement(By.xpath("//button[text()='Save Beneficiary']"));
        createBene.click();
        customWait(5000);
        closeBrowser(driver);
    }
}

