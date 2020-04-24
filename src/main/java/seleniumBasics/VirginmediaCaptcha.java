package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VirginmediaCaptcha {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.initializeDriver("chrome");
		Utility.launchURL(driver, "http://www-virginmedia-ie.dev.aem.upc.biz/register/create-profile");
		
		By username=By.xpath("//input[@name='username']");
		By submit=By.xpath("//button[@id='background_fullwidth_templatesection_section_content_uxpcontainer_containerparsys_guestuserdetails_submitusername']");
		
		Utility.doSendValues(driver, username, "Abhinav@gmail.com");
		Utility.doClick(driver, submit);
		
		
		
}
}
