package Day5;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownload {
		
		 WebDriver driver;
		    
		    @BeforeMethod
		    public void setup() {
		        System.out.println("running before method-creating browser");
		        driver=new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		    }
		    
		    @AfterMethod
		    public void tearnow() {
		        driver.quit();
		        System.out.println("runnning after method");
		        //Assert.assertTrue(true);
		    }
		    @Test
		    public void test() {
		    	driver.get("https://the-internet.herokuapp.com");
		    	driver.findElement(By.xpath("li//a[text()='File Download']")).click();
		    	driver.findElement(By.xpath("//a[contains(text(),'index.html']")).click();
		    	ChromeOptions options = new ChromeOptions();

		    	HashMap<String, Object> chromePref = new HashMap<>();

		    	chromePref.put("download.default_directory", "C:\\Users\\pawkumar16\\Downloads");

		    	options.setExperimentalOption("prefs", chromePref);
		    }
		    	
		

}
