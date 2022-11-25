package Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DataDrivenTest {
		
		 WebDriver driver;
		    
		    @BeforeMethod
		    public void setup() {
		        System.out.println("running before method-creating browser");
		        driver=new ChromeDriver();
		        driver.get("https://ineuron-courses.vercel.app/login");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		    }
		    
		    @AfterMethod
		    public void tearnow() {
		        driver.quit();
		        System.out.println("runnning after method");
		        //Assert.assertTrue(true);
		    }
		    	
		
	   
	@Test(dataProvider="testdata1")
	public void myTest(String email,String password) {
		driver.findElement(By.xpath("//input [@placeholder = 'Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input [@placeholder = 'Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Practise']")).getText(),"Practise");
	    driver.findElement(By.xpath("//button[text()='Sign out']")).click();
	}
	
//	@DataProvider(name="testdata")
//	public Object[][] testDataGeneration()
//	{
//		Object [][]arr=new Object[4][2];
//		arr[0][0]="sample9@gmail.com";
//		arr[0][1]="Mukesh1234";
//		arr[1][0]="samplemukesh@gmail.com";
//		arr[1][1]="Mukesh1234";
//		arr[2][0]="samplemukesh1@gmail.com";
//		arr[2][1]="Mukesh1234";
//		arr[3][0]="samplemukesh2@gmail.com";
//		arr[3][1]="Mukesh1234";
//		return arr;
//	}
//	
	@DataProvider(name="testdata1")
	public Object[][] testDataGeneration1(){
		Object [][] arr=null;
		try {
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testData/SapientTestData.xlsx")));
			int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
			int column=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
			
			arr=new Object[rows][column];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<column;j++) {
					arr[i][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
						
				}
			}
			System.out.println(arr);
			wb.close();
		}catch(FileNotFoundException e) {
			System.out.println("Please check the file"+e.getMessage());
		}
		catch( IOException e) {
			System.out.println("Something went wrong IO"+e.getMessage());
		}
	
	    return arr;
	    
	}
	}





