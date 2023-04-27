package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class LoginTest extends BaseTest {
	@Parameters({"user", "pass"})
	@Test
	public void validLoginTest(String user, String pass) {
		
		app.click(app.menu.loginLink);
		app.login.loginInApp(user, pass);
		assertTrue(app.login.elementIsDisplayed(app.login.myAccElement));
	}

}
