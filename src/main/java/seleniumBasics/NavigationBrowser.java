package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationBrowser {
	
	public static void main(String []args) {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		
	//Enter URL:
	driver.get("https://www.google.com/");		// Driver will not perform any action unless the page is completely loaded.
	
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
	
	driver.navigate().to("http://www.amazon.com");	//Driver will not wait for the page to load completely before performing any action
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	// Get Current URL:
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	

	//Close the browser:
	driver.quit();
	
	
}
}

