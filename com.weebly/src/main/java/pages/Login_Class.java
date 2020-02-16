package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Class {
	WebDriver driver;

	public Login_Class(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "user_login")
	WebElement username;

	@FindBy(how = How.ID, using = "user_pass")
	WebElement passwoard;

	@FindBy(how = How.NAME, using = "wp-submit")
	WebElement signingButton;

	public void login() {
		username.sendKeys("opensourcecms");
		passwoard.sendKeys("opensourcecms");
		signingButton.click();
	}

}
