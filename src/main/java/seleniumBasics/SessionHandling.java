package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionHandling {
	
	public static void main(String []args) {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		
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
//	driver.close();
	
//	System.out.println(driver.getTitle());
	
	// It will initiate a new session
	driver =new ChromeDriver();
	driver.get("http://www.amazon.com");
	
	
	
}
}

