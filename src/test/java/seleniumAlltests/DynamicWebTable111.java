package seleniumAlltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable111 {
@Test
public void verifyWebTable() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	
	int cols=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th")).size();
	//table[@class='dataTable']//tbody//tr//td
	int rows=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
	for(int i=0;i<cols;i++) {
		for(int j=0;j<rows;j++) {
			String ss=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
			System.out.println(ss);
		}
	}
	
}
}
