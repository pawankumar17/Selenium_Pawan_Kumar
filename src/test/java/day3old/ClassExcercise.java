package day3old;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassExcercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/Login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ineuron@ineuron.ai");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ineuron");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Actions action=new Actions(driver);
        WebElement m=driver.findElement(By.xpath("//span[text()='Manage']"));
        action.moveToElement(m).perform();
       
        driver.findElement(By.xpath("//span[text()='Manage Categories']")).click();
        Set<String> allWindows=driver.getWindowHandles();
        List<String> pagesList=new ArrayList<String>(allWindows);
        String first=pagesList.get(0);
        String second=pagesList.get(1);
        driver.switchTo().window(second);
       
        driver.findElement(By.xpath("//button[text()='Add New Category ']")).click();

		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Selenium");
		alt.accept();
		String name="Selenium";
		driver.findElement(By.xpath("//td[text()='" + name +"']//following::button[1]")).click();
		//driver.switchTo().window(second);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> allElements= driver.findElements(By.xpath("//td[text()='" + name +"']"));
		if(allElements.size()==0) {
			System.out.println("deleted");
		}else
			System.out.println("Not deleted");


	}

}
