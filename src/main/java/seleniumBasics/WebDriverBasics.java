package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String []args) {
		
	// WebDriver is an Interface and all browser clasess like ChromeDriver, GeckoDriver, SafariDriver etc. implements this interface.
	// WebDriver driver = new WebDriver();  ==> This is invalid cause we cannot create an object of Interface. 
	// 											So we perform Typecasting and write as:
	//		WebDriver driver = new ChromeDriver();
	
	//Open Chrome Browser	
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
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

