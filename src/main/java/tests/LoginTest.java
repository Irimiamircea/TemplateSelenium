package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void validLoginTest() {
		
		app.click(app.menu.loginLink);
	}

}
