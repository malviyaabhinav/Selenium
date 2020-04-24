package seleniumBasics;

import org.openqa.selenium.WebDriver;



public class TrivagoPageTest 
{
	static TrivagoPage tp;
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = null;
		String url = "https://www.trivago.in/";
		tp= new TrivagoPage(driver);
		
		System.out.println("Test started");
		
		tp.setUpDriver();

		tp.loadURL(url);
		
		tp.searchHotels();
		
		tp.verifyPrice();
		
		tp.tearDown();
		
		System.out.println("Test Completed");
	}

}
