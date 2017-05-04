/**
 * @author sandeepyadav
 *
 */
package pageObjects;

import org.openqa.selenium.By;

public class LoginPage {
	String username = "identifierId";
	String password = "password";
	String next = "//span[contains(text(),'Next')]";
	String imageClick="//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span";
	String email="//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[2]";

	public By enterUsername() {
		return By.id(username);
	}

	public By enterPassword() {
		return By.name(password);
	}

	public By clickNext() {
		return By.xpath(next);
	}
	public By clickOnImage() {
		return By.xpath(imageClick);
	}
	public By getEmail() {
		return By.xpath(email);
	}
}
