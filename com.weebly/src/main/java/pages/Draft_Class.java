package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Draft_Class {
	WebDriver driver;

	public Draft_Class(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"title\"]")
	WebElement Tittle;

	@FindBy(how = How.ID, using = "content")
	WebElement Content;

	@FindBy(how = How.NAME, using = "save")
	WebElement Save;

	@FindBy(how = How.XPATH, using = "//*[@id=\"dashboard_quick_press\"]/div/div/ul/li[1]/div/a")
	WebElement Validate  ;

	public void ClickDraft_Class() {

		Tittle.sendKeys("trying");
		Content.sendKeys("shakhawat");
		Save.click();
		Validate.click();
	}

}
