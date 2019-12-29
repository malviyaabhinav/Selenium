package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownNoSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By date=By.xpath("//select[@name='birthday_day']/option");
		By month=By.xpath("//select[@name='birthday_month']/option");
		By year=By.xpath("//select[@name='birthday_year']/option");
		
		selectDropdown(driver, date, "25");
		selectDropdown(driver, month, "Nov");
		selectDropdown(driver, year, "1992");
	}
	public static void selectDropdown(WebDriver driver, By locator, String value) {
		List<WebElement> options=driver.findElements(locator);
		for(int i=0; i<options.size();i++) {
			if(options.get(i).getText().equalsIgnoreCase(value)) {
				options.get(i).click();
				break;
			}
		}
	}
	
	
	

}
