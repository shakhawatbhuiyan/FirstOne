package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Login_Class;
import util.Browser_Factory_Exam;

public class LoginTest_Exam {
	@Test
	public void TechfiosLogin() {
		WebDriver driver = Browser_Factory_Exam.startBrowser();
		Login_Class loginwebsite = PageFactory.initElements(driver, Login_Class.class);
		loginwebsite.login();
	//	driver.close();
	//	driver.quit();

	}


}
