package seleniumTrainingold;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Pawan",Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("tittle is"+title);
		String url=driver.getCurrentUrl();
		System.out.println("Url is"+url);
		
	}

}
