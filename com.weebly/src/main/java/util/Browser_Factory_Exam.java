package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Factory_Exam {
	static WebDriver driver;

	public static WebDriver startBrowser() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");

		driver.manage().window().maximize();

		return driver;
	}

}
