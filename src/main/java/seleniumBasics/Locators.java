package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		//Create WebElement and then perform actions.
		
		/*
		 * driver.findElement(By.id("username")).sendKeys("abhinavmalviya1992@gmail.com"
		 * ); driver.findElement(By.id("password")).sendKeys("Jimmy@1992");
		 * Thread.sleep(5000);
		 */
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("abhinavmalviya1992@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Jimmy@1992");
	
		
		
		

	}

}
