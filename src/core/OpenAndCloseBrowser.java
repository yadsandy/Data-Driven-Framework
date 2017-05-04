/**
 * @author sandeepyadav
 *
 */
package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenAndCloseBrowser {
	protected static WebDriver driver;

	@Parameters({ "browser", "baseURL" })
	@BeforeClass
	public void openBrowser(String browser, String baseURL) {
		if (browser.equalsIgnoreCase("firefox")) {
			// Open firefox browser
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Driver/geckodriver");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Opened");
		} else if (browser.equalsIgnoreCase("chrome")) {
			// Open chrome browser
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver");
			driver = new ChromeDriver();

			System.out.println("Chrome Browser Opened");

		}

		else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Driver/geckodriver");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Opened");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	public static WebDriver getInstance() {
		return driver;
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}