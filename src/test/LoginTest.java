/**
 * @author sandeepyadav
 *
 */
package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import core.ActionDriver;
import core.OpenAndCloseBrowser;
import pageObjects.LoginPage;
import utility.DataProviderForLogin;

@Listeners(screenshot.ResultListener.class)
public class LoginTest extends OpenAndCloseBrowser {

	LoginPage lp = new LoginPage();

	@Test(dataProviderClass = DataProviderForLogin.class, dataProvider = "getLoginData")
	public void test(String username, String password) throws Exception {
		ActionDriver actionDriver = new ActionDriver(driver);
		System.out.println("Enter Username");
		actionDriver.sendText(lp.enterUsername(), username);
		System.out.println("Click on next");
		actionDriver.click(lp.clickNext());
		Thread.sleep(2000);
		System.out.println("Enter Password");
		actionDriver.sendText(lp.enterPassword(), password);
		System.out.println("Click on next");
		actionDriver.click(lp.clickNext());
		//Verify Account
		actionDriver.click(lp.clickOnImage());
		actionDriver.checkValidAssert(lp.getEmail(), username, "Email not verified successfully");

	}

}
