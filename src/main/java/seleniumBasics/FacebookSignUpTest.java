package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.initializeDriver("chrome");
		Utility.launchURL(driver, "https://www.facebook.com/");

		By firstName = By.name("firstname");
		By surName = By.name("lastname");
		By email = By.name("reg_email__");
		By password = By.name("reg_passwd__");
		By date = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		By sexMale = By.xpath("//*[@name='sex'][@value='2']");
		By SignUp = By.name("websubmit");

		Utility.doSendValues(driver, firstName, "Abhinav");
		Utility.doSendValues(driver, surName, "Malviya");
		Utility.doSendValues(driver, email, "919876543210");
		Utility.doSendValues(driver, password, "TestAtTasty2019");
		Utility.selectDropdownValue(driver, month, "index", "10");
		Utility.selectDropdownValue(driver, date, "index", "10");		
		Utility.selectDropdownValue(driver, year, "text", "1986");
		Utility.doClick(driver, sexMale);
		Utility.doClick(driver, SignUp);

	

	}

}
