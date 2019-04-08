package seleniumAlltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {
	
	
	@Test
	@Parameters({"url","userName","passWord"})
	public void verifyCRMLogin(String url,String userName,String passWord ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
