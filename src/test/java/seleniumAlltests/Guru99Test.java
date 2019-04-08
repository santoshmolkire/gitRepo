package seleniumAlltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListenetTest.class)
public class Guru99Test {
	WebDriver driver;
	@Test		
	public void Login()				
	{		
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/V4/");					
	driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	driver.findElement(By.name("password")).sendKeys("amUpenu");							
	driver.findElement(By.name("btnLogin")).click();					
	
	}		

	//Forcefully failed this test as verify listener.		
	@Test		
	public void TestToFail()				
	{		
		System.out.println("This method to test fail");					
		Assert.assertTrue(true);			
	}		
}
