/**
 * @author sandeepyadav
 *
 */
package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionDriver {
	protected WebDriver driver;

	public ActionDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By loc) {
		driver.findElement(loc).click();
	}

	public void sendText(By loc, String value) {
		driver.findElement(loc).clear();
		driver.findElement(loc).sendKeys(value);
	}
	 public void checkValidAssert(By location, Object equalValue, String ErrorMessage) {
	        assert driver.findElement(location).getText().trim().equals(equalValue) : ErrorMessage;
	    }


}