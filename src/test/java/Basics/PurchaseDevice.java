package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PurchaseDevice {

    WebDriver driver;

    @BeforeTest
    public  void launchBrowser(){
        driver= new ChromeDriver();
    }

    @Test
    public void StartBrowser() throws InterruptedException {
        driver.get("https://gray-island-0bd788c1e.2.azurestaticapps.net/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void ClickLearningMaterial()  throws InterruptedException  {
        driver.findElement(By.xpath("//button[contains(.,'Learning Materials')]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void EnterUserName() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='login-card']/input")).sendKeys("malesela@gmail.com");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void EnterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='login-card']/input[2]")).sendKeys("marcus9902");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void ClickLogin()  throws InterruptedException  {
        driver.findElement(By.xpath("//div[@id='login-card']/button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void ClickLoginAgain()  throws InterruptedException  {
        driver.findElement(By.xpath("//div[@id='login-card']/button")).click();
        Thread.sleep(4000);
    }

    @Test(priority = 6)
    public void VerifyIfPracticePageIsDisplayed() throws InterruptedException {
        driver.findElement(By.xpath("//h2[contains(.,'Practice Assessments')]")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void ClickWebAutomation()  throws InterruptedException  {
        driver.findElement(By.xpath("//span[contains(.,'Web Automation')]")).click();
        Thread.sleep(2000);}

    @Test(priority = 8)
    public void ClickDeviceType()  throws InterruptedException  {
        driver.findElement(By.xpath("//select[@id='deviceType']")).click();
        Thread.sleep(2000);}

    @Test(priority = 9)
    public void SelectDeviceType() throws InterruptedException {
        driver.findElement(By.id("deviceType")).sendKeys("phone");
        Thread.sleep(2000);
    }



    @Test(priority = 10)
    public void ClickBrand()  throws InterruptedException  {
        driver.findElement(By.xpath("//select[@id='brand']")).click();
        Thread.sleep(2000);}

    @Test(priority = 11)
    public void SelectBrand() throws InterruptedException {
        driver.findElement(By.id("brand")).sendKeys("Samsung");
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void ClickOnStorage()  throws InterruptedException  {
        driver.findElement(By.xpath("//div[@id='inventory-form-grid']/div[4]/div/label/span")).click();
        Thread.sleep(2000);}

    @Test(priority = 13)
    public void SelectColor() throws InterruptedException {
        driver.findElement(By.id("color")).sendKeys("Black");
        Thread.sleep(2000);}

    @Test(priority = 14)
    public void ClickOnQuantity()  throws InterruptedException  {
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("1");
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void ClickOnAddress()  throws InterruptedException  {
        driver.findElement(By.xpath("//input[@id='address']")).click();
        Thread.sleep(2000);}

    @Test(priority = 16)
    public void EnterAddress() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("malesela@gmail.com");
        Thread.sleep(2000);}

    @Test(priority = 17)
    public void ClickOnPurchaseDevice()  throws InterruptedException  {
        driver.findElement(By.xpath("//button[@id='purchase-device-btn']")).click();
        Thread.sleep(2000);}

    @Test(priority = 18)
    public void VerifyFormReset()  throws InterruptedException  {
        driver.findElement(By.xpath("//input[@id='address']")).click();
        Thread.sleep(2000);}

    @Test(priority = 19)
    public void ClickLogout()  throws InterruptedException  {
        driver.findElement(By.id("app-root")).click();
        Thread.sleep(4000);}

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

