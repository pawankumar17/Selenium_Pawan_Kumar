package Day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class BrowserStack {
	 WebDriver driver;
	    
	    @org.testng.annotations.Parameters({"os","osVersion","browser","browserVersion"})
	    @BeforeMethod
	    public void setup(String os, String osVersion,String browser, String browserVersion) {
	    	DesiredCapabilities capabilities=new DesiredCapabilities();
	    	capabilities.setCapability("browserName",browser);
	    	capabilities.setCapability("browserVersion",browserVersion);
	    	capabilities.setCapability("os",os);
	    	capabilities.setCapability("osVersion",osVersion);
	    	
//	    	MutableCapabilities capabilities1 = new MutableCapabilities();
//	    	capabilities1.setCapability("browserName", "Edge");
//	    	capabilities1.setCapability("browserVersion", "latest");
//	    	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//	    	browserstackOptions.put("os", "Windows");
//	    	browserstackOptions.put("osVersion", "8");
//	    	browserstackOptions.put("local", "false");
//	    	browserstackOptions.put("seleniumVersion", "3.5.2");
//	    	capabilities1.setCapability("bstack:options", browserstackOptions);
//	    	
	    	
//	    	MutableCapabilities capabilities = new MutableCapabilities();
//	    	capabilities.setCapability("browserName", "Chrome");
//	    	capabilities.setCapability("browserVersion", "latest");
//	    	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//	    	browserstackOptions.put("os", "Windows");
//	    	browserstackOptions.put("osVersion", "8");
//	    	browserstackOptions.put("local", "false");
//	    	browserstackOptions.put("seleniumVersion", "3.14.0");
//	    	capabilities.setCapability("bstack:options", browserstackOptions);
	        
	        URL url=null;
	        try {
	        	url = new URL("https://pawankumar_zi8SUX:mKKwxQt5e8szN2zeaqPy@hub-cloud.browserstack.com/wd/hub");
	        		
	            }catch(MalformedURLException e){
	            	e.printStackTrace();
	            }
	        
	        	driver=new RemoteWebDriver(url,capabilities);
	        	
	        
	    }
	    
	    @AfterMethod
	    public void tearnow() {
	        driver.quit();
	       
	        
	    }
	    
	    @Test
	    public void test() {
			driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
			
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//a//b[text()='Admin']")).click();
			//Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
			//Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mukesh Otwani");
			driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("Pawan1");
			driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("Pawan@12345");
			driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("Pawan@12345");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='btnSave']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Pawan1");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Pawan@12345");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			
		}
	    	
	    }
	    	
	

