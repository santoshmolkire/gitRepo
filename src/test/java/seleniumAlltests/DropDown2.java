package seleniumAlltests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown2 {

	@Test
	public void dropDowntours() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement element=driver.findElement(By.name("country"));
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		for(int i=0;i<options.size();i++) {
			String allvalues=options.get(i).getAttribute("value");
			if(allvalues.equals("ANGUILLA")) {
				options.get(i).click();
			}
			//System.out.println(allvalues);
		}
	}
}
