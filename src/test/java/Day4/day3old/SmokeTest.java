//package day3old;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class SmokeTest {
//	
//	 WebDriver driver;
//	 @BeforeMethod
//	 public void setup() {
//		 System.out.println("Runnig Before Method Creating Browser Session");
//		 driver=new ChromeDriver();
//		 driver.get("http://137.184.76.209/orangehrm-4.9/sympony/web/index.php/auth/login");
//	 }
//	 @AfterMethod
//	 public void tearDown() {
//		 driver.quit();
//		 System.out.println("Running After Method Creating Browser Session");
//	 }
//	 @Test
//	 public void verifyUrl() {
//		 Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
//	 }
//	 @Test
//	 public void verifyTitle() {
//		 Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
//	 }
//	 @Test
//	    public void verifySocialMedia() {
//
//
//
//	       Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(), 4);
//	    
//	    }
//	    
//	    @Test
//	    public void verifyForgetPasswordLink() {
//	        WebElement forget=driver.findElement(By.linkText("Forgot your password?"));
//	        Assert.assertTrue(forget.isDisplayed());
//	    }
//}
