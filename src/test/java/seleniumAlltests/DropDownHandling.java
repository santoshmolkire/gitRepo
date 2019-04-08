package seleniumAlltests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling {
	@Test
	public void verifyFBBirthday() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		Select select=new Select(day);
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().contains("23")) {
				boolean flag=webElement.isSelected();
				if(!flag)
				webElement.click();
				break;
			}
		}
		//dont use selectbyindex it is always risky because  it can change if value doesnot matter use index
	/*	String dob="5-Feb-1993";
		String str[]=dob.split("-");
		selectValueFromDropdown(day,str[0]);
		selectValueFromDropdown(month,str[1]);
		selectValueFromDropdown(year,str[2]);
		selectValueFromDropdown(day,"23");
		selectValueFromDropdown(month,"Aug");
		selectValueFromDropdown(year,"1993");
		}
		
	public static void selectValueFromDropdown(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByVisibleText(value);
	}*/
}
}
