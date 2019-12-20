package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessExecution {
	
	public static void main(String []args) {
		// Create object of ChromeOptions Class.
		// pass the addArguements value as "--headless"
		// Add the arguement value to ChromeDriver.
	
/*		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);*/

		WebDriverManager.firefoxdriver().setup();	
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");	
		WebDriver driver = new FirefoxDriver(fo);		
		
	//Enter URL:
	driver.get("https://www.google.com/");
	
	//Get the title of the page:
	String title=driver.getTitle();
	System.out.println(title);
	
	//Validating Title: Actual Vs Expected
	if (title.equals("Google")) {
		System.out.println("Correct Title");
	}
	else {
		System.out.println("Incorrect Title");
	}
	
	// Get Current URL:
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	

	//Close the browser:
	driver.quit();
	
	
}
}

