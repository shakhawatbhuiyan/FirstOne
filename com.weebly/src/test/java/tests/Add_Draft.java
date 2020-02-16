package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Draft_Class;

import pages.Login_Class;
import util.Browser_Factory_Exam;

public class Add_Draft {
	@Test
	public void ClickDraft_Class() {
		WebDriver driver = Browser_Factory_Exam.startBrowser();

		Login_Class loginwebsite = PageFactory.initElements(driver, Login_Class.class);
		loginwebsite.login();

		Draft_Class Draft = PageFactory.initElements(driver, Draft_Class.class);
		Draft.ClickDraft_Class();

		driver.close();
		driver.quit();
	}

}
