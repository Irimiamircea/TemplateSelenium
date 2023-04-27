package utils;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.MenuPage;

public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	
	//construim pagina
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);

}
