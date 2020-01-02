package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.initializeDriver("chrome");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Utility.launchURL(driver, "https://app.hubspot.com/login");
		
		By username=By.id("username");
		By password=By.id("password");
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(username));

		Utility.doSendValues(driver, username, "abhinavmalviya1992@gmail.com");
		Utility.doSendValues(driver, password, "Jimmy@1992");
		
		
	}

}
