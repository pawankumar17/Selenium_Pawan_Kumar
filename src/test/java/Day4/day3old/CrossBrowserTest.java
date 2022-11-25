//package day3old;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.beust.jcommander.Parameters;
//
//public class CrossBrowserTest {
//	
//	@org.testng.annotations.Parameters("browser")
//	@Test
//	public void loginTest(String Browser) {
//		WebDriver driver=null;
//		if(Browser.equalsIgnoreCase("Chrome")) {
//		driver=new ChromeDriver();
//	}
//		if(Browser.equalsIgnoreCase("Edge")) {
//			driver=new EdgeDriver();
//		}
//		if(Browser.equalsIgnoreCase("Firefox")) {
//			driver=new FirefoxDriver();
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//		driver.get("");
//		driver.quit();
//		Assert.assertTrue(true);
//}
//}	
