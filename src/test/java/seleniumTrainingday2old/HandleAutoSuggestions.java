package seleniumTrainingday2old;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//		//driver.findElement(By.name("q")).sendKeys("Pawan Kumar");
//		driver.findElement(By.xpath("//input[contains(@id,'datepicker')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()='25']")).click();
//		driver.close();
//		
//		WebDriver driver1=new ChromeDriver();
//		driver1.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//		driver1.findElement(By.xpath("//a[@id='datepicker']")).click();
//		List<WebElement> date=driver1.findElements(By.xpath("//a[@class='ui-state-default']"));
//		
//		for(WebElement ele: date) {
//			String str=ele.getText();
//			System.err.println(str);
//			if(str.contains("26")) {
//				ele.click();
//				break;
//			}
//		}
//		driver1.close();
//		
		
		WebDriver driver2=new ChromeDriver();
		driver2.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver2.findElement(By.xpath("//button[@type='button']")).click();
		List<WebElement> elements=driver2.findElements(By.xpath("//li[@role='presentation']//a"));
		
		for(WebElement ele: elements) {
			String str=ele.getText();
			System.err.println(str);
			if(str.contains("CSS")) {
				ele.click();
				break;
			}
		}
		driver2.close();
		
	}

}
