package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiLevelNoSelectTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement dropdown = driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		dropdown.click();
		Thread.sleep(3000);
		 selectDropdownValue(driver, "choice 3", "choice 2 2", "choice 4", "choice 6", "choice 7");
		//selectDropdownValue(driver, "ALL");
	}

	public static void selectDropdownValue(WebDriver driver, String... value) throws InterruptedException {
		List<WebElement> dropdownValues = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']/ul/li//span[@class='comboTreeItemTitle']"));

		if (!value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < dropdownValues.size(); i++) {
				String dropText = dropdownValues.get(i).getText();
				for (int j = 0; j < value.length; j++) {
					if (dropText.equalsIgnoreCase(value[j])) {
						dropdownValues.get(i).click();
					}
				}
			}
		} else
			try {
				for (int i = 0; i < dropdownValues.size(); i++) {
					dropdownValues.get(i).click();
				}
			} catch (Exception e) {
				System.out.println("Some Exception occurred!!!");
			}

	}
}
