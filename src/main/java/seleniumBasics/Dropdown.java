package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		/*
		 * selectByVisibleText(day, "25"); selectByVisibleText(month, "Nov");
		 * selectByVisibleText(year, "1992");
		 */
		
		selectByIndex(day, 26);
		selectByIndex(month, 8);
		selectByIndex(year, 4);
		
	}
	
	public static void selectByVisibleText(WebElement element, String value) {
		Select select =new Select(element);
		select.selectByVisibleText(value);
	}
	public static void selectByIndex(WebElement element, int index) {
		Select select =new Select(element);
		select.selectByIndex(index);
	}

}
