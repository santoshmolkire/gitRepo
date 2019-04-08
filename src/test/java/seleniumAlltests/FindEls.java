package seleniumAlltests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindEls {

	@Test
	public void clickOnRadioBtn() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement>listOfbtn=driver.findElements(By.xpath("//input[@name='name']"));
		int size=listOfbtn.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			String value=listOfbtn.get(i).getAttribute("value");
			System.out.println(value);
			if(value.contains("No")) {
				listOfbtn.get(i).click();
				break;
			}
		}
	}

}
