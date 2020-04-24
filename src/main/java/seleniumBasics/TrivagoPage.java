package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrivagoPage 
{
	public static WebDriver driver;
	String URL = "https://www.trivago.in/";
	
	public TrivagoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUpDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void loadURL(String url)
	{
		driver.get(url);
		
	}
	public void searchHotels() throws InterruptedException
	{
		driver.findElement(By.id("querytext")).sendKeys("Pune");
		System.out.println("City has been written");
		
		//driver.findElement(By.className("cal-is-range-start")).click();
		driver.findElement(By.xpath("//button[@key='checkInButton']")).click();
		driver.findElement(By.xpath("//time[@datetime='2020-02-24']")).click();
		System.out.println("Checkin Date has been selected");
		
		//driver.findElement(By.className("cal-is-range-end")).click();
		driver.findElement(By.xpath("//button[@key='checkOutButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//time[@datetime='2020-02-28']")).click();
		System.out.println("Checkout Date has been selected");
		
		driver.findElement(By.xpath("//span[text()='Single room']")).click();
		System.out.println("Room type has been selected");
		
		driver.findElement(By.cssSelector("span.search-button__label")).click();
		System.out.println("User clicks on search button");
	}
	
	public void verifyPrice()
	{
		String price = driver.findElement(By.xpath("(//p[@class='accommodation-list__priceInfo--0ffd1'])[1])")).getText();
		System.out.println("The price of the hotel in INR is = "+price);
		
		System.out.println("Now change the currency type in Euro");
		
		
		Select currency = new Select(driver.findElement(By.id("currency")));
		currency.selectByVisibleText("EUR - Euro");
		
		System.out.println("Euro Currency has been selected");
	}
	
	public void tearDown()
	{
		driver.quit();
	}
}
