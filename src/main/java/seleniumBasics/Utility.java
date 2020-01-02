package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Abhinav_Kumar19 The class contains the generic methods/useractions
 *         that is to be done on Web Application Methods like: GetElement,
 *         InitializeBrowser, Launch URL, ClickMethod, SendValues, GetTextValue,
 *         SelectDropdown, DragAndDrop, MoveElement, CaptureScreenshot, HandlePopUp,
 *
 */
public class Utility {
	public static WebDriver driver;

	/**
	 * This method is used to initialize driver as per browser
	 * 
	 * @param driver
	 * @param browser
	 * @return
	 */
	public static WebDriver initializeDriver(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				System.out.println("Please enter correct browser from 'chrome' or 'firefox'");
			}
		} catch (Exception e) {
			System.out.println("Some error happended while initializing the browser" + e.getMessage());
		}
		return driver;
	}

	/**
	 * This method returns WebElement
	 * 
	 * @param driver
	 * @param locator
	 * @return WebElement
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			waitForElement(driver,locator);
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Some error happened in creating element..." + e.getMessage());
		}
		return element;
	}
	
	/**
	 * This methods waits 15 seconds for element to be present on the page
	 * @param driver
	 * @param locator
	 */
	public static void waitForElement(WebDriver driver, By locator) {
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));		
	}
	
	/**
	 * This method is used to launch URL
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Some error happened in launching URL..." + e.getMessage());
		}
	}

	/**
	 * This method is used to click on element
	 * 
	 * @param element
	 */
	public static void doClick(WebDriver driver, By locator) {
		try {
			getElement(driver, locator).click();
		} catch (Exception e) {
			System.out.println("Some error happened while clicking on element" + e.getMessage());
		}
	}

	/**
	 * This method is used to send values in a field.
	 * 
	 * @param element
	 * @param value
	 */
	public static void doSendValues(WebDriver driver, By locator, String value) {
		try {
			getElement(driver, locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("Some error happended while sending the values in field" + e.getMessage());
		}
	}

	/**
	 * This method is used to get the text of WebElement of page.
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String doGetText(WebDriver driver, By locator) {
		String text = null;
		try {
			text = getElement(driver, locator).getText();
		} catch (Exception e) {
			System.out.println("Some error happened while getting the element text..." + e.getMessage());
		}
		return text;
	}

	/**
	 * This method is used to select dropdown which has Select tag
	 * 
	 * @param driver
	 * @param locator
	 * @param option  (enter index or text)
	 * @param value   (enter dropdown index or dropdown text value)
	 */
	public static void selectDropdownValue(WebDriver driver, By locator, String option, String value) {
		if (option.equalsIgnoreCase("text")) {
			try {
				Select select = new Select(getElement(driver, locator));
				select.selectByVisibleText(value);
			} catch (Exception e) {
				System.out.println("Some error happened while clicking selecting dropdown..." + e.getMessage());
			}
		}
		else if (option.equalsIgnoreCase("index")) {
			try {
				Select select = new Select(getElement(driver, locator));
				select.selectByIndex(Integer.parseInt(value));
			} catch (Exception e) {
				System.out.println("Some error happened while clicking selecting dropdown..." + e.getMessage());
			}

		} else {
			System.out.println("Seems that the selection cannot be done. Please check if dropdown has Select tag...");
		}
	}
	
	public static void moveElement(By locator) {		
		Actions action=new Actions(driver);
		action.moveToElement(getElement(driver, locator)).build().perform();
	}
	
	
	
	
	
	
}
