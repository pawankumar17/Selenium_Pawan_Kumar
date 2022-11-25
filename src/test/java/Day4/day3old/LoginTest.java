package day3old;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
    
    WebDriver driver;
    
    @BeforeMethod
    public void setup() {
        System.out.println("running before method-creating browser");
        driver=new ChromeDriver();
        driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
        
    }
    
    @AfterMethod
    public void tearnow() {
        driver.quit();
        System.out.println("runnning after method");
    }
    
    @Test
    public void validuserpass() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
    
    @Test
    public void invalidpass(){
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iwdsc%");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getText(),"Invalid credentials");    
    }
    @Test
    public void invaliduser() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin11");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getText(),"Invalid credentials");    
    }
    
    @Test
    public void Invalidpassuser() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin11");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%dd");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getText(),"Invalid credentials");
        
    }
    
    
    
    



}